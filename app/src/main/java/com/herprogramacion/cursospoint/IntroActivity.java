package com.herprogramacion.cursospoint;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.database.DatabaseUtils;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.database.DatabaseUtilsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.Explode;
import android.transition.Transition;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.Button;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

    }

    void ingresar(View view){
        startActivity(new Intent(getApplicationContext(),CourseActivity.class));
    }

   /* @Override
    protected void onResume() {
        super.onResume();
    }*/
}
