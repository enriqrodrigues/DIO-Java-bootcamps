package com.basic;

public class Classes {

    //Declaração de Métodos - Sintaxe:
    /*
            <visibilidade?> <tipo?> <modificador?> <retorno> <nome>(<parâmetros?>) <exceções?> {
                <corpo>
            }

    Visibilidade:
        public = acesso de qualquer classe;
        protected = acesso por classes no mesmo pacote e subclasses;
        private = acesso apenas dentro da classe.
    Tipo:
        abstract: classe que não pode ser instanciada ou método que precisa ser implementado por uma subclasse
        não abstrata.
        Concreto?
    Modificador:
        static = faz um método ou variável pertencer à classe ao invés de às instâncias;
        final = indica uma constante. Impossibilita que uma classe seja estendida, que um método seja sobrescrito
        ou que uma variável seja reinicializada.
    Retorno:
        Tipo de dado (dado, objeto ou classe) que o método retornará.
        void se não houver retorno.
    Nome:
        Nome do método deve ser definido utilizando as mesmas regras para definição de nomes de variáveis.
    Parâmetros:
        Valores de entrada esperados para utilização dentro método.
    Exceções:
        Exceções que o método pode lançar (mensagens de erro).
    Corpo:
        O programa executado dentro do método.
    *A interrogação indica que o parâmetro é opcional.
     */

    public int soma(int a, int b){
        return a + b;
    }

    //Chamando o método
    /*
    NomeDaClasse.nomeDoMetodo();		//as classes iniciam com letra maiúscula
    nomeDoObjeto.nomeDoMetodo();		//objetos iniciam com letra minúscula
     */

    //Particularidades
    /*
    Assinatura do método: conjunto nome + parâmetros.
    Construtor e Destrutor: são métodos especiais usados na Orientação a Objetos. O construtor cria os objetos e o destrutor auxilia na destruição destes objetos.
    Mensagem: são as solicitações ou chamadas para execução do método. Esta pode ser direcionada a um objeto ou uma Classe.
    Passagem de Parâmetros: quando passamos parâmetros para o método. Esta passagem pode ser por valor (cópia) ou por referência (endereço).
     */

    //Boas Práticas
    /*
    Crie métodos curtos para facilitar o entendimento, algo entre 80 e 120 linhas.
    Se o método ficar muito grande, tente quebra-lo em métodos auxiliares menores.
    Evite lista de parâmetros longas e utilize as visibilidades adequadas.
     */

    //Modificadores de classes, variáveis ou métodos
    /*
    extends: indica a superclasse que a subclasse está estendendo
    implements: indica as interfaces que uma classe irá implementar
    interface: especifica uma interface
    native: indica que um método está escrito em uma linguagem dependente de plataforma, como o C
    new: instancia um novo objeto, chamando seu construtor
    strictfp: usado em frente a um método ou classe para indicar que os números de ponto flutuante seguirão as
    regras de ponto flutuante em todas as expressões
    synchronized:indica que um método só pode ser acessado por uma thread de cada vez
    transient: impede a serialização de campos
    volatile:indica que uma variável pode ser alterada durante o uso de threads
    Return é uma instrução de interrupção. O método executa seu retorno quando completa todas as suas instruções,
    chega a uma declaração de retorno ou lança uma exceção.
     */

    //Sobrecarga
    /*
    É a capacidade de definir métodos para diferentes contextos, mas preservando seu nome. Mantemos o nome e mudamos
    os tipos da lista de parâmetros, a assinatura. No exemplo abaixo tem dois método com o mesmo nome, mas parâmetros
    diferentes.
     */
    public int converterToInt(float f){
        return (int) f;
    }
    public int converterToInt(double d){
        return (int) d;
    }

}
