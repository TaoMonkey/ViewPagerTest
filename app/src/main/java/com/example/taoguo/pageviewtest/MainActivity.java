package com.example.taoguo.pageviewtest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPage;
    FragmentPagerAdapter myFragmentPagerAdapter;
    List<Fragment> mArrayList = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPage = (ViewPager) findViewById(R.id.view_page);

        BlankFragment1 blankFragment1 = new BlankFragment1();
        BlankFragment2 blankFragment2 = new BlankFragment2();
        BlankFragment3 blankFragment3 = new BlankFragment3();

        mArrayList.add(blankFragment1);
        mArrayList.add(blankFragment2);
        mArrayList.add(blankFragment3);

        myFragmentPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                //return null;
                try {
                    return (Fragment) mArrayList.get(position);
                }catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }

            @Override
            public int getCount() {
                return  mArrayList.size();
               // return 0;
            }
        };

        mViewPage.setAdapter(myFragmentPagerAdapter);
        mViewPage.setCurrentItem(0);

    }
}
