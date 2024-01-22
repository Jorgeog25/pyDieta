package core;

public class Paciente {

    private String nombre;
    private String fechaAlta;
    private double peso;
    private double altura;
    private Dia dia1, dia2, dia3, dia4, dia5;

    public Paciente(String nombre, String fechaAlta, double peso, double altura) {
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
        this.peso = peso;
        this.altura = altura;
        this.dia1 = new Dia(1);
        this.dia2 = new Dia(2);
        this.dia3 = new Dia(3);
        this.dia4 = new Dia(4);
        this.dia5 = new Dia(5);
    }

    public String getNombre() {
        return nombre;
    }

    public Dia getDia1() {
        return dia1;
    }

    public Dia getDia2() {
        return dia2;
    }

    public Dia getDia3() {
        return dia3;
    }

    public Dia getDia4() {
        return dia4;
    }

    public Dia getDia5() {
        return dia5;
    }
}
