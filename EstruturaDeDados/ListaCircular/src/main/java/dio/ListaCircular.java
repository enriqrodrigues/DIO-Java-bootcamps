package dio;

public class ListaCircular<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanhoLista = 0;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.tamanhoLista == 0){             //Se a lista estiver vazia,
            this.cabeca = novoNo;               //adicionamos o primeiro elemento
            this.cauda = cabeca;                //que será igual ao último (cabeça = cauda)
            this.cabeca.setNoProximo(cauda);    //e apontará para si mesmo.
        }else{                                  //Se a lista não estiver vazia,
            novoNo.setNoProximo(this.cauda);    //adicionamos o elemento na cauda
            this.cabeca.setNoProximo(novoNo);   //e apontamos a cabeça para o novo nó.
            this.cauda = novoNo;
        }
        this.tamanhoLista++;
    }

    public void remove(int index){
        if(index >= this.tamanhoLista){          //se o índice for maior que a lista, retorna erro.
            throw new IndexOutOfBoundsException("Índice maior que a lista.");
        }
        No<T> noAuxiliar = this.cauda;
        if(index == 0){                     //se o índice for igual a zero, removeremos a cauda.
            this.cauda = this.cauda.getNoProximo();     //Configuramos a nova cauda.
            this.cabeca.setNoProximo(this.cauda);       //Configuramos o apontamento da cabeça.
        }else if(index == 1){               //se o ídice for 1
            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
                                            //Fizemos o índice 0 apontar para o antigo índice 2.
        }else{                              //Se não é 0, nem 1, então vamos correr a lista
            for(int i = 0; i < index-1 ; i++){
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }
        this.tamanhoLista--;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();             //Aproveita o getNo para puxar o coneúdo.
    }

    private No<T> getNo(int index){         //GetNo puxa o conteúdo do elemento.
        if(this.isEmpty()) {                //Se a lista estiver vazia, retorna um erro.
            throw new IndexOutOfBoundsException("A lista está vazia");
        }
        if(index == 0){                     //Se o índice for 0, retorna a cauda.
            return this.cauda;
        }
        No<T> noAuxiliar = this.cauda;      //Cria um nó auxiliar que vai receber a cauda.
        for(int i = 0; (i < index) && (noAuxiliar != null); i++){       //Varre a lista até o índice.
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;                  //No fim retorna o elemento do índice
    }

    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }

    public int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = this.cauda;
        for(int i = 0; i < this.size() ; i++){
            strRetorno += "[No{Conteúdo= " + noAuxiliar.getConteudo() + " }]--->\n";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += this.size() != 0 ? "Retorna ao início" : "[]";
        return strRetorno;
    }
}
