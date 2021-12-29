package com.datastructs;

public class No<T> {    //Com o <T> dizemmos que é uma classe genérica.

    private T content;
    private No<T> nextNo;

    public No(T content) {
        this.content = content;
        this.nextNo = null;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public No<T> getNextNo() {
        return nextNo;
    }

    public void setNextNo(No<T> nextNo) {
        this.nextNo = nextNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "content=" + content +
                '\'' +
                '}';
    }
}
