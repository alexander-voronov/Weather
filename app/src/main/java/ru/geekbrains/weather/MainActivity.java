package ru.geekbrains.weather;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Constants {

    private final static int REQUEST_CODE = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Button startSecondActivity = findViewById(R.id.button_1);
        startSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText txt = findViewById(R.id.textView_1);

                Parcel parcel = new Parcel();

                parcel.text = txt.getText().toString();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra(TEXT, parcel);
                startActivityForResult(intent, REQUEST_CODE);

            }
        });*/
    }

    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != REQUEST_CODE) {
        super.onActivityResult(requestCode, resultCode, data);
        return;
        }
        if (resultCode == RESULT_OK){
            EditText num = findViewById(R.id.textView_3);
        }
    }*/
}