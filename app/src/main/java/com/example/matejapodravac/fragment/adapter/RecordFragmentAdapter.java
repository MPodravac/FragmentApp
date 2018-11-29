package com.example.matejapodravac.fragment.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.matejapodravac.fragment.fragments.PersonalInfoFragment;
import com.example.matejapodravac.fragment.fragments.StudentInfoFragment;
import com.example.matejapodravac.fragment.fragments.SummaryFragment;

import java.util.List;

/**
 * Lista treba sadržavati brojeve od 1 do 3
 * 1 je PersonalInfoFragment
 * 2 je StudentInfoFragment
 * 3 je SummaryFragment
*/
public class RecordFragmentAdapter extends FragmentPagerAdapter {
    List<Integer> dataList;
    public RecordFragmentAdapter(FragmentManager fm, List<Integer>dataList) {
        super(fm);
        this.dataList = dataList;
    }

    @Override
    public Fragment getItem(int position) {
        int dataType = dataList.get(position);

        if(dataType == 1)
        {
            return PersonalInfoFragment.newInstance();
        }
        else if(dataType == 2)
        {
            return StudentInfoFragment.newInstance();
        }
        else
        {
            return SummaryFragment.newInstance();
        }
    }

    @Override
    public int getCount() {
        return dataList.size();
    }
}
