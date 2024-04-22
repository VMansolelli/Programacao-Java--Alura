package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.avalia(6);
        Filme filmeDoPaulo = new Filme("Dogville",2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost",2000);



        ArrayList<Titulo> listaAssistidos = new ArrayList<>();
        listaAssistidos.add(filmeDoPaulo);
        listaAssistidos.add(meuFilme);
        listaAssistidos.add(outroFilme);
        listaAssistidos.add(lost);

        for (Titulo item : listaAssistidos) {
            System.out.println(item.getNome());
            //Realiza um filtro para mostrar apenas as classificações de filme
            if (item instanceof Filme filme) {
                System.out.println("Clasificação " + filme.getClassificao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Victor");
        buscaPorArtista.add("Adam");
        buscaPorArtista.add("Paulo");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);

        Collections.sort(listaAssistidos);
        System.out.println(listaAssistidos);

        //Realizando ordenação por outro metodo
        listaAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(listaAssistidos);

    }
}
