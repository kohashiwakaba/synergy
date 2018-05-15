package wakaba.synergy.marryply;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.design.widget.Snackbar;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ObjViewHolder> {

    Context mc;

    public static final String int_i1 = "beginner.wakaba.myapplication";
    public static class ObjViewHolder extends RecyclerView.ViewHolder{

        CardView cv;
        ImageView n1;
        TextView n2;
        TextView n3;
        TextView n4;
        ToggleButton n5;
        ImageView n6;
        TextView n7;
        TextView n8;
        View.OnClickListener cl;

        ObjViewHolder(View iv){
            super(iv);
            cv = iv.findViewById(R.id.main_card);
            n1 = iv.findViewById(R.id.news_card_1_thumb);
            n2 = iv.findViewById(R.id.news_card_2_category);
            n3 = iv.findViewById(R.id.news_card_3_title);
            n4 = iv.findViewById(R.id.news_card_4_date);
            n5 = iv.findViewById(R.id.news_card_5_heart);
            n6 = iv.findViewById(R.id.news_card_6_image);
            n7 = iv.findViewById(R.id.news_card_7_reply);
            n8 = iv.findViewById(R.id.news_card_8_share);
        }

    }

    List<Main_News> n;

    NewsAdapter(List<Main_News> ns, Context c){
        this.n = ns;
        mc = c;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public ObjViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_main_news, parent, false);
        ObjViewHolder ov = new ObjViewHolder(v);

        return ov;
    }

    @Override
    public void onBindViewHolder(ObjViewHolder h, int i) {
        final int pos = i;
        h.n1.setImageResource(n.get(i).n_1_thumb);
        h.n2.setText(n.get(i).n_2_cat);
        h.n3.setText(n.get(i).n_3_title);
        h.n4.setText(n.get(i).n_4_date);
        //
        h.n6.setImageResource(n.get(i).n_6_image);
        h.n7.setText(n.get(i).n_7_com);
        h.n8.setText(n.get(i).n_8_share);

        h.cl = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.news_card_5_heart : {
                        Snackbar.make(view, "좋아요 버튼 테스트", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show(); break;
                    }
                    default:{
                        Intent in = new Intent(mc.getApplicationContext(),NewsfeedActivity.class);
                        in.putExtra("news_1_image",n.get(pos).n_6_image);
                        in.putExtra("news_2_title",n.get(pos).n_3_title);
                        in.putExtra("news_3_subtitle",n.get(pos).n_2_cat);
                        in.putExtra("news_4_content",n.get(pos).n_9_content);
                        mc.startActivity(in);
                    }
                }

            }
        };

        h.cv.setOnClickListener(h.cl);
        h.n5.setOnClickListener(h.cl);

    }

    @Override
    public int getItemCount() {
        return n.size();
    }
}
