package Notadeaula1.Questão2;

public class Produto {
    private int codigo;
    private String nome;
    private String tamanhoPeso;
    private String cor;
    private double valor;
    private int quantidade;

    public Produto(int codigo, String nome, String tamanhoPeso, String cor, double valor, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.tamanhoPeso = tamanhoPeso;
        this.cor = cor;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome + ", Tamanho/Peso: " + tamanhoPeso + 
               ", Cor: " + cor + ", Valor: " + valor + ", Quantidade no estoque: " + quantidade;
    }
}
