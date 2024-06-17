package com.mycompany.catchingexceptions.exceptionCustom;

public class CustomException {

    public CustomException() {
    }
    
    public void odioALosPares(int a) throws Exception {
        if (a%2==0) {
            throw new Exception("No me gustan los números pares");
        }
        else {
            System.out.println("Número impar :)");
        }
    }
}
