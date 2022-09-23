package com.empresa.empresa.entity;

import javax.persistence.*;

@Entity
@Table(name = "empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //Atribut
    private long idEmpresa;
    @Column (name="nombre")
    private String nombre;
    @Column (name="tipoIdentificacion")
    private String tipoIdentificacion;
    @Column (name="numeroIdentificacion")
    private long numeroIdentificacion;
    @Column (name="telefono")
    private long telefono;
    @Column (name="direccion")
    private String direccion;
    @Column (name="email")
    private String email;

    //Constructor
    public Empresa(){}
    public Empresa(long idEmpresa, String nombre, String tipoIdentificacion, long numeroIdentificacion, long telefono, String direccion) {
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
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

    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}
