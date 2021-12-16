package initiation;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author laure
 */
public class Initiation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date maDate = new Date();
        System.out.println("Hello world! C'est le TP, youhouuuuu");
        System.out.println("Hello World,\n nous sommes le 22/08/2020 ");
        System.out.println("Hello World,\r nous sommes le 22/08/2020 ");
        System.out.println("Hello World,\t nous sommes le 22/08/2020 ");

        int jour = 22;
        String mois = "Août";
        int annee = 2020;
        System.out.println("Aujourd'hui, nous sommes le " + jour + " " + mois + " " + annee);
        System.out.println(hello("Bob"));
        aujourdhui();
        showDate(maDate);
        etatCivil();
    }

    /**
     *
     * @param s je passe un String en paramètre
     */
    public static String hello(String s) {
        return "Bonjour " + s + "!";
    }

    /**
     * donne la date d'aujourd'hui
     */
    public static void aujourdhui() {
        Date maDate = new Date();
        long time = maDate.getTime();
        System.out.println(maDate.getClass());;
        System.out.println("aujourd'hui nous sommes le " + maDate);
        System.out.println(time);
    }

    /**
     *
     * @param date je passe une date et je le transforme avec SimpleDateFormat
     */
    public static void showDate(Date date) {
        SimpleDateFormat newDate = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(newDate.format(date));
    }

//    public static void etatCivil() {
//        System.out.println("De Barros Laurent");
//        System.out.println("Né le : 30/12/1988");
//        System.out.println("Né a Brasilia");
//    }
    
    public static void etatCivil () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est votre nom?");
        String nom = scanner.nextLine();
        System.out.println("Quel est votre prénom?");
        String prenom = scanner.nextLine();
        System.out.println("Quelle est votre date de naissance?");
        String date = scanner.nextLine();
        System.out.println("Quelle est votre ville de naissance?");
        String ville = scanner.nextLine();
        System.out.println("Vous vous appelez " + nom + " " + prenom + " et vous êtes né le " + date + " à " + ville);
    }
}
