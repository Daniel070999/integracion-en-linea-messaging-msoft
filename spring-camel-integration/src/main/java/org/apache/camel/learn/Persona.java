package org.apache.camel.learn;

public class Persona {

    private int codigo;
    private String identificacion;
    private String nombres;
    private String direccion;
    private String tipotransaccion;

    public Persona() {
    };

    public Persona(int codigo, String identificacion, String nombres, String direccion, String tipotransaccion) {
        this.codigo = codigo;
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.direccion = direccion;
        this.tipotransaccion = tipotransaccion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipotransaccion() {
        return tipotransaccion;
    }

    public void setTipotransaccion(String tipotransaccion) {
        this.tipotransaccion = tipotransaccion;
    }

    @Override
    public String toString() {
        return "Persona [codigo=" + codigo + ", identificacion=" + identificacion + ", nombres=" + nombres
                + ", direccion=" + direccion + ", tipotransaccion=" + tipotransaccion + "]";
    }

}
