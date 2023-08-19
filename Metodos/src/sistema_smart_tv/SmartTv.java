package sistema_smart_tv;

public class SmartTv { 
    boolean ligada = false; // Objeto SmartTv
    int canal = 1;
    int volume = 25;

    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
}
