package trabalhovendedor;

import javax.swing.JOptionPane;

public class Controle {
    public static void main(String[] args) {
        // Exemplo de uso
        String nome = JOptionPane.showInputDialog("Digite o nome do vendedor:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do vendedor:"));
        double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário base do vendedor:"));
        double comissao = Double.parseDouble(JOptionPane.showInputDialog("Digite a comissão do vendedor:"));
        int vendasNoMes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de vendas do vendedor no mês:"));

        VendedorCLT vendedor = new VendedorCLT(nome, idade, salarioBase, comissao);
        
        //Estruturas condicionais 
        if (vendedor.bateuMeta(vendasNoMes)) {
            JOptionPane.showMessageDialog(null, "O vendedor bateu a meta de vendas!");
        } else {
            JOptionPane.showMessageDialog(null, "O vendedor não bateu a meta de vendas.");
        }

        vendedor.exibirInformacoes();
    }
}

