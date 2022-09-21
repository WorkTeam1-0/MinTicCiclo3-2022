package com.empresa.empresa.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transacciones")
public class Transaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Atributos
    private long idTransaccion;
    @Column (name="concepto")
    private String concepto;
    @Column (name="monto")
    private float monto;
    //private Usuario usuario;
    //private Empresa empresa;
    @Column (name="tipoTransaccion")
    private String tipoTransaccion;
    @Column (name="cantidadProducto")
    private float cantidadProducto;
    @Column (name="totalPagar")
    private float totalPagar;
    //private Date fechaCreacion;
    //private Date fechaActualizacion;

    //Constructor
    public Transaccion(){}
    public Transaccion(long idTransaccion, String concepto, float monto, Usuario usuario, Empresa empresa, String tipoTransaccion, float cantidadProducto, float totalPagar, Date fechaCreacion, Date fechaActualizacion) {
        this.idTransaccion = idTransaccion;
        this.concepto = concepto;
        this.monto = monto;
        //this.usuario = usuario;
        //this.empresa = empresa;
        this.tipoTransaccion = tipoTransaccion;
        this.cantidadProducto = cantidadProducto;
        this.totalPagar = totalPagar;
        //this.fechaCreacion = fechaCreacion;
        //this.fechaActualizacion = fechaActualizacion;
    }

    //Getters and Setters
    public long getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(long idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    /*public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }*/

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public float getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(float cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public float getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(float totalPagar) {
        this.totalPagar = totalPagar;
    }

    /*public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }*/
}
