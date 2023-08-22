public class ExemploBreakContinue {
	public static void main(String[] args) {
	
	for(int numero = 1; numero <=8; numero ++){
		if(numero==3)
			continue; // ele ignora
		if(numero==5)
			break; // ele para 
		
		System.out.println(numero);
		
	}
	

    }
}