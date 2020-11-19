package com.example.ashwin.tabbedlayout;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

/**
 * Created by ashwin on 4/8/16.
 */
public class TabFragment3 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab_fragment_3, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.w(MainActivity.TAG, "TabFragment3 | onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.w(MainActivity.TAG, "TabFragment3 | onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.w(MainActivity.TAG, "TabFragment3 | onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.w(MainActivity.TAG, "TabFragment3 | onStop");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.w(MainActivity.TAG, "TabFragment3 | onDetach");
    }
}
