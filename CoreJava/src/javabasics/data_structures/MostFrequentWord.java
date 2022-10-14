package javabasics.data_structures;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentWord {
    public static void main(String[] args) {

        //Write a function that receives a sentence (string) as a parameter and returns the most frequent word of that sentence. If there is more than one such word return any one of them.

        //Test the method with the sentence from John Updike’s 'Rabbit, Run':
        mostFreqWord("But then they were married (she felt awful about being pregnant before but\n" +
                "Harry had been talking about marriage for a while and anyway laughed when\n" +
                "she told him in early February about missing her period and said Great she\n" +
                "was terribly frightened and he said Great and lifted her put his arms around\n" +
                "under her bottom and lifted her like you would a child he could be so\n" +
                "wonderful when you didn’t expect it in a way it seemed important that you\n" +
                "didn’t expect it there was so much nice in him she couldn’t explain to\n" +
                "anybody she had been so frightened about being pregnant and he made her\n" +
                "be proud) they were married after her missing her second period in March\n" +
                "and she was still little clumsy etc. dark-complected Janice Springer and her\n" +
                "husband was a conceited lunk who wasn’t good for anything in the world Daddy\n" +
                "said and the feeling of being alone would melt a little with a little drink.");

        //Expected result: and
    }


    static void mostFreqWord(String input){

        Map<String, Integer> map = new HashMap<>();
        int startOfNewWord = 0;
        String word = "";

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' '){
                word += input.substring(startOfNewWord, i);
                word = word.toLowerCase();
                if (!map.containsKey(word)){
                    map.put(word, 1);
                    word = "";
                } else if (map.containsKey(word)){
                    map.replace(word, map.get(word), map.get(word) + 1);
                    word = "";
                }
                startOfNewWord = i + 1;
            } else if (input.charAt(i) == '.' && i == input.length() - 1){
                word += input.substring(startOfNewWord, i);
                word = word.toLowerCase();
                if (!map.containsKey(word)){
                    map.put(word, 1);
                    word = "";
                } else if (map.containsKey(word)){
                    map.replace(word, map.get(word), map.get(word) + 1);
                    word = "";
                }
                startOfNewWord = i + 1;
            }
            else if(i == input.length() - 1){
                word += input.substring(startOfNewWord, i + 1);
                word = word.toLowerCase();
                if (!map.containsKey(word)){
                    map.put(word, 1);
                    word = "";
                } else if (map.containsKey(word)){
                    map.replace(word, map.get(word), map.get(word) + 1);
                    word = "";
                }
                startOfNewWord = i + 1;
            }
        }

        //System.out.println(map);

        int highestCount = 0;
        for (String s : map.keySet()){
            if (map.get(s) >= highestCount){
                highestCount = map.get(s);
            }
        }

        for (String s : map.keySet()){
            if (map.get(s) == highestCount){
                System.out.println(s);
            }
        }
    }
}
