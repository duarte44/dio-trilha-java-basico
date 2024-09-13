import java.util.Scanner;

public class ContaTerminal {

    String nome;
    String agencia;
    int conta;
    float saldo;

    public void recebeValor(String nome, String agencia, int conta, float saldo){
        this.nome = nome;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    public String retorno(){
        return "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponivel para saque";
    }

}
