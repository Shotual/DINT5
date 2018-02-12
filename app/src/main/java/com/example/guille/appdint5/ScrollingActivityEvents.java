package com.example.guille.appdint5;

/**
 * Created by guille on 12/2/18.
 */

import android.view.View;

        import android.support.design.widget.Snackbar;
        import android.view.View;

/**
 * Created by daniel.iglesia on 23/01/2018.
 */

public class ScrollingActivityEvents implements View.OnClickListener {
    ScrollingActivity scrollingActivity;
    boolean blFabsVisible=false;

    public ScrollingActivityEvents(ScrollingActivity scrollingActivity ){
        this.scrollingActivity=scrollingActivity;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.fab) {
            if(!blFabsVisible)scrollingActivity.showFabs();
            else scrollingActivity.hideFabs();

            blFabsVisible=!blFabsVisible;
        }

    }
}
