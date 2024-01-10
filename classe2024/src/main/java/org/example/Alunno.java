package org.example;

public class Alunno {
    protected double voto1;
    protected double voto2;
    private final String nome,cognome;

    public double getMedia() {
        return media;
    }

    protected double media;
    public Alunno(double voto1, double voto2, String nome, String cognome) {
        this.voto1 = voto1;
        this.voto2 = voto2;
        this.nome = nome;
        this.cognome = cognome;
    }

    public double getVoto1() {
        return voto1;
    }
    public double getVoto2() {
        return voto2;
    }

    public double mediaVoti(){
        return (voto1+voto2)/2;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }


}
