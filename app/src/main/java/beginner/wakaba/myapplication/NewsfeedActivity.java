package beginner.wakaba.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class NewsfeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newsfeed);

        Intent i = getIntent();
        int tbimage = i.getIntExtra("news_1_image",0);
        String title = i.getStringExtra("news_2_title");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        ImageView toolbar_i = findViewById(R.id.n_toolbar_image);
        setSupportActionBar(toolbar);
        setTitle(title);
        toolbar_i.setImageResource(tbimage);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
