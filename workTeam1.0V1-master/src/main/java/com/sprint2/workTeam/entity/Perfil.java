package com.sprint2.workTeam.entity;

import org.apache.catalina.User;

public class Perfil {

    //Atributo
    private String id;
    private String imagen;
    private String telefono;
    private User usuario;

    //Constructor
    public Perfil(String id, String imagen, String telefono, User usuario) {
        this.id = id;
        this.imagen = imagen;
        this.telefono = telefono;
        this.usuario = usuario;
    }


    //Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen =  imagen;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }
}
