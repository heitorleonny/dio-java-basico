import java.util.Scanner;
import java.text.DecimalFormat;

public class GrandeDeposito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        

        DecimalFormat df = new DecimalFormat("R$ ###0.00");
        boolean continuar = true;
        while(continuar){
            double valor = scanner.nextDouble();
            if (valor > 0) {
                System.out.println("Deposito realizado com sucesso!\n" + //
                        "Saldo atual: " + df.format(valor));
                        continuar = false;
            } else if (valor == 0) {
                System.out.println("Encerrando o programa...");
                continuar = false;
            } else {
                System.out.println("Valor invalido! Digite um valor maior que zero.");
                continuar = true; // a plataforma só aceitou como false, porém de acordo com o enunciado deveria ser perguntado novamente
            }
        }
    }
}