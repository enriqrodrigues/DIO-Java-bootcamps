package com.basic;

public class Variaveis {

    //Declaração de Variáveis
    public static String exampleVarString0 = "Exemplo de String"; //Exemplo de variável do tipo String.
    protected int exampleVarInt0 = 0; //Exemplo de variável do tipo número inteiro.

    private final boolean EXAMPLE_VAR_BOOLEAN0 = true; //Exemplo de variável do tipo booleana.

    //Declaração de Variáveis - Sintaxe básica:
    /*
        <visibilidade?> <modificador?> <tipo> <nome> = <valorInicial?>;

    Visibilidade:
        public = acesso de qualquer classe;
        protected = acesso por classes no mesmo pacote e subclasses;
        private = acesso apenas dentro da classe.
            Caso não seja definido um modificador de acesso, o programa o considerará public.
            Por padrão, use sempre private.
    Modificador:
        static = faz um método ou variável pertencer à classe ao invés de às instâncias;
        final = indica uma constante.
    *A interrogação indica que o parâmetro é opcional.
    */

    //Tipos de Variáveis
        byte exampleVarByte = 127; //valores numéricos de 8 bits. De -128 até 127 (Valor default = 0).
        short exampleVarShort = 32767; //valores numéricos de 32 bits. De -32.768 até 32.767 (Valor default = 0).
        int exampleVarInt = 2147483647; //valores númericos de 32 bits. De -2.147.483.646 até 2.147.483.647
        // (Valor default = 0).
        long exampleVarLong = 9223372036854775806L; //valores númericos de 64 bits. De -9.223.372.036.854.775.806 até
        //9.223.372.036.854.775.807 (L no final obrigatório. Valor default 0L).
        float exampleVarFloat = 3.40282347E+38f; //Valores irracionais de 32 bits +/-3.40282347E+38
        //(f no final obrigatório. Valor default = 0.0f).
        double exampleVarDouble = 1.79769313486231570E+308d; //Valores irracionais de 64 bits.
        //+/-1.79769313486231570E+308 (d no final opcional. Valor default = 0.0d).
        char exampleVarChar = 'T'; //Caracteres unicode de 16 bits. Usa ''. (Valor default = '\u0000').
        boolean exampleVarBoolean; //Verdadeiro ou falso: true or false (Valor default = false).
        String exampleVarString; //Trabalha com palavras e frases. Funciona como um array de caracteres. Usa "" (Valor
        //default = null).

    //Nomes de variáveis - Boas práticas:
    /*

            Java é sensível à utilização de maiúsculas e minúsculas;
            Use notação camelo para as nomear variáveis em geral;
            Para constantes use letras maiúsculas separadas por underline "_".
            Não pode começar com números.
            Não pode possuir espaços.
            "$" e "_" devem ser evitados ("_" é usada apenas em constantes).
            Não é permitido usar palavras reservadas do Java.
        */

    //As 52 palavras reservadas do Java:
    /*
        Modificadores de acesso
            private, protected, public
        Modificadores de classes, variáveis ou métodos
            abstract, class, extends, final, implements, interface, native, new,
            static, strictfp, synchronized, transient, volatile.
        Controle de fluxo dentro de um bloco de código
            break, case, continue, default, do, else, for, if, instanceof
            return, switch, while.
        Tratamento de erros
            assert: testa uma expressão condicional para verificar uma suposição do programador
            catch: declara o bloco de código usado para tratar uma exceção
            finally:bloco de código, após um try-catch, que é executado independentemente do fluxo de programa
            seguido ao lidar com uma exceção
            throw:usado para passar uma exceção para o método que o chamou
            throws: indica que um método pode passar uma exceção para o método que o chamou
            try: bloco de código que tentará ser executado, mas que pode causar uma exceção
        Controle de pacotes
            import:importa pacotes ou classes para dentro do código
            package: especifica a que pacote todas as classes de um arquivo pertencem
        Primitivos
            boolean, byte, char, double, float, int, long, short.
        Variáveis de referência
            super: refere-se a superclasse imediata
            this: refere-se a instância atual do objeto
        Retorno de um método
            void: indica que o método não tem retorno
        Palavras reservadas não utilizadas
            const: Não utilize para declarar constantes; use public static final
            goto: não implementada na linguagem Java por ser considerada prejudicial
        Literais reservados
            De acordo com a Java Language Specification, null, true e false são tecnicamente chamados de valores
            literais, e não keywords. Se você tentar criar algum identificador com estes valores, você também terá
            um erro de compilação.
         */

    //Casting (Conversão)
    /*
    Upcast - Conversão de um tipo de variável menor para um tipo de maior. Diz-se “implícito” e não exige alteração
    na atribuição.
    Downcast - Conversão de um tipo de variável maior para um tipo menor. Diz-se “Explícito” e é necessário apontar
    na atribuição o tipo de variável de destino. Ex.: long l = 100; int i = (int) l.
        Downcast (precisa explicitar): double > float > long > int > char > short > byte.
    */

}
