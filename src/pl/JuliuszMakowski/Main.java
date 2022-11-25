package pl.JuliuszMakowski;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

   /*     Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        PrintWriter save = new PrintWriter("message_file");
        save.println(text);
        save.close();

        Scanner readFile = new Scanner(new File("message_file"));
        String fileText = readFile.nextLine();

        System.out.println(fileText);
    */
        calculator();
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
    // task D
    public static void calculator(){
        double a = 0;
        double b = 0;
        int choice = 1;
        boolean x = false;
        boolean y = false;
        System.out.println("podaj dwie dowolne liczby:");


        while (!x) {
            Scanner scanner = new Scanner(System.in);
            try {
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                x = true;
            } catch (Exception e) {
                System.out.println("zły format liczb. Spróbuj ponownie.");
            }
        }
        System.out.println("""
                Wpisz:
                1 aby wykonać dodawanie
                2 aby wykonać odejmowanie
                3 aby wykonać mnożenie
                4 aby wykonać dzielenie
                """);
        while (!y) {
            Scanner scanner = new Scanner(System.in);
            try {
                choice = scanner.nextInt();
                while (choice>4 || choice<1){
                    System.out.println("podaj liczbę od 1 do 4");
                    choice = scanner.nextInt();
                }
                y = true;
            } catch (Exception e) {
                System.out.println("wpisz właściwy numer");
            }
        }
        switch (choice){
            case 1:
                System.out.println(a  + " + " + b + " = " + (a+b));
                break;
            case 2:
                System.out.println(a + " - " + b + " = " + (a-b));
                break;
            case 3:
                System.out.println(a  + " * " + b + " = " + (a*b));
                break;
            case 4:
                System.out.println(a + " / " + b  + " = " + (a/b));
        }



    }
}
