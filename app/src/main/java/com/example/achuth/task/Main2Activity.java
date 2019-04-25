package com.example.achuth.task;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.UUID;

public class Main2Activity extends AppCompatActivity {
    private EditText editTextname,editTextdate,editTextcomment;
    private Button button;
    private DatabaseReference UserDatabaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editTextcomment=(EditText)findViewById(R.id.commenttext);
        editTextdate=(EditText)findViewById(R.id.date);
        editTextname=(EditText)findViewById(R.id.name);
        button=(Button)findViewById(R.id.button);
        UserDatabaseReference = FirebaseDatabase.getInstance().getReference().child("Comments").child("ID");


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserComment userDetail =new UserComment();
                userDetail.setName(editTextname.getText().toString());
                userDetail.setCommenttext(editTextcomment.getText().toString());
                userDetail.setDate(Long.parseLong(editTextdate.getText().toString()));
                String uniqueID = UUID.randomUUID().toString();
                UserDatabaseReference.child(uniqueID).setValue(userDetail);

            }
        });
    }
}
