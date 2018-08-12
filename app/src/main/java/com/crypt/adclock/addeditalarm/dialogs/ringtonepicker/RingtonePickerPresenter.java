package com.crypt.adclock.addeditalarm.dialogs.ringtonepicker;

import android.net.Uri;
import android.support.v4.app.FragmentManager;

public class RingtonePickerPresenter implements RingtoneDialogContract.Presenter {

    private RingtonePickerDialog.OnRingtoneSelectedListener mListener;
    private RingtoneDialogContract.View mView;
    private FragmentManager mFragmentManager;

    public RingtonePickerPresenter(FragmentManager fragmentManager,
                                   RingtonePickerDialog.OnRingtoneSelectedListener l) {
        mFragmentManager = fragmentManager;
        mListener = l;
    }

    @Override
    public void show(Uri initialUri, String tag) {
        RingtonePickerDialog dialog = RingtonePickerDialog.newInstance(mListener, initialUri);
        dialog.show(mFragmentManager, tag);
    }

    @Override
    public void takeView(RingtoneDialogContract.View view) {
        mView = view;
    }

    @Override
    public void dropView() {
        mView = null;
    }
}
