import Ejecucion.Cliente;
import Ejecucion.Contrato;
import Ejecucion.Plan;

public class Main {
    public static void main(String[] args) {
        // Crear clientes
        Cliente cliente1 = new Cliente("Juan Perez", "555-1234");
        Cliente cliente2 = new Cliente("Ana López", "555-5678");

        // Crear planes
        Plan plan1 = new Plan("Plan Básico", 20.0, "100 minutos y 2GB");
        Plan plan2 = new Plan("Plan Premium", 50.0, "500 minutos y 20GB");

        // Crear contratos
        Contrato contrato1 = new Contrato(cliente1, plan1, "10/03/2026");
        Contrato contrato2 = new Contrato(cliente2, plan2, "11/03/2026");

        // Mostrar contratos
        contrato1.mostrarContrato();
        contrato2.mostrarContrato();
    }
}