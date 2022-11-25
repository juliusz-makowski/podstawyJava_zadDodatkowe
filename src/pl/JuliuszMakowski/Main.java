package pl.JuliuszMakowski;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (int i=0; i<10; i++) {
            int number = showFiboNumber(i);
            System.out.println(number);
        }

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
    // task B
    public static int showFiboNumber(int n){

        if (n == 0) return 0;
        else if (n == 1) return 1;
        else {
            return showFiboNumber(n-1) + showFiboNumber(n - 2);
        }
    }
}
