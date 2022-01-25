package com.singleton;

/**
 * Encapsula a instancia numa classe estática interna chamada Holder
 * @see <a href="https://stackoverflow.com/a/24018148">Referência</a>
 */

public class SingletonLazyHolder {

    //Classe que guarda a instancia.
    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    //Garantiamos que niguém de fora poderá instancia-la.
    private SingletonLazyHolder() {
        super();
    }

    //método public para exposição do padrão
    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }

}
