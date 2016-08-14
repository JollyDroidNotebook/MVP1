package ru.jollydroid.mvp1;

import com.hannesdorfmann.mosby.mvp.MvpView;

/**
 * Created by tse on 12/08/16.
 */
public interface MainView  extends MvpView {
    void showCounter(int counter);
}
