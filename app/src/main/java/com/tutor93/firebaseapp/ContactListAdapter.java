package com.tutor93.firebaseapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by indra on 04/09/2016.
 */
public class ContactListAdapter extends ArrayAdapter<Contact> {


    private List<Contact> contacts;

    public ContactListAdapter(Context context, int resource, List<Contact> objects) {
        super(context, resource, objects);
        contacts = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).
                    inflate(R.layout.item_contact_list, parent, false);
        }

        Contact contact = contacts.get(position);
        TextView contactName = (TextView) convertView.findViewById(R.id.contact_name);
        TextView contactNumber = (TextView) convertView.findViewById(R.id.contact_number);


        contactName.setText(contact.getName());
        contactNumber.setText(contact.getNumber());


        return convertView;
    }
}
