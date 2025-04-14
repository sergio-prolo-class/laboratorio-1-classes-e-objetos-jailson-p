package ifsc.poo;

public class Retangulo {

    private float largura;
    private float altura;

    public Retangulo(float largura,float altura){
        this.largura = largura;
        this.altura = altura;
    }

    public void setLargura(float largura){
        this.largura = largura;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public float getArea(){
        return largura*altura;
    }

    public float getPerimetro(){
        return 2*(largura + altura);
    }

    public float getLargura(){
        return this.largura;
    }

    public float getAltura(){
        return this.altura;
    }

    @Override
    public String toString() {

        return "\nPara um retângulo de " + this.getLargura() + " larg. com " + this.getAltura()
                +" de altura a área deste retângulo é "+ this.getArea() + " e o perímetro é " + this.getPerimetro() + "\n";
    }
}
