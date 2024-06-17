package com.mycompany.manejandoarchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class ManejandoArchivos {

    public static void main(String[] args) throws IOException {
        File file = new File("./archivo.txt");        
        
        if (!file.exists()) {
            try {
               file.createNewFile();
               System.out.println("File has been created!");
            } catch (IOException e) {
                System.out.println("This program wasn't able to create the ");
            }            
        }
        else {
            System.out.println("The file already exists!");
        }
        
        FileReader reader = new FileReader("./archivo.txt", Charset.forName("UTF8"));        
        System.out.println(reader.getEncoding());
        
        // Acceder caracter a caracter
        /* char[] data = new char[50];
        reader.read(data); */
        /* for (char chara : data) {
            System.out.println(chara);
        } */
        /*System.out.println(data);
        String toCapitalize = "";
        for (int index = 0; index < data.length; index++) {
            if (index != 0) {
                if (data[index-1] == ' ') {
                    toCapitalize += Character.toUpperCase(data[index]);
                    continue;
                }
                toCapitalize += data[index];
                continue;
            }
            toCapitalize += Character.toUpperCase(data[index]);
        }
        System.out.println(toCapitalize);
        System.out.println(data[3]);*/
        // reader.close();        
        
        // Acceder linea a linea
        BufferedReader buffer = new BufferedReader(reader);
        String line;
        while ((line=buffer.readLine()) != null) {
            System.out.println("Line: "+line);
        }
        reader.close();
    }
}
