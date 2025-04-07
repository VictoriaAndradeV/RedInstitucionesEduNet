package Clases;

import java.util.GregorianCalendar;

public class Institucion {
    private GregorianCalendar fechaDeInicio;
    private String sede;
    private String idOficial;

    public Institucion(GregorianCalendar fechaDeInicio, String sede, String idOficial) {
        this.fechaDeInicio = fechaDeInicio;
        this.sede = sede;
        this.idOficial = idOficial;
    }

    public GregorianCalendar getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(GregorianCalendar fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getIdOficial() {
        return idOficial;
    }

    public void setIdOficial(String idOficial) {
        this.idOficial = idOficial;
    }
}
