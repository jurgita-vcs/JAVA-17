package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;

import static org.junit.Assert.*;

/**
 * Created by User on 2017-12-20.
 */
public class PrinterTest {

    @Test
    public void givenFile_whenCopyingFile_thenCheckIsFileFound() {
        //given
        Printer printer = new Printer();
        //when
        printer.copyFile("printer.txt", "copiedPrinter.txt");
        //then
        try {
            new FileReader("printer.txt");
        }catch (FileNotFoundException e) {
            Assert.fail("File not found.");
        }
    }

}