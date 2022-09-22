package com.sprint2.workTeam.entity;

import org.apache.catalina.User;

public class Empresa {

    //Atributo
    private Long idEmpresa;
    private String nombreEmpresa;
    private String documentoEmpresa;
    private String telefonoEmpresa;
    private String direccion;
    private User usuarios [];
    private Transaccion transacciones [];

    //Constructor

    public Empresa(Long idEmpresa, String nombreEmpresa, String documentoEmpresa, String telefonoEmpresa, String direccion, User[] usuarios, Transaccion[] transacciones) {
        this.idEmpresa = idEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.documentoEmpresa = documentoEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.direccion = direccion;
        this.usuarios = usuarios;
        this.transacciones = transacciones;
    }

    //Getters and Setters

    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDocumentoEmpresa() {
        return documentoEmpresa;
    }

    public void setDocumentoEmpresa(String documentoEmpresa) {
        this.documentoEmpresa = documentoEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public User[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(User[] usuarios) {
        this.usuarios = usuarios;
    }

    public Transaccion[] getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(Transaccion[] transacciones) {
        this.transacciones = transacciones;
    }

}
