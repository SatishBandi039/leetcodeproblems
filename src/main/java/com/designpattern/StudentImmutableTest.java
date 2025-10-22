package com.designpattern;

import java.util.HashMap;
import java.util.Map;

public final class StudentImmutableTest {

    private final String name;
    private final int id;
    private final Map<String, String> metaData;

    public StudentImmutableTest(String name, int id, Map<String, String> metaData){
        this.name = name;
        this.id = id;

        // Deep copy of mutable Map to maintain immutability
        Map<String, String> tempMap = new HashMap<>();
        for(Map.Entry<String, String> entry: metaData.entrySet()){
            tempMap.put(entry.getKey(), entry.getValue());
        }
        this.metaData = tempMap;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Return a deep copy of the mutable Map to avoid exposing internal state
    public Map<String, String> getMetadata() {
        Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry : this.metaData.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }

    public static void main(String args[]){
        Map<String, String> map = new HashMap<>();
        map.put("1","first");
        map.put("2","second");

        StudentImmutableTest student = new StudentImmutableTest("Satish",39,map);

        System.out.println(student.getName());         // Alice
        System.out.println(student.getId());        // 101
        System.out.println(student.getMetadata());     // {1=first, 2=second}
    }
}
