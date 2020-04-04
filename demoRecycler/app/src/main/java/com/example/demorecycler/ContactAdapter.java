package com.example.demorecycler;

import android.content.Context;
import android.media.Image;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class ContactAdapter extends ArrayAdapter<Contact> {
    private Context myContext;
    private ArrayList<Contact> myContacts = new ArrayList<Contact>();

    public ContactAdapter(Context myContext, ArrayList<Contact> myContacts){
        super(myContext,0,myContacts);
        this.myContext = myContext;
        this.myContacts = myContacts;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(myContacts == null){
            //Inflater displays to screen
            convertView = LayoutInflater.from(myContext).inflate(R.layout.contact_items,parent,false);

        }

        Contact currentContact = myContacts.get(position);
        ImageView profilePicture = convertView.findViewById(R.id.profilePic);
        profilePicture.setImageResource(currentContact.getProfilePicture());

        TextView name = convertView.findViewById(R.id.name);
        name.setText(currentContact.getName());

        TextView number = convertView.findViewById(R.id.number);
        number.setText(currentContact.getNumber());


        return convertView;

    }
}
