package com.example.varun.fragrancequiz;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by varun on 17/8/15.
 */
public class ScreenSlidePageFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = (ViewGroup)inflater.inflate(R.layout.fragment_screen_slide_page,container,false);

        return rootView;
    }
}
