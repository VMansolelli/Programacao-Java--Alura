package br.com.alura.screenmatch.modelos;

public class Titulo {
    //Atributos que toda classe para se criar um objeto pode ter
    //private bloqueia o uso do atributo para declaração direta pelo código, seu uso fica exclusivo aos métodos
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    //Criação de construtor que deixa obrigatório que ao instanciar uma classe coloque nome e ano de lançamento
    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    /*Getter e Setter são métodos que permite retornar e alterar o valor do atributo no projeto
    Chamamos todo esse processo de bloqueios e liberações de encapsulamento*/

    //Criação de um método acessor para mostrar o atributo privado
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    //Criação de um método chamado Setter que deixa atribuir um valor ao atributo privado
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    //Criação de um método que realiza uma ação
    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    //Criação de método que precisa receber dados
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    //Criação de método que retorna um resultado
    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
