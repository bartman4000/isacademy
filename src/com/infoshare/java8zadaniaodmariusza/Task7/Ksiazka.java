package com.infoshare.java8zadaniaodmariusza.Task7;

/**
 * Created by bartman3000 on 2017-03-14.
 */
public class Ksiazka {

    private String autor;
    private String tytul;
    private Gatunek gatunek;
    private int liczbaStron;
    private boolean dlaDzieci;

    public Ksiazka(String autor, String tytul, Gatunek gatunek, int liczbaStron, boolean dlaDzieci) {
        this.autor = autor;
        this.tytul = tytul;
        this.gatunek = gatunek;
        this.liczbaStron = liczbaStron;
        this.dlaDzieci = dlaDzieci;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public Gatunek getGatunek() {
        return gatunek;
    }

    public void setGatunek(Gatunek gatunek) {
        this.gatunek = gatunek;
    }

    public int getLiczbaStron() {
        return liczbaStron;
    }

    public void setLiczbaStron(int liczbaStron) {
        this.liczbaStron = liczbaStron;
    }

    public boolean isDlaDzieci() {
        return dlaDzieci;
    }

    public void setDlaDzieci(boolean dlaDzieci) {
        this.dlaDzieci = dlaDzieci;
    }

    @Override
    public String toString() {
        return "Ksiażka{" +
                "autor='" + autor + '\'' +
                ", tytul='" + tytul + '\'' +
                ", gatunek=" + gatunek +
                ", liczbaStron=" + liczbaStron +
                ", dlaDzieci=" + dlaDzieci +
                '}';
    }
}
