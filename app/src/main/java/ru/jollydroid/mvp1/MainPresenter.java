package ru.jollydroid.mvp1;

import com.hannesdorfmann.mosby.mvp.MvpPresenter;

/**
 * Created by tse on 12/08/16.
 */
public interface MainPresenter extends MvpPresenter<MainView> {
    void buttonPressed();
}
