
package com.mycompany.bibliotecau;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class biblioteca {
           
    private List<Libro> libros;
    private List<Libro> librosPrestados;

    public biblioteca() {
        libros = new ArrayList<>();
        librosPrestados = new ArrayList<>();
        cargarLibros();
    }

    private void cargarLibros() {
    libros.add(new Libro("El Principito", "infantiles", true));
    libros.add(new Libro("Cien Años de Soledad", "fantasia", true));
    libros.add(new Libro("Don Quijote", "fantasia", true));
    libros.add(new Libro("1984", "historia", true));
    }

    public void mostrarLibros() {
        System.out.println("\n--- LIBROS EN LA BIBLIOTECA ---");
        for (int i = 0; i < libros.size(); i++) {
            System.out.println((i + 1) + ". " + libros.get(i));
        }
    }

    public void mostrarPrestados() {
        if (librosPrestados.isEmpty()) {
            System.out.println("No has prestado ningún libro.");
            return;
        }

        System.out.println("\n--- TUS LIBROS PRESTADOS ---");
        for (Libro libro : librosPrestados) {
            System.out.println("- " + libro.getTitulo());
        }
    }

    public boolean prestarLibro(int numero) {
        if (numero > 0 && numero <= libros.size()) {
            Libro l = libros.get(numero - 1);
            if (l.estaDisponible()) {
                l.prestamo();
                librosPrestados.add(l);
                return true;
            }
        }
        return false;
    }

    public boolean devolverLibro(int numero) {
        if (numero > 0 && numero <= librosPrestados.size()) {
            Libro l = librosPrestados.remove(numero - 1);
            l.devolucion();
            return true;
        }
        return false;
    }
    
    public void cargarNuevosLibros(){
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Ingrese el título del libro: ");
        String titulo = scanner.nextLine();

        System.out.print("Ingrese la categoria del libro: ");
        String categoria = scanner.nextLine();


        System.out.print("¿Está disponible? (true/false): ");
        String disponibleInput = scanner.nextLine();
        boolean disponible = disponibleInput.equalsIgnoreCase("sí");

        // Crear un nuevo libro y agregarlo a la lista
        Libro nuevoLibro = new Libro(titulo, categoria, disponible);
        libros.add(nuevoLibro);
        System.out.println("¡Libro agregado con éxito!");
    }
 }   


  

