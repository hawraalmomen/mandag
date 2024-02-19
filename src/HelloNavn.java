import java.util.Scanner;

public class HelloNavn {


    public static void main(String[] args) {
        double student = 3.45;
        String studentNavn = "Hawra";
        String studentEfternavn = "Almomen";

        System.out.println("Hello" + " " + studentNavn);
        System.out.println("Hvad vil du gerne at opdatere det til?");

        Scanner input = new Scanner(System.in);
        student = input.nextDouble();
        System.out.println(studentNavn + " " + studentEfternavn + " har nu en opdatering af " + student);

    }
}
