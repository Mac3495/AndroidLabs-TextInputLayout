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

    View revela;
    Button boton;

    TextInputLayout til_usuario, til_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        til_usuario = (TextInputLayout) findViewById(R.id.til_usuario);
        til_password = (TextInputLayout) findViewById(R.id.til_password);

        revela = (View) findViewById(R.id.reveal);
        boton = (Button) findViewById(R.id.boton_intro);

        //getWindow().setExitTransition(new Explode());

    }

    void ingresar(View view){

        String usuario = til_usuario.getEditText().getText().toString();
        String password = til_password.getEditText().getText().toString();

        if(TextUtils.isEmpty(usuario)){
            til_usuario.setError("Ingrese el nombre de usuario");
            return;
        }else if (TextUtils.isEmpty(password)){
            til_password.setError("Ingrese una contraseña");
            return;
        }else{

            til_usuario.setError(null);
            til_password.setError(null);

            revealView();
            //startActivity(new Intent(getApplicationContext(),CourseActivity.class));

            Intent intent = new Intent(getApplicationContext(), CourseActivity.class);
            startActivity(intent, ActivityOptionsCompat.makeSceneTransitionAnimation(this).toBundle());
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        revela.setVisibility(View.INVISIBLE);
        boton.setVisibility(View.VISIBLE);
    }

    public void revealView(){

        int cx = (revela.getLeft() + revela.getRight()) / 2;
        int cy = (revela.getTop() + revela.getBottom()) / 2;

        int finalRadius = Math.max(revela.getWidth(), revela.getHeight());

        Animator anim =
                ViewAnimationUtils.createCircularReveal(revela, cx, cy, 0, finalRadius);

        anim.setDuration(500);

        revela.setVisibility(View.VISIBLE);
        boton.setVisibility(View.INVISIBLE);

        anim.start();
    }

}
