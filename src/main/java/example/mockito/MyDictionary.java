package example.mockito;

import java.util.Map;

class MyDictionary {

    private Map<String, String> wordMap;

    public void add(String word, String meaning) {
        wordMap.put(word, meaning);
    }

    public String getMeaning(String word) {
        return wordMap.get(word);
    }
}
