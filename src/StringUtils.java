import java.util.*;
import java.util.regex.*;

public class StringUtils {
    
    // 1. Palindrome Checker
    public static boolean isPalindrome(String input) {
        String cleanInput = input.replaceAll("\\s+", "").toLowerCase();
        StringBuilder reversed = new StringBuilder(cleanInput).reverse();
        return cleanInput.equals(reversed.toString());
    }
    
    // 2. Word Frequency Counter
    public static Map<String, Integer> wordFrequency(String paragraph) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(paragraph, " ");
        
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken().toLowerCase();
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        
        return frequencyMap;
    }
    
    // 3. String Compression
    public static String compressString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        char current = input.charAt(0);
        
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == current) {
                count++;
            } else {
                compressed.append(current).append(count);
                current = input.charAt(i);
                count = 1;
            }
        }
        compressed.append(current).append(count);
        
        return compressed.length() < input.length() ? compressed.toString() : input;
    }
    
    // 4. Group Splitter
    public static List<String> splitIntoGroups(String input, int n) {
        List<String> groups = new ArrayList<>();
        Pattern pattern = Pattern.compile("(?<=\\G.{" + n + "})");
        String[] parts = pattern.split(input);
        
        for (String part : parts) {
            if (!part.isEmpty()) {
                groups.add(part);
            }
        }
        
        return groups;
    }
    
    // 5. Vowel Remover
    public static String removeVowels(String input) {
        return input.replaceAll("[aeiouAEIOU]", "");
    }
    
    // 6. Reverse Words
    public static String reverseWords(String sentence) {
        StringTokenizer tokenizer = new StringTokenizer(sentence, " ");
        StringBuilder result = new StringBuilder();
        
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            result.append(new StringBuilder(word).reverse());
            if (tokenizer.hasMoreTokens()) {
                result.append(" ");
            }
        }
        
        return result.toString();
    }
    
    // 7. Password Strength Checker
    public static boolean isStrongPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        
        boolean hasNumber = password.matches(".*\\d.*");
        boolean hasSpecialChar = password.matches(".*[!@#$%^&*()].*");
        
        return hasNumber && hasSpecialChar;
    }
    
    // 8. Remove Duplicate Characters
    public static String removeDuplicates(String input) {
        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();
        
        for (char c : input.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                result.append(c);
            }
        }
        
        return result.toString();
    }
    
    // 9. Find Longest Word
    public static String findLongestWord(String sentence) {
        StringTokenizer tokenizer = new StringTokenizer(sentence, " ");
        String longestWord = "";
        
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
        return longestWord;
    }
    
    // 10. Reformat Fixed Width File
    public static List<String> reformatFixedWidth(String input) {
        return Arrays.asList(input.split("(?<=\\G.{10})"));
    }
    
    // Main method for testing
    public static void main(String[] args) {
        // Test cases
        System.out.println("1. Palindrome Checker:");
        System.out.println("Is 'A man a plan a canal Panama' a palindrome? " + 
            isPalindrome("A man a plan a canal Panama"));
        
        System.out.println("\n2. Word Frequency Counter:");
        Map<String, Integer> freq = wordFrequency("hello world hello java world");
        System.out.println(freq);
        
        System.out.println("\n3. String Compression:");
        System.out.println(compressString("aaabbcc"));
        
        System.out.println("\n4. Group Splitter:");
        System.out.println(splitIntoGroups("abcdefghijklmnop", 4));
        
        System.out.println("\n5. Vowel Remover:");
        System.out.println(removeVowels("Hello World"));
        
        System.out.println("\n6. Reverse Words:");
        System.out.println(reverseWords("Learn Java Today"));
        
        System.out.println("\n7. Password Strength Checker:");
        System.out.println("Is 'Password123!' strong? " + isStrongPassword("Password123!"));
        
        System.out.println("\n8. Remove Duplicates:");
        System.out.println(removeDuplicates("programming"));
        
        System.out.println("\n9. Find Longest Word:");
        System.out.println(findLongestWord("Find the longest word in this sentence"));
        
        System.out.println("\n10. Reformat Fixed Width:");
        System.out.println(reformatFixedWidth("JohnSmith AnneBrown"));
    }
} 