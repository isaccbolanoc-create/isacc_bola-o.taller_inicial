package ejecucion;

import salud.Cita;
import salud.Medicamento;
import salud.Medico;
import salud.Paciente;

public class Main {
    public static void main(String[] args) {
        // Crear pacientes
        Paciente paciente1 = new Paciente("Juan Perez", 30);
        Paciente paciente2 = new Paciente("Ana López", 25);

        // Crear medicos
        Medico medico1 = new Medico("Dr. Gómez", "Cardiología");
        Medico medico2 = new Medico("Dra. Martínez", "Pediatría");

        // Crear medicamentos
        Medicamento med1 = new Medicamento("Paracetamol", "500mg");
        Medicamento med2 = new Medicamento("Ibuprofeno", "400mg");

        // Crear citas
        Cita cita1 = new Cita(paciente1, medico1, "12/03/2026");
        Cita cita2 = new Cita(paciente2, medico2, "15/03/2026");

        // Mostrar información
        cita1.mostrarCita();
        cita2.mostrarCita();

        System.out.println("Medicamentos recetados:");
        System.out.println(paciente1.getNombre() + " -> " + med1.getNombre() + " " + med1.getDosis());
        System.out.println(paciente2.getNombre() + " -> " + med2.getNombre() + " " + med2.getDosis());
    }
}