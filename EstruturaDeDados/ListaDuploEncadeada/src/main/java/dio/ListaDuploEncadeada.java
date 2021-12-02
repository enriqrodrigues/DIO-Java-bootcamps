package dio;

public class ListaDuploEncadeada<T> {

    private NoDuplo<T> primeiroNo;      //Na lista duplamente encadeada nés precisamos de duas referências,
    private NoDuplo<T> ultimoNo;        //uma para o nó posterior e outra para o nó anterior.

    private int tamanhoLista;

    public ListaDuploEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public T get(int index){            //Aqui aproveitaremos o getNo para retornar o conteúdo do item.
        return this.getNo(index).getConteudo();     //Retorna o conteúdo do GetNo(index).
    }

    public void add(T elemento){         //Adiciona um item ao final da lista.
        NoDuplo<T> novoNo = new NoDuplo<>(elemento); //Instaciamos um NoDuplo chamado novoNo
                                                     //e passamos para ele o elemento recebido.
        novoNo.setNoProximo(null);      //noProximo é nulo pq  estamos adicionando no fim da lista.
        novoNo.setNoPrevio(ultimoNo);   //noPrevio apotará para o antigo ultimoNo.
        if(primeiroNo == null){
            primeiroNo = novoNo;
        }
        if(ultimoNo != null){
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T elemento){
        NoDuplo<T> noAuxiliar = getNo(index);           //Puxar o elemento da lista pelo getNo.
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);    //Receber o novo elemento.
        novoNo.setNoProximo(noAuxiliar);                //Configura a referêcnia futura do novo nó.
        if(novoNo.getNoProximo() != null){      //Testa se o novoNo deverá ser o último da lista
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());   //Copia a referência do nó auxiliar para o novoNo.
            novoNo.getNoProximo().setNoPrevio(novoNo);      //O novoNo define-se como noPrevio do próximo nó.
        }else{
            novoNo.setNoPrevio(ultimoNo);       //O novoNo recebe a referência do antigo ultimoNo
            ultimoNo = novoNo;                  //e passa a ser o último item da lista.
        }
        if(index == 0){             //Testa se o novoNo deverá ser o primeiro da lista.
            primeiroNo = novoNo;
        }else{
            novoNo.getNoPrevio().setNoProximo(novoNo);  //O novoNo define-se como noProximo do nó anterior.
        }
        tamanhoLista++;
    }

    public void remove(int index){      //Remove o elemento apontado no index.
        if(index == 0){                 //Se index = 0, refere-se ao primeiro nó da lista.
            primeiroNo = primeiroNo.getNoProximo();
            if(primeiroNo != null){
                primeiroNo.setNoPrevio(null);
            }
        }else{
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
            //Ele acessa o noPrevio, através do nóAuxiliar e define no noPrevio uma nova referência de
            //noProximo que é a referência que está no noAuxiliar.
            if(noAuxiliar != ultimoNo){                 //Se o nó removido não for o último.
                noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
                //Ele acessa o noProximo, através do nóAuxiliar e define no noPrevio uma nova referência de
                //noPrevio que é a referência que está no noAuxiliar.
            }else{          //Se o nó removido for o último
                ultimoNo = noAuxiliar;
            }
        }
        tamanhoLista--;
    }

    private NoDuplo<T> getNo(int index){            //GETNO vai retornar o nó de um índice específico.
        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i=0; (i < index) && (noAuxiliar != null) ; i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }                                   //O for vai rodar enquanto as duas condições forem verdadeiras.
        return noAuxiliar;
    }                                       //O método getNo é usado por vários outros métodos.

    public int size(){               //Para otimizar a performance, iremos incrementar e decrementar o
        return this.tamanhoLista;    //"tamanhoLista" a medida que incluímos ou retiramos os itens da lista.
    }

    @Override
    public String toString() {
        String strRetorno = "";
        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteúdo= " + noAuxiliar.getConteudo() + " }]\n";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += null;
        return strRetorno;
    }
}
