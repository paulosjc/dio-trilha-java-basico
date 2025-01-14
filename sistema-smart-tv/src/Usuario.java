public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Qual o volume atual da TV? " + smartTv.volume);

        System.out.println("A TV está sintonizada em qual canal? " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("A TV está sintonizada em qual canal? " + smartTv.canal);
        
        System.out.println("A TV está ligada? " + smartTv.ligada);
               
        smartTv.ligar();
        System.out.println("A TV está ligada agora? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("A TV continua ligada? " + smartTv.ligada);
    }
}
