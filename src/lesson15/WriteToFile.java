package lesson15;

import java.io.*;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        File onome = new File("Onome.txt");

        try {
            if(onome.exists()) {
                read(onome);
            }else {
                onome.createNewFile();
                System.out.println("File has been created");
                write(onome);
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void write(File file) throws IOException {
        FileWriter fileWriter = new FileWriter(file.getName());

        fileWriter.write("Onome has a big forehead");
        fileWriter.close();
        System.out.println("File has been written");
    }

    static void read(File file) throws IOException {
        Scanner scanner = new Scanner(file);

        System.out.println(scanner.nextLine());
        System.out.println("File has been read");
    }
}
