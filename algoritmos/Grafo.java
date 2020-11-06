package com.example.algoritmos;

public class Grafo {
        Vertice[] adj;
        boolean[] visitou;
        int qntVertice;
        int cusor;
        StringBuffer resp;
        int[] distancia;

        Grafo(int qntNo) {
            this.adj = new Vertice[qntNo + 1];
            this.qntVertice = qntNo + 1;
            this.cusor = 1;
            this.visitou = new boolean[qntNo + 1];
            this.distancia = new int[qntNo + 1];
        }

        void print(){
            for(int i = 1; i< this.distancia.length; i++){
                System.out.println(this.distancia[i]);
            }
        }

        int dijkstra(Vertice partida, Vertice chegada) {
            int resp = 0;
            resetaVisitado();
            Heap heap = new Heap(13);
            Vertice temp = partida;
            Vertice auxx;
            this.distancia[temp.valor] = 0;
            while (visitado() == false) {
                if(temp.nome.equals(chegada.nome)){

                }
                this.visitou[temp.valor] = true;
                auxx = temp.prox;
                while (auxx != null) {
                    if (auxx.custo + this.distancia[temp.valor] < this.distancia[auxx.valor]) {
                        this.distancia[auxx.valor] = auxx.custo
                                + this.distancia[temp.valor];
                            resp += this.distancia[temp.valor];
                    }
                    Vertice novo;
                    novo = new Vertice(auxx.nome, auxx.valor);
                    novo.custo = this.distancia[auxx.valor];
                    heap.add(novo);
                    auxx = auxx.prox;
                }
                Vertice aux = heap.remover();
                if (aux != null && this.visitou[aux.valor]) {
                    while (aux != null && this.visitou[aux.valor] && visitado() == false) {
                        aux = heap.remover();

                    }
                }
                temp = this.adj[aux.valor];
            }
            return resp;
        }

        boolean visitado() {
            boolean aux = true;
            for (int i = 1; i < this.visitou.length; i++) {
                if (this.visitou[i] == false) {
                    aux = false;
                    i = this.visitou.length;
                }
            }
            return aux;
        }

        void resetaVisitado() {
            for (int i = 1; i < this.qntVertice; i++) {
                this.visitou[i] = false;
                this.distancia[i] = 999;
            }
        }

        void addVertice(String nome) {
            Vertice novo = new Vertice(nome, this.cusor);
            this.adj[this.cusor++] = novo;
        }

        public void addAresta(String nome, String nome2, int custo) {
            Vertice novo = null;
            boolean aresta1 = false, aresta2 = false;
            for (int i = 1; i < this.qntVertice; i++) {
                if (this.adj[i].nome.equals(nome) && aresta1 == false) {
                    novo = new Vertice(nome2, i);
                    Vertice temp = this.adj[i];
                    while (temp.prox != null) {
                        temp = temp.prox;
                    }
                    temp.prox = novo;
                    temp.prox.custo = custo;

                    aresta1 = true;
                    if (aresta1 == true && aresta2 == true) {
                        i = this.qntVertice;
                    }
                } else if (this.adj[i].nome.equals(nome2) && aresta2 == false) {
                    novo = procuraVertice(nome2);
                    if(novo == null) {
                        novo = new Vertice(nome2, 2);
                    }
                    Vertice temp = this.adj[i];
                    while (temp.prox != null) {
                        temp = temp.prox;
                    }
                    temp.prox = novo;
                    temp.prox.custo = custo;
                    aresta2 = true;
                    if (aresta1 == true && aresta2 == true) {
                        i = this.qntVertice;
                    }
                }
            }
        }

        public Vertice procuraVertice(String nome){
            for (int i = 1; i < this.cusor; i ++){
                if(this.adj[i].nome.equals(nome)){
                    return this.adj[i];
                }
            }
            return null;
        }
    }

