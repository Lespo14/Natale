package org.example;

public class Universitari extends Alunno{
    public Universitari(double voto1, double voto2, String nome, String cognome) {
        super(voto1, voto2, nome, cognome);
    }
    @Override
    public double mediaVoti(){
        return super.mediaVoti()*3;
    }
}
