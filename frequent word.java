public class MostFrequentWord {

    public static String findMostFrequentWord(String str) {
        String[] words = str.toLowerCase().split("\\s+");
        String mostFrequent = "";
        int maxCount = 0;

        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i].replaceAll("[^a-z]", "");
            int count = 0;

            for (int j = 0; j < words.length; j++) {
                if (currentWord.equals(words[j].replaceAll("[^a-z]", ""))) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostFrequent = currentWord;
            }
        }

        return "\"" + mostFrequent + "\" appeared " + maxCount + " times.";
    }

    public static void main(String[] args) {
        String input = "the dog and the cat chased the bird";
        String output = findMostFrequentWord(input);

        System.out.println("Input: \"" + input + "\"");
        System.out.println("Output: " + output);
    }
}
