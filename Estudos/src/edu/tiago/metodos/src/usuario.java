public class usuario {
    public static void main(String[] args) {

        smartTv smartTv = new smartTv();

        System.out.println("Tv ligada ? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> Tv ligada ? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.desligar();
        System.out.println("Novo status -> Tv ligada ? " + smartTv.ligada);
    }
}
