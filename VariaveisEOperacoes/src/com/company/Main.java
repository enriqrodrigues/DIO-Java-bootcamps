package com.company;

public class Main {

    public static void main(String[] args) {
        //Declaração
        int i;
        int I;
        int _a; //embora não seja proibido, nao é recomendado usar _ ou $ na variável.
        int $a;
        //Atribuição
        i = 5;
        I = 10;
        _a = 20;
        $a = 7;
        //Declaração + Atribuição
        final int j = 10;   //"final" é usado para constantes

        int asrn2467md = 100;
        int asrn2$467_md = 10;

        int quantidadeProduto = 50;
        int QuantidadeProduto;  //A primeira letra em minúsculo é uma boa prática.

        final int NUMERO_TENTATIVAS = 5; //Notação padrão para constantes.
        final int numero_tentativas = 5;
        int QUANTIDADE_OPÇÕES = 25;
        int qtdProd;

        System.out.println(i);
        System.out.println(I);
        System.out.println(_a);
        System.out.println($a);

        System.out.println(j);
        System.out.println(asrn2467md);
        System.out.println(asrn2$467_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPÇÕES);

        byte b1 = -128;
        byte b2 = 127;
        short s1 = -32768;
        short s2 = 32767;
        int i1 = -2147483648;
        int i2 = 2147483647;
        long l1 = -9223372036854775808L;
        long l2 = 9223372036854775807L;
        float f1 = 3.14f;
        double d1 = 3.14d;
        char c1 = 'c';
        char c2 = '\u0057';
        String t1 = "palavras";
        String t2 = "frases inteiras";
        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println("byte: " + b1 + " até " + b2);
        System.out.println("short: " + s1 + " até " + s2);
        System.out.println("int: " + i1 + " até " + i2);
        System.out.println("long exemplo: " + l1 + " até " + l2);
        System.out.println("float: " + f1);
        System.out.println("double: " + d1);
        System.out.println("char: " + c1 + " ou " + c2);
        System.out.println("string: " + t1 + " e " + t2);
        System.out.println("boolean: " + bo1 + " ou " + bo2);

        System.out.println("PrePos");
        prePos();
        System.out.println("Aritmético");
        aritmetico();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("Precedência");
        precedencia();

        //Casting
        byte b01;
        short s01 = 1000;
        b01 = (byte) s01;

        long l01;
        int i01 = 10;
        l1 = i01;

        int i02;
        long l02 = 100000000000000l;
        i02 = (int) l02;
        System.out.println("Casting Long to int: " + l02);

        int i03;
        long l03 = 10000l;
        i03 = (int) l03;

        double d01;
        float f01 = 10.5f;
        d01 = f01;

        float f02;
        float f03;
        double d02 = 10000.5d;
        f02 = (float) d02;
        double d03 = 10000.58888888888888888888888888888888888d;
        f03 = (float) d03;
        System.out.println("Casting double to float: " + f03);

        int i04;
        float f04 = 11.5697f;
        i04 = (int) f04;
    }

    public static void prePos() {
        int k = 10;
        int i = ++k;
        int j = k--;
        int x = k;
        System.out.println("i: " + i);
        System.out.println("j: " + i);
        System.out.println("x: " + i);
    }

    public static void aritmetico() {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a + b;
        int r2 = c - a;
        int r3 = d * b;
        int r4 = e / a;
        int r5 = c % b;

        System.out.println("a+b" + r1);
        System.out.println("c-a" + r2);
        System.out.println("d*b" + r3);
        System.out.println("e/a" + r4);
        System.out.println("c%b" + r5);

    }

    private static void atribuicao() {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        a += 2;
        b -= 4;
        c /= 6;
        d *= 2;
        e %= 4;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }

    private static void precedencia() {
        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --j * k;
        int b = k / i % 3 + 1;
        int c = 2;
        c *= i *= 5;

        System.out.println("i++ + --j * k: " + a);
        System.out.println("k / --i % 3 + 1: " + b);
        System.out.println("c *= i *= 5: " + c);

    }

}