import java.util.*;
public class Alphabetg {

    public static void main(String[] args) {

         Scanner scnr = new Scanner(System.in);
       char c=scnr.next().charAt(0);

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}