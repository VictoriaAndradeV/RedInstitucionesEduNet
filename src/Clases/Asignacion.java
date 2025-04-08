package Clases;

import java.util.GregorianCalendar;
import enums.Rol;

public class Asignacion {
    private GregorianCalendar fechaInicio;
    private Persona persona;
    private Rol rol;

    public Asignacion() { //constructor vacio

    }

    public Asignacion(GregorianCalendar fechaInicio, Persona persona, Rol rol) { //constructor con todos los atributos
        this.fechaInicio = fechaInicio;
        this.persona = persona;
        this.rol = rol;
    }

    public GregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(GregorianCalendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Rol getRol() { //getter para enum ROL
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Asignacion{" +
                "fechaInicio=" + fechaInicio +
                ", persona=" + persona +
                ", rol=" + rol +
                '}';
    }
}
