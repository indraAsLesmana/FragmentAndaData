package com.tutor93.firebaseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        String [] items = getResources().getStringArray(R.array.data_contact);
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,
                        android.R.id.text1,items);

        ListView lv = (ListView) findViewById(R.id.contactList);
        lv.setAdapter(adapter);

    }
}
