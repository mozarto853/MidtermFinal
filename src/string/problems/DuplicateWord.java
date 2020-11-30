package string.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = ("Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language");

        String[] words = st.split(" ");
        Map<String, Integer> wordMap = new HashMap<String,Integer>();


        for(String str : words){
            if(wordMap.get(str) != null ){
                wordMap.put(str, wordMap.get(str) +1);
            }else {
                wordMap.put(str,1);
            }
        }
        Set<String>str2 = wordMap.keySet();
        for(String str : str2){
            System.out.println(" word: " + str + " is repeated repeated: " + wordMap.get(str));
        }

    }
    /* THE CORRECT WAY TO DO IT. I was stuck so I looked up the answer
    }

	public static void duplicateWord(String st) {
		st.toLowerCase();
		int count;
		int letterCount = 0;

		String[] words = st.split(" ");

		for (String word : words) {
			letterCount += word.length();
		}
		System.out.println("The average length of a word is: " + letterCount / words.length);

		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = "0";
				}
			}
			if (count > 1 && words[i] != "0")
				System.out.println(words[i] + " " + count);
		}

	}
     */

}
