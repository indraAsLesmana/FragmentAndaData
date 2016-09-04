package com.tutor93.firebaseapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by indra on 04/09/2016.
 */
public final class DataProvider {

    public static List<Contact> contactList = new ArrayList<>();
    public static Map<String, Contact> contactMap = new HashMap<>();

    static {
        addContact("1423345", "asri");
        addContact("0098657", "lesmana");
        addContact("12344523", "agus");
        addContact("6674590", "indra");
        addContact("6674591", "indra A");
        addContact("6674592", "indra L");
        addContact("6674593", "indra Agus");
        addContact("6674594", "indra lesmana");
        addContact("6674595", "indra lesmana a");
        addContact("6674596", "indra lesmana b");
    }

    private static void addContact(String number, String name) {
        Contact contact = new Contact(number, name);
        contactList.add(contact);
        contactMap.put(number, contact);
    }
}
