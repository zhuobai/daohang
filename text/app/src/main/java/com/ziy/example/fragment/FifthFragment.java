package com.ziy.example.fragment;

import android.os.Bundle;
import android.support.v4.app.*;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.del.text.R;

/**
 * Created by del on 2017/10/8.
 */

public class FifthFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v=inflater.inflate(R.layout.layout_fifth,container,false);
        return v;
    }
}
