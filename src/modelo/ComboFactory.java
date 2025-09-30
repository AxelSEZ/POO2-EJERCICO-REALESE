package modelo;

public class ComboFactory {
    public static Combo crearCombo(String tipo) {
        switch(tipo) {
            case "hamburguesa": return new Combo("Combo Hamburguesa", 15.0);
            case "pollo": return new Combo("Combo Pollo", 14.0);
            case "vegetariano": return new Combo("Combo Vegetariano", 12.0);
            default: throw new IllegalArgumentException("Tipo de combo no válido");
        }
    }
}
