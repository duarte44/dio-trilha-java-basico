import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ContaTerminal contaTerminal = new ContaTerminal();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite sua agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite o numero da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite seu saldo: ");
        float saldo = scanner.nextFloat();

        contaTerminal.recebeValor(nome, agencia, numero, saldo);

        System.out.println(contaTerminal.retorno());
    }
}
