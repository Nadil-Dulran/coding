public class WordCount {
    public static void main(String[] args) {

        String string = "This is a test. This test is only a test";

        // Remove dot (not a word)
        string = string.replace(".", "");

        // Divide string into words
        String[] words = string.split(" ");

        // Arrays to store words and counts
        String[] wordList = new String[words.length];
        int[] count = new int[words.length];

        int index = 0;

        for (String word : words) {
            boolean found = false;

            for (int i = 0; i < index; i++) {
                if (wordList[i].equals(word)) {
                    count[i]++;
                    found = true;
                    break;
                }
            }

            if (!found) {
                wordList[index] = word;
                count[index] = 1;
                index++;
            }
        }

        // Print the counts
        for (int i = 0; i < index; i++) {
            System.out.print(wordList[i] + " : " + count[i] + "   ");
        }
    }
}
