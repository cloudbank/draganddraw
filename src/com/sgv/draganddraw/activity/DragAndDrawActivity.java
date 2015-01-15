
package com.sgv.draganddraw.activity;

import android.support.v4.app.Fragment;

import com.sgv.draganddraw.fragment.DragAndDrawFragment;

public class DragAndDrawActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new DragAndDrawFragment();
    }
}
