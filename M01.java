// 12S24029 - Adithya Philip Jona Putra Silaban 
// 12S24048 - Olivia Tambunan 

import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nilaihuruf, kredit;
        double performa, nilaiangka;
        int kredit1;

        kredit = input.nextLine();
        if (kredit.equals("---")) {
            kredit = kredit;
        } else {
            kredit1 = Integer.parseInt(kredit);
        }
        nilaihuruf = input.nextLine();
        while (!nilaihuruf.equals("---")) {
            if (nilaihuruf.equals("A")) {
                nilaiangka = 4.0;
            } else {
                if (nilaihuruf.equals("AB")) {
                    nilaiangka = 3.5;
                } else {
                    if (nilaihuruf.equals("B")) {
                        nilaiangka = 3.0;
                    } else {
                        if (nilaihuruf.equals("BC")) {
                            nilaiangka = 2.5;
                        } else {
                            if (nilaihuruf.equals("C")) {
                                nilaiangka = 2.0;
                            } else {
                                if (nilaihuruf.equals("D")) {
                                    nilaiangka = 1.0;
                                } else {
                                    if (nilaihuruf.equals("E")) {
                                        nilaiangka = 0.0;
                                    } else {
                                        nilaiangka = 0.0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            performa = kredit1 * nilaiangka;
            System.out.println(toFixed(performa,1));
            kredit = input.nextLine();
            if (kredit.equals("---")) {
                kredit = kredit;
            } else {
                kredit1 = Integer.parseInt(kredit);
            }
            nilaihuruf = input.nextLine();
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
