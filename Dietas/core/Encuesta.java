package core;

import utils.GenericTree;

public class Encuesta {

    String fechaToma;
    private GenericTree<IData> tree;

    public Encuesta(String fechaToma) {
        this.fechaToma = fechaToma;
        this.tree = new GenericTree<IData>();
    }

    private Dia lunes = new Dia(1);
    private Dia martes = new Dia(2);
    private Dia miercoles = new Dia(3);
    private Dia jueves = new Dia(4);
    private Dia viernes = new Dia(5);

    private Ingesta desayuno = new Ingesta("Desayuno");
    private Ingesta almuerzo = new Ingesta("Almuerzo");
    private Ingesta comida = new Ingesta("Comida");
    private Ingesta merienda = new Ingesta("Merienda");
    private Ingesta cena = new Ingesta("Cena");
    

    public void rellenarArbol(Paciente paciente){
        this.tree.insertNode(tree.getRoot(), paciente, 0, 0);

        this.tree.insertNode(tree.getRoot(), lunes, 1, 0);
        this.tree.insertNode(tree.getRoot(), martes, 2, 0);
        this.tree.insertNode(tree.getRoot(), miercoles, 3, 0);
        this.tree.insertNode(tree.getRoot(), jueves, 4, 0);
        this.tree.insertNode(tree.getRoot(), viernes, 5, 0);

        this.tree.insertNode(tree.getRoot(), desayuno, 1, 1);
        this.tree.insertNode(tree.getRoot(), almuerzo, 1, 2);
        this.tree.insertNode(tree.getRoot(), comida, 1, 3);
        this.tree.insertNode(tree.getRoot(), merienda, 1, 4);
        this.tree.insertNode(tree.getRoot(), cena, 1, 5);

        this.tree.insertNode(tree.getRoot(), desayuno, 2, 1);
        this.tree.insertNode(tree.getRoot(), almuerzo, 2, 2);
        this.tree.insertNode(tree.getRoot(), comida, 2, 3);
        this.tree.insertNode(tree.getRoot(), merienda, 2, 4);
        this.tree.insertNode(tree.getRoot(), cena, 2, 5);

        this.tree.insertNode(tree.getRoot(), desayuno, 3, 1);
        this.tree.insertNode(tree.getRoot(), almuerzo, 3, 2);
        this.tree.insertNode(tree.getRoot(), comida, 3, 3);
        this.tree.insertNode(tree.getRoot(), merienda, 3, 4);
        this.tree.insertNode(tree.getRoot(), cena, 3, 5);

        this.tree.insertNode(tree.getRoot(), desayuno, 4, 1);
        this.tree.insertNode(tree.getRoot(), almuerzo, 4, 2);
        this.tree.insertNode(tree.getRoot(), comida, 4, 3);
        this.tree.insertNode(tree.getRoot(), merienda, 4, 4);
        this.tree.insertNode(tree.getRoot(), cena, 4, 5);
    }

    public void mostrarArbol(){
        System.out.println();
        System.out.println("Paciente: " + this.tree.getRoot().getValue().getNombre());

        System.out.println(" " + this.tree.getRoot().first.getValue().getNombre());
        System.out.println("  " + this.tree.getRoot().first.first.getValue().getNombre());
        if(!this.tree.getRoot().first.first.getValue().ingestaVacia()){
            this.tree.getRoot().first.first.getValue().getAlimentos();
        }
        System.out.println("  " + this.tree.getRoot().first.second.getValue().getNombre());
        if(!this.tree.getRoot().first.second.getValue().ingestaVacia()){
            this.tree.getRoot().first.second.getValue().getAlimentos();
        }
        System.out.println("  " + this.tree.getRoot().first.third.getValue().getNombre());
        if(!this.tree.getRoot().first.third.getValue().ingestaVacia()){
            this.tree.getRoot().first.third.getValue().getAlimentos();
        }
        System.out.println("  " + this.tree.getRoot().first.fourth.getValue().getNombre());
        if(!this.tree.getRoot().first.fourth.getValue().ingestaVacia()){
            this.tree.getRoot().first.fourth.getValue().getAlimentos();
        }
        System.out.println("  " + this.tree.getRoot().first.fifth.getValue().getNombre());
        if(!this.tree.getRoot().first.fifth.getValue().ingestaVacia()){
            this.tree.getRoot().first.fifth.getValue().getAlimentos();
        }

        System.out.println(" " + this.tree.getRoot().second.getValue().getNombre());
        System.out.println("  " + this.tree.getRoot().second.first.getValue().getNombre());
        if(!this.tree.getRoot().second.first.getValue().ingestaVacia()){
            this.tree.getRoot().second.first.getValue().getAlimentos();
        }
        System.out.println("  " + this.tree.getRoot().second.second.getValue().getNombre());
        if(!this.tree.getRoot().second.second.getValue().ingestaVacia()){
            this.tree.getRoot().second.second.getValue().getAlimentos();
        }
        System.out.println("  " + this.tree.getRoot().second.third.getValue().getNombre());
        if(!this.tree.getRoot().second.third.getValue().ingestaVacia()){
            this.tree.getRoot().second.third.getValue().getAlimentos();
        }
        System.out.println("  " + this.tree.getRoot().second.fourth.getValue().getNombre());
        if(!this.tree.getRoot().second.fourth.getValue().ingestaVacia()){
            this.tree.getRoot().second.fourth.getValue().getAlimentos();
        }
        System.out.println("  " + this.tree.getRoot().second.fifth.getValue().getNombre());
        if(!this.tree.getRoot().second.fifth.getValue().ingestaVacia()){
            this.tree.getRoot().second.fifth.getValue().getAlimentos();
        }

        System.out.println(" " + this.tree.getRoot().third.getValue().getNombre());
        System.out.println("  " + this.tree.getRoot().third.first.getValue().getNombre());
        if(!this.tree.getRoot().third.first.getValue().ingestaVacia()){
            this.tree.getRoot().third.first.getValue().getAlimentos();
        }
        System.out.println("  " + this.tree.getRoot().third.second.getValue().getNombre());
        if(!this.tree.getRoot().third.second.getValue().ingestaVacia()){
            this.tree.getRoot().third.second.getValue().getAlimentos();
        }
        System.out.println("  " + this.tree.getRoot().third.third.getValue().getNombre());
        if(!this.tree.getRoot().third.third.getValue().ingestaVacia()){
            this.tree.getRoot().third.third.getValue().getAlimentos();
        }
        System.out.println("  " + this.tree.getRoot().third.fourth.getValue().getNombre());
        if(!this.tree.getRoot().third.fourth.getValue().ingestaVacia()){
            this.tree.getRoot().third.fourth.getValue().getAlimentos();
        }
        System.out.println("  " + this.tree.getRoot().third.fifth.getValue().getNombre());
        if(!this.tree.getRoot().third.fifth.getValue().ingestaVacia()){
            this.tree.getRoot().third.fifth.getValue().getAlimentos();
        }

        System.out.println(" " + this.tree.getRoot().fourth.getValue().getNombre());
        System.out.println("  " + this.tree.getRoot().fourth.first.getValue().getNombre());
        if(!this.tree.getRoot().fourth.first.getValue().ingestaVacia()){
            this.tree.getRoot().fourth.first.getValue().getAlimentos();
        }
        System.out.println("  " + this.tree.getRoot().fourth.second.getValue().getNombre());
        if(!this.tree.getRoot().fourth.second.getValue().ingestaVacia()){
            this.tree.getRoot().fourth.second.getValue().getAlimentos();
        }
        System.out.println("  " + this.tree.getRoot().fourth.third.getValue().getNombre());
        if(!this.tree.getRoot().fourth.third.getValue().ingestaVacia()){
            this.tree.getRoot().fourth.third.getValue().getAlimentos();
        }
        System.out.println("  " + this.tree.getRoot().fourth.fourth.getValue().getNombre());
        if(!this.tree.getRoot().fourth.fourth.getValue().ingestaVacia()){
            this.tree.getRoot().fourth.fourth.getValue().getAlimentos();
        }
        System.out.println("  " + this.tree.getRoot().fourth.fifth.getValue().getNombre());
        if(!this.tree.getRoot().fourth.fifth.getValue().ingestaVacia()){
            this.tree.getRoot().fourth.fifth.getValue().getAlimentos();
        }

        System.out.println(" " + this.tree.getRoot().fifth.getValue().getNombre());
        System.out.println("  " + this.tree.getRoot().fifth.first.getValue().getNombre());
        if(!this.tree.getRoot().fifth.first.getValue().ingestaVacia()){
            this.tree.getRoot().fifth.first.getValue().getAlimentos();
        }
        System.out.println("  " + this.tree.getRoot().fifth.second.getValue().getNombre());
        if(!this.tree.getRoot().fifth.second.getValue().ingestaVacia()){
            this.tree.getRoot().fifth.second.getValue().getAlimentos();
        }
        System.out.println("  " + this.tree.getRoot().fifth.third.getValue().getNombre());
        if(!this.tree.getRoot().fifth.third.getValue().ingestaVacia()){
            this.tree.getRoot().fifth.third.getValue().getAlimentos();
        }
        System.out.println("  " + this.tree.getRoot().fifth.fourth.getValue().getNombre());
        if(!this.tree.getRoot().fifth.fourth.getValue().ingestaVacia()){
            this.tree.getRoot().fifth.fourth.getValue().getAlimentos();
        }
        System.out.println("  " + this.tree.getRoot().fifth.fifth.getValue().getNombre());
        if(!this.tree.getRoot().fifth.fifth.getValue().ingestaVacia()){
            this.tree.getRoot().fifth.fifth.getValue().getAlimentos();
        }
    }
 
}
