package HelloAliceBob;

import java.util.Scanner;
import java.lang.String;

/**
 * Created by jalisahewitt on 9/9/16.
 */
public class HelloAliceBob {
    public static void main(String[] args){
        System.out.println("What is your name?");
        Scanner name = new Scanner(System.in);
        String x=name.next();

        if( x.equalsIgnoreCase("Alice") || x.equalsIgnoreCase("Bob")) {
            System.out.println("Hello " + x);
        }


    }

}
