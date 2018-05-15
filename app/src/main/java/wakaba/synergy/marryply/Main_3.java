package wakaba.synergy.marryply;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chino on 2018-03-27.
 */

public class Main_3 extends Fragment {
    SwipeRefreshLayout s;

    private List<Main_Com> mc;

    String url = "";
    private static final String TAG_ = "";


    RecyclerView mR;
    RecyclerView.Adapter mA;
    StaggeredGridLayoutManager sg;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main3,container,false);

        mR = v.findViewById(R.id.main_p3_r);

        sg = new StaggeredGridLayoutManager(2,1);
        mR.setLayoutManager(sg);
        mR.setHasFixedSize(true);

        InitComm();

        s = v.findViewById(R.id.sr3);
        s.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                s.setRefreshing(false);
            }
        });

        return v;


    }



    private void InitComm(){

        mc = new ArrayList<>();
        mc.add(new Main_Com(R.drawable.demo_w1,"도어 스튜디오","#도어 #스튜디오 #1세대스튜디오",9));
        mc.add(new Main_Com(R.drawable.demo_w2,"봉 스튜디오","#자연 #야외 #스튜디오 #자연광",31));
        mc.add(new Main_Com(R.drawable.demo_w3,"SW 스튜디오","#깔끔 #클래식 #모던 #스튜디오",28));
        mc.add(new Main_Com(R.drawable.demo_w4,"모리스제이 스튜디오","#영화같은 #스튜디오 #연출 #고급스러운 #소품",63));
        mc.add(new Main_Com(R.drawable.demo_w5,"루미에 스튜디오","#스튜디오 #행복한추억 #러블리",47));
        mc.add(new Main_Com(R.drawable.demo_w7,"비엔나 스튜디오","#스튜디오 #부산 #컨셉 #배경",50));
        mc.add(new Main_Com(R.drawable.demo_w6,"쿠바 스튜디오","#리허설촬영 #스튜디오 #한국웨딩플래너협회",95));

        CommAdapter a = new CommAdapter(mc,getContext());
        mR.setAdapter(a);
    }


}
