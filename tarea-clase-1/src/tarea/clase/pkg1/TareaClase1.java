/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.clase.pkg1;

import java.util.Scanner;

/**
 *
 * @author isral
 */
public class TareaClase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objetos de tipo estudiante
        Estudiante est1 = new Estudiante();
        Estudiante est2 = new Estudiante();

        Scanner entrada = new Scanner(System.in);
        //Entrada de datos para el estudiante 1
        System.out.println("Ingrese el nombre y apellido del estudiante 1");
        est1.setNombre(entrada.nextLine());
        est1.setApellido(entrada.nextLine());
        //Entrada de datos para el estudiante 2
        System.out.println("Ingrese el nombre y apellido del estudiante 2");
        est2.setNombre(entrada.nextLine());
        est2.setApellido(entrada.nextLine());
        //Presentación
        System.out.printf("El nombre y apellido del estudiante 1 es:\t%s\t%s\n", est1.getNombre(),est1.getApellido());
        System.out.printf("El nombre y apellido del estudiante 2 es:\t%s\t%s\n", est2.getNombre(),est2.getApellido());

    }

}
