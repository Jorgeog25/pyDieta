package core;


import utils.generica.GenericList;
import utils.generica.GenericNode;

public class Ingesta {

    String nombre; 
    GenericList<Alimento> alimentos;

    public Ingesta(String nombre) {
        this.nombre = nombre;
        this.alimentos = new GenericList<Alimento>();
    }

    public String getNombre() {
        return nombre;
    }

    public void getAlimentos() {
        GenericNode<Alimento> iterator = this.alimentos.getFirst();
    
        while (iterator != null) {
            System.out.println("      " + iterator.getValue().getNombre());
            iterator = iterator.getNext();
        }
    }
    
    public void addAlimento(Alimento alimento) {
        this.alimentos.insertEnd(alimento);
    }

    public void removeAlimento(Alimento alimento) {
        this.alimentos.delete(alimento);
    }

    public double getCalorias() {
        double calorias = 0;
        GenericNode<Alimento> iterator = this.alimentos.getFirst();
    
        while (iterator != null) {
            calorias += iterator.getValue().getCalorias();
            iterator = iterator.getNext();
        }
        return calorias;
    }

    public double getProteinas() {
        double proteinas = 0;
        GenericNode<Alimento> iterator = this.alimentos.getFirst();
    
        while (iterator != null) {
            proteinas += iterator.getValue().getProteinas();
            iterator = iterator.getNext();
        }
        return proteinas;
    }

    public double getGrasas() {
        double grasas = 0;
        GenericNode<Alimento> iterator = this.alimentos.getFirst();
    
        while (iterator != null) {
            grasas += iterator.getValue().getGrasas();
            iterator = iterator.getNext();
        }
        return grasas;
    }

    public double getCarbohidratos() {
        double carbohidratos = 0;
        GenericNode<Alimento> iterator = this.alimentos.getFirst();
    
        while (iterator != null) {
            carbohidratos += iterator.getValue().getCarbohidratos();
            iterator = iterator.getNext();
        }
        return carbohidratos;
    }

    public double getVitaminas() {
        double vitaminas = 0;
        GenericNode<Alimento> iterator = this.alimentos.getFirst();
    
        while (iterator != null) {
            vitaminas += iterator.getValue().getVitaminas();
            iterator = iterator.getNext();
        }
        return vitaminas;
    }

    public double getMinerales() {
        double minerales = 0;
        GenericNode<Alimento> iterator = this.alimentos.getFirst();
    
        while (iterator != null) {
            minerales += iterator.getValue().getMinerales();
            iterator = iterator.getNext();
        }
        return minerales;
    }
    
}
