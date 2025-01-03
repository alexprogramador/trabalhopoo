package trabalhovendedor;

/**
//Autor: Alexsandro Barbosa da Silva
//Para a Disciplina de: Programação Orientada a Objetos.
//Professora: Lorena Piza Arndt
* Tema: "Projeto: Vendedor"
*/

import javax.swing.JOptionPane;
//Classe Tema: Vendedor
// Herança: Criando a superclasse
// Superclasse: 
class Vendedor {
	// Encapsulamento
    // Atributos genéricos
    private String nome;
    private int idade;
    private double salarioBase;//Poliformismo será aplicado na subclasse

    // Construtor
    public Vendedor(String nome, int idade, double salarioBase) {
        this.nome = nome;
        this.idade = idade;
        this.salarioBase = salarioBase;
    }

    // Métodos Get e Set
    // métodos associados aos atributos Encapsulados
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Método para calcular o salário total
    public double calcularSalarioTotal() {
        return salarioBase;
    }

    // Método para verificar se o vendedor bateu a meta de vendas
    public boolean bateuMeta(int vendasNoMes) {
        return vendasNoMes >= 10;
    }

    // Método para exibir informações do vendedor
    public void exibirInformacoes() {
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idade + "\nSalário Total: " + calcularSalarioTotal());
    }
}