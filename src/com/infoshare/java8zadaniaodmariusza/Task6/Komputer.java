package com.infoshare.java8zadaniaodmariusza.Task6;

public interface Komputer {

    default Double predkoscProcesora(){
        return 3.1;
    }

    default int  pojemnośćDysku(){
        return 120;
    }

    default int pamięcRAM(){
        return 8;
    }



}
