package com.singleton;

//A instância ocorre apenas se a classe for chamada
public class SingletonLazy {

    //A classe controla sua própria instância
    private static SingletonLazy instancia;

    //Garantiamos que niguém de fora poderá instancia-la.
    private SingletonLazy() {
        super();
    }

    //método public para exposição do padrão
    public static SingletonLazy getInstancia() {
        if(instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }

}
