package com.example.guesswhoceleb;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView boity;
    ImageView james;
    ImageView hasley;
    Button boitybutton;
    Button jamesbutton;
    Button hasleybutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.activity_main);
        jamesbutton = (Button) findViewById(R.id.jamesbutton);
        hasleybutton = (Button) findViewById(R.id.hasleybutton);

        addListenerOnButton();

    }

    private Object findViewById(int jamesbutton) {
        return null;
    }

    private void setContentView(int activity_main) {
    }

    private void addListenerOnButton() {
        boity = (ImageView) findViewById(R.id.boity);

        boitybutton = (Button) findViewById(R.id.boitybutton);
        boitybutton.setOnClickListener(new View.OnClickListener()

        {

            @Override
            public void onClick(View arg0) {
                boity.setImageResource(R.drawable.boity);
            }

        });


        {

            jamesbutton = (Button) findViewById(R.id.jamesbutton);
            jamesbutton.setOnClickListener(new View.OnClickListener()

            {

                @Override
                public void onClick(View arg0) {
                    james.setImageResource(R.drawable.james);
                }

            });

        }

        {
            hasleybutton = (Button) findViewById(R.id.hasleybutton);
            hasleybutton.setOnClickListener(new View.OnClickListener()

            {
                @Override
                public void onClick(View arg0) {
                    hasley.setImageResource(R.drawable.hasley);
                }

            });

        }
    }


    }


