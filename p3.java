import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();

        String[] words=str.trim().split("\\s+");
        int wordcount=words.length;
        System.out.println("number of word:"+wordcount);
    }
}
    
