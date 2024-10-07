package Notadeaula3.Questão2;

public class Animal {
    private String nome;
    private String raca;

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public void caminhar() {
        System.out.println(nome + " está caminhando.");
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }
    
    public void emitirSom() {
        
    }
}

