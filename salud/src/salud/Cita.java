package salud;


public class Cita {
    private Paciente paciente;
    private Medico medico;
    private String fecha;

    public Cita(Paciente paciente, Medico medico, String fecha) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
    }

    public void mostrarCita() {
        System.out.println("Cita para: " + paciente.getNombre() +
                " con el Dr. " + medico.getNombre() +
                " (" + medico.getEspecialidad() +
                ") en " + fecha);
    }
}