package com.shivamdev.beaconpoc.data;

import com.shivamdev.beaconpoc.data.remote.BeaconApi;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by shivam on 29/5/17.
 */
@Singleton
public class DataManager {

    private final BeaconApi beaconApi;

    @Inject
    public DataManager(BeaconApi beaconApi) {
        this.beaconApi = beaconApi;
    }


}