package com.example.navigationdrawerdemo;  // adapte si besoin

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class BlankFragment2 extends Fragment {

    public BlankFragment2() {
        // Constructeur vide obligatoire
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // On “gonfle” le layout fragment_blank2.xml
        return inflater.inflate(R.layout.fragment_blank2, container, false);
    }
}
