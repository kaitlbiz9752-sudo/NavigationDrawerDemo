package com.example.navigationdrawerdemo;  // <-- adapte si ton package est différent

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class BlankFragment extends Fragment {

    public BlankFragment() {
        // Constructeur vide obligatoire
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // On “gonfle” le layout fragment_blank.xml
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }
}
