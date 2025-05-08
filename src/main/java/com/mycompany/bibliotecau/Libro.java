/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecau;

public class Libro {
    
    private String titulo;
    private String categoria;
    private boolean disponible;

    public Libro() {
    }

    
    
    public Libro(String titulo, String categoria, boolean disponible) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
    }
    
    public boolean estaDisponible() {
        return disponible;
    }
    
    public void prestamo(){
        disponible = false;
    }

    public void devolucion(){
        disponible = true;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", categoria=" + categoria + ", disponible=" + disponible + '}';
    }
    
 
    
    
    
    
      
    
}
