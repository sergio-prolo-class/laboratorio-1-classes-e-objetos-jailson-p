package ifsc.poo;

public class Lampada {
    //Iten 1.1 variável boolean
    private boolean lampada ;
    private static int quantidadeLampadas;
    //Item 1.4 - Readme.md - construtor com estado inicial fixo
    public Lampada(){
        this.lampada = false;
        quantidadeLampadas++;
    }
    //Item 1.4 - Readme.md - construtor com argumento
    public Lampada(boolean novoEstado){
        this.lampada = novoEstado;
        quantidadeLampadas++;
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