package com.iddamal.min.algopracticetracker;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DialogFragment extends android.support.v4.app.DialogFragment {
    private final String LOG_TAG = "DialogFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dialog, container);

        Log.d(LOG_TAG, "frag. created");

        return super.onCreateView(inflater, container, savedInstanceState);

    }
}

//                  A Minura Iddamalgoda production                 //
