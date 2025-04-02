package com.example.Task2.task2;

public class ListaEncadeada {
    public Elemento primeiro;
    public Elemento ultimo;
    public int tamanho;

    public Elemento getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }

    public Elemento getUltimo() {
        return ultimo;
    }

    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public Elemento get(int posicao) {
        Elemento atual = this.primeiro;
        for(int i=0; i < posicao; i++) {
            if(atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }
        return atual;
    }

    public void add(String novoValor) {
        Elemento elemento = new Elemento(novoValor);
        if(this.primeiro == null && this.ultimo == null) {
            this.primeiro = elemento;
            this.ultimo = elemento;
        }else {
            this.ultimo.setProximo(elemento);
            this.ultimo = elemento;
        }
        this.tamanho++;
    }

    public void delete(String valor) {
        Elemento anterior = null;
        Elemento atual = this.primeiro;
        for(int i=0; i< this.getTamanho(); i++) {
            if(atual.getValor().equalsIgnoreCase(valor)) {
                anterior.setProximo(atual.getProximo());
                atual = null;
                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }

}
