package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

/*A função extends traz uma herança de outra classe, ou seja ela faz tudo que a classe Titulo faz
mais o que foi declarada dentro dela */
public class Filme extends Titulo implements Classificavel {
    private String diretor;

    //Criação de construtor que puxa a herança da classe mãe que é a Titulo,
    // dessa forma fica obrigatório que ao instanciar um objeto Filme ele deve ter um nome e ano de lançamento
    public Filme(String nome, int anoDeLacamento) {
       super(nome, anoDeLacamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificao() {
        return (int) pegaMedia() / 2;
    }

    //Sobreescrever o método toString da classe Object que é mãe de todos
    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
