package ru.geekbrains.weather;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity implements Constants {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coat);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
                    finish();
            return;
        }

        if (savedInstanceState == null) {
                        SecondFragment details = new SecondFragment();
            details.setArguments(getIntent().getExtras());
                        getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, details).commit();
        }



        /*Parcel parcel = (Parcel) getIntent().getExtras().getSerializable(TEXT);

        EditText editText = findViewById(R.id.textView_3);

        editText.setText(String.valueOf(parcel.text));

        Button startFirstActivity = findViewById(R.id.button_2);
        startFirstActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = (EditText) findViewById(R.id.textView_3);
                Intent intentResult = new Intent();
                intentResult.putExtra(NUMBER_RESULT, editText.getText().toString());
                setResult(RESULT_OK, intentResult);
                finish();
            }
        });*/
    }
}