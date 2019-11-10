package com.minh.listviewgmail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Mail> listMail;
    ListView lvMail;
    MailAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listMail = new ArrayList<Mail>();
        listMail.add(new Mail("Nguoi gui","Chu de buc thu","Noi dung buc thu etc etc etc", new Date(2019,10,10)));
        listMail.add(new Mail("Nguoi gui","Chu de buc thu","Noi dung buc thu etc etc etc", new Date(2019,10,10)));
        listMail.add(new Mail("Nguoi gui","Chu de buc thu","Noi dung buc thu etc etc etc", new Date(2019,10,10)));
        listMail.add(new Mail("Nguoi gui","Chu de buc thu","Noi dung buc thu etc etc etc", new Date(2019,10,10)));
        listMail.add(new Mail("Nguoi gui","Chu de buc thu","Noi dung buc thu etc etc etc", new Date(2019,10,10)));
        listMail.add(new Mail("Nguoi gui","Chu de buc thu","Noi dung buc thu etc etc etc", new Date(2019,10,10)));
        listMail.add(new Mail("Nguoi gui","Chu de buc thu","Noi dung buc thu etc etc etc", new Date(2019,10,10)));
        listMail.add(new Mail("Nguoi gui","Chu de buc thu","Noi dung buc thu etc etc etc", new Date(2019,10,10)));
        listMail.add(new Mail("Nguoi gui","Chu de buc thu","Noi dung buc thu etc etc etc", new Date(2019,10,10)));
        listMail.add(new Mail("Nguoi gui","Chu de buc thu","Noi dung buc thu etc etc etc", new Date(2019,10,10)));
        listMail.add(new Mail("Nguoi gui","Chu de buc thu","Noi dung buc thu etc etc etc", new Date(2019,10,10)));
        listMail.add(new Mail("Nguoi gui","Chu de buc thu","Noi dung buc thu etc etc etc", new Date(2019,10,10)));
        listMail.add(new Mail("Nguoi gui","Chu de buc thu","Noi dung buc thu etc etc etc", new Date(2019,10,10)));
        listMail.add(new Mail("Nguoi gui","Chu de buc thu","Noi dung buc thu etc etc etc", new Date(2019,10,10)));
        lvMail = findViewById(R.id.listMail);
        adapter =  new MailAdapter(listMail, this);
        lvMail.setAdapter(adapter);
    }
}
