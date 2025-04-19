package ifsc.poo;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;

public class Produto {
    //Item 5.1 - Readme.md - Atributos
    private String nome;
    private int preco;
    private int desconto;
    private Codigo codigo;
    private static int contProdutos;
    private static int capacidadeLista;
    private static ArrayList<Produto> ultimos50;

    public Produto(String nome,int preco) {
        this.nome = nome;
        this.setPreco(preco);
        this.desconto = 0;
        contProdutos++;
        this.codigo = new Codigo(contProdutos);
        if(contProdutos == 1) {
            capacidadeLista = 50;
            ultimos50 = new ArrayList<>(capacidadeLista);
        }
        Produto.addListaUltimos50(this);
    }

    //Item 5.2 - Readme.md - criar método (void) setNome(String nome)
    public void setNome(String nome){this.nome = nome;}

    //Item 5.2 - Readme.md - - criar método (String) getNome()
    public String getNome(){return this.nome;}

    //Item 5.2 - Readme.md - - criar método (void) setPreco(int preco)
    public void setPreco(int preco){if (preco >= 0)this.preco = preco * 100;}

    //Item 5.2 - Readme.md - - criar método (void) setPreco(int preco)
    public float getPreco(){return (float) this.preco/100.00f;}

    //Item 5.2 - Readme.md - - criar método (void) setDesconto(int desconto)
    public void setDesconto(int desconto){this.desconto = desconto;}

    //Item 5.2 - Readme.md - - criar método (int) getDesconto()
    public int getDesconto(){return this.desconto;}

    public String getCodigo(){
        return this.codigo.getID();
    }

    //Item 5.3(d) -Readme.me - Criar método (String) anuncio()
    public String anuncio(){
        String  nome = StringUtils.capitalize(this.getNome());
        float  precoComDesconto = this.getPreco()-(this.getPreco()*this.getDesconto()/100.00f);
        return String.format(( "%s: de R$ %.2f por APENAS R$ %.2f!\n" ), nome, this.getPreco(), precoComDesconto).replace(".",",");
    }
    private class Codigo{
        private int id;
       //private static int ultimoID;

        public Codigo(int ultimoID){
            this.id = ultimoID;
        }
        public String getID(){
            int milhar = this.id/1000;
            return String.format("CD:%03d-%03d",milhar,(this.id-milhar*1000));
        }

    }

    private static void addListaUltimos50(Produto produto){
        if (ultimos50.size() == capacidadeLista){
            ultimos50.remove(0);
        }
        ultimos50.add(produto);
    }
    public static String[] listaUltimos50(){
        String[] lista = new String[capacidadeLista+1];
        lista[0] = "Código;Nome;Preço;Desconto";
        for (int i=0; i < capacidadeLista; i++){
            lista[i+1] = String.format(("%s;%s;%.2f;%d"),ultimos50.get(i).getCodigo(),ultimos50.get(i).getNome(),ultimos50.get(i).getPreco(),ultimos50.get(i).getDesconto());
        }
        return lista;
    }

}
/*
    Item 5.3(e) - Crítica sobre esta modelagem -
    Atributos int preco e int desconto mudaria par double, facilitaria sem usar gambiarras e ajustadas para uso monetário.
    Todos os métodos com retorno int para doble assim como as entradas int também.
*/