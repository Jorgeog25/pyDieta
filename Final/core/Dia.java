package core;

public class Dia {

    private String dia;
    private Ingesta desayuno, almuerzo, comida, merienda, cena;

    public Dia(int dia) {
        this.dia = "Dia " + dia;
        this.desayuno = new Ingesta("Desayuno");
        this.almuerzo = new Ingesta("Almuerzo");
        this.comida = new Ingesta("Comida");
        this.merienda = new Ingesta("Merienda");
        this.cena = new Ingesta("Cena");
    }

    public String getDia() {
        return dia;
    }

    public Ingesta getDesayuno() {
        return desayuno;
    }

    public Ingesta getAlmuerzo() {
        return almuerzo;
    }

    public Ingesta getComida() {
        return comida;
    }

    public Ingesta getMerienda() {
        return merienda;
    }

    public Ingesta getCena() {
        return cena;
    }

    public double getCalorias() {
        double caloriasTotal = this.desayuno.getCalorias() + this.almuerzo.getCalorias() + this.comida.getCalorias() + this.merienda.getCalorias() + this.cena.getCalorias();
        return caloriasTotal;
    }
    
    public double getProteinas() {
        double proteinasTotal = this.desayuno.getProteinas() + this.almuerzo.getProteinas() + this.comida.getProteinas() + this.merienda.getProteinas() + this.cena.getProteinas();
        return proteinasTotal;
    }

    public double getGrasas() {
        double grasasTotal = this.desayuno.getGrasas() + this.almuerzo.getGrasas() + this.comida.getGrasas() + this.merienda.getGrasas() + this.cena.getGrasas();
        return grasasTotal;
    }

    public double getCarbohidratos() {
        double carbohidratosTotal = this.desayuno.getCarbohidratos() + this.almuerzo.getCarbohidratos() + this.comida.getCarbohidratos() + this.merienda.getCarbohidratos() + this.cena.getCarbohidratos();
        return carbohidratosTotal;
    }

    public double getVitaminas() {
        double vitaminasTotal = this.desayuno.getVitaminas() + this.almuerzo.getVitaminas() + this.comida.getVitaminas() + this.merienda.getVitaminas() + this.cena.getVitaminas();
        return vitaminasTotal;
    }

    public double getMinerales() {
        double mineralesTotal = this.desayuno.getMinerales() + this.almuerzo.getMinerales() + this.comida.getMinerales() + this.merienda.getMinerales() + this.cena.getMinerales();
        return mineralesTotal;
    }

}
