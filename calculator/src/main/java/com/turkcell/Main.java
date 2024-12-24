package com.turkcell;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        int y;
        int islem;

        Scanner sc = new Scanner(System.in);

        System.out.println("Toplama icin 1, Cikarma icin 2, Carpma icin 3, Bolme icin 4");
        System.out.print("Select the operation : ");
        islem = sc.nextInt();
        System.out.println("Select first num: ");
        x = sc.nextInt();
        System.out.println("Select second num: ");
        y = sc.nextInt();

        calculate(islem, x, y);

        sc.close();

    }

    public static void calculate(int islem, int x, int y) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            if (islem == 1) {
                System.out.println("Sonuc= " + (x + y));
            } else if (islem == 2) {
                System.out.println("Sonuc= " + (x - y));

            } else if (islem == 3) {
                System.out.println("Sonuc= " + (x * y));

            } else if (islem == 4) {
                if (y!=0) {
                    System.out.println("Sonuc= " + (x / y));
                }
                else{
                    System.out.println("can not divide to zero");}
            }
            else {
                System.out.println("gecersiz");
            }
            System.out.println("cikmak icin 0 a basınız");

            System.out.print("Yeni bir islem yapmak ister misiniz? (Evet icin 1, Cikmak icin 0): ");
            int devam = sc.nextInt();
            if (devam == 0) {
                break;
            } else if (devam == 1) {
                System.out.println("Toplama icin 1, Cikarma icin 2, Carpma icin 3, Bolme icin 4");
                System.out.print("Yeni islemi seciniz: ");
                islem = sc.nextInt();
                System.out.println("Ilk sayiyi secin: ");
                x = sc.nextInt();
                System.out.println("Ikinci sayiyi secin: ");
                y = sc.nextInt();
            }
        }
    }
}

