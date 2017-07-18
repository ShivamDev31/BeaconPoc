package com.shivamdev.beaconpoc.injection.component;

import dagger.Subcomponent;
import com.shivamdev.beaconpoc.injection.PerFragment;
import com.shivamdev.beaconpoc.injection.module.FragmentModule;

/**
 * This component inject dependencies to all Fragments across the application
 */
@PerFragment
@Subcomponent(modules = FragmentModule.class)
public interface FragmentComponent {
}
