package com.mycompany.catchingexceptions;

import com.mycompany.catchingexceptions.exceptionCustom.CustomException;

public class CatchingExceptions {

    public static void main(String[] args) {
        CustomException prueba = new CustomException();
                
        try {
            prueba.odioALosPares(20);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
