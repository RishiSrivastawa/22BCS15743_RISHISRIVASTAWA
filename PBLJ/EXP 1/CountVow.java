import java.util.Locale;
import java.util.Scanner;

public class CountVow {
    int vow , con , specialChar , digit;

    int vowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') return 1;
        else if(c>=65 && c<=90) return 2;
        else if(c>=48 && c<= 57 ) return 3;
        else return 0;
    }
    public void countChar(String s){
        s = s.toLowerCase();
        for(char c : s.toCharArray()){
            int val = vowel(c);
            if(val==1)vow++;
            else if(val==2) specialChar++;
            else if(val==3)digit++;
            else con++;
        }
        System.out.println("Vowel : "+vow);
        System.out.println("Consonant : " + con++);
        System.out.println("Special Character : " + specialChar);
        System.out.println("Digit : "+ digit);
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        CountVow c = new CountVow();
        System.out.print("Enter your string here : ");
        String s = sc.nextLine();
        c.countChar(s);
    }
}
