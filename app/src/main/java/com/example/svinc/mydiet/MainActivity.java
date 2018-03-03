package com.example.svinc.mydiet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    Button button;
    Random r;
    Integer[] images = {R.drawable.burger, R.drawable.chicken, R.drawable.noodles};
    String[] quotes = {"“If you can dream it, you can do it.” - Walt Disney",
            "“Press forward. Do not stop, do not linger in your journey, but strive for the mark set before you.” - George Whitefield",
            " “The future belongs to those who believe in the beauty of their dreams.” - Eleanor Roosevelt"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        textView = (TextView) findViewById(R.id.quoteLabel);
        button = (Button) findViewById(R.id.refreshButton);

        r = new Random();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(images[r.nextInt(images.length)]);
                Random randquote = new Random();
                final int randnum = randquote.nextInt(3);
                textView.setText(quotes[randnum]);

            }
        });
    }
}
