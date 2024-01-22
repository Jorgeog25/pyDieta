package core;

public class Alimento {

    private String nombre;
    private double calorias;

    public Alimento(String nombre, double calorias) {
        this.nombre = nombre;
        this.calorias = calorias;
    }

    public String getNombre() {
        return nombre;
    }
}

