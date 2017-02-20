package com.codepath.todoapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

      //  String param1 = getIntent().getStringExtra("a");

        addListenerOnButton();
        //onSubmit();
    }


    public void addListenerOnButton() {
        final Context context = this;
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String param1 = getIntent().getStringExtra("a");
                EditText etEditItem = (EditText) findViewById(R.id.editText);
                etEditItem.setText(param1);

                Intent intent = new Intent(context,MainActivity.class);
                Bundle bundle = getIntent().getExtras();

                startActivityForResult(intent,20);

            }
        });
    }
}




