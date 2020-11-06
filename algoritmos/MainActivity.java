package com.example.algoritmos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText origem;
    EditText chegada;
    Button botao;

    TextView resultado;

    Grafo grafo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        origem = (EditText) findViewById(R.id.editPartida);
        chegada  = (EditText) findViewById(R.id.editChegada);
        resultado = (TextView) findViewById(R.id.textoFinal);
        botao = (Button) findViewById(R.id.button);

        grafo = new Grafo(90);

        //grafo.addVertice("Joana Bezerra", 1);
        //grafo.addVertice("TI Aeroporto/TI Joana Bezerra", 2);

        //Lugares

        grafo.addVertice("Jaboatão");
        grafo.addVertice("Engenho Velho");
        grafo.addVertice("Floriano");
        grafo.addVertice("Cavaleiro");
        /*
        grafo.addVertice("Camaragibe");
        grafo.addVertice("Cosme e Damião");
        grafo.addVertice("Rodoviária");
        grafo.addVertice("Curado");
        grafo.addVertice("Alto do Céu");

         */
        grafo.addVertice("Coqueiral");
        grafo.addVertice("Tejipió");
        grafo.addVertice("Barro");
        grafo.addVertice("Werneck");
        grafo.addVertice("Santa Luzia");
        grafo.addVertice("Mangueira");
        grafo.addVertice("Ipiranga");
        grafo.addVertice("Afogados");
        grafo.addVertice("Joana Bezerra");
        grafo.addVertice("Recife");
        /*
        grafo.addVertice("Largo da Paz");
        grafo.addVertice("Imbiribeira");
        grafo.addVertice("Antônio Falcão");
        grafo.addVertice("Shopping");
        grafo.addVertice("Tancredo Neves");
        grafo.addVertice("Aeroporto");
        grafo.addVertice("Porta Larga");
        grafo.addVertice("Prazeres");
        grafo.addVertice("Cajueiro Seco");
        */
        grafo.addVertice("Moreno");
        grafo.addVertice("Nossa Senhora da Conceição");
        grafo.addVertice("TI TIP");
        grafo.addVertice("TI Cavaleiro");
        grafo.addVertice("Santo Aleixo (luz)");
        grafo.addVertice("Santo Aleixo (rios)");
        grafo.addVertice("Vila Rica");
        grafo.addVertice("Vila Piedade");
        grafo.addVertice("Malvinas");
        grafo.addVertice("Colônia");
        grafo.addVertice("Lote 56");
        grafo.addVertice("Bonança");
        grafo.addVertice("Zumbi do Pacheco");
        grafo.addVertice("Alto dos Ventos");
        grafo.addVertice("Dois Carneiros");
        grafo.addVertice("Quitandinha");
        grafo.addVertice("Loteamento Nova Esperança");
        grafo.addVertice("Retiro");
        grafo.addVertice("UR-11");
        grafo.addVertice("Ceasa");
        grafo.addVertice("UR-03");
        grafo.addVertice("Macaxeira (Vársea)");
        grafo.addVertice("Zumbi do Pacheco");
        grafo.addVertice("UR-05");
        grafo.addVertice("TI Prazeres");
        grafo.addVertice("Macaxeira (BR-101)");
        grafo.addVertice("Coqueiral");
        grafo.addVertice("Cajueiro Seco");
        grafo.addVertice("Shopping Rio Mar");
        grafo.addVertice("Boa Viagem");
        grafo.addVertice("Conde da Boa Vista");
        grafo.addVertice("IMIP");
        grafo.addVertice("Jardim Brasil");
        grafo.addVertice("TI Xambá");
        grafo.addVertice("TI Pelopidas");
        grafo.addVertice("TI CDU");
        grafo.addVertice("Cais de Santa Rita");
        /*
        grafo.addVertice("Matriz da Luz");
        grafo.addVertice("Muribara");
        grafo.addVertice("Alto Santo Antônio");
        grafo.addVertice("Conde da Boa Vista");
        grafo.addVertice("TI Cosme e Damião");
        grafo.addVertice("Araçoiaba");
        grafo.addVertice("Vera Cruz");
        grafo.addVertice("Chã de Cruz");
        grafo.addVertice("Lot. João Paulo II");
        grafo.addVertice("Timbi");
        grafo.addVertice("Santa Mônica");
        grafo.addVertice("Santa Terezinha");
        grafo.addVertice("Santana");
        grafo.addVertice("Derby");
        grafo.addVertice("Lot. S. João e S. Paulo");
        grafo.addVertice("Penedo");
        grafo.addVertice("Vársea Fria");
        grafo.addVertice("TI Macaxeira");
        grafo.addVertice("São Lourenço");
        grafo.addVertice("Parque Capibarida");
        grafo.addVertice("Tiúma");
        grafo.addVertice("Caxagá");
        grafo.addVertice("Curado V");
        grafo.addVertice("Curado II");
        grafo.addVertice("Curado IV (Rua 14)");
        grafo.addVertice("Curado IV (AV.01)");
         */


        //Metrô

        grafo.addVertice("Metrô Jaboatão");
        grafo.addVertice("Metrô Engenho Velho");
        grafo.addVertice("Metrô Floriano");
        grafo.addVertice("Metrô Cavaleiro");
        /*
        grafo.addVertice("Metrô Camaragibe");
        grafo.addVertice("Metrô Cosme e Damião");
        grafo.addVertice("Metrô Rodoviária");
        grafo.addVertice("Metrô Curado");
        grafo.addVertice("Metrô Alto do Céu");

         */
        grafo.addVertice("Metrô Coqueiral");
        grafo.addVertice("Metrô Tejipió");
        grafo.addVertice("Metrô Barro");
        grafo.addVertice("Metrô Werneck");
        grafo.addVertice("Metrô Santa Luzia");
        grafo.addVertice("Metrô Mangueira");
        grafo.addVertice("Metrô Ipiranga");
        grafo.addVertice("Metrô Afogados");
        grafo.addVertice("Metrô Joana Bezerra");
        grafo.addVertice("Metrô Recife");
        /*
        grafo.addVertice("Metrô Largo da Paz");
        grafo.addVertice("Metrô Imbiribeira");
        grafo.addVertice("Metrô Antônio Falcão");
        grafo.addVertice("Metrô Shopping");
        grafo.addVertice("Metrô Tancredo Neves");
        grafo.addVertice("Metrô Aeroporto");
        grafo.addVertice("Metrô Porta Larga");
        grafo.addVertice("Metrô Prazeres");
        grafo.addVertice("Metrô Cajueiro Seco");

         */

        grafo.addAresta("Metrô Jaboatão", "Metrô Engenho Velho", 2);
        grafo.addAresta("Metrô Engenho Velho", "Engenho Velho", 1);
        grafo.addAresta("Metrô Engenho Velho", "Metrô Floriano", 2);
        grafo.addAresta("Metrô Floriano", "Floriano", 1);
        grafo.addAresta("Metrô Floriano", "Metrô Cavaleiro", 4);
        grafo.addAresta("Metrô Cavaleiro", "Cavaleiro", 1);
        grafo.addAresta("Metrô Cavaleiro", "Metrô Coqueiral", 1);
        grafo.addAresta("Metrô Coqueiral", "Coqueiral", 1);
        grafo.addAresta("Metrô Coqueiral", "Metrô Tejipió", 1);
        grafo.addAresta("Metrô Tejipió", "Tejipió", 1);
        grafo.addAresta("Metrô Tejipió", "Metrô Barro", 2);
        grafo.addAresta("Metrô Barro", "Barro", 1);
        grafo.addAresta("Metrô Barro", "Metrô Werneck", 2);
        grafo.addAresta("Metrô Werneck", "Werneck", 1);
        grafo.addAresta("Metrô Werneck", "Metrô Santa Luzia", 2);
        grafo.addAresta("Metrô Santa Luzia", "Santa Luzia", 1);
        grafo.addAresta("Metrô Santa Luzia", "Metrô Mangueira", 2);
        grafo.addAresta("Metrô Mangueira", "Mangueira", 1);
        grafo.addAresta("Metrô Mangueira", "Metrô Ipiranga", 2);
        grafo.addAresta("Metrô Ipiranga", "Ipiranga", 1);
        grafo.addAresta("Metrô Ipiranga", "Metrô Afogados", 2);
        grafo.addAresta("Metrô Afogados", "Afogados", 1);
        grafo.addAresta("Metrô Afogados", "Metrô Joana Bezerra", 2);
        grafo.addAresta("Metrô Joana Bezerra", "Joana Bezerra", 1);
        grafo.addAresta("Metrô Joana Bezzera", "Metrô Recife", 2);
        grafo.addAresta("Metrô Recife", "Recife", 2);

        /*grafo.addAresta("Metrô Camarabige", "Metrô Cosme e Damião", 2);
        grafo.addAresta("Metrô Cosme e Damião", "Metrô Rodoviária", 2);
        grafo.addAresta("Metrô Rodoviária", "Curado", 2);
        grafo.addAresta("Metrô Curado", "Metrô Alto do Céu", 2);
        grafo.addAresta("Metrô Alto do Céu", "Metrô Coqueiral", 2);

        grafo.addAresta("Metrô Cajueiro Seco", "Metrô Prazeres", 2);
        grafo.addAresta("Metrô Prazere", "Metrô Porta Larga", 2);
        grafo.addAresta("Metrô Porta Larga", "Metrô Aeroporto", 2);
        grafo.addAresta("Metrô Aeroporto", "Metrô Tancredo Neves", 2);
        grafo.addAresta("Metrô Tancredo Neves", "Metrô Shopping", 2);
        grafo.addAresta("Metrô Shopping", "Metrô Antônio Falcão", 2);
        grafo.addAresta("Metrô Antônio Falcão", "Metrô Imbiribeira", 2);
        grafo.addAresta("Metrô Imbiribeira", "Metrô Largo da Paz", 2);
        grafo.addAresta("Metrô Largo da Paz", "Metrô Joana Bezerra", 2);

         */


        //Estação Jaboatão

        grafo.addVertice("Jaboatão (PARADOR)");
        grafo.addVertice("MORENO / TI Jaboatão");
        grafo.addVertice("N.S.da Conceição  / TI Jaboatão");
        grafo.addVertice("TI TIP / TI Jaboatão (SANCHO)");
        grafo.addVertice("TI Jaboatão / TI Cavaleiro");
        grafo.addVertice("Santo Aleixo  / Jaboatão (luz)");
        grafo.addVertice("Santo Aleixo / Jaboatão (rios)");
        grafo.addVertice("Vila Rica  / Jaboatão");
        grafo.addVertice("TI Jaboatão / Vila Piedade");
        grafo.addVertice("TI Jaboatão / Malvinas");
        grafo.addVertice("Colônia / Jaboatão");
        grafo.addVertice("Lote 56 /  Jaboatão");
        grafo.addVertice("Bonança / Jaboatão");

        /*
        200 - Jaboatão (PARADOR) - 55 min
        201 - MORENO / TI Jaboatão - 63 miin
        208 -  N.S.da Conceição  / TI Jaboatão - 73 min
        219 - TI TIP / TI Jaboatão (SANCHO) - 113 min
        220 - TI Jaboatão / TI Cavaleiro -  33 min
        250 - Santo Aleixo  / Jaboatão (LUZ) -  15 min
        251  - Santo Aleixo / Jaboatão (RIOS) - 48 min
        252 - Vila Rica  / Jaboatão- 50 min
        261 - TI Jaboatão / Vila Piedade - 29 min
        262 - TI Jaboatão / Malvinas - 11 min
        272 - Colônia / Jaboatão-22 min
        274 - Lote 56 /  Jaboatão- 22 min
        290 -  Bonança / Jaboatão-  105 min
        */

        grafo.addAresta("Jaboatão", "Jaboatão (PARADOR)", 10);
        grafo.addAresta("Jaboatão (PARADOR)", "Cais de Santa Rita", 55);
        grafo.addAresta("Jaboatão", "MORENO / TI Jaboatão", 10);
        grafo.addAresta("MORENO / TI Jaboatão", "Moreno", 63);
        grafo.addAresta("Jaboatão", "N.S.da Conceição  / TI Jaboatão", 10);
        grafo.addAresta("N.S.da Conceição  / TI Jaboatão", "Nossa Senhora da Conceição", 73);
        grafo.addAresta("Jaboatão", "TI TIP / TI Jaboatão (SANCHO)", 10);
        grafo.addAresta("TI TIP / TI Jaboatão (SANCHO)", "TI TIP", 113);
        grafo.addAresta("Jaboatão", "TI Jaboatão / TI Cavaleiro", 10);
        grafo.addAresta("TI Jaboatão / TI Cavaleiro", "Cavaleiro", 33);
        grafo.addAresta("Jaboatão", "Santo Aleixo  / Jaboatão (LUZ)", 10);
        grafo.addAresta("Santo Aleixo  / Jaboatão (LUZ)", "Santo Aleixo", 15);
        grafo.addAresta("Jaboatão", "Santo Aleixo / Jaboatão (RIOS)", 10);
        grafo.addAresta("Santo Aleixo / Jaboatão (RIOS)", "Santo Aleixo", 48);
        grafo.addAresta("Jaboatão", "Vila Rica  / Jaboatão", 10);
        grafo.addAresta("Vila Rica  / Jaboatão", "Vila Rica", 50);
        grafo.addAresta("Jaboatão", "TI Jaboatão / Vila Piedade", 10);
        grafo.addAresta("TI Jaboatão / Vila Piedade", "Vila Piedade", 29);
        grafo.addAresta("Jaboatão", "TI Jaboatão / Malvinas", 10);
        grafo.addAresta("TI Jaboatão / Malvinas", "Malvinas", 11);
        grafo.addAresta("Jaboatão", "Colônia / Jaboatão", 10);
        grafo.addAresta("Colônia / Jaboatão", "Colônia", 22);
        grafo.addAresta("Jaboatão", "Lote 56 /  Jaboatão", 10);
        grafo.addAresta("Lote 56 /  Jaboatão", "Lote 56", 22);
        grafo.addAresta("Jaboatão", "Bonança / Jaboatão", 10);
        grafo.addAresta("Bonança / Jaboatão", "Bonança", 105);



        //Estação Cavaleiro

        grafo.addVertice("Zumbi do Pacheco / TI Cavaleiro");
        grafo.addVertice("Alto do Vento / TI Cavaleiro");
        grafo.addVertice("Dois Carneiros / TI Cavaleiro");
        grafo.addVertice("Quitandinha / TI Cavaleiro");
        grafo.addVertice("TI Cavaleiro / LOT. Nova Esperança");

        /*
        149 - Zumbi do Pacheco / TI Cavaleiro - 16 min
        220 - TI Jaboatão / TI Cavaleiro  - 33 min
        244 - Alto do Vento / TI Cavaleiro - 17 min
        245 - Doi Carneiros / TI Cavaleiro - 19 min
        255 - Quitandinha / TI Cavaleiro - 27 min
        256 - TI Cavaleiro / LOT. Nova Esperança - 28 min

        */


        grafo.addAresta("Cavaleiro", "Zumbi do Pacheco / TI Cavaleiro", 10);
        grafo.addAresta("Zumbi do Pacheco / TI Cavaleiro", "Zumbi do Pacheco", 16);
        grafo.addAresta("Cavaleiro", "Alto do Vento / TI Cavaleiro", 10);
        grafo.addAresta("Alto do Vento / TI Cavaleiro", "Alto do Vento", 17);
        grafo.addAresta("Cavaleiro", "Dois Carneiros / TI Cavaleiro", 10);
        grafo.addAresta("Dois Carneiros / TI Cavaleiro", "Dois Carneros", 19);
        grafo.addAresta("Cavaleiro", "Quitandinha / TI Cavaleiro", 10);
        grafo.addAresta("Quitandinha / TI Cavaleiro", "Quitandinha", 27);
        grafo.addAresta("Cavaleiro", "TI Cavaleiro / LOT. Nova Esperança", 10);
        grafo.addAresta("TI Cavaleiro / LOT. Nova Esperança", "Loteamento Nova Esperança", 28);


        //Estação Barro

        grafo.addVertice("UR-11 / Barro");
        grafo.addVertice("Barro / Ceasa");
        grafo.addVertice("UR-03 / Barro (Milagres)");
        grafo.addVertice("Barro / Macaxeira (VÁRZEA)");
        grafo.addVertice("Zumbi do Pacheco/BARRO (LOT.)");
        grafo.addVertice("UR-05/BARRO (BR-101)");
        grafo.addVertice("TI Barro / TI Prazeres (Jordão)");
        grafo.addVertice("Barro / Macaxeira (BR-101)");
        grafo.addVertice("Coqueiral / Barro");
        grafo.addVertice("T.I. Barro / T.I. Cajueiro Seco");

        grafo.addAresta("Barro", "UR-11 / Barro", 10);
        grafo.addAresta("UR-11 / Barro", "UR-11", 56);
        grafo.addAresta("Barro", "Barro / Ceasa", 10);
        grafo.addAresta("Barro / Ceasa", "Ceasa", 31);
        grafo.addAresta("Barro", "UR-03 / Barro (Milagres)", 10);
        grafo.addAresta("UR-03 / Barro (Milagres)", "UR-03", 26);
        grafo.addAresta("Barro", "Zumbi do Pacheco/BARRO (LOT.)", 10);
        grafo.addAresta("Zumbi do Pacheco/BARRO (LOT.)", "Zumbi do Pacheco", 57);
        grafo.addAresta("Barro", "UR-05/BARRO (BR-101)", 10);
        grafo.addAresta("UR-05/BARRO (BR-101)", "UR-05", 37);
        grafo.addAresta("Barro", "TI Barro / TI Prazeres (Jordão)", 10);
        grafo.addAresta("TI Barro / TI Prazeres (Jordão)", "TI Prazeres", 77);
        grafo.addAresta("Barro", "Barro / Macaxeira (BR-101)", 10);
        grafo.addAresta("Barro / Macaxeira (BR-101)", "Macaxeira", 26);
        grafo.addAresta("Barro", "Coqueiral / Barro", 10);
        grafo.addAresta("Coqueiral / Barro", "Coqueiral", 32);
        grafo.addAresta("Barro", "T.I. Barro / T.I. Cajueiro Seco", 10);
        grafo.addAresta("T.I. Barro / T.I. Cajueiro Seco", "Cajueiro Seco", 65);

        /*
        103 - UR-11 / Barro - 56 min
        108 - BARRO / CEASA - 31 min
        128 - UR-03 / Barro (Milagres) - 26 min
        202 - Barro / Macaxeira (VÁRZEA) - 35 min
        203 - Zumbi do Pacheco/BARRO (LOT.) - 57 min
        205 - UR-05/BARRO (BR-101) -  37 min
        206 - TI Barro / TI Prazeres (Jordão) - 77 min
        207 - Barro / Macaxeira (BR-101) - 26 min
        209 - Coqueiral / Barro - 32 min
        216 - T.I. Barro / T.I. Cajueiro Seco - 65 min
        */

        //Estação Santa Luzia

        grafo.addVertice("TI Santa Luzia / Ibura");
        grafo.addVertice("TI Santa Luzia / Parque Aeronáutica");
        grafo.addVertice("TI Santa Luzia / Loteamento Jiquiá");

        /*
        102 - TI Santa Luzia / Ibura - 47 min
        106 - TI Santa Luzia / Parque Aeronáutica - 42 min
        204 - TI Santa Luzia / Loteamento Jiquiá - 11 min
        */

        grafo.addAresta("Santa Luzia", "TI Santa Luzia / Ibura", 10);
        grafo.addAresta("TI Santa Luzia / Ibura", "Ibura", 47);
        grafo.addAresta("Santa Luzia", "TI Santa Luzia / Parque Aeronáutica", 10);
        grafo.addAresta("TI Santa Luzia / Parque Aeronáutica", "Parque Aeronáutica", 42);
        grafo.addAresta("Santa Luzia", "TI Santa Luzia / Loteamento Jiquiá", 10);
        grafo.addAresta("TI Santa Luzia / Loteamento Jiquiá", "Loteamento Jiquiá", 11);

        //Estação Afogados

        grafo.addVertice("TI Afogados / TI Aeroporto");
        grafo.addVertice("PE-15 / Afogados");

        /*
        115 - TI Afogados / TI Aeroporto - 31 min
        914 - PE-15 / Afogados - 48 min
        */

        grafo.addAresta("Afogados", "TI Afogados / TI Aeroporto", 10);
        grafo.addAresta("TI Afogados / TI Aeroporto", "Aeroporto", 31);
        grafo.addAresta("Afogados", "PE-15 / Afogados", 10);
        grafo.addAresta("PE-15 / Afogados", "TI PE-15", 31);


        //Estação Joana Bezerra


        grafo.addVertice("TI Joana Bezerra / Shopping RioMar");
        grafo.addVertice("TI Aeroporto / TI Joana Bezerra");
        grafo.addVertice("Circular (Conde da Boa Vista/Prefeirura)");
        grafo.addVertice("Circular (Conde da Boa Vista/Rua do Sol)");
        grafo.addVertice("Circular IMIP");
        grafo.addVertice("Jardim Brasil / Joana Bezerra (CAXANGA)");
        grafo.addVertice("TI PE-15 / TI Joana Bezerra (CONORTE)");
        grafo.addVertice("TI Xambá / TI Joana Bezerra ( CAXANGA)");
        grafo.addVertice("TI Pelópidas / TI Joana Bezerra");
        grafo.addVertice("TI CDU / TI Joana Bezerra");


              /*  021 - TI Joana Bezerra / Shopping RioMar (BORBOREMA) - 15 min
            026 - TI Aeroporto / TI Joana Bezerra (BORBOREMA) - 33 min
            080 - Joana Bezerra / Boa Viagem (BORBOREMA) - 31 min
            100 - Circular (Conde da Boa Vista / Prefeitura) (METROPOLITANA) 33 min
            101 - Circular (Conde da Boa Vista / Rua do Sol) (METROPOLITANA) - 30 min
            104 - Circular (IMIP) ( METROPOLITANA)  - 21 min
            825 - Jardim Brasil / Joana Bezerra (CAXANGA) - 31 min
            861 - TI Xambá / TI Joana Bezerra ( CAXANGA) - 65 min
            1909 - TI Pelópidas / TI Joana Bezerra ( CONORTE) -  30 min
            1913 - TI PE-15 / TI Joana Bezerra (CONORTE) - 44 min
            2443 - TI CDU / TI Joana Bezerra (MOBIBRASIL/MOBI-PE) - 33 min
            */

        grafo.addAresta("Joana Bezerra", "TI Joana Bezerra / Shopping RioMar", 10);
        grafo.addAresta("TI Joana Bezerra / Shopping RioMar", "Shopping RioMar", 15);
        grafo.addAresta("Joana Bezerra", "TI Aeroporto / TI Joana Bezerra (BORBOREMA)", 10);
        grafo.addAresta("TI Aeroporto / TI Joana Bezerra", "Aeroporto", 33);
        grafo.addAresta("Joana Bezerra", "Joana Bezerra / Boa Viagem", 10);
        grafo.addAresta("Joana Bezerra / Boa Viagem", "Boa Viagem", 31);
        grafo.addAresta("Joana Bezerra", "Circular (Conde da Boa Vista / Prefeitura)", 10);
        grafo.addAresta("Circular (Conde da Boa Vista / Prefeitura)", "Conde da Boa Vista", 33);
        grafo.addAresta("Joana Bezerra", "Circular (Conde da Boa Vista / Rua do Sol)", 10);
        grafo.addAresta("Circular (Conde da Boa Vista / Rua do Sol)", "Conde da Boa Vista", 30);
        grafo.addAresta("Joana Bezerra", "Circular (IMIP)", 10);
        grafo.addAresta("Circular (IMIP)", "IMIP", 30);
        grafo.addAresta("Joana Bezerra", "Jardim Brasil / Joana Bezerra (CAXANGA)", 10);
        grafo.addAresta("Jardim Brasil / Joana Bezerra (CAXANGA)", "Jardim Brasil", 31);
        grafo.addAresta("Joana Bezerra", "TI Xambá / TI Joana Bezerra", 10);
        grafo.addAresta("TI Xambá / TI Joana Bezerra", "TI Xambá", 65);
        grafo.addAresta("Joana Bezerra", "TI Pelópidas / TI Joana Bezerra", 10);
        grafo.addAresta("TI Pelópidas / TI Joana Bezerra", "TI Pelópidas", 30);
        grafo.addAresta("Joana Bezerra", "TI PE-15 / TI Joana Bezerra", 10);
        grafo.addAresta("TI PE-15 / TI Joana Bezerra", "TI PE-15", 44);
        grafo.addAresta("Joana Bezerra", "TI CDU / TI Joana Bezerra", 10);
        grafo.addAresta("TI CDU / TI Joana Bezerra", "TI CDU", 44);


        //Estação Central

        grafo.addVertice("Circular (Príncipe)");
        grafo.addVertice("Circular (Prefeitura / Cabugá)");


        grafo.addAresta("Recife", "Circular (Conde da Boa Vista / Prefeitura)", 10);
        grafo.addAresta("Circular (Conde da Boa Vista / Prefeitura)", "Conde da Boa Vista", 28);
        grafo.addAresta("Recife", "Circular (Conde da Boa Vista / Rua do Sol)", 10);
        grafo.addAresta("Circular (Conde da Boa Vista / Rua do Sol)", "Conde da Boa Vista", 30);
        grafo.addAresta("Recife", "Circular (Cabugá / Prefeitura)", 10);
        grafo.addAresta("Circular (Cabugá / Prefeitura)", "Prefeitura", 28);



        /*101 Circular (Conde da Boa Vista / Rua do Sol) - 30 min
        104 Circular (IMIP) - 20 min
        107 Circular (Cabugá / Prefeitura) - 28 min
        116 Circular (Príncipe) - 21 min
        117 Circular (Prefeitura / Cabugá) - 24 min
        */

        //Estação Camaragibe

       /* grafo.addVertice("Matriz da Luz");
        grafo.addVertice("Muribara");
        grafo.addVertice("Alto Santo Antônio");
        grafo.addVertice("Conde da Boa Vista");
        grafo.addVertice("TI Cosme e Damião");
        grafo.addVertice("Araçoiaba");
        grafo.addVertice("Vera Cruz");
        grafo.addVertice("Chã de Cruz");
        grafo.addVertice("Lot. João Paulo II");
        grafo.addVertice("Timbi");
        grafo.addVertice("Santa Mônica");
        grafo.addVertice("Santa Terezinha");
        grafo.addVertice("Santana");
        grafo.addVertice("Derby");
        grafo.addVertice("Lot. S. João e S. Paulo");
        grafo.addVertice("Penedo");
        grafo.addVertice("Vársea Fria");
        grafo.addVertice("TI Macaxeira");
        grafo.addVertice("São Lourenço");
        grafo.addVertice("Parque Capibarida");
        grafo.addVertice("Tiúma");

        //Estação Rodoviária

        grafo.addVertice("Moreno");
        grafo.addVertice("Caxagá");
        grafo.addVertice("Curado V");
        grafo.addVertice("Curado II");
        grafo.addVertice("Curado IV (Rua 14)");
        grafo.addVertice("Curado IV (AV.01)");

        //Estação Cosme e Damião










        grafo.addAresta("Joana Bezerra", "TI Aeroporto/TI Joana Bezzera", 33);
        //grafo.dijkstra("Joana Bezerra", "TI Aeroporto/TI Joana Bezerra");

        */
    }


    public void ok(View v){
        String origemT = origem.getText().toString();
        String chegadaT = chegada.getText().toString();

        Vertice h = grafo.procuraVertice(origemT);
        Vertice j = grafo.procuraVertice(chegadaT);
        int a = grafo.dijkstra(h, j);

        resultado.setText("Seu tempo estimado de viagem é: " + a);
    }

    /*public void clicou() {
        grafo.dijkstra("Joana Bezerra", "TI Aeroporto/TI Joana Bezerra");

    }*/
}