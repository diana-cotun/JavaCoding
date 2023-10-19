import Task1.Calculator;
import Task1.Operatii;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator(5, 10);
        calculator.setTermenUnu(2.3f);
        calculator.setTermenDoi(5);

//        System.out.println(calculator.adunare());
//        System.out.println(calculator.scadere());

        Scanner scaner = new Scanner(System.in);
        String operatii = scaner.next().toUpperCase();

        if (Operatii.ADUNARE.toString().equals(operatii)){
            System.out.println(calculator.adunare());
        } else if (Operatii.SCADERE.toString().equals(operatii)){
            System.out.println(calculator.scadere());
        } else {
            System.out.println("Valoarea introdusa nu este valida");
        }



    }
}