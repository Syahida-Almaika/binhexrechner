package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // write your code here
        System.out.println("Dezimal zu Binärzahl = 1");
        System.out.println("Dezimal zu Hexadezimalzahl = > 1");
        Scanner sc = new Scanner(System.in);
        int zahl = sc.nextInt();

        System.out.println("Bitte eine Dezimalzahl eingeben: ");
        int dec = sc.nextInt();
        if (zahl == 1) {
            System.out.println("Die Zahl '" + dec + "' als Binärzahl: ");
            while (dec > 0) {
                System.out.print(dec % 2);
                dec = dec / 2;
            }
        } else {
            System.out.println("Die Zahl '" + dec + "' als Hexadezimalzahl: ");
            List<String> hexzahlliste = new ArrayList<>();
            while (dec > 0) {
                if (dec % 16 <= 10) {
                    //System.out.print(dec % 16);
                    hexzahlliste.add((dec % 16) + "");
                    dec = dec / 16;
                } else {
                    if (dec % 16 == 10) {
                        //System.out.println("A");
                        hexzahlliste.add("A");
                    }
                    if (dec % 16 == 11) {
                        //System.out.println("B");
                        hexzahlliste.add("B");
                    }
                    if (dec % 16 == 12) {
                        //System.out.println("C");
                        hexzahlliste.add("C");
                    }
                    if (dec % 16 == 13) {
                        //System.out.println("D");
                        hexzahlliste.add("D");
                    }
                    if (dec % 16 == 14) {
                        //System.out.println("E");
                        hexzahlliste.add("E");
                    }
                    if (dec % 16 == 15) {
                        //System.out.println("F");
                        hexzahlliste.add("F");
                    }
                    dec = dec / 16;
                }
            }
            for (int i = hexzahlliste.size()-1; i >= 0; i--) {
                System.out.print(hexzahlliste.get(i));
            }
        }
        System.out.println("");
    }
}