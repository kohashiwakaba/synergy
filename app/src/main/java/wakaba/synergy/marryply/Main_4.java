package wakaba.synergy.marryply;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import wakaba.synergy.marryply.MPalette;

/**
 * Created by chino on 2018-03-27.
 */

public class Main_4 extends Fragment {

    CardView mp_profile_regular;
    ImageView profile_image;
    ConstraintLayout pi_bg;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main4,container,false);
        mp_profile_regular = v.findViewById(R.id.mp_pr_regular_i);
        profile_image = v.findViewById(R.id.mp_card_1_thumb);
        Bitmap bitmap = ((BitmapDrawable)profile_image.getDrawable()).getBitmap();
        Palette p = createPaletteSync(bitmap);
        Palette.Swatch vibrantSwatch = checkVibrantSwatch(p);
        mp_profile_regular.setCardBackgroundColor(vibrantSwatch.getRgb());

        /*
        final Button b2 = v.findViewById(R.id.button2);
        View.OnClickListener cl =new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b2.setText("버튼 123");
            }
        };
        b2.setOnClickListener(cl);
*/
        return v;
    }

    public Palette createPaletteSync(Bitmap b){
        return Palette.from(b).generate();
    }

    private Palette.Swatch checkVibrantSwatch(Palette p) {
        Palette.Swatch vibrant = p.getLightVibrantSwatch();
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
}
