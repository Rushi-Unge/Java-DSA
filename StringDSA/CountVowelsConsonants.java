package StringDSA;

import java.util.Scanner;

public class CountVowelsConsonants {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int countVowels = 0;
        int countConsonants = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i'|| str.charAt(i) == 'o'|| str.charAt(i) == 'u'){
                countVowels++;
            }else{
                if(!(str.charAt(i) == ' '))
                countConsonants++;
            }
        }
        System.out.println("The count of Vowels "+countVowels);
        System.out.println("The count of consonants "+countConsonants);
        
    }
}
