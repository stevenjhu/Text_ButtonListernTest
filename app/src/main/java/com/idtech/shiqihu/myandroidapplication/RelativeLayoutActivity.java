package com.idtech.shiqihu.myandroidapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by student on 6/21/2016.
 */
public class RelativeLayoutActivity extends android.app.Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_relative_layout);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                EditText textfield = (EditText)findViewById(R.id.firstTextField);
                intent.putExtra("firstString", textfield.getText().toString());
                startActivity(intent);
            }
        });



    }
    /*public void buttonClicked(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        EditText textfield = (EditText)findViewById(R.id.firstTextField);
        intent.putExtra("firstString", textfield.getText().toString());
        startActivity(intent);
        }
*/
    }

/**/