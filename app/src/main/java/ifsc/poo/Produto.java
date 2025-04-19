package ifsc.poo;
import org.apache.commons.lang3.StringUtils;

public class Produto {
    //Item 5.1 - Readme.md - Atributos
    private String nome;
    private int preco;
    private int desconto;

    public Produto(){Produto produto = new Produto("",0);}

    public Produto(String nome,int preco) {
        this.nome = nome;
        this.preco= preco *100;
    }

    //Item 5.2 - Readme.md - criar método (void) setNome(String nome)
    public void setNome(String nome){this.nome = nome;}

    //Item 5.2 - Readme.md - - criar método (String) getNome()
    public String getNome(){return this.nome;}

    //Item 5.2 - Readme.md - - criar método (void) setPreco(int preco)
    public void setPreco(int preco){this.preco = preco * 100;}

    //Item 5.2 - Readme.md - - criar método (void) setPreco(int preco)
    public float getPreco(){return (float) this.preco/100.00f;}

    //Item 5.2 - Readme.md - - criar método (void) setDesconto(int desconto)
    public void setDesconto(int desconto){this.desconto = desconto;}

    //Item 5.2 - Readme.md - - criar método (int) getDesconto()
    public int getDesconto(){return this.desconto;}

    //Item 5.3(d) -Readme.me - Criar método (String) anuncio()
    //todo métodos com mensagens estilizadas na classe, o que diz a convenção?
    public String anuncio(){
        String  nome = StringUtils.capitalize(this.getNome());
        float  precoComDesconto = this.getPreco()-(this.getPreco()*this.getDesconto()/100.00f);
        return String.format(( "%s: de R$ %.2f por APENAS R$ %.2f!\n" ), nome, this.getPreco(), precoComDesconto).replace(".",",");
    }
}
/*
    Item 5.3(e) - Crítica sobre esta modelagem -
    Atributos int preco e int desconto mudaria par double, facilitaria sem usar gambiarras e ajustadas para uso monetário.
    Todos os métodos com retorno int para doble assim como as entradas int também.
*/