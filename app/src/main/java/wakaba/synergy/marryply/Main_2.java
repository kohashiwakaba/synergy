package wakaba.synergy.marryply;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by chino on 2018-03-27.
 */

public class Main_2 extends Fragment {
    CardView emp;
    Button newplan;
    View.OnClickListener cl;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main2,container,false);
        emp = v.findViewById(R.id.calc_none);
        newplan = emp.findViewById(R.id.card_calc_add);

        cl = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),AddPlanActivity.class);
                getActivity().startActivity(i);
            }
        };
        newplan.setOnClickListener(cl);

        return v;
    }

    public  void showDatePicker(){

    }
}
