import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char");
        char ch = sc.nextLine().charAt(0);

        switch(ch)
        {
            case 'a' : case 'e' : case 'i' : case 'o' : case 'u' : System.out.println("Char-ul " + ch + " este o vocala");break;
            default : System.out.println("Char-ul " + ch + " este o consoana");
        }
    }
}