import java.util.Scanner;

public class NameFromEmail{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please give me you e-mail address and I'll tell your name!");

        nameFromEmail(sc.nextLine());

    }

    static String nameFromEmail(String input) {
        String splitEmail[] = input.split("[.\\@]");
        String name = splitEmail[1] + " " + splitEmail[0];
        System.out.println(name);
        return name;
    }

}