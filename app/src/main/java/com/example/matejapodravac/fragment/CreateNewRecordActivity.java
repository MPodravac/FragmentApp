package com.example.matejapodravac.fragment;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.matejapodravac.fragment.adapter.RecordFragmentAdapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreateNewRecordActivity extends AppCompatActivity {

    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_record);
        viewPager= findViewById(R.id.viewPager);

        List<Integer> fragmentDataLisT = new ArrayList<>();
        fragmentDataLisT.add(1);
        fragmentDataLisT.add(2);
        fragmentDataLisT.add(3);
        Collections.sort(fragmentDataLisT);
        RecordFragmentAdapter adapter = new RecordFragmentAdapter(getSupportFragmentManager(), fragmentDataLisT);
        viewPager.setAdapter(adapter);
    }
}
