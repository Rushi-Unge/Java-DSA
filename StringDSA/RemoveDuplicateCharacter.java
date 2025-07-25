package StringDSA;

public class RemoveDuplicateCharacter {
    public static void main(String[] args) {
        String str = "Rushikesh";
        StringBuilder duplicateRemoved = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean isDuplicate = false;

            for (int j = 0; j < duplicateRemoved.length(); j++) {
                if (duplicateRemoved.charAt(j) == ch) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                duplicateRemoved.append(ch);
            }
        }

        System.out.println("Original: " + str);
        System.out.println("Without Duplicates: " + duplicateRemoved);
    }
}
