package ifsc.poo;

import java.util.Collections;
import java.util.Random;
import java.util.Vector;

public class App {

    public static void main(String[] args){

        System.out.println("\n");
        //item 1.3(a) - Readme.md - criar duas instâncias de Lampada
        Lampada led = new Lampada();
        Lampada alogenica = new Lampada();
        //itens 1.3(b)e(c) - Readme.md - ligar uma instância e desligar a outra e imprimir o estado
        led.ligar();
        System.out.println("Lampada de led está : " + ((led.verEstado())? "Ligada":"Desligada"));
        alogenica.desligar();
        System.out.println("Lampada Alogênica está: " + ((alogenica.verEstado())? "Ligada":"Desligada"));
        System.out.println();

        //Item 2.3(a) - Readme.md. Criar duas pessoas, nessas condições
        Pessoa alice = new Pessoa("Alice", 22);
        Pessoa bruno = new Pessoa("Bruno", 25);
        System.out.println();
        //Item 2.3(b) - Readme.md. Comemorar 3x felicidades ao Bruno
        bruno.felizAniversario();
        bruno.felizAniversario();
        bruno.felizAniversario();
        System.out.println();
        //Item 2.3(c) - Readme.md. Imprimir a idade das duas pessoas
        System.out.println(alice.getNome() + " tem " + alice.getIdade() + " anos.");
        System.out.println(bruno.getNome() + " tem " + bruno.getIdade() + " anos.\n");
        //Item 2.3(d) - Readme.md. Teste de regra para idade < 0
        alice.setIdade(-44);
        System.out.println();
        //Item 2.3(e) - Readme.md Teste set de nome vazio
        bruno.setNome("");
        System.out.println(bruno.getNome());

        //Item 3.3(a) - Readme.me - criar um retângulo com 5 largura e 4 altura
        Retangulo quadrilatero = new Retangulo(5,4);
        //Item 3.3(b) - Readme.me - comprova que 5x4 tem área 20 e perimetro 18
        System.out.println(quadrilatero);
        //Item 3.3(c) - Readme.md - criar um vetor com 10 'Retangulo's aleatórios
        Vector<Retangulo> vetRet = new Vector<>();
        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            float largura = rand.nextFloat(1,20);
            float altura  = rand.nextFloat(1,20);
            vetRet.add(new Retangulo(largura, altura));
        }
        //Item 3.3(d) - Readme.md - Imprimir a maior razão A/P deste vetor,,,, nessa eu me superei
        //abaixo, usa o método compareTo que este usa a razao A/P como parâmetro para re-organizar as posições crescentes no Vector
        Collections.sort(vetRet);
        //ultimo vector é o de maior razão
        System.out.println(vetRet.get(vetRet.capacity()-1));
        //for(Retangulo a : vetRet){System.out.println(a);}


        //Item 4.3 - Readme.md - Relógio
        Relogio casio = new Relogio();
        //Item 4.3(a) - Readme.md - ajustar para 14:58:32
        casio.ajustaHora((byte) 14,(byte) 58,(byte) 32);
        //Item 4.3(b) - Readme.md - avançar 2 min
        casio.avancaMinuto();
        casio.avancaMinuto();
        System.out.println(casio.getHora());
        //Item 4.3(c) - Readme.me - alterar para 23:59:59
        casio.ajustaHora((byte) 23,(byte) 59,(byte) 59);
        //Item 4.3(e) - Readme.me - Demonstração da Resolução para os formatos XXpm XXm XXs
        System.out.println(casio.getHora12(true));
        //Item 4.3(d) - Readme.me - avançar um segundo de 23:59:59
        casio.avancaSegundo();
        System.out.println(casio.getHora());
        System.out.println();

        //Item 5.3(a) - Readme.md - Criar 2 produtos
        Produto produto1 = new Produto();
        produto1.setNome("geladeira");
        produto1.setPreco(832);
        Produto produto2 = new Produto("micro-ondas", 499);
        //Item 5.3(b) - Readme.md - set desconto 6 e 12 respectivamente
        produto1.setDesconto(6);
        produto2.setDesconto(12);
        //Item 5.3(c) - Readme.md - Saída com o valor dos descontos;
        float p1comDesconto = produto1.getPreco()-(produto1.getPreco()*produto1.getDesconto()/100.00f);
        System.out.println(p1comDesconto);
        float p2comDesconto = produto2.getPreco()-(produto2.getPreco()*produto2.getDesconto()/100.00f);
        System.out.println(p2comDesconto);
        //Item 5.3(d) - Readme.md - Saída com o valor dos descontos por um Método anuncio();
        System.out.println(produto1.anuncio());
    }
}