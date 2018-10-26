package com.fide.abbasal1.fide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AfterLogin extends AppCompatActivity  implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);
        TextView one = (TextView) findViewById(R.id.emergencyContacts);
        one.setOnClickListener(this); // calling onClick() method
        TextView two = (TextView) findViewById(R.id.donate);
        two.setOnClickListener(this);
        TextView three = (TextView) findViewById(R.id.sendRequest);
        three.setOnClickListener(this);
        TextView four = (TextView) findViewById(R.id.Volunteer);
        four.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.emergencyContacts:
                Intent i=new Intent(this,EmergencyContactsActivity.class);
                startActivity(i);
                break;

            case R.id.donate:
                // do your code
                Intent i2=new Intent(this,DonateActivity.class);
                startActivity(i2);
                break;

            case R.id.sendRequest:
                // do your code
                Intent i3=new Intent(this,SendRequestActivity.class);
                startActivity(i3);
                break;
            case R.id.Volunteer:
                // do your code
                Intent i4=new Intent(this,VolunteerActivity.class);
                startActivity(i4);
                break;

            default:
                break;
        }
    }
}
