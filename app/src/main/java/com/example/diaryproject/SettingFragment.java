package com.example.diaryproject;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SettingFragment extends Fragment {

    public SettingFragment(){}

    private static class SettingFragmentHoler {
        public static final SettingFragment INSTANCE = new SettingFragment();
    }

    public static SettingFragment newInstance() {
        return SettingFragmentHoler.INSTANCE;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_setting, container, false);
    }
}