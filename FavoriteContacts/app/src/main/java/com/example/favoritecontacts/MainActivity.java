package com.example.favoritecontacts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.GregorianCalendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btn1Call, but1Text;
    TextView textViewStatus;
    Spinner helloTranslations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewStatus = (TextView) findViewById(R.id.textViewStatus);
        setupButtonClickEvents();
        setupButtonClickEvents2();


    }

    public void intentBegin(Intent i) {
        PackageManager pm = getPackageManager();
        List activities = pm.queryIntentActivities(i, PackageManager.MATCH_DEFAULT_ONLY);
        if (activities.size() > 0) {
            startActivity(i);
        }
    }

    private void setupButtonClickEvents() {
        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        btn1Call = (Button) findViewById(R.id.button1Call);
        btn1Call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // calls the number from the string resource number1
                Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", getResources().getString(R.string.number1), null));
                // checks to see if we have permission
                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    intentBegin(callIntent);
                }
            }
        });

        /**
         *   Set up button click event listener for the celendar button for the first performance
         *       Use the calendar intent to set an event reminder on the calendar
         */
        but1Text = (Button) findViewById(R.id.button1Text);
        but1Text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // texts the number from the string resource number1 whatever text option was chosen from the Spinner
                Spinner textBody = findViewById(R.id.helloTranslations);
                Intent sendIntent = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", getResources().getString(R.string.number1), null));
                sendIntent.putExtra("sms_body", textBody.getSelectedItem().toString());
                intentBegin(sendIntent);
            }
        });

    }

    private void setupButtonClickEvents2() {
        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        btn1Call = (Button) findViewById(R.id.button2Call);
        btn1Call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // calls the number from the string resource number1
                Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", getResources().getString(R.string.number2), null));
                // checks to see if we have permission
                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    intentBegin(callIntent);
                }
            }
        });

        /**
         *   Set up button click event listener for the celendar button for the first performance
         *       Use the calendar intent to set an event reminder on the calendar
         */
        but1Text = (Button) findViewById(R.id.button2Text);
        but1Text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // texts the number from the string resource number1 whatever text option was chosen from the Spinner
                Spinner textBody = findViewById(R.id.helloTranslations);
                Intent sendIntent = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", getResources().getString(R.string.number2), null));
                sendIntent.putExtra("sms_body", textBody.getSelectedItem().toString());
                intentBegin(sendIntent);
            }
        });

    }

    private void setupButtonClickEvents3() {
        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        btn1Call = (Button) findViewById(R.id.button3Call);
        btn1Call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // calls the number from the string resource number1
                Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", getResources().getString(R.string.number3), null));
                // checks to see if we have permission
                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    intentBegin(callIntent);
                }
            }
        });

        /**
         *   Set up button click event listener for the celendar button for the first performance
         *       Use the calendar intent to set an event reminder on the calendar
         */
        but1Text = (Button) findViewById(R.id.button3Text);
        but1Text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // texts the number from the string resource number1 whatever text option was chosen from the Spinner
                Spinner textBody = findViewById(R.id.helloTranslations);
                Intent sendIntent = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", getResources().getString(R.string.number3), null));
                sendIntent.putExtra("sms_body", textBody.getSelectedItem().toString());
                intentBegin(sendIntent);
            }
        });


    }
}
