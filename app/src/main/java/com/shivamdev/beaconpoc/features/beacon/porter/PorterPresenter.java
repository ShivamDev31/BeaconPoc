package com.shivamdev.beaconpoc.features.beacon.porter;

import com.shivamdev.beaconpoc.data.DataManager;
import com.shivamdev.beaconpoc.features.base.BasePresenter;
import com.shivamdev.beaconpoc.injection.ConfigPersistent;

import javax.inject.Inject;

@ConfigPersistent
public class PorterPresenter extends BasePresenter<PorterScreen> {

    private final DataManager dataManager;

    @Inject
    public PorterPresenter(final DataManager dataManager) {
        this.dataManager = dataManager;
    }



}