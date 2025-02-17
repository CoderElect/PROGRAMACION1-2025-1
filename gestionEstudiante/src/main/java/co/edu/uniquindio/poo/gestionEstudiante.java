package co.edu.uniquindio.poo;

import java.util.Scanner;

public class gestionEstudiante {

    // imprime info solicitada y dato dado
    public static void Estudiante(String nombres, String apellidos, String identificacion, String correo, String telefono, int edad) {

        System.out.println("Nombres: " + nombres);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("ID: " + identificacion);
        System.out.println("Correo: " + correo);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Edad: " + edad);
    }

    public static void main(String[] args) {
      //lee lo solicitado
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese nombres: ");
        String nombres = scanner.nextLine();

        System.out.print("Ingrese apellidos: ");
        String apellidos = scanner.nextLine();

        System.out.print("Ingrese ID: ");
        String identificacion = scanner.nextLine();

        System.out.print("Ingrese correo: ");
        String correo = scanner.nextLine();

        System.out.print("Ingrese teléfono: ");
        String telefono = scanner.nextLine();

        System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();

        Estudiante(nombres, apellidos, identificacion, correo, telefono, edad);
        scanner.close();
    }
}
