package com.rizalprasetia10120183.uasakbif5_10120183;

//NIM     :   10120183
//NAMA    :   RIZAL PRASETIA SUPRIADI
//KELAS   :   IF-5

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;
import com.rizalprasetia10120183.uasakbif5_10120183.adapter.SectionPagerAdapter;

public class InfoFragment extends Fragment {


    View myFragments;

    ViewPager viewPager;
    TabLayout tabLayout;


    public InfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myFragments = inflater.inflate(R.layout.fragment_info, container, false);

        viewPager = myFragments.findViewById(R.id.viewPager);
        tabLayout = myFragments.findViewById(R.id.tabLayout);

        return myFragments;
    }

//    onActivity create method


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void setUpViewPager(ViewPager viewPager) {
        SectionPagerAdapter adapter = new SectionPagerAdapter(getChildFragmentManager());

        adapter.addFragment(new Info1Fragment(), "About");
        adapter.addFragment(new Info2Fragment(), "Version");

        viewPager.setAdapter(adapter);
    }
}