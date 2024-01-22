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
    
}
