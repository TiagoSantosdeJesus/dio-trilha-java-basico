public class smartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void aumentarVolume() {
        volume++;
        System.out.print("Aumentando volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.print("Diminuindo volume para: " + volume);
    }

    public void desligar() {
        ligada = false;
    }

}
