package wakaba.synergy.marryply;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Main_2l_1 extends Fragment {

    SwipeRefreshLayout s;
    RecyclerView mr;
    RecyclerView.LayoutManager mL;


    private List<List_1> mc;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main2_list1,container,false);
        mr = v.findViewById(R.id.main_2_list_1);

        mL = new LinearLayoutManager(getActivity());
        mr.setLayoutManager(mL);
        mr.setHasFixedSize(true);

        mc = new ArrayList<>();
        mc.add(new List_1(1,R.drawable.demo_l_wed1,"신도림S컨벤션웨딩홀\\","서울특별시 구로구 경인로 610 코리아빌딩",200000));
        mc.add(new List_1(2,R.drawable.demo_l_wed2,"라마다서울신도림호텔","서울특별시 구로구 경인로 624",200000));
        mc.add(new List_1(3,R.drawable.demo_l_wed3,"SM웨딩 컨벤션","경기도 성남시 수정구 수진동 4789",200000));
        mc.add(new List_1(4,R.drawable.demo_l_wed4,"바하하우스","경기도 용인시 기흥구 석현로 12번길 28",200000));

        s = v.findViewById(R.id.main_2_list_1_layout);
        s.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                s.setRefreshing(false);
            }
        });

        MainListAdapter a = new MainListAdapter(mc,getContext());
        mr.setAdapter(a);

        return v;


    }

}
