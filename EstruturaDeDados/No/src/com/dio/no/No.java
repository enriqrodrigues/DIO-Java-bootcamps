package com.dio.no;

public class No {

    private String conteudo;        //Variável que armazena o dado do nó, o conteúdo.
    private No proximoNo;           //Variável (de mesmo tipo da classe) que guarda a referência para o próximo nó.

    public No(String conteudo) {    //CONSTRUTOR
        this.proximoNo = null;      //Quando cria o nó, a referênica para o proximoNo é nula.
        this.conteudo = conteudo;   //Quando cria o nó, o conteúdo é recebido.
    }
                                    //GETTERS AND SETTERS
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    public No getProximoNo() {
        return proximoNo;
    }
    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }
                                    //TOSTRING
    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
