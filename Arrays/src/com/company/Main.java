package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class Main {

    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        int enDeger,boyDeger;
        int cevap;
        System.out.println("En degeri Giriniz: ");
        enDeger=scanner.nextInt();
        System.out.println("Boy degeri Giriniz: ");
        boyDeger=scanner.nextInt();
        enDeger=setEn(enDeger);
        boyDeger=setBoy(boyDeger);
        cevap=Hesapla(enDeger,boyDeger);
        System.out.println("Sonuç: "+cevap);
    }
    public static int setBoy(int boy)
    {
        if (boy==0 || boy<0)
            return 2;
        else
            return boy;

    }
    public static int setEn(int en)
    {
        if (en==0 || en <0)
            return 2;
        else
            return en;

    }
    public static int Hesapla(int en,int boy)
    {
        int sonuc=en*boy;
        return sonuc;
    }
}