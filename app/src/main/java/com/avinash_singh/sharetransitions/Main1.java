package com.avinash_singh.sharetransitions;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Main1 extends AppCompatActivity {

    private CircleImageView Profile;
    private TextView Name,Details;
    private TextView PressMe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        //UI Links
        Profile = findViewById(R.id.ProfileImage);
        Name = findViewById(R.id.Name);
        Details = findViewById(R.id.ProfileDetails);
        PressMe = findViewById(R.id.Press);

        PressMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sharedIntent = new Intent(Main1.this,Main2.class);

                Pair[] pairs = new Pair[3];

                pairs[0] = new Pair<View,String>(Profile,"ProfileImage");
                pairs[1] = new Pair<View,String>(Name,"Name");
                pairs[2] = new Pair<View,String>(Details,"NameDetails");



                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Main1.this,pairs);
                startActivity(sharedIntent,options.toBundle());

            }
        });


    }
}
