package com.example.contactapp;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class WorkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);

        final List<ContactModel> Work = new ArrayList<>();
        Work.add(new ContactModel("Aish","9664946562","Email.gmail.com",R.drawable.image));
        Work.add(new ContactModel("Beeshm","9265326812","Email.gmail.com",R.drawable.image));
        Work.add(new ContactModel("Chiru","9565236482","Email.gmail.com",R.drawable.image));
        Work.add(new ContactModel("Devid","9764946562","Email.gmail.com",R.drawable.image));
        Work.add(new ContactModel("Guru","9764946562","Email.gmail.com",R.drawable.image));
        Work.add(new ContactModel("poo","9464946562","Email.gmail.com",R.drawable.image));
        Work.add(new ContactModel("Manu","9864946562","Email.gmail.com",R.drawable.image));
        Work.add(new ContactModel("Naga","9664946562","Email.gmail.com",R.drawable.image));
        Work.add(new ContactModel("Shru","9564946562","Email.gmail.com",R.drawable.image));
        Work.add(new ContactModel("Boss","9164946562","Email.gmail.com",R.drawable.image));

        RecyclerView Work_recyclerView = findViewById(R.id.Recycler3);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        Work_recyclerView.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter=new ContactAdapter(this,Work, R.color.black);
        Work_recyclerView.setAdapter(contactAdapter);
    }
    private static void add(ContactModel add) {
    }
}
