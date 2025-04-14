/*
 * This source file was generated by the Gradle 'init' task
 */
package ifsc.poo;

import java.util.ArrayList;
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
        System.out.println(quadrilatero.toString());

        //Item 3.3(c) - Readme.md - criar um vetor com 10 'Retangulo's aleatórios
        Vector<Retangulo> vetRet = new Vector<Retangulo>();
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


    }
}
