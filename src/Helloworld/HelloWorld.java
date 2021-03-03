package Helloworld;

import java.util.Scanner;

public class HelloWorld {
    


        public static void main(String[] args) {
    int number=5;

    number = number + 3;

    System.out.println("vad är number " +number);

    }

    public static void main(String[] args) {
       System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("!");

// Det finns mer som t och n men jag kan inte skriva bakåtslash på grund av dåligt tagentbort
        System.out.println("Hello" +"World");
// Detta är ett verktyg som vi importerade kolla näst längst upp i kodfälten
        Scanner scanner = new Scanner(System.in);
        String hej = scanner.nextLine();
        System.out.println("Du skrev: " +hej +" är liten");



        String nej= "hej";
        System.out.println("Length of text:" + nej.length());
        System.out.print(nej+ "då");
        System.out.println("!");
        System.out.println(nej.equals("Hej"));
    }
/*Nu skriver jag bara ett stycke här
 *Här fortsätter det stycket
 * och ännu längre det är stjärnorna som dikterar helt hur långt man vill gå
 * helluuu
 */
}
