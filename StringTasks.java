public class StringTasks {

    // 1) Count vowels:
    public static void countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                count++;
            }
        }
        System.out.println("Vowel Count: " + count);
    }

    // 2) Check palindrome:
    public static void checkPalindrome(String str) {
        String rev = "";
        str = str.toLowerCase();

        for (int i = str.length()-1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    // 3) Count words:
    public static void countWords(String str) {
        String words[] = str.split(" ");
        System.out.println("Word Count: " + words.length);
    }

    // 4) Convert to title case:
    public static void toTitleCase(String str) {
        String words[] = str.split(" ");
        String result = "";
        for (String w : words) {
            result = result + Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";
        }
        System.out.println("Title Case: " + result.trim());
    }

    // 5) Check anagram:
    public static void checkAnagram(String s1, String s2) {
        char a[] = s1.toLowerCase().toCharArray();
        char b[] = s2.toLowerCase().toCharArray();

        java.util.Arrays.sort(a);
        java.util.Arrays.sort(b);

        if (java.util.Arrays.equals(a, b)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    // 6) Sum of digits:
    public static void sumOfDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                sum = sum + (ch - '0');
            }
        }
        System.out.println("Sum of Digits: " + sum);
    }

    public static void main(String[] args) {

        countVowels("Welcome To Session");
        checkPalindrome("Madam");
        checkPalindrome("Song");
        countWords("I love India");
        toTitleCase("hello world from java");
        checkAnagram("listen", "silent");
        sumOfDigits("12345");

    }
}
