public class MaxEvenCharacters {
    public static String findWordWithMaxEvenChars(String sentence) {
        String[] words = sentence.split(" ");
        String result = "";
        int maxEvenCount = 0;

        for (String word : words) {
            int evenCount = 0;

            for (int i = 0; i < word.length(); i++) {
                if (Character.isDigit(word.charAt(i))) {
                    int num = Character.getNumericValue(word.charAt(i));
                    if (num % 2 == 0) {
                        evenCount++;
                    }
                }
            }

            if (evenCount > maxEvenCount) {
                maxEvenCount = evenCount;
                result = word;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        String wordWithMaxEvenChars = findWordWithMaxEvenChars(sentence);

        System.out.println("Word with the maximum number of even characters: " + wordWithMaxEvenChars);
    }
}

