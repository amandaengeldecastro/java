package com.example;

import java.util.Map;

public class Conta {
    private String nome;
    private Map<String, Double> valoresPorMes;

    public Conta(String nome, Map<String, Double> valoresPorMes) {
        this.nome = nome;
        this.valoresPorMes = valoresPorMes;
    }

    public String getNome() {
        return nome;
    }

    public Map<String, Double> getValoresPorMes() {
        return valoresPorMes;
    }

    public double getValorMes(String mes) {
        return valoresPorMes.getOrDefault(mes, 0.0);
    }
}
