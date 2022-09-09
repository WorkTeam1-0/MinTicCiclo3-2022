package com.empresa.empresa.entity;

public class Empresa {
    //Atributo
    private long idEmpresa;
    private String nombre;
    private String tipoIdentificacion;
    private long numeroIdentificacion;
    private long telefono;
    private String direccion;

    //Constructor
    public Empresa(long idEmpresa, String nombre, String tipoIdentificacion, long numeroIdentificacion, long telefono, String direccion) {
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    //Getters and Setters

    public long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public long getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(long numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
