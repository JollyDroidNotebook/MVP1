package ru.jollydroid.mvp1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.hannesdorfmann.mosby.mvp.MvpActivity;

public class MainActivity extends MvpActivity<MainView, MainPresenter> implements MainView {

    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getPresenter().buttonPressed();
            }
        });
    }

    @NonNull
    @Override
    public MainPresenter createPresenter() {
        return new MainPresenterImpl(getApplicationContext());
    }

    @Override
    public void showCounter(int counter) {
        Snackbar
                .make(
                        fab,
                        "You clicked " + counter + " times",
                        Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .show();

    }
}
