package com.company;

import java.io.Serializable;

/**
 * Created by User on 2017-12-20.
 */
public class Car implements Serializable{
    private String valstybiniaiNumeriai;
    private String spalva;
    private String kuroTipas;
    private int metai;
    private int rida;

    public Car(String valstybiniaiNumeriai, String spalva, String kuroTipas, int metai, int rida) {
        this.valstybiniaiNumeriai = valstybiniaiNumeriai;
        this.spalva = spalva;
        this.kuroTipas = kuroTipas;
        this.metai = metai;
        this.rida = rida;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Automobilio valstybiniai numeriai " + valstybiniaiNumeriai +
                ", spalva " + spalva +
                ", kuro tipas: " + kuroTipas +
                ", pagaminta " + metai +
                ", nuvaziavo " + rida + " km";
    }
}
