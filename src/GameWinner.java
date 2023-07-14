public class GameWinner {
    public static String determineWinner(String colors) {
        int consecutiveCount = 1;
        char prevChar = colors.charAt(0);

        for (int i = 1; i < colors.length(); i++) {
            char currentChar = colors.charAt(i);

            if (currentChar == prevChar) {
                consecutiveCount++;
            } else {
                prevChar = currentChar;
                consecutiveCount = 1;
            }

            if (consecutiveCount >= 3) {
                // The game ends with three or more consecutive characters of the same color
                return (consecutiveCount % 2 == 1) ? "Wendy" : "Bob";
            }
        }

        // The game ends with less than three consecutive characters of the same color
        return (consecutiveCount % 2 == 1) ? "Wendy" : "Bob";
    }

    public static void main(String[] args) {
        String colors = "wwwbb";
        String winner = determineWinner(colors);
        System.out.println("The winner is: " + winner);
    }
}

