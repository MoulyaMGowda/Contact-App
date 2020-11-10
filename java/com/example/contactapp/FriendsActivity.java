package com.example.contactapp;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FriendsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        final List<ContactModel> Friends = new ArrayList<>();
        Friends.add(new ContactModel("tina","9964956642","Email.gmail.com",R.drawable.image));
        Friends.add(new ContactModel("Lila","9956776812","Email.gmail.com",R.drawable.image));
        Friends.add(new ContactModel("Nehu","9965236482","Email.gmail.com",R.drawable.image));
        Friends.add(new ContactModel("Peter","9948456562","Email.gmail.com",R.drawable.image));
        Friends.add(new ContactModel("Mana","9964946562","Email.gmail.com",R.drawable.image));
        Friends.add(new ContactModel("Akash","9964739862","Email.gmail.com",R.drawable.image));
        Friends.add(new ContactModel("lilly","9945475862","Email.gmail.com",R.drawable.image));
        Friends.add(new ContactModel("shree","9964946562","Email.gmail.com",R.drawable.image));
        Friends.add(new ContactModel("rosie","9965678862","Email.gmail.com",R.drawable.image));
        Friends.add(new ContactModel("shwe","90987654432","Email.gmail.com",R.drawable.image));

        RecyclerView Friends_recyclerView = findViewById(R.id.Recycler2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        Friends_recyclerView.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter=new ContactAdapter(this,Friends, R.color.black);
        Friends_recyclerView.setAdapter(contactAdapter);
    }

    private static void add(ContactModel add) {
    }
}
