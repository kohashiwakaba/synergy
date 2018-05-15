package wakaba.synergy.marryply;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chino on 2018-03-27.
 */

public class Main_1 extends Fragment {
    SwipeRefreshLayout s;

    private List<Main_News> mn;

    String url = "";
    private static final String TAG_ = "";

    RecyclerView mR;
    RecyclerView.Adapter mA;
    RecyclerView.LayoutManager mL;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main,container,false);

        mR = v.findViewById(R.id.main_p1_r);

        mL = new LinearLayoutManager(getActivity());
        mR.setLayoutManager(mL);
        mR.setHasFixedSize(true);

        initNews();

        s = v.findViewById(R.id.sr);
        s.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                s.setRefreshing(false);
            }
        });
        return v;
    }

    private void initNews(){

        mn = new ArrayList<>();
        mn.add(new Main_News(R.drawable.demo_icon,"추천","추천 카페 BEST 3","2018/04/01",false,R.drawable.demo_m1,"22","8",getString(R.string.news_large1)));
        mn.add(new Main_News(R.drawable.demo_icon,"박람회","전주 JTV 웨딩 박람회","2018/12/04",false,R.drawable.demo_m2,"12","9",getString(R.string.news_large2)));
        mn.add(new Main_News(R.drawable.demo_icon,"추천","신혼 여행지 추천 BEST 10","2018/05/01",false,R.drawable.demo_m3,"20","6",getString(R.string.news_large3)));

        NewsAdapter a = new NewsAdapter(mn,getContext());
        mR.setAdapter(a);

    }

}
