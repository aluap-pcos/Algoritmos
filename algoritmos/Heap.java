package com.example.algoritmos;

public class Heap {
    Vertice v[];
    int ultimo;

    Heap(int t) {
        this.ultimo = 1;
        this.v = new Vertice[t + 1];
    }

    Vertice remover() {
        this.ultimo--;
        Vertice primeiro = this.v[1];
        this.v[1] = this.v[this.ultimo];
        minHeapify(v, 1);
        return primeiro;
    }


    void add(Vertice num) {
        int atual = this.ultimo++;
        int pai = atual / 2;
        this.v[atual] = num;
        while (this.v[pai] != null && pai > 0 && num.custo < this.v[pai].custo) {
            Vertice aux = this.v[pai];
            this.v[pai] = num;
            this.v[atual] = aux;
            atual = pai;
            pai = pai / 2;
        }
    }

		    /*void heapfy(int pai) {
		        int menor;
		        int esq = 2 * pai;
		        if (esq < this.ultimo) {
		            menor = esq;
		            if (esq + 1 <= this.ultimo) {
		                if (this.v[esq].custo > this.v[esq + 1].custo) {
		                    menor++;
		                }
		            }
		            if (this.v[pai].custo > this.v[menor].custo) {
		                Vertice aux = this.v[menor];
		                this.v[menor] = this.v[pai];
		                this.v[pai] = aux;
		                heapfy(menor);
		            }

		        }
		    }*/

    public static void minHeapify(Vertice[] a, int i) {
        int l = 2*i;
        int r = (2*i)+1;

        int menor = 1;

        if(l < a.length && a[l] != null && a[i] != null && a[l].custo<a[i].custo && a[menor] != null) {
            menor = l;
        }else {
            menor = i;
        }

        if(a[menor] != null && r < a.length && a[r] != null && a[r].custo < a[menor].custo) {
            menor = r;
        }

        if(menor != i && a[menor] != null) {
            Vertice b = a[i];
            a[i] = a[menor];
            a[menor] = b;

            minHeapify(a, menor);
        }


    }


}

