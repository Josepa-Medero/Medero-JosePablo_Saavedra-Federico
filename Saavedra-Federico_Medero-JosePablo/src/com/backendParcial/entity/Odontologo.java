package com.backendParcial.entity;

public class Odontologo {

    private int numeroDeMatricula;
    private String Nombre;
    private String Apellido;

    public Odontologo(int numeroDeMatricula, String nombre, String apellido) {
        this.numeroDeMatricula = numeroDeMatricula;
        Nombre = nombre;
        Apellido = apellido;
    }

    public Odontologo(String nombre, String apellido) {
        Nombre = nombre;
        Apellido = apellido;
    }

    public int getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    public void setNumeroDeMatricula(int numeroDeMatricula) {
        this.numeroDeMatricula = numeroDeMatricula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    @Override
    public String toString(){
    return "Numero de Matricula: " + numeroDeMatricula + " - Nombre: " + Nombre + " Apellido: " + Apellido;
    }
}
