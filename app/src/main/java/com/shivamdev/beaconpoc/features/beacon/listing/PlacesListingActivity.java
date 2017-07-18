package com.shivamdev.beaconpoc.features.beacon.listing;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mikepenz.fastadapter.commons.adapters.FastItemAdapter;
import com.shivamdev.beaconpoc.R;
import com.shivamdev.beaconpoc.data.model.BeaconData;
import com.shivamdev.beaconpoc.features.base.BaseActivity;
import com.shivamdev.beaconpoc.features.beacon.listing.item.PlacesItem;
import com.shivamdev.beaconpoc.injection.component.ActivityComponent;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;

public class PlacesListingActivity extends BaseActivity implements PlacesListingScreen {
    @Inject
    public PlacesListingPresenter presenter;

    @BindView(R.id.rv_places)
    RecyclerView rvPlaces;

    private FastItemAdapter<PlacesItem> fastItemAdapter;

    public static void start(Context context) {
        Intent starter = new Intent(context, PlacesListingActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupRecyclerView();
    }

    private void setupRecyclerView() {
        fastItemAdapter = new FastItemAdapter<>();
        rvPlaces.setLayoutManager(new LinearLayoutManager(this));
        rvPlaces.setAdapter(fastItemAdapter);
    }

    @Override
    public int getLayout() {
        return R.layout.activity_places_listing;
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

    public void showBeaconPlaces(List<BeaconData> beaconDataList) {
        for (BeaconData beaconData : beaconDataList) {
            new PlacesItem(beaconData);
        }
    }
}