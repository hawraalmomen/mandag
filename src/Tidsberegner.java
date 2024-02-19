import java.util.Scanner;

public class Tidsberegner {


    public static void main(String[] args) {
        int minutterSekunder = 60;
        int timeSekunder = 60 * 60;
        int døgnSekunder = 24 * timeSekunder;

        int second = 50;
        int minute = 35;
        int hour = 11;

        Scanner input = new Scanner(System.in);
        // vises i terminalen først
        System.out.println("angiv timer");
        // tager input
        hour = input.nextInt();
        // printer input ud
        System.out.println("Der er angivet " +hour+ " som timer");
        System.out.println("angiv minutter");
        minute = input.nextInt();
        System.out.println("Der er angivet " +minute+ " som minutter");
        System.out.println("angiv sekunder");
        second = input.nextInt();
        System.out.println("Der er angivet " +second+ " sekunder");
        System.out.println("Der er gået " +hour+ " timer");
        System.out.println("Der er gået " +minute+ " minutter");
        System.out.println("Der er gået " +second+ " sekunder");

        System.out.println("Hvor mange timer miutter og sekunder er der gået siden midnat?");
        System.out.println("Der er gået " +second+ " sekunder siden midnat");












        //minute = 35;
        //hour = 11;





/*
        System.out.println("hvor mange timer er der gået siden midnat?");
        int minute = input.nextInt();
        int hour = input.nextInt();
        System.out.println(minute);
        int second = input.nextInt();
        System.out.println(second);
        System.out.println(hour);
*/


    }




}
