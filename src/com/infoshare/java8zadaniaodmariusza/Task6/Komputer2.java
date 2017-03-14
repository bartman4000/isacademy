package com.infoshare.java8zadaniaodmariusza.Task6;

public class Komputer2 implements Komputer {
    @Override
    public Double predkoscProcesora() {
        return 4.0;
    }

    @Override
    public int pamięcRAM() {
        return 16;
    }

    @Override
    public int pojemnośćDysku() {
        return 256;
    }

    @Override
    public String toString() {

        return this.getClass().getSimpleName()+": Proc:"+ this.predkoscProcesora() + " RAM:" + this.pamięcRAM() + " Dysk:"+this.pojemnośćDysku();
    }
}
