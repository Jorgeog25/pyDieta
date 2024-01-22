package core;


import utils.generica.GenericList;

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
        GenericList<Alimento> iterator = new GenericList<>();
        iterator = this.alimentos;
        while (iterator.getFirst() != null) {
            System.out.println("      " + iterator.getFirst().getValue().getNombre());
            iterator.deleteFront();
        }
    }

    public void addAlimento(Alimento alimento) {
        this.alimentos.insertEnd(alimento);
    }



    
}
