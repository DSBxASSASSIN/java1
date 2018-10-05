import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wat is je voornaam?");
        String fn = scanner.nextLine();

        System.out.println("wat is je leeftijd?");
        String lt = scanner.nextLine();

        System.out.println("wat is de kleur van je oogen?");
        String ko = scanner.nextLine();

        System.out.println("wat is je postcode?");
        String pc = scanner.nextLine();

        System.out.println("wat is je woonplaats?");
        String wp = scanner.nextLine();



        System.out.println("dus als het klopt dan heet jij " + fn + "?");
        System.out.println("en ben je " + lt + " jaar?");
        System.out.println("en heb je " + ko + " ogen?");
        System.out.println("en is je postcode " + pc + "?");
        System.out.println("en woon je in " + wp + "?");


//        String input = Charname.nextLine();
//        String getName = input;
//        System.out.print (input);

    }

}