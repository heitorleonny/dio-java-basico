import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("SEJA BEM VINDO A CRIAÇÃO DE CONTA DO BANCO JAVA!!!");
        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.next();
        System.out.println("Agora seu número: ");
        int numero = scanner.nextInt();
        System.out.println("Agora digita sua agência por favor: ");
        String agencia = scanner.next();
        System.out.println("Agora pra finalizar digita seu saldo por favor: ");
        double saldo = scanner.nextDouble();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero +  " e seu saldo " + saldo +  " já está disponível para saque.");
    }
}
