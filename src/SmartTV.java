public class SmartTV {
    boolean ligada = true;
    int canal = 1;
    int volume = 30;

    public void ligar(){
      ligada = true;
    }    
    public void desligar(){
      ligada = false;
    }    

    public void aumentarVolume(){
      volume ++;
      System.out.println("volume " + volume);
    }

    public void diminuirVolume(){
      volume --;
      System.out.println("volume " + volume);
    }

    public void mudarCanal (int novoCanal){
      canal = novoCanal;
    }

    public void aumentarCanal(){
      canal ++;
    }

    public void diminuirCanal(){
      canal --;
    }
      


    }
    

  

