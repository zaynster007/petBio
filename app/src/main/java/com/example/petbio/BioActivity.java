package com.example.petbio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.petbio.R.id.dogId;

public class BioActivity extends AppCompatActivity {
    TextView t1;
    TextView t2;
    ImageView img2;
    Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);
        img2=(ImageView) findViewById(R.id.imageView2);
        t1=(TextView) findViewById(R.id.pname);
        t2=(TextView) findViewById(R.id.pbio);

        extras=getIntent().getExtras();
        if(extras!=null)
        {
            String name=extras.getString("name");
            String bio=extras.getString("bio");
            setUp(name,bio);
        }

    }

    public void setUp(String name,String bio)
    {
            if(name.equals("Tommy"))
            { t1.setText(name);
             t2.setText(bio);
             img2.setImageDrawable(getResources().getDrawable(R.drawable.dog));

            }
            else if(name.equals("Pussy")){
                t1.setText(name);
                t2.setText(bio);
                img2.setImageDrawable(getResources().getDrawable(R.drawable.cat));

              }


    }

}
