package dev.hdstudio.wat.lab2;

import java.util.HashMap;
import java.util.Map;

public class FrequentNames {

    public HashMap<String, Integer> frequentNames;

    public FrequentNames() {
        frequentNames = new HashMap();
    }

    public void insert(String name) {
        if (frequentNames.containsKey(name)) {
            int x = frequentNames.get(name) + 1;
            frequentNames.replace(name, x);
        }
        else {
            frequentNames.put(name, 1);
        }
    }

    public void choose() {
        Map.Entry<String, Integer> maxEntry = null;

        for (Map.Entry<String, Integer> entry : frequentNames.entrySet())
        {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
            {
                maxEntry = entry;
            }
        }
        frequentNames.remove(maxEntry);
        System.out.println(maxEntry);
    }
}
