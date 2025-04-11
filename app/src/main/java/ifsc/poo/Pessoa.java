package ifsc.poo;

public class Pessoa {
    private String nome;
    private int idade = 0;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        if (idade <= 0) {
            System.out.println("Idade impossivel, tente novamente");
            return;
        }
        if (this.idade < idade) {
            System.out.println(toString());
        }
        this.idade = idade;
    }

    @Override
    public String toString() {
        return this.nome + ", feliz aniversário! " ;
    }
}