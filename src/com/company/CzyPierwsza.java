package com.company;

import java.util.ArrayList;
import java.util.List;

public class CzyPierwsza {
private int n;
private int b;

    public CzyPierwsza() {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    List<Integer> pierwsze(int n) {
        boolean czyP = false;
        List<Integer> pierwsze = new ArrayList<>();

        for (int j = 1; j<=n; j++) {
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    czyP = true;
                    break;
                }else {
                    czyP = false;
                }
            }
            if(!czyP){
                pierwsze.add(j);
            }
        }
        return  pierwsze;
    }

    List <Integer> niePierwsze (int n){
        List<Integer> niePierwsze = new ArrayList<>();

        for (int j =1; j<=n; j++){
            boolean czyP = false;
            for (int i = 2; i<j; i++){
                if (j%i==0){
                    czyP = true;
                    break;
                }else{
                    czyP = false;
                }
            }

            if (czyP){
                niePierwsze.add(j);
            }
        }
        return niePierwsze;
    }
}





