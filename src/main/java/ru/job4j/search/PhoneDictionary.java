package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {


    private ArrayList<Person> persons = new ArrayList<Person>();


    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public  ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person info : result) {
            if (info.getAddress().contains(key) || info.getName().contains(key) && info.getAddress().contains(key) || info.getPhone().contains(key)) {
                return result;
            }
        } return persons;

    }
}

