package StringDSA;

public class ReverseString {
    
    public static String reverse(String s){
        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length/2;i++){
            char temp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = temp;

        }
        String reversed = new String(chars);
        return reversed;
    }

    public static void main(String[] args) {
        String s = "Rushikesh";
        String rev = reverse(s);
        System.out.println("Reverse of Rushikesh is "+rev);
    }
}
