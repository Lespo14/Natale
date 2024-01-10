package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String nome,cognome;
        double voto1,voto2,media;
        Alunno AL;
        Universitari un;
        System.out.println("Nome:");
        nome=in.next();
        System.out.println("Cognome:");
        cognome=in.next();
        System.out.println("Voto1:");
        voto1=in.nextDouble();
        System.out.println("Voto2:");
        voto2=in.nextDouble();
        AL=new Alunno(voto1,voto2,nome,cognome);
        media=AL.mediaVoti();
        System.out.println( media);
        System.out.println("Nome:");
        nome=in.next();
        System.out.println("Cognome:");
        cognome=in.next();
        System.out.println("Voto1:");
        voto1=in.nextDouble();
        System.out.println("Voto2:");
        voto2=in.nextDouble();
        un=new Universitari(voto1,voto2,nome,cognome);
        media=un.mediaVoti();
        System.out.println(media);
    }
}