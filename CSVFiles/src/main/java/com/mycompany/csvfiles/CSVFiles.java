package com.mycompany.csvfiles;

import com.mycompany.csvfiles.manageFiles.AppendToFile;
import com.mycompany.csvfiles.manageFiles.ReadFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class CSVFiles {
    
    public static void createFile(File file) throws IOException {
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("File {"+ file.getName() +"} has been created!");
        }
        else {
            System.out.println("The file {"+ file.getName() +"} already exists!");
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        
        File file = new File("./data.csv");        
        ReadFile readFile = new ReadFile(file);
        
        List<String> data = readFile.loadData();
        
        for (String string : data) {
            final String[] splitedData = string.split(";");
            final String code = splitedData[0];
            final String name = splitedData[1] + " " + splitedData[2];
            System.out.println("Hola "+name+" tu código es "+code);
        }
        
        System.out.println("¿Desea agregar texto al final?");
        
        
        
        AppendToFile appender = new AppendToFile(file);
        appender.addLineToEOF("192208;Juan Manolo;Torres");
        
    }
}
