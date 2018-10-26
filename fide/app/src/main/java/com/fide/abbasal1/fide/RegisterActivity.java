package com.fide.abbasal1.fide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.microsoft.windowsazure.mobileservices.MobileServiceClient;
import com.microsoft.windowsazure.mobileservices.http.ServiceFilterResponse;
import com.microsoft.windowsazure.mobileservices.table.TableOperationCallback;

import java.net.MalformedURLException;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    private MobileServiceClient mClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button submit= findViewById(R.id.regbtn);
        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        EditText namet=findViewById(R.id.RegName);
        String name=namet.getText().toString();
        EditText emailt=findViewById(R.id.RegEmail);
        String email=emailt.getText().toString();
        EditText mobt=findViewById(R.id.RegMobile);
        String mob=mobt.getText().toString();
        EditText passt=findViewById(R.id.RegPass);
        String password=passt.getText().toString();
        try {
            mClient = new MobileServiceClient("https://ndrelief.azurewebsites.net",
                    this);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        TodoItem item = new TodoItem(name,email,mob,password);
        mClient.getTable(TodoItem.class).insert(item, new TableOperationCallback<TodoItem>() {
            public void onCompleted(TodoItem entity, Exception exception, ServiceFilterResponse response) {
                if (exception == null) {
                    // Insert succeeded
                } else {
                    // Insert failed
                }
            }
        });

        finish();
    }
}
