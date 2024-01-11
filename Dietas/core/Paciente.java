package core;

public class Paciente  implements IData{

    String nombre;
    String fechaAlta;
    double peso;
    double altura;

    public Paciente(String nombre, String fechaAlta, double peso, double altura) {
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void mostrarPaciente() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de alta: " + fechaAlta);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
    }

}
