package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

/*A função extends traz uma herança de outra classe, ou seja ela faz tudo que a classe Titulo faz
mais o que foi declarada dentro dela */
public class Filme extends Titulo implements Classificavel {
    private String diretor;

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
}
