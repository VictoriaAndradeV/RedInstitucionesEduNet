package Clases;
import java.util.List;

public class Docente {
    private List<String> titulosAcademicos;
    private List<String> areasDeEspecializacion;

    public Docente(){

    }

    public Docente(List<String> titulosAcademicos, List<String> areasDeEspecializacion) {
        this.titulosAcademicos = titulosAcademicos;
        this.areasDeEspecializacion = areasDeEspecializacion;
    }
}
