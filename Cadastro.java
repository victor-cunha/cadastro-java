import java.util.Scanner;
import javax.swing.JOptionPane;

public class Cadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cadastro de Pessoa
        System.out.println("Cadastro de Pessoa");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // consumir a quebra de linha
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        // Cadastro de Pet
        System.out.println("\nCadastro de Pet");
        System.out.print("Nome do pet: ");
        String nomePet = scanner.nextLine();
        System.out.print("Idade do pet: ");
        int idadePet = scanner.nextInt();
        scanner.nextLine(); // consumir a quebra de linha
        System.out.print("Raça: ");
        String raca = scanner.nextLine();

        // Cadastro de Veículo
        System.out.println("\nCadastro de Veículo");
        String marca = JOptionPane.showInputDialog("Marca: ");
        String modelo = JOptionPane.showInputDialog("Modelo: ");
        String placa = JOptionPane.showInputDialog("Placa: ");

        // Imprimir cadastro
        System.out.println("\n--- Cadastro ---");
        System.out.println("Pessoa: " + nome + ", " + idade + " anos, CPF " + cpf);
        System.out.println("Pet: " + nomePet + ", " + idadePet + " anos, raça " + raca);
        System.out.println("Veículo: " + marca + " " + modelo + ", placa " + placa);
    }
}