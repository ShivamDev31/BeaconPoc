package com.shivamdev.beaconpoc.features.beacon.nurse;

import com.shivamdev.beaconpoc.features.base.BasePresenter;
import com.shivamdev.beaconpoc.injection.ConfigPersistent;

import javax.inject.Inject;

@ConfigPersistent
public class NursePresenter extends BasePresenter<NurseScreen> {

    @Inject
    public NursePresenter() {
    }

}
