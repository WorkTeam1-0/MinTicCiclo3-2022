package com.sprint2.workTeam.entity;

import org.apache.catalina.User;

public class Transaccion {

    //Atributos
    private Long id;
    private String concepto;
    private Float monto;

    public Transaccion(Long id, String concepto, Float monto, User usuario, Empresa empresa) {
        this.id = id;
        this.concepto =  concepto;
        this.monto = monto;
        this.usuario = usuario;
        this.empresa = empresa;
    }

    private User usuario;
    private Empresa empresa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
