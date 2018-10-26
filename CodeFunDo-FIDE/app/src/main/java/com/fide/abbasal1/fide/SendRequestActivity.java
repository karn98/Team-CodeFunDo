package com.fide.abbasal1.fide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SendRequestActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_request);
        Button send=findViewById(R.id.requestbtn);
        send.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        EditText txt=findViewById(R.id.editTextRequest);
        String mes=txt.getText().toString();
        //database.addMessageToDatabase(mes);
        finish();
    }
}
