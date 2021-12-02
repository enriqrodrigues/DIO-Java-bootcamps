package dio;

public class NoDuplo<T> {   //Definimos uma classe genérica.

    private T conteudo;             //conteúdo do nó.
    private NoDuplo noProximo;      //referência para o nó posterior.
    private NoDuplo noPrevio;       //referência para o nó anterior.

//CONSTRUTOR
    public NoDuplo(T conteudo){     //"conteudo" aqui é o parametro recebido.
        this.conteudo = conteudo;   //this.conteudo se refere ao parâmetro do objeto.
                                    // (que aqui guarda o "conteudo recebido).
    }

//GETTERS AND SETTERS
    public T getConteudo() {
        return conteudo;
    }
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }
    public NoDuplo getNoProximo() {
        return noProximo;
    }
    public void setNoProximo(NoDuplo noProximo) {
        this.noProximo = noProximo;
    }
    public NoDuplo getNoPrevio() {
        return noPrevio;
    }
    public void setNoPrevio(NoDuplo noPrevio) {
        this.noPrevio = noPrevio;
    }

//TOSTRING
    @Override
    public String toString() {
        return "NoDuplo{" +
                "conteudo=" + conteudo +        //Aqui ele retornará apenas o conteúdo do nó.
                '}';
    }
}
