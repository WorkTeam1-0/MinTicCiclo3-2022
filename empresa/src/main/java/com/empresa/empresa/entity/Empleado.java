package com.empresa.empresa.entity;

public class Empleado {
    //Atributo
    private long idEmpleado;
    private Usuario idUsuario;
    private Empresa idEmpresa;

    //Constructor
    public Empleado(long idEmpleado, Usuario idUsuario, Empresa idEmpresa) {
        this.idEmpleado = idEmpleado;
        this.idUsuario = idUsuario;
        this.idEmpresa = idEmpresa;
    }

    //Getters and Setters
    public long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Empresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Empresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
}
