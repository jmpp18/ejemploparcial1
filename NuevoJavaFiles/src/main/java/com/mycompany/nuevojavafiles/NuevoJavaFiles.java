package com.mycompany.nuevojavafiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class NuevoJavaFiles {
    
    public static void createFile(File file) throws IOException {
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("File {"+ file.getName() +"} has been created!");
        }
        else {
            System.out.println("The file {"+ file.getName() +"} already exists!");
        }
    }
    public static void readFile(File file) throws FileNotFoundException, IOException {
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        String line;
        while ((line = buffer.readLine()) != null) {
            System.out.println(line);
        }        
    }    
    public static void readAndReverseLines(File file) throws FileNotFoundException, IOException {
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        String line;
        ArrayList<String> lines = new ArrayList<>();
        while ((line = buffer.readLine()) != null) {
            char[] letters = line.toCharArray();
            String reversedLine = "";
            for (int i = ((letters.length)-1); i >= 0; i--) {
                reversedLine += letters[i];
            }
            lines.add(reversedLine);
        }
        
        cleanFile(file);       
        
        for (String lineToAppend : lines) {
            appendToEOF(file, lineToAppend);
        }
        
    }    
    public static void cleanFile(File file) {
        try (FileWriter writer = new FileWriter(file, false)) {
            PrintWriter pw = new PrintWriter(writer);
            pw.print("");            
            writer.close();
            pw.close();
        } catch (IOException e) {
            System.out.println("File is being used by another program!");
        }
    }    
    public static void writeFromScratch(File file, String newLine) throws IOException {
        try (FileWriter writer = new FileWriter(file, false)) {
            PrintWriter pw = new PrintWriter(writer);
            pw.println(newLine);
            
            writer.close();
            pw.close();
        } catch (IOException e) {
            System.out.println("File is being used by another program!");
        }        
    }
    public static void appendToEOF(File file, String newLine) throws IOException {
        try (FileWriter writer = new FileWriter(file, true)) {
            PrintWriter pw = new PrintWriter(writer);
            pw.println(newLine);
            
            writer.close();
            pw.close();
        } catch (IOException e) {
            System.out.println("File is being used by another program!");
        }        
    }
    
    public static void main(String[] args) throws IOException {
        File textFile = new File("./probando.txt");
        
        // The code is above this psvm
        createFile(textFile);
        
        // appendToEOF(textFile, "Al final del archivo");
        // writeFromScratch(textFile, "Only I remain in the file");
        // appendToEOF(textFile, "Al final del archivo");
        // appendToEOF(textFile, "Al final del archivo");
        // appendToEOF(textFile, "Al final del archivo");
        // readFile(textFile);
        readAndReverseLines(textFile);        
    }
}
