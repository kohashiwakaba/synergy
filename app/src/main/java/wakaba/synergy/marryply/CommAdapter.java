package wakaba.synergy.marryply;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CommAdapter extends RecyclerView.Adapter<CommAdapter.ObjViewHolder> {

    Context mc;
    public static class ObjViewHolder extends RecyclerView.ViewHolder{

        CardView cv;
        ImageView c1;
        TextView c2;
        TextView c3;
        TextView c4;
        View.OnClickListener cl;

        ObjViewHolder(View iv) {
            super(iv);
            cv = iv.findViewById(R.id.main_comm);
            c1 = iv.findViewById(R.id.comm_card_1_image);
            c2 = iv.findViewById(R.id.comm_card_2_title);
            c3 = iv.findViewById(R.id.comm_card_3_hashtag);
            c4 = iv.findViewById(R.id.comm_card_4_comments);

        }
    }

    List<Main_Com> n;

    CommAdapter(List<Main_Com> ns, Context c){
        this.n = ns;
        mc = c;
    }

    @Override
    public void onBindViewHolder(ObjViewHolder h, int i) {
        h.c1.setImageResource(n.get(i).c1_bg);
        h.c2.setText(n.get(i).c2_title);
        h.c3.setText(n.get(i).c3_tag);
        h.c4.setText(n.get(i).c4_comment+"");

        final String tc = n.get(i).c2_title;

        h.cl = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, tc+" 카드 테스트", Snackbar.LENGTH_LONG)
                        .setAction("버튼", null).show();
            }
        };
        h.cv.setOnClickListener(h.cl);

    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public ObjViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_main_com, parent, false);
        CommAdapter.ObjViewHolder ov = new CommAdapter.ObjViewHolder(v);
        return ov;
    }

    @Override
    public int getItemCount() {
        return n.size();
    }
}
