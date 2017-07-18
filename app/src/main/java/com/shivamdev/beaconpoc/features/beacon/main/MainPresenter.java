package com.shivamdev.beaconpoc.features.beacon.main;

import com.shivamdev.beaconpoc.features.base.BasePresenter;
import com.shivamdev.beaconpoc.injection.ConfigPersistent;

import javax.inject.Inject;

@ConfigPersistent
public class MainPresenter extends BasePresenter<MainScreen> {

    @Inject
    public MainPresenter() {
    }

}
