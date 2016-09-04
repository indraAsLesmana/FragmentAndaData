package com.tutor93.firebaseapp;

import android.widget.ArrayAdapter;

/**
 * Created by indra on 04/09/2016.
 */
public class Contact {
    private String name;
    private String number;

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public Contact(String number, String name) {
        this.number = number;
        this.name = name;
    }
}
