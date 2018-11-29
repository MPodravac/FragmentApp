package com.example.matejapodravac.fragment.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.matejapodravac.fragment.R;

public class PersonalInfoFragment extends Fragment {

    public static PersonalInfoFragment newInstance(){

        Bundle args = new Bundle();

        PersonalInfoFragment fragment = new PersonalInfoFragment();
        fragment.setArguments(args);
        return fragment;
    }
    EditText etName;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflatedView = inflater.inflate(R.layout.fragment_personal_info, container, false);
        etName = inflatedView.findViewById(R.id.etName);
        return inflatedView;
    }
}
