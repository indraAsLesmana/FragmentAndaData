package com.tutor93.firebaseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class SignInActivity extends AppCompatActivity {

    private List<Contact> contacts = DataProvider.contactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

       // String [] items = getResources().getStringArray(R.array.data_contact);

        /* ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this,R.layout.item_contact_list,
                        R.id.contactList,items);
       */

        ContactListAdapter adapter = new ContactListAdapter
                (this, R.layout.item_contact_list, contacts);

        ListView lv = (ListView) findViewById(R.id.contactList);
        lv.setAdapter(adapter);

    }
}
