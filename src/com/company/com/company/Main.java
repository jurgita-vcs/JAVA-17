package com.company;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer();

        //printer.scanFile("printer.txt");
        //printer.copyFile("printer.txt", "copiedPrinter.txt");
        //printer.countWords("printer.txt");

        CarRegister registra = new CarRegister();
        Car ferrari = new Car("AAA000", "Raudona", "B", 2017, 100);
        //porshe.uzregistruotiNaujaMasina();
        registra.automobiliuSarasas(ferrari);
        //porshe.uzregistruotiNaujaMasina();
    }
}
