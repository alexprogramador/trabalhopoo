package trabalhovendedor;

//Subclasse representando um Vendedor CLT
class VendedorCLT extends Vendedor {
 // Atributos específicos
 private final double comissao;

 // Construtor
 public VendedorCLT(String nome, int idade, double salarioBase, double comissao) {
     super(nome, idade, salarioBase);
     this.comissao = comissao;
 }

 // Sobrescrita do método para calcular o salário total considerando comissão
//Poliformismo
 @Override
 public double calcularSalarioTotal() {
     return getSalarioBase() + comissao; //aplicado o poliformismo
 }
}