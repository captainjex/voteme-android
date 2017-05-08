package com.wkwksama.voteme;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    protected class VoteListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent iLogin = new Intent(v.getContext(),TempActivity.class);
            startActivity(iLogin);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Belum dibikin", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        LinearLayout pilVote1 = (LinearLayout) this.findViewById(R.id.main_pil1);
        pilVote1.setOnClickListener(new MainActivity.VoteListener());
    }

}
