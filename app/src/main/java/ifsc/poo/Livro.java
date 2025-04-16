package ifsc.poo;

import java.util.ArrayList;

public class Livro {
    public enum Generos{
        Fantasia("Fantasia"), Aventura("Aventura"), Romance("Romance"), Misterio("Misterio"), Terror("Terror"), Auto_ajuda("Auto-ajuda") , Pedagogico("Pedagógico");

        private final String genero;

        Generos(String genero) {
            this.genero= genero;
        }
    }

    private String titulo;
    private String autor;
    private Generos[] generos;
    private ArrayList<String[]> capitulosEpaginas;
    private static int maxCapitulos;
    private int maximoPaginas;
    private int paginaAtual;
    private String capAtual;

    public Livro(String titulo, String autor, Generos genero0, Generos genero1, int totalPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.generos = new Generos[2];
        this.generos[0] = genero0;
        this.generos[1] = genero1;
        this.maxCapitulos = 30;
        this.capitulosEpaginas = new ArrayList<>();
        this.capAtual = "Título: " + titulo + ", por " + this.getAutor();
        this.maximoPaginas = totalPaginas;
        this.paginaAtual = 0;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public Generos[] getGeneros() {
        return this.generos;
    }

    public ArrayList<String[]> getCapitulosEpaginas() {
        return this.capitulosEpaginas;
    }

    public int getMaxCapitulos() {
        return this.maxCapitulos;
    }

    public int getMaximoPaginas() {
        return this.maximoPaginas;
    }

    public int getPaginaAtual() {
        return this.paginaAtual;
    }

    public String getCapAtual(){
        return this.capAtual;
    }
    //Mét. para avançar páginas
    public boolean avancarPagina(){
        if( this.getPaginaAtual() < this.getMaximoPaginas() ){
            this.paginaAtual++;
            this.capAtual = capituloAtual(this.paginaAtual);
            return true;
        }
        return false;
    }
    //Mét. para voltar páginas
    public boolean voltaPagina(){
        if (this.paginaAtual > 1 ){
            this.paginaAtual--;
            this.capAtual = capituloAtual(this.paginaAtual);
            return true;
        }
        return false;
    }
    //Mét.Aux. para devolver o capítulo atual da página referida
    private String capituloAtual(int pagina){
        String capituloAtual = "";
        int pagInitcap;
        for (String[] capEpag: this.capitulosEpaginas){
            pagInitcap = Integer.parseInt(String.valueOf(capEpag[1].trim()));
            if(pagina >= pagInitcap){
                capituloAtual = capEpag[0];
            }
            else break;
        }
        return capituloAtual;
    }
    //Adiciona capítulos ao livro instanciado
    public void addCapitulo(String nomeCapitulo, String pagInitCap){
        this.capitulosEpaginas.add(new String[]{nomeCapitulo, pagInitCap});
    }
}