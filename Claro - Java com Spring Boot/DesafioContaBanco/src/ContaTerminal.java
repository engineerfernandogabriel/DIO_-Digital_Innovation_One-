import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o seu nome completo");
        String nome = scan.nextLine();
        
        System.out.println("Informe o código da agência");
        String agencia = scan.nextLine();

        System.out.println("Informe o número da conta");
        int conta = scan.nextInt();

        System.out.println("Informe o saldo");
        double saldo = scan.nextDouble();

 //       System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque\n", nome, agencia, conta, saldo);

        System.out.printf("\nOlá ".concat(nome)
                                .concat(", obrigado por criar uma conta em nosso banco, sua agencia é ")
                                .concat(agencia)
                                .concat(", conta ")
                                .concat(String.valueOf(conta))
                                .concat(" e seu saldo R$ ")
                                .concat(String.format("%.2f", saldo))
                                .concat(" já está disponível para saque"));
    }
}
