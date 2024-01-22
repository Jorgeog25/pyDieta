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



    
}
