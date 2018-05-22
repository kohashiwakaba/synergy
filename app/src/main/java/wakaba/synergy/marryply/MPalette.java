package wakaba.synergy.marryply;

import android.graphics.Bitmap;
import android.support.v7.graphics.Palette;

public class MPalette {


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

}
