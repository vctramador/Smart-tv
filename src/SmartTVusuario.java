public class SmartTVusuario {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();
        System.out.println("ligada " + smartTV.ligada);
        System.out.println("canal " + smartTV.canal);
        System.out.println("volume " + smartTV.volume);

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();

        smartTV.mudarCanal(11);

        System.out.println("canal " + smartTV.canal);
    }
    
}
