import java.util.Scanner;

class Manipulation {
    Manipulation(String word)
    {
    	System.out.println("The length of the string using length() function : " +word.length());
        System.out.println("Using toLowerCase() function : " +word.toLowerCase());
        System.out.println("Using toUpperCase() function : " +word.toUpperCase());
        System.out.println("Checks whether a string is empty(TRUE) or not(False) using isEmpty() function : "
                +word.isEmpty());
        System.out.println("Returns the hash code of a string using hashCode() function : " +word.hashCode());
    }
    
}

public class Prgrm3 {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String word = sc.nextLine();
        Manipulation m=new Manipulation(word);

    }
}