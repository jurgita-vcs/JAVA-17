package com.company;

import java.io.*;

/**
 * Created by User on 2017-12-20.
 */
public class CarRegister extends Car{
    public CarRegister() {
        super();
    }

    public void uzregistruotiNaujaMasina() {
        try (
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("cars.txt"))
        ) {
            while (true) {
                System.out.println(in.readObject().toString());
            }
        } catch (EOFException e) {
            System.out.println("Job done");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void automobiliuSarasas(Object car) {
        try (
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("cars.txt"))
        ) {
            out.writeObject(car.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
