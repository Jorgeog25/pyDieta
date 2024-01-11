package core;
public class Alimento {

    String nombre;
    double calorias;

    public Alimento(String nombre, double calorias) {
        this.nombre = nombre;
        this.calorias = calorias;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }
}
