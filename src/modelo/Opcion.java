package modelo;

public class Opcion {
    private String nombre;
    private double precio;

    public Opcion(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }

    @Override
    public String toString() {
        return nombre + " (S/ " + precio + ")";
    }
}
