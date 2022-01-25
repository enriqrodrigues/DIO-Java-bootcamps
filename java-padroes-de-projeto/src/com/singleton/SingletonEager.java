package com.singleton;

//A instância ocorre independentemente de a classe ser chamada.
public class SingletonEager {

    //A classe controla sua própria instância
    private static SingletonEager instancia = new SingletonEager();

    //Garantiamos que niguém de fora poderá instancia-la.
    private SingletonEager() {
        super();
    }

    //método public para exposição do padrão
    public static SingletonEager getInstancia() {
        return instancia;
    }

}
