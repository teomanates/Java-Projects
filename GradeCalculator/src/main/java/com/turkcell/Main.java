package com.turkcell;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("dersin hesaplanacak sınav sayısını giriniz");
            int sinavSayisi = sc.nextInt();

            double notlar[] = new double[sinavSayisi];

            for (int i = 0; i < sinavSayisi; i++) {

                System.out.println((i + 1) + ". notu girin");
                int not = sc.nextInt();
                System.out.println("yüzde kac etkiledigini girin");
                double yuzde = sc.nextDouble();
                notlar[i] = ((not*yuzde)/100);
                if (not < 0 || yuzde < 0 || yuzde > 100) {
                    System.out.println("Lütfen geçerli bir not ve yüzde girin!");
                    return;
                }

            }

            double toplam=0;
            for(int i = 0; i< sinavSayisi; i++)
            {
                toplam+=notlar[i];
            }
            System.out.println("Genel ortalamanız: " + toplam);
            System.out.println("Harf notunuz: " + harfNotuHesapla(toplam));

    }
        public static String harfNotuHesapla(double ortNotlar){
            if (ortNotlar >= 90) {
                return "AA";
            } else if (ortNotlar >= 80) {
                return "BA";
            } else if (ortNotlar >= 70) {
                return "BB";
            } else if (ortNotlar >= 60) {
                return "CB";
            } else if(ortNotlar >= 50){
                return "CC";
            } else if (ortNotlar >=40) {
                return "DC";
            } else if (ortNotlar >= 30){
                return "DD";
            } else{
                return "kaldiniz";
            }

        }


}
