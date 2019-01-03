package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CzyPierwsza czyPierwsza = new CzyPierwsza();
        long start = System.currentTimeMillis();
        long stop;
        int n = 20;
        System.out.println("Liczby pierwsze:\n");
        for (Integer p : czyPierwsza.pierwsze(n)) {
            System.out.println(p);
        }
        System.out.println("\nLiczby, które nie są pierwsze:\n");
        for (Integer p: czyPierwsza.niePierwsze(n)){
            System.out.println(p);
        }
    }
}

        //
//
//        for (int i = 1; i<=n; i++) {
//            boolean czy = czyPierwsza.czyPierwsza(i);
//
//            if (czy) {
//                System.out.println(i + " - tak");
//            }
//            if (!czy) {
//                System.out.println(i + " - nie");
//            }
//        }
//        stop = System.currentTimeMillis();
//
//        System.out.println("czas programu dla prób - " + n + " to: " + (stop-start)/1000 );
//    }
//}

//
//        boolean czyPier = false;
//        for (int j = 1; j <= n; j++) {
//
//            for (int i = 2;  i < j; i++) {
//
//                if (j % i == 0) {
//                    czyPier = true;
//                    break;
//                } else {
//                    czyPier = false;
//                }
//            }
//            if (!czyPier) {
//                System.out.println(j);
//            }
//        }
//    }
//}

