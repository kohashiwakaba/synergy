package wakaba.synergy.marryply;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by chino on 2018-03-27.
 */

public class Main_4 extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main4,container,false);
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
}
