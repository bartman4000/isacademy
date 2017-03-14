package com.infoshare.java8zadaniaodmariusza.Task6;

public class Komputer1 implements Komputer {

    @Override
    public String toString() {

        return this.getClass().getSimpleName()+": Proc:"+ this.predkoscProcesora() + " RAM:" + this.pamięcRAM() + " Dysk:"+this.pojemnośćDysku();
    }
}
