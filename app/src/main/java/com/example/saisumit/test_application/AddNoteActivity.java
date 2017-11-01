package com.example.saisumit.test_application;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.applandeo.materialcalendarview.CalendarView;

public class AddNoteActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);
        final CalendarView datePicker = (CalendarView) findViewById(R.id.datePicker);
        Button button = (Button) findViewById(R.id.addNoteButton);
        final EditText noteEditText = (EditText) findViewById(R.id.noteEditText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnIntent = new Intent();
                MyEventDay myEventDay = new MyEventDay(datePicker.getSelectedDate(),
                        R.drawable.plus, noteEditText.getText().toString());
                returnIntent.putExtra(EventsActivity.RESULT, myEventDay);
                setResult(Activity.RESULT_OK, returnIntent);
                finish();
            }
        });
    }
}