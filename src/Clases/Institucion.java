package Clases;
import java.util.ArrayList;
import java.util.List;

public class Institucion {
    private Direccion direccion;
    private int idOficial;
    private String nombre;
    private List<String> sedes;
    private List<Asignacion> asignaciones;

    public Institucion() {
        this.asignaciones = new ArrayList<>();
    }

    public Institucion(Direccion direccion, int idOficial, String nombre, List<String> sedes) {
        this.direccion = direccion;
        this.idOficial = idOficial;
        this.nombre = nombre;
        this.sedes = sedes;
        this.asignaciones = new ArrayList<>();
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public int getIdOficial() {
        return idOficial;
    }

    public void setIdOficial(int idOficial) {
        this.idOficial = idOficial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getSedes() {
        return sedes;
    }

    public void setSedes(List<String> sedes) {
        this.sedes = sedes;
    }

    public void addAsignacion(Asignacion asignacion){
        this.asignaciones.add(asignacion);
    }

    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    @Override
    public String toString() {
        return "Institucion{" +
                "direccion=" + direccion +
                ", idOficial=" + idOficial +
                ", nombre='" + nombre + '\'' +
                ", sedes=" + sedes +
                ", asignaciones=" + asignaciones +
                '}';
    }
}
