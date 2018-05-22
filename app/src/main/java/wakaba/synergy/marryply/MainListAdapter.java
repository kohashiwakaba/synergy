package wakaba.synergy.marryply;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MainListAdapter extends RecyclerView.Adapter<MainListAdapter.ObjViewHolder> {

    Context mc;
    public static class ObjViewHolder extends RecyclerView.ViewHolder{

        ConstraintLayout ll;
        ImageView n2;
        TextView n3;
        TextView n4;
        TextView n5;
        ImageButton n6;
        View.OnClickListener cl;

        ObjViewHolder(View iv) {
            super(iv);
            ll = iv.findViewById(R.id.list_main);
            n2 = iv.findViewById(R.id.lm_2_image);
            n3 = iv.findViewById(R.id.lm_3_name);
            n4 = iv.findViewById(R.id.lm_4_price);
            n5 = iv.findViewById(R.id.lm_5_desc);
            n6 = iv.findViewById(R.id.lm_6_cart);

        }
    }
    List<List_1> n;

    MainListAdapter(List<List_1> ns, Context c){
        this.n = ns;
        mc = c;
    }


    @Override
    public void onBindViewHolder(ObjViewHolder h, int i) {
        h.n2.setImageResource(n.get(i).image);
        h.n3.setText(n.get(i).name);
        h.n4.setText(n.get(i).price+"");
        h.n5.setText(n.get(i).desc);

        final String tc = n.get(i).name;

        h.cl = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, tc+" 리스트 테스트", Snackbar.LENGTH_LONG)
                        .setAction("버튼", null).show();
            }
        };
        h.ll.setOnClickListener(h.cl);

    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public ObjViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_main_wed, parent, false);
        MainListAdapter.ObjViewHolder ov = new MainListAdapter.ObjViewHolder(v);
        return ov;
    }

    @Override
    public int getItemCount() {
        return n.size();
    }
}
