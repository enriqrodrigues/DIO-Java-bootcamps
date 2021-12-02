package com.dio.no;

public class Main {
    public static void main(String[] args) {

        No no1 = new No("Conteúdo nó 1");   //Qd cria o nó, o dado entre () é destinado ao construtor.

        No no2 = new No("Conteúdo nó 2");
        no1.setProximoNo(no2);                       //Aqui nós "setamos" a referência do no1 para o no2.
                                                     //Podemos dizer que o no1 está apontando para o no2.
        No no3 = new No("Conteúdo nó 3");
        no2.setProximoNo(no3);

        No no4 = new No("Conteúdo nó 4");
        no3.setProximoNo(no4);

        //Portanto, temos o no1 apontando para o no2, aponta para no3, que aponta para no4, que aponta para "null".

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println("-----------------");

        System.out.println(no2);
        System.out.println(no2.getProximoNo());
        System.out.println("-----------------");

        System.out.println(no3);
        System.out.println(no3.getProximoNo());
        System.out.println("-----------------");

        System.out.println(no4);
        System.out.println(no4.getProximoNo());
        System.out.println("-----------------");

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());

    }
}
