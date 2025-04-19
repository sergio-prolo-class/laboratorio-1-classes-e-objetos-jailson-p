package ifsc.poo;

public class Retangulo {
    //Item 3.1 - Readme.md - Atributos
    private float largura;
    private float altura;
    //Task up
    private static Retangulo maiorArea;
    private static Retangulo menorPerimetro;
    private static Retangulo maiorAreaPorPerimetro;

    public Retangulo(float largura,float altura){
        if(largura <= 0) this.largura = 1;
        else this.largura = largura;
        if(altura <= 0) this.altura = 1;
        else this.altura = altura;
        if (maiorArea != null){
            if (this.getArea() > maiorArea.getArea())                maiorArea = this;
            if (this.getPerimetro() < menorPerimetro.getPerimetro()) menorPerimetro = this;
            if (this.getAreaPorPerimetro() > maiorAreaPorPerimetro.getAreaPorPerimetro()) maiorAreaPorPerimetro = this;
        }
        else maiorArea = menorPerimetro = maiorAreaPorPerimetro = this;
    }

    //Item 3.2 - Readme.md - (void) setLargura(float largura)
    public void setLargura(float largura){ this.largura = largura;}

    //Item 3.2 - Readme.md - (void) setAltura(float altura)
    public void setAltura(float altura){ this.altura = altura; }

    public float getLargura(){ return this.largura; }

    public float getAltura(){ return this.altura; }

    //Item 3.2 - Readme.md - (float) getArea()
    public float getArea(){ return largura*altura; }

    //Item 3.2 - Readme.md - (float) getPerimetro()
    public float getPerimetro(){ return 2*(this.largura + this.altura); }

    //Métod0 utilitário para uso interno para calcular A/P
    private  float getAreaPorPerimetro(){ return this.getArea() / this.getPerimetro();}

    public static Retangulo getMaiorArea(){ return maiorArea; }

    public static Retangulo getMenorPerimetro(){ return menorPerimetro; }

    public static Retangulo getMaiorAreaPorPerimetro(){return maiorAreaPorPerimetro;}

    @Override
    public String toString() {
        return  String.format("\nLargura: %3.2f\tAltura: %3.2f\tArea: %4.2f  \t\tPerímetro: %3.2f \tRazão A/P: %.2f\n", this.largura, this.altura, this.getArea(), this.getPerimetro(),this.getAreaPorPerimetro());
    }
}