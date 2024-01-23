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

    public double getCalorias() {
        double caloriasTotal = this.dia1.getCalorias() + this.dia2.getCalorias() + this.dia3.getCalorias() + this.dia4.getCalorias() + this.dia5.getCalorias();
        return caloriasTotal;
    }

    public double getProteinas() {
        double proteinasTotal = this.dia1.getProteinas() + this.dia2.getProteinas() + this.dia3.getProteinas() + this.dia4.getProteinas() + this.dia5.getProteinas();
        return proteinasTotal;
    }

    public double getGrasas() {
        double grasasTotal = this.dia1.getGrasas() + this.dia2.getGrasas() + this.dia3.getGrasas() + this.dia4.getGrasas() + this.dia5.getGrasas();
        return grasasTotal;
    }

    public double getCarbohidratos() {
        double carbohidratosTotal = this.dia1.getCarbohidratos() + this.dia2.getCarbohidratos() + this.dia3.getCarbohidratos() + this.dia4.getCarbohidratos() + this.dia5.getCarbohidratos();
        return carbohidratosTotal;
    }

    public double getVitaminas() {
        double vitaminasTotal = this.dia1.getVitaminas() + this.dia2.getVitaminas() + this.dia3.getVitaminas() + this.dia4.getVitaminas() + this.dia5.getVitaminas();
        return vitaminasTotal;
    }

    public double getMinerales() {
        double mineralesTotal = this.dia1.getMinerales() + this.dia2.getMinerales() + this.dia3.getMinerales() + this.dia4.getMinerales() + this.dia5.getMinerales();
        return mineralesTotal;
    }
}
