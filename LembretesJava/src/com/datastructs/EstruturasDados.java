package com.datastructs;

public class EstruturasDados {
    public static void main(String[] args) {

        //Estruturas de Dados
        /*
        As atribuições em Java são por cópia de valor sempre. Com o tipo primitivo, copiamos o valor em memória.
        Com objetos copiamos o valor da referência em memória, sem duplicar o objeto.
         */

        //Generics?
        /*
        Lista<String> minhaLista = new Lista<>();
        public class Lista<T> {
            private T t
        }

        Evitar casting excessivo;
        Evitar código redundantes;
        Encontrar erros em tempo de compilação;
         */

        //Wildcards
        /*
        K para "Key", exemplo: Map<K, V>;
        V para "Value", exemplo: Map<K, V>;
        E para "Element", exemplo: List<E>;
        T para "Type", exemplo: Collection#addAll;
        ? para genérico.

        Sem wildcard:
        public class No{
            private String conteudo;
        }

        Com wildcard:
        public class No<T>{
            private T conteudo;
        }
         */

        //Unknown Wildcard (Coringa desconhecido/Ilimitado)
        /*
        public void imprimeLista(List<?> lista){
            for (Object obj : lista) {
                System.out.println(obj);
            }
        }
        List<Aluno> minhaLista = new List<Aluno>();
        imprimeLista(minhaLista);
        A função acima recebe uma lista de qualquer coisa e é impressa num laço for. Esse é o tipo de Wildcard
        mais genérico.
         */

        //Upperbounded Wildcard (Coringa limitado por cima)
        /*
        public void imprimeLista(List<? extends Pessoa> listaPessoas){
            for (Pessoa p : listaPessoas) {
                System.out.println(p);
            }
        }
        List<Aluno> minhaLista = new List<Aluno>();
        imprimeLista(minhaLista);

        Função que recebe uma lista de pessoas e descendentes de Pessoa.
        Digamos que temos uma lista de Alunos. Se Aluno herda (extends) Pessoa, essa lista ele vai aceitar.
         */

        //Lowerbounded Wildcard (Coringa limitado por baixo)
        /*
        public void imprimeLista(List<? super Pessoa> listaPessoas){
            for (Pessoa p : listaPessoas) {
                System.out.println(p);
            }
        }
        List<Aluno> minhaLista = new List<Aluno>();
        imprimeLista(minhaLista);

        Aqui ele vai recusar qualquer herdeiro da classe Pessoa. Ele só aceitará de Pessoa para cima.
         */

        //Trabalhando com Nós
        {
            No<String> no1 = new No<>("No 1 Content");  //Cria o No1
            No<String> no2 = new No<>("No 2 Content");  //Cria o No2
            no1.setNextNo(no2);                                 //Aponta o No1 para o No2
            No<String> no3 = new No<>("No 3 Content");
            no2.setNextNo(no3);

            System.out.println(no1);
            System.out.println(no1.getNextNo());
            System.out.println(no2);
            System.out.println(no2.getNextNo());
            System.out.println(no3);
            System.out.println(no3.getNextNo());
        }

        //LISTAS ENCADEADAS
        /*
        Método Add() - Método que adiciona nós em qualquer lugar da fila. A gente informa o local onde vamos adicionar
        o nó.
        Método Remove() - Remove um nó de qualquer lugar da Fila conforme o índice informado.
        Método get() - Retorna a referência do nó sem exclui-lo da lista.
        Método size() - Retorna o tamanho da lista.
        */

        //LISTAS DUPLAMENTE ENCADEADAS
        /*
        Aqui os nós ou objetos possuem duas referências, uma que aponta para o nó anterior e outra que aponta para o
        nó posterior. No último item da lista, a referência de nó anterior é nula. No primeiro item da lista, a
        referência de nó posterior é nula.
        Os métodos são os mesmos da lista encadeada.
        */

        //LISTAS CIRCULARES
        /*
        Aqui temos um lista parecida com uma lista de encadeamento simples, a diferença é que o último elemento, no
        lugar de apontar para “null”, agora aponta para o primeiro. O primeiro elemento é chamado de cauda e o último
        elemento é chamado de cabeça. Temos ainda uma referência de entrada que aponta para o último elemento.
        Os métodos são os mesmos da lista encadeada.
         */

        //ÁRVORE
        /*
        Listas, Filas e Pilhas, são estruturas lineares, enquanto que a Árvore é uma estrutura de dados bidimensional
        não linear. A Árvore é constituída de nós que representam um modelo hierárquico. Armazenando os dados com base
        em relações de dependências. Características das árvores.
        •	Nó: Elemento da árvore que pode armazenar dados e referências para outros nós.
        •	Raiz: Nó principal da árvore. Origem de todas as demais ramificações.
        •	Pai/Filho: Relação entre dois nós ligados diretamente. O que está acima é o Pai e o que está abaixo é o Filho.
        •	Irmão: Nós com o mesmo Pai.
        •	Nível de um nó: Posição hierárquica em relação à raiz.
        •	Altura ou profundidade: Grau máximo dos nós.
        •	Folha ou Nó terminal: São os últimos nós da árvore. Eles não possuem filhos.
        •	Nó interno: Qualquer nó que não é Folha.
        •	Grau de um nó: Determinado a partir do número de Filho que o nó possui.
        •	Subárvore: Ramo formado a partir de um nó da árvore principal.
         */

        //EQUALS and HASHCODE
        /*
        São métodos usados para melhorar a busca, organização e comparação dos elementos.
        Eles devem ser implementados juntos.
        Equals() é usado para testar se um objeto é igual ao outro
        HashCode retorna um número inteiro (hash) gerado a partir do atributo do objeto.
         */

    }
}
