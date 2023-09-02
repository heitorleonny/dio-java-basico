import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
   
        double valorInicial = scanner.nextDouble();
        
     
        double taxaJuros = scanner.nextDouble();
        
        int periodo = scanner.nextInt();
        
        double valorFinal = valorInicial;

        taxaJuros += 1;

        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
        valorFinal = valorInicial * Math.pow(taxaJuros, periodo);
        DecimalFormat df = new DecimalFormat("R$ ###0.00");

        System.out.println("Valor final do investimento: " + df.format(valorFinal));
        
        scanner.close();
    }
}