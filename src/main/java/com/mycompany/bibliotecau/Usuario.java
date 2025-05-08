
package com.mycompany.bibliotecau;

import java.util.Scanner;


public class Usuario {
    
    private String nombre;
    private String id;

    public Usuario() {
    }

    public Usuario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }
    
    
    public void creacionUsuario(){
        Scanner ScanerU = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del usuario : ");
        String nombre = ScanerU.nextLine();

        System.out.print("Ingrese la id ");
        String id = ScanerU.nextLine();

        Usuario nuevoUsuario = new Usuario(nombre, id);
        System.out.println("¡Usuario agregado con éxito!");
    }
        
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    
    
}
