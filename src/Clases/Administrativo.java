package Clases;


public class Administrativo {

        private String[] cargos;
        private String[] responsabilidades;

        public Administrativo(String[] cargos, String[] responsabilidades) {
            this.cargos = cargos;
            this.responsabilidades = responsabilidades;
        }

        public String[] getCargos() {
            return cargos;
        }

        public void setCargos(String[] cargos) {
            this.cargos = cargos;
        }

        public String[] getResponsabilidades() {
            return responsabilidades;
        }

        public void setResponsabilidades(String[] responsabilidades) {
            this.responsabilidades = responsabilidades;
        }

}
