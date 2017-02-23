package com.codepath.todoapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

   // MainActivity _main = new MainActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        String param1 = getIntent().getStringExtra("a");
        EditText etEditItem = (EditText) findViewById(R.id.editText);
        etEditItem.setText(param1);
        //set cursor at the end
        int textLength = etEditItem.getText().length();
        etEditItem.setSelection(textLength, textLength);

        addListenerOnButton();

    }


    public void addListenerOnButton() {
        final Context context = this;
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String param1 = getIntent().getStringExtra("a");
                int position = getIntent().getIntExtra("position",-1);
                EditText etEditItem = (EditText) findViewById(R.id.editText);


                Intent intent = new Intent(context,MainActivity.class);

                String newParam = etEditItem.getText().toString();
                // Pass relevant data back as a result
                intent.putExtra("a", newParam);
                intent.putExtra("code", 200);

                intent.putExtra("position",position);
              //  _main.writeItems();
                // Activity finished ok, return the data
                setResult(RESULT_OK, intent); // set result code and bundle data for response

                finish();
            }
        });
    }
}




