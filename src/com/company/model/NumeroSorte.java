package com.company.model;

import java.util.ArrayList;
import java.util.Random;

public class NumeroSorte {
    public String numer;
    private ArrayList<String> agenda = new ArrayList();

    Random gerador = new Random();

    public void sorteio() {
        int jg = 0;
        boolean igual = true;

        // gerar 4 jogos
        while (jg < 4) {
            agenda.clear();

            loop:
            for (int i = 0; i < 6; i++) {
                numer = String.valueOf(gerador.nextInt(59) + 1);
                int n = agenda.size();
                //System.out.println(numer);

                if (n != 0) {
                    for (int j = 0; j < n; j++) {
                        int ag = Integer.parseInt(agenda.get(j));

                        int nber = Integer.parseInt(numer);

                        if (nber == ag) {
                            agenda.clear();
                            //Jogo não valido diminuir o jg
                            jg -= 1;
                            break loop;


                        } else {
                            igual = false;
                        }
                    }
                    if (igual == false) {
                        agenda.add(numer);
                    }
                } else {
                    agenda.add(numer);
                }

            }
            //Jogo valido incrementa o jg
            jg += 1;
            if (agenda.size() != 0) {
                System.out.println("Jogo " + jg + ": " + agenda.toString());
            }
        }
    }
}
