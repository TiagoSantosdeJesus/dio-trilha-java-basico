package edu.tiago.padroesdeprojetos;

public class TestSingleton {
    public static void main(String[] args) {

        // Teste relacionado ao designer pattern Singleton.
        Singleton singleton = Singleton.getInstancia();
        System.out.println(singleton);
        singleton = Singleton.getInstancia();
        System.out.println(singleton);
    }
}
