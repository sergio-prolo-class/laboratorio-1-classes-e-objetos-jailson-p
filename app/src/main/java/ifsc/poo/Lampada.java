package ifsc.poo;

public class Lampada {

    private boolean ligada = true;

    public Lampada(){
        this.ligada = true;
    }

    public Lampada(boolean ligada){
        this.ligada = ligada;
    }

    public void ligar(){
        this.ligada = true;
    }

    public void desligar(){
        this.ligada = false;
    }

    public boolean verEstado(){
        return this.ligada;
    }

}
