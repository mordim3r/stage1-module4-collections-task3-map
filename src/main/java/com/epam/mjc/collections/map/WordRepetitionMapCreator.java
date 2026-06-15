package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {

        Map<String, Integer> result = new HashMap<>();
        String []words = sentence.split("[^a-zA-Z]+");
        for (String i: words){
            if (i.isEmpty()) continue;
            String lword = i.toLowerCase();
            result.merge(lword,1, Integer::sum);
        }
        return result;
    }
}
