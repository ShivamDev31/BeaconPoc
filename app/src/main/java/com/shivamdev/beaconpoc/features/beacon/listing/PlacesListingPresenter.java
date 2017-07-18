package com.shivamdev.beaconpoc.features.beacon.listing;

import com.shivamdev.beaconpoc.data.DataManager;
import com.shivamdev.beaconpoc.features.base.BasePresenter;
import com.shivamdev.beaconpoc.injection.ConfigPersistent;

import javax.inject.Inject;

@ConfigPersistent
public class PlacesListingPresenter extends BasePresenter<PlacesListingScreen> {


    private final DataManager dataManager;

    @Inject
    public PlacesListingPresenter(final DataManager dataManager) {
        this.dataManager = dataManager;
    }



}