package pl.JuliuszMakowski;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        addString("1;6;3");
    }
    public static void addString(String s){
        boolean x = false;
        String[] sArray = s.split(";");
        int sum = 0;

        while (!x) {
            int arrayLength = sArray.length;
            int[] iArray = new int[arrayLength];

            try {
                for (int i = 0; i < arrayLength; i++) {
                    iArray[i] = Integer.parseInt(sArray[i]);
                    sum += iArray[i];
                }
                x = true;
            }catch (Exception e){
                System.out.println("zły format \nPodaj liczby całkowite odzielone średnikiem:");
                Scanner scanner = new Scanner(System.in);
                String s1= scanner.nextLine();
                sArray = s1.split(";");
                sum = 0;
            }
        }
        System.out.println("suma podanych liczb = " + sum);
    }
}
