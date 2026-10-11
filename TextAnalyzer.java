import java.util.*;

public class TextAnalyzer{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String text= sc.nextLine();
        
        String[] words= text.split("\\s+");
        int wordcount= words.length;
        text= text.toLowerCase();

        int vowelcount= 0;
        int consonantcount= 0;

        for(int i=0; i<text.length(); i++){
            char c= text.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                vowelcount++;

            }
            else if(c>='a' && c<='z'){
                consonantcount++;
            }
        }

        System.out.println("Total Words= "+ wordcount);
        System.out.println("Total Vowels = "+vowelcount);
        System.out.println("Total Consonant = "+consonantcount);
        sc.close();
    }
}