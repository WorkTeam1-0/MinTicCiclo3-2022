package com.empresa.empresa.entity;

public class Empleado {
    //Atributo
    private Long idEmpleado;
    private String email;
    private String perfil;
    private String rol;
    private String empresa;
    private Transaccion transacciones [];

    //Constructor
    public Empleado(Long idEmpleado, String email, String perfil, String rol, String empresa, Transaccion[] transacciones) {
        this.idEmpleado = idEmpleado;
        this.email = email;
        this.perfil = perfil;
        this.rol = rol;
        this.empresa = empresa;
        this.transacciones = transacciones;
    }

    //Getters and Setters

    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Transaccion[] getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(Transaccion[] transacciones) {
        this.transacciones = transacciones;
    }
}
