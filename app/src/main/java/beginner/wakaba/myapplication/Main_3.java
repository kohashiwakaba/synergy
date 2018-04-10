package beginner.wakaba.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by chino on 2018-03-27.
 */

public class Main_3 extends Fragment {
    SwipeRefreshLayout s;

    StaggeredGridLayoutManager sg;

    RecyclerView mR;
    RecyclerView.Adapter mA;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main3,container,false);

        mR = v.findViewById(R.id.main_p3_r);
        mR.setHasFixedSize(true);

        sg = new StaggeredGridLayoutManager(2,1);
        mR.setLayoutManager(sg);

        s = v.findViewById(R.id.sr3);
        s.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                s.setRefreshing(false);
            }
        });

        return v;


    }
}
