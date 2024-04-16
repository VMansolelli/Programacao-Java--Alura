//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de laçamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        double media = (9.8 + 6.3 + 8) /3;
        System.out.println(media);
        //Forma de colocar texto em bloco - Text Block
        String sinopse = """
        Filme de aventura 
        com galã dos anos 80
        """;
        System.out.println(sinopse);

        //Casting - conversão explicita de dados
        int classificao = (int) (media / 2);
        System.out.println(classificao);

        int x = 10;
        double y = x; // casting implícito

        double xX = 10.5;
        int yY = (int) xX; // casting explícito




    }
}