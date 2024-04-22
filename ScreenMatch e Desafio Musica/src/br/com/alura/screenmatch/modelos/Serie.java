package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

/*A função extends traz uma herança de outra classe, ou seja ela faz tudo que a classe Titulo faz
mais o que foi declarada dentro dela */
public class Serie extends Titulo implements Classificavel {
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodios;

    //Criação de construtor que puxa a herança da classe mãe que é a Titulo,
    // dessa forma fica obrigatório que ao instanciar um objeto Serie ele deve ter um nome e ano de lançamento
    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodios() {
        return minutosPorEpisodios;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.minutosPorEpisodios = minutosPorEpisodios;
    }

    //Sobreescreve o método nessa classe, da qual foi herdada
    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodios;
    }

    @Override
    public int getClassificao() {
        return 0;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
