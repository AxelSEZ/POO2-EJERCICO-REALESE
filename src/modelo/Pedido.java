package modelo;

public class Pedido {
    private String comboBase;
    private double precioComboBase;
    private String bebida;
    private double precioBebida;
    private String acompanamiento;
    private double precioAcompanamiento;
    private String extra;
    private double precioExtra;

    public Pedido(String comboBase, double precioComboBase,
                  String bebida, double precioBebida,
                  String acompanamiento, double precioAcompanamiento,
                  String extra, double precioExtra) {
        this.comboBase = comboBase;
        this.precioComboBase = precioComboBase;
        this.bebida = bebida;
        this.precioBebida = precioBebida;
        this.acompanamiento = acompanamiento;
        this.precioAcompanamiento = precioAcompanamiento;
        this.extra = extra;
        this.precioExtra = precioExtra;
    }

    public double calcularTotal() {
        return precioComboBase + precioBebida + precioAcompanamiento + precioExtra;
    }

    public void mostrarResumen() {
        System.out.println("\n===== Resumen del pedido =====");

        // Combo base SIEMPRE se muestra
        System.out.println("Combo base: " + comboBase + " - S/ " + precioComboBase);

        if (!bebida.equals("Ninguno")) {
            System.out.println("Bebida: " + bebida + " - S/ " + precioBebida);
        }
        if (!acompanamiento.equals("Ninguno")) {
            System.out.println("Acompañamiento: " + acompanamiento + " - S/ " + precioAcompanamiento);
        }
        if (!extra.equals("Ninguno")) {
            System.out.println("Extra: " + extra + " - S/ " + precioExtra);
        }

        System.out.println("-----------------------------");
        System.out.println("Total a pagar: S/ " + calcularTotal());
    }
}
