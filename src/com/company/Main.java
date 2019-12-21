package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("c:/5345/test.txt");
        file.createNewFile();
        file.getParentFile().mkdir();

        try {
            file.createNewFile();
        } catch(Exception e) {
            System.out.println(e.toString());
        }
        try {
            PrintWriter pw = new PrintWriter(file);
            pw.print("Hello!");
            pw.close();
        } catch (FileNotFoundException e) {
         //
        }


        // для чтения
        // Scanner
        // BufferReader
        File file2 = new File("c:/ggg/readme.txt");
        try {
            Scanner scan = new Scanner(file2);
            while(scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
            scan.close();
        } catch (FileNotFoundException e) {
            // обработка ошибки
        }


    }
}
