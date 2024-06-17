package com.mycompany.escribiendoarchivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribiendoArchivos {
    
    public static void createFile(File file) throws IOException {
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("File {"+ file.getName() +"} has been created!");
        }
        else {
            System.out.println("The file {"+ file.getName() +"} already exists!");
        }
    }
    
    public static void main(String[] args) throws IOException {
        
        File archivoNuevo = new File("./nuevoArchivo.csv");
        createFile(archivoNuevo);
        
        try (FileWriter writer = new FileWriter(archivoNuevo)) {
            PrintWriter printerWriter = new PrintWriter(writer);
            for (int i = 0; i < 10; i++) {
                printerWriter.println("Linea "+i);
            }
            // Only close the writer
            writer.close();
        }
        catch (IOException e) {
            System.out.println("File is being used by another program!");
        }
    }
}
