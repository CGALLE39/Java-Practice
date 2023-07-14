public class NextPermutation {
    public static String findNextPermutation(String word) {
        char[] chars = word.toCharArray();

        // Step 1: Find the first pair of adjacent characters in reverse order where left < right
        int i = chars.length - 2;
        while (i >= 0 && chars[i] >= chars[i + 1]) {
            i--;
        }

        // Step 2: If no such pair exists, return "no answer"
        if (i == -1) {
            return "no answer";
        }

        // Step 3: Find the smallest character greater than chars[i] from the right side
        int j = chars.length - 1;
        while (chars[j] <= chars[i]) {
            j--;
        }

        // Step 4: Swap chars[i] and chars[j]
        swap(chars, i, j);

        // Step 5: Reverse the substring starting from index i+1
        reverse(chars, i + 1, chars.length - 1);

        return new String(chars);
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    private static void reverse(char[] chars, int start, int end) {
        while (start < end) {
            swap(chars, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String word = "abcd";
        String nextPermutation = findNextPermutation(word);

        System.out.println("Next permutation: " + nextPermutation);
    }
}
