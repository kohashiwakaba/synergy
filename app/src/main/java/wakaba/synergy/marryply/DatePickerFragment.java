package wakaba.synergy.marryply;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;
import java.util.Calendar;

public class DatePickerFragment extends AppCompatDialogFragment {
    DatePickerDialog.OnDateSetListener ondateset;
    private int year, month, day;
    public void setCallBack(DatePickerDialog.OnDateSetListener ondate){
        ondateset = ondate;
    }
    @Override
    public void setArguments(Bundle args) {
        super.setArguments(args);
        year = args.getInt("year");
        month = args.getInt("month");
        day = args.getInt("day");
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new DatePickerDialog(getActivity(), ondateset, year, month, day);
    }
}
