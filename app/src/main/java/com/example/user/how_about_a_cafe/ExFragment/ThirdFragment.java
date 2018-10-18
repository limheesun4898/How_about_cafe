package com.example.user.how_about_a_cafe.ExFragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.airbnb.lottie.LottieAnimationView;
import com.example.user.how_about_a_cafe.R;

public class ThirdFragment extends android.support.v4.app.Fragment {
    public static LottieAnimationView third_lottie;

    public ThirdFragment () {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = (View) inflater.inflate(R.layout.activity_third_fragment, container, false);
        third_lottie = view.findViewById(R.id.third_lottie);
        third_lottie.playAnimation();
        third_lottie.loop(true);

        return view;
    }
}
