package wakaba.synergy.marryply;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.graphics.Palette;
import android.transition.Slide;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class NewsfeedActivity extends AppCompatActivity {

    Context mc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initActivityTransitions();
        setContentView(R.layout.activity_newsfeed);

        Intent i = getIntent();
        int tbimage = i.getIntExtra("news_1_image",R.drawable.demo_c1);
        String title = i.getStringExtra("news_2_title");
        String subtitle = i.getStringExtra("news_3_subtitle");
        String context = i.getStringExtra("news_4_content");
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);

        NestedScrollView ns = (NestedScrollView) findViewById(R.id.ns_ns_context);
        TextView ctx = (TextView) ns.findViewById(R.id.news_context);
        ctx.setText(context);

        int p_v = getResources().getColor(R.color.colorPrimary);


        ViewCompat.setTransitionName(findViewById(R.id.toolbar_layout),"news_1_image");
        supportPostponeEnterTransition();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        ImageView toolbar_i = findViewById(R.id.n_toolbar_image);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setSubtitle(subtitle);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),tbimage);
        Log.e("E","bitmap = "+bitmap);
        Bitmap bitmaptest = BitmapFactory.decodeResource(getResources(),R.drawable.demo_c2);
        Log.e("E","bitmaptest = "+bitmaptest);
        toolbar_i.setImageBitmap(bitmap);

        setToolbarColor(bitmap);

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

    public void setToolbarColor(Bitmap bitmap) {
        // Generate the palette and get the vibrant swatch
        // See the createPaletteSync() and checkVibrantSwatch() methods
        // from the code snippets above
        Palette p = createPaletteSync(bitmap);
        Log.e("E","p = "+p);
        Palette.Swatch vibrantSwatch = checkVibrantSwatch(p);
        Log.e("E","vibrantSwatch = "+vibrantSwatch);

        // Set the toolbar background and text colors
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout ct = findViewById(R.id.toolbar_layout);
        ct.setContentScrimColor(vibrantSwatch.getRgb());
        toolbar.setTitleTextColor(vibrantSwatch.getTitleTextColor());
        getWindow().setNavigationBarColor(vibrantSwatch.getRgb());
    }

    public Palette createPaletteSync(Bitmap b){
        return Palette.from(b).generate();
    }

    private Palette.Swatch checkVibrantSwatch(Palette p) {
        Palette.Swatch vibrant = p.getVibrantSwatch();
        if (vibrant != null) {
            return vibrant;
        }else{
            return checkDominantSwatch(p);
        }
    }
    private Palette.Swatch checkDominantSwatch(Palette p) {
        Palette.Swatch dominant = p.getDominantSwatch();
        if (dominant != null) {
            return dominant;
        }
        return null;
    }

    private void initActivityTransitions() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Slide transition = new Slide();
            transition.excludeTarget(android.R.id.statusBarBackground, true);
            getWindow().setEnterTransition(transition);
            getWindow().setReturnTransition(transition);
        }
    }


}
