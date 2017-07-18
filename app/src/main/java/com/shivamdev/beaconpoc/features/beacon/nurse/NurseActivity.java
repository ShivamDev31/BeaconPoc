package com.shivamdev.beaconpoc.features.beacon.nurse;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.shivamdev.beaconpoc.Constants;
import com.shivamdev.beaconpoc.R;
import com.shivamdev.beaconpoc.features.base.BaseActivity;
import com.shivamdev.beaconpoc.features.beacon.listing.PlacesListingActivity;
import com.shivamdev.beaconpoc.injection.component.ActivityComponent;

import javax.inject.Inject;

import butterknife.OnClick;

public class NurseActivity extends BaseActivity implements NurseScreen {

    @Inject
    public NursePresenter presenter;

    public static void start(Context context, String id) {
        Intent starter = new Intent(context, NurseActivity.class);
        starter.putExtra(Constants.ID, id);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public int getLayout() {
        return R.layout.activity_nurse;
    }

    @Override
    protected void inject(ActivityComponent activityComponent) {
        activityComponent.inject(this);
    }

    @Override
    protected void attachView() {
        presenter.attachView(this);
    }

    @Override
    protected void detachPresenter() {
        presenter.detachView();
    }

    @OnClick(R.id.b_book_porter)
    public void bookPorterClicked() {
        startListingActivity();
    }

    private void startListingActivity() {
        PlacesListingActivity.start(this);
    }
}