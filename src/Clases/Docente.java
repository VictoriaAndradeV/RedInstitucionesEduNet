package Clases;


public class Docente {

        private String[] titulosAcademicos;
        private String[] areasDeEspecializacion;

        public Docente(String[] titulosAcademicos, String[] areasDeEspecializacion) {
            this.titulosAcademicos = titulosAcademicos;
            this.areasDeEspecializacion = areasDeEspecializacion;
        }

        public String[] getTitulosAcademicos() {
            return titulosAcademicos;
        }

        public void setTitulosAcademicos(String[] titulosAcademicos) {
            this.titulosAcademicos = titulosAcademicos;
        }

        public String[] getAreasDeEspecializacion() {
            return areasDeEspecializacion;
        }

        public void setAreasDeEspecializacion(String[] areasDeEspecializacion) {
            this.areasDeEspecializacion = areasDeEspecializacion;
        }
}
