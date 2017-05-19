package com.example.taoguo.pageviewtest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by taoguo on 2017/5/19.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private FragmentManager fragmetnmanager;
    private List<Fragment> listfragment; //创建一个List<Fragment>

    public MyFragmentPagerAdapter(FragmentManager fm,List<Fragment> list) {
        super(fm);
        fragmetnmanager = fm;
        listfragment = list;
    }

    @Override
    public Fragment getItem(int position) {
        return listfragment.get(position); //返回第几个fragment
    }

    @Override
    public int getCount() {
        return listfragment.size(); //总共有多少个fragment
    }
}
