package core;

public class Dia implements IData {

    String dia;

    public Dia(int dia) {
        this.dia = "Dia " + dia;
    }

    public String getNombre() {
        return dia;
    }

    @Override
    public boolean ingestaVacia() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ingestaVacia'");
    }

    @Override
    public void getAlimentos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAlimentos'");
    }
}
