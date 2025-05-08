/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bibliotecau;

import java.util.Scanner;
public class BibliotecaU {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        biblioteca biblio = new biblioteca();
        Usuario user = new Usuario();

        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Ver libros disponibles");
            System.out.println("2. Prestar libro");
            System.out.println("3. Ver libros prestados");
            System.out.println("4. Devolver libro");
            System.out.println("5. Registrar nuevo libro");
            System.out.println("6. Registrar nuevo Usuario");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    biblio.mostrarLibros();
                    break;
                case 2:
                    biblio.mostrarLibros();
                    System.out.print("Número del libro a prestar: ");
                    int numPrestamo = sc.nextInt();
                    if (biblio.prestarLibro(numPrestamo)) {
                        System.out.println("Libro prestado con éxito.");
                    } else {
                        System.out.println("No se pudo prestar el libro.");
                    }
                    break;
                case 3:
                    biblio.mostrarPrestados();
                    break;
                case 4:
                    biblio.mostrarPrestados();
                    System.out.print("Número del libro a devolver: ");
                    int numDevolucion = sc.nextInt();
                    if (biblio.devolverLibro(numDevolucion)) {
                        System.out.println("Libro devuelto con éxito.");
                    } else {
                        System.out.println("No se pudo devolver el libro.");
                    }
                    break;
                    
                    
                case 5:
                    
                    biblio.cargarNuevosLibros();
                    break;
                    
                case 6:
                        
                     user.creacionUsuario();
                     break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }
}
