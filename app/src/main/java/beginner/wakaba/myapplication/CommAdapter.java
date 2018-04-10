package beginner.wakaba.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class CommAdapter extends RecyclerView.Adapter<CommAdapter.ObjViewHolder> {

    Context mc;

    public static class ObjViewHolder extends RecyclerView.ViewHolder{



        ObjViewHolder(View iv) {
            super(iv);
        }
    }

    @Override
    public void onBindViewHolder(ObjViewHolder holder, int position) {

    }

    @Override
    public ObjViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
