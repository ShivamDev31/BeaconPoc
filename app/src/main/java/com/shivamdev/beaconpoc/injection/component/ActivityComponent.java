package com.shivamdev.beaconpoc.injection.component;

import com.shivamdev.beaconpoc.features.beacon.listing.PlacesListingActivity;
import com.shivamdev.beaconpoc.features.beacon.main.MainActivity;
import com.shivamdev.beaconpoc.features.beacon.nurse.NurseActivity;
import com.shivamdev.beaconpoc.features.beacon.porter.PorterActivity;
import com.shivamdev.beaconpoc.injection.PerActivity;
import com.shivamdev.beaconpoc.injection.module.ActivityModule;

import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

    void inject(NurseActivity nurseActivity);

    void inject(PorterActivity porterActivity);

    void inject(PlacesListingActivity placesListingActivity);
}
