package Ejecucion;

public class Contrato {
    private Cliente cliente;
    private Plan plan;
    private String fechaActivacion;

    public Contrato(Cliente cliente, Plan plan, String fechaActivacion) {
        this.cliente = cliente;
        this.plan = plan;
        this.fechaActivacion = fechaActivacion;
    }

    public void mostrarContrato() {
        System.out.println("Cliente: " + cliente.getNombre() +
                " (" + cliente.getTelefono() + ")" +
                " tiene el plan: " + plan.getNombrePlan() +
                " - " + plan.getDetalle() +
                " por $" + plan.getPrecio() +
                " activado el " + fechaActivacion);
    }
}