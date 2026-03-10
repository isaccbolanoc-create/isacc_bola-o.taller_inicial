package Ejecucion;

public class Plan {
    private String nombrePlan;
    private double precio;
    private String detalle; // datos o minutos

    public Plan(String nombrePlan, double precio, String detalle) {
        this.nombrePlan = nombrePlan;
        this.precio = precio;
        this.detalle = detalle;
    }

    public String getNombrePlan() {
        return nombrePlan;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDetalle() {
        return detalle;
    }
}