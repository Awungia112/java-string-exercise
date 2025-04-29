# Java String Exercises

A collection of utility methods for string manipulation in Java.

## Features

The `StringUtils` class provides various string manipulation methods including:

- Palindrome checking
- Word frequency counting
- String compression
- Group splitting
- Vowel removal
- Word reversal
- Password strength checking
- Duplicate character removal
- Longest word finding
- Fixed width file reformatting

## Usage

Simply import the `StringUtils` class and use its static methods for string manipulation tasks.

```java
import StringUtils;

// Example usage
boolean isPal = StringUtils.isPalindrome("A man a plan a canal Panama");
String compressed = StringUtils.compressString("aaabbcc");
```

## Requirements

- Java 8 or higher

## Exercises Included

1. **Palindrome Checker**
   - Checks if a string reads the same backward
   - Ignores cases and spaces

2. **Word Frequency Counter**
   - Counts occurrences of each word in a paragraph
   - Uses StringTokenizer for word separation

3. **String Compression**
   - Compresses repeated characters (e.g., "aaabbcc" → "a3b2c2")
   - Returns original string if compression doesn't reduce length

4. **Group Splitter**
   - Splits a string into fixed-length chunks
   - Uses regex for efficient splitting

5. **Vowel Remover**
   - Removes all vowels from a string
   - Case-insensitive removal

6. **Reverse Words**
   - Reverses each word in a sentence
   - Maintains word order

7. **Password Strength Checker**
   - Validates password strength
   - Checks for minimum length, numbers, and special characters

8. **Remove Duplicate Characters**
   - Removes duplicate characters while keeping first occurrences
   - Uses HashSet for efficient tracking

9. **Find Longest Word**
   - Finds the longest word in a sentence
   - Uses StringTokenizer for word separation

10. **Reformat Fixed Width File**
    - Splits fixed-width entries into separate lines
    - Each entry is 10 characters long

## How to Run

1. Compile the code:
   ```bash
   javac src/StringUtils.java
   ```

2. Run the program:
   ```bash
   java -cp src StringUtils
   ```

The main method includes test cases for all exercises, demonstrating their functionality. 