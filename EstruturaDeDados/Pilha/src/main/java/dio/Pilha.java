package dio;

public class Pilha {
    No refNoEntradaPilha = null;        //Referência de entrada da pilha.

    public void push(No novoNo){        //Recebe um novo nó.
        No refAuxiliar = refNoEntradaPilha;         //Guarda a referência de entrada.
        refNoEntradaPilha = novoNo;                 //A referência de entrada agora aponta para o novoNo.
        refNoEntradaPilha.setRefNo(refAuxiliar);    //O novo nó aponta para o nó anterior.
    }

    public No pop(){                    //Tira o nó da pilha.
        if(!isEmpty()){
            No noPoped = refNoEntradaPilha;         //Guarda a referência de entrada no noPoped.
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();   //Atualiza a referência de entrada.
            return noPoped;                         //Retorna o nó removido (guardado em noPoped).
        }
        return null;
    }

    public No top(){                    //Top apenas retorna a referência
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){           //Se a referência de entrada está nula, ele retorna true, senão false.
        return refNoEntradaPilha == null? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "------------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "------------\n";
        No noAuxiliar = refNoEntradaPilha;
        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno += "============";
        return stringRetorno;
    }
}
