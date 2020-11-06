package com.example.algoritmos;

public class Vertice {
    String nome;
    int valor;
    int custo;
    Vertice prox;

    Vertice(String nome, int valor) {
        this.valor = valor;
        this.nome = nome;
        this.prox = null;
        this.custo = 0;
    }


}
