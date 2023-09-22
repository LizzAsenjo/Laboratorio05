/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio_05;

/**
 *
 * @author Liz
 */
public class Estudiante {
    
    private String nombre;
    private String apellido; 
    private String dni;
    
    public Estudiante(){}   

    public Estudiante(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String getTextoLista(){ //esto te ayuda a guardar en este orden 
        return this.apellido+ ", " 
                +this.nombre+ ""
                +" | DNI: " +this.dni;
    }
}
