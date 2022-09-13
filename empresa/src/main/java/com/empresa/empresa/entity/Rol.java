package com.empresa.empresa.entity;


public class Rol {
    //Atributo
    private long idRol;
    private String nombreRol;

    //Constructor
    public Rol(){}
    public Rol(long idRol, String nombreRol) {
        this.idRol = idRol;
        this.nombreRol = nombreRol;
    }

    //Getters and Setters
    public long getIdRol() {
        return idRol;
    }

    public void setIdRol(long idRol) {
        this.idRol = idRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
}
