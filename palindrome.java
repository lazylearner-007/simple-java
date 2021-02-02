import java.util.Scanner;

public class palindrome
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String raw_string = sc.nextLine();
        String reverse_string = "";
        int limit = raw_string.length() - 1;

        for (int i = 0;i<=limit;i++){
            reverse_string = (raw_string.charAt(i)) + reverse_string;
        }

        if (reverse_string.equals(raw_string)){
            System.out.println("The input String is a palindrome.");
        }
        else
            System.out.println("The input String is not a palindrome.");
    }
}
