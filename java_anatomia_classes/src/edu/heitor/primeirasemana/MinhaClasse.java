package edu.heitor.primeirasemana;

public class MinhaClasse {
    
    public static void main (String [] args) {

        String primeiroNome = "Heitor";
        String segundoNome = "Leonny"; 

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Nome completo: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
