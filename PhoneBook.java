package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {
    private Map<String, List<String>> map;

    public PhoneBook(Map<String, List<String>> map) {
        this.map = map;
    }

    public PhoneBook() {
        this(new HashMap<String, List<String>>());
    }

    public void add(String name, String phoneNumber) {
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add(phoneNumber);
        this.map.put(name, numbers);
    }

    public void addAll(String name, String... phoneNumbers) {
        ArrayList list = new ArrayList<String>();
        if (phoneNumbers != null){
            for (String g : phoneNumbers){
                list.add(g);
            }
        }
        this.map.put(name, list);
        //list.addAll(Arrays.asList(phoneNumbers));
        //map.put(name, list);
    }

    public void remove(String name) {
        map.remove(name);
    }

    public Boolean hasEntry(String name) {
        for (Map.Entry<String, List<String>> entry : map.entrySet()){
            if (entry.getValue().contains(name)){
                return true;
            }
        }

        return false;
    }

    public List<String> lookup(String name) {
        return map.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        return null;
    }

    public List<String> getAllContactNames() {
        List list = new ArrayList();
        for (Map.Entry<String, List<String>> entry : map.entrySet()){
            list.add(entry.getKey());
        }
        return list;
    }

    public Map<String, List<String>> getMap() {
        return map;
    }
}
