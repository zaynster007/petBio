package com.example.petbio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView catImage;
    ImageView dogImage ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        catImage=(ImageView) findViewById(R.id.catId);
        dogImage=(ImageView)findViewById(R.id.dogId);
        catImage.setOnClickListener(this);
        dogImage.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
        case R.id.catId :
           Intent i=new Intent(this,BioActivity.class);
           i.putExtra("name","Tommy");
           i.putExtra("bio","nice doggo");
           startActivity(i);

            break;

            case R.id.dogId :
                Intent j=new Intent(this,BioActivity.class);
                j.putExtra("name","Pussy");
                j.putExtra("bio","nice cat");
                startActivity(j);

                break;


        }

    }
}
