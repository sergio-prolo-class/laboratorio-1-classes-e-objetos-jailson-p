package ifsc.poo;

public class Retangulo implements Comparable<Retangulo> {
    //Item 3.1 - Readme.md - Atributos
    private float largura;
    private float altura;
    //Task up
    private static Retangulo maiorArea;
    private static Retangulo menorPerimetro;

    public Retangulo(float largura,float altura){
        if(largura <= 0) this.largura = 1;
        else this.largura = largura;
        if(altura <= 0) this.altura = 1;
        else this.altura = altura;
    }

    //Item 3.2 - Readme.md - (void) setLargura(float largura)
    public void setLargura(float largura){
        this.largura = largura;
    }

    //Item 3.2 - Readme.md - (void) setAltura(float altura)
    public void setAltura(float altura){
        this.altura = altura;
    }

    //Item 3.2 - Readme.md - (float) getArea()
    public float getArea(){
        return largura*altura;
    }

    //Item 3.2 - Readme.md - (float) getPerimetro()
    public float getPerimetro(){
        return 2*(largura + altura);
    }

    public float getLargura(){
        return this.largura;
    }

    public float getAltura(){
        return this.altura;
    }

    //Métod0 utilitário para uso interno para calcular A/P
    private float getRazaoAreaSobrePerimetro(Retangulo a){ return a.getArea() / a.getPerimetro();}

    //Métod0 requisitado para uso com a classe Collections, um comparador para classe Retangulo entre A/P
    public int compareTo(Retangulo outroRetangulo){
        if      (getRazaoAreaSobrePerimetro(this) < getRazaoAreaSobrePerimetro(outroRetangulo))   {return -1;}
        else if (getRazaoAreaSobrePerimetro(this) > getRazaoAreaSobrePerimetro(outroRetangulo))   {return 1;}
        else                                                                                         {return 0;}
    }

    @Override
    public String toString() {
        return  "Para um retângulo com:\n" +
                "Largura:"+ this.getLargura() + " e altura: " + this.getAltura()
                +"\nArea: "+ this.getArea() + " e o perímetro é " + this.getPerimetro() + " e sua razão A/P é :" + this.getRazaoAreaSobrePerimetro(this) + "\n";
    }
}