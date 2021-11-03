package com.example.diaryproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CalenderFragment extends Fragment {

    public CalenderFragment() { }

    private static class CalenderFragmentHolder {
        public static final CalenderFragment INSTANCE = new CalenderFragment();
    }

    public static CalenderFragment newInstance() {
        return CalenderFragment.CalenderFragmentHolder.INSTANCE;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_calender, container, false);
    }
}