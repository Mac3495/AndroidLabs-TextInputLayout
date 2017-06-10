package com.herprogramacion.cursospoint;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.transition.Explode;
import android.view.Menu;
import android.view.MenuItem;

public class CourseActivity extends AppCompatActivity {
    public RecyclerView recyclerView;
    public LinearLayoutManager linearLayout;

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        setToolbar(); // Reemplazar toolbar

        setupRecyclerView(); // Preparar recycler view

    }

    private void setupRecyclerView() {
        linearLayout = new LinearLayoutManager(this);
        recyclerView = (RecyclerView) findViewById(R.id.reciclador);
        recyclerView.setLayoutManager(linearLayout);
        CourseAdapter adapter = new CourseAdapter(this, Courses.getCourses());
        recyclerView.setAdapter(adapter);
    }

    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

}
