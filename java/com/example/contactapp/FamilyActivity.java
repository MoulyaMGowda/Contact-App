package com.example.contactapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        final List<ContactModel> Family = new ArrayList<>();
        Family.add(new ContactModel("Dad","999876542","Email.gmail.com",R.drawable.image));
        Family.add(new ContactModel("Mom","9165326812","Email.gmail.com",R.drawable.image));
        Family.add(new ContactModel("Sis","9875236482","Email.gmail.com",R.drawable.image));
        Family.add(new ContactModel("Brother","9908765462","Email.gmail.com",R.drawable.image));
        Family.add(new ContactModel("Bro","98765433322","Email.gmail.com",R.drawable.image));
        Family.add(new ContactModel("Sista","9097655462","Email.gmail.com",R.drawable.image));
        Family.add(new ContactModel("Aunty","9098876542","Email.gmail.com",R.drawable.image));
        Family.add(new ContactModel("Uncle","98764900562","Email.gmail.com",R.drawable.image));
        Family.add(new ContactModel("Grandpa","9987765542","Email.gmail.com",R.drawable.image));
        Family.add(new ContactModel("Granny","9345676772","Email.gmail.com",R.drawable.image));

        RecyclerView Family_recyclerView = findViewById(R.id.Recycler1);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        Family_recyclerView.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter=new ContactAdapter(this,Family, R.color.black);
        Family_recyclerView.setAdapter(contactAdapter);
    }
}
