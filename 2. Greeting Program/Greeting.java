import java.util.*;

public class Greeting {

    public static void main(String[] args) {
        
        System.out.print("Please enter your name: ");
        Scanner nameScanner = new Scanner(System.in);
        String name = nameScanner.nextLine();
        System.out.println("Hello " + name);
    }




}
