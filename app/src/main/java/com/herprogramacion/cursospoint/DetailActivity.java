package com.herprogramacion.cursospoint;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.TaskStackBuilder;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    private static final String EXTRA_POSITION = "com.herprogramacion.cursospoint.extra.POSITION";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        setToolbar(); // Reemplazar la action bar

        // Se obtiene la posición del item seleccionado
        int position = getIntent().getIntExtra(EXTRA_POSITION, -1);

        // Carga los datos en la vista
        setupViews(position);

        Window window = getWindow();


    }

    private void setupViews(int position) {
        TextView name = (TextView) findViewById(R.id.detail_name);
        TextView description = (TextView) findViewById(R.id.detail_description);
        TextView author = (TextView) findViewById(R.id.detail_author);
        RatingBar rating = (RatingBar) findViewById(R.id.detail_rating);
        ImageView image = (ImageView) findViewById(R.id.detail_image);

        // Obtiene el curso ha detallar basado en la posición
        Course detailCourse = Courses.getCourseByPosition(position);

        name.setText(detailCourse.getName());
        description.setText(detailCourse.getDescription());
        author.setText(detailCourse.getAuthor());
        rating.setRating(detailCourse.getRating());

        switch (position){
            case 0:
                image.setImageResource(R.drawable.img1);
                setTitle(detailCourse.getName());
                break;
            case 1:
                image.setImageResource(R.drawable.img2);
                setTitle(detailCourse.getName());
                break;
            case 2:
                image.setImageResource(R.drawable.img3);
                setTitle(detailCourse.getName());
                break;
            case 3:
                image.setImageResource(R.drawable.img4);
                setTitle(detailCourse.getName());
                break;
            case 4:
                image.setImageResource(R.drawable.img5);
                setTitle(detailCourse.getName());
                break;
            case 5:
                image.setImageResource(R.drawable.img6);
                setTitle(detailCourse.getName());
                break;
        }
    }

    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null)// Habilitar Up Button
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public static void launch(Activity context, int position, View sharedView) {
        Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra(EXTRA_POSITION, position);

        context.startActivity(intent);


    }
}