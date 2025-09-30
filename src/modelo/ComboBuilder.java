package modelo;

public class ComboBuilder {
    private Combo combo;
    private Opcion bebida;
    private Opcion extra;
    private Opcion acompanamiento;

    public ComboBuilder(Combo combo) {
        this.combo = combo;
    }

    public ComboBuilder addBebida(Opcion bebida) {
        this.bebida = bebida;
        return this;
    }

    public ComboBuilder addExtra(Opcion extra) {
        this.extra = extra;
        return this;
    }

    public ComboBuilder addAcompanamiento(Opcion acomp) {
        this.acompanamiento = acomp;
        return this;
    }

    public String build() {
        double total = combo.getPrecio();
        StringBuilder detalle = new StringBuilder(combo.getNombre() + " ");

        // Agregar bebida si no es "Ninguno"
        if (bebida != null && !bebida.getNombre().equalsIgnoreCase("Ninguno")) {
            detalle.append("con ").append(bebida).append(" ");
            total += bebida.getPrecio();
        }

        // Agregar acompañamiento si no es "Ninguno"
        if (acompanamiento != null && !acompanamiento.getNombre().equalsIgnoreCase("Ninguno")) {
            detalle.append("y ").append(acompanamiento).append(" ");
            total += acompanamiento.getPrecio();
        }

        // Agregar extra si no es "Ninguno"
        if (extra != null && !extra.getNombre().equalsIgnoreCase("Ninguno")) {
            detalle.append("más ").append(extra).append(" ");
            total += extra.getPrecio();
        }

        detalle.append("\nTotal: S/ ").append(total);

        return detalle.toString();
    }
}
