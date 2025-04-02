package com.example.Task2.task2;

public class Elemento {
    public String valor;
    public Elemento proximo;

    public Elemento(String novoValor) {
        this.valor = novoValor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }
}
