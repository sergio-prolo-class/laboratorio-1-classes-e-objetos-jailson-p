package ifsc.poo;

public class Lampada {
    //Iten 1.1 variável boolean
    private boolean lampada ;

    //construtor
    public Lampada(){this.lampada = false;}
    //construtor com argumento
    public Lampada(boolean novoEstado){
        this.lampada = novoEstado;
    }

    //Item 1.2 - Readme.md. Método que permite manter o estado "ligado" da lâmpada
    public void ligar(){
        this.lampada = true;
    }

    //Item 1.2 - Readme.md. Método que permite manter o esdado "desligado" da lâmpada
    public void desligar(){
        this.lampada = false;
    }

    //Item 1.2 - Readme.md. Método que devolve o estado da lâmpada
    public boolean verEstado(){
        return this.lampada;
    }
}