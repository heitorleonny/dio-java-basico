package sistema_smart_tv;

public class Usuario {
    
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: "+smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);
        smartTv.ligar();
        System.out.println("TV ligada? " + smartTv.ligada);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.print("Volume: " + smartTv.volume);
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.aumentarCanal();
        System.out.println();
        System.out.println("Canal: " + smartTv.canal);
        
    }
}
