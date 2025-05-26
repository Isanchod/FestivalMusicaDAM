public class Concierto {

    private String fecha;
    private Grupo grupo;
    private Escenario escenario;

    public Concierto(String fecha, Grupo grupo, Escenario escenario) {
        this.fecha = fecha;
        this.grupo = grupo;
        this.escenario = escenario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Escenario getEscenario() {
        return escenario;
    }

    public void setEscenario(Escenario escenario) {
        this.escenario = escenario;
    }
}
