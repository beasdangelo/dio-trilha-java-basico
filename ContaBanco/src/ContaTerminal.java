import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

       // Solicita e armazena o número da conta
       System.out.print("Por favor, digite o número da Conta: ");
       int numero = scanner.nextInt();

       // Solicita e armazena o número da agência
       System.out.print("Por favor, digite o número da Agência: ");
       scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt()
       String agencia = scanner.nextLine();

       // Solicita e armazena o nome do cliente
       System.out.print("Por favor, digite o nome do Cliente: ");
       String nomeCliente = scanner.nextLine();

       // Solicita e armazena o saldo da conta
       System.out.print("Por favor, digite o saldo da Conta: ");
       double saldo = scanner.nextDouble();

         // Exibe a mensagem final com as informações coletadas
         String mensagem = String.format(
            "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
           nomeCliente, agencia, numero, saldo);
    System.out.println(mensagem);

    // Fecha o scanner
    scanner.close();
    }

}
