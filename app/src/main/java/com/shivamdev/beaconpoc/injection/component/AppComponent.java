package com.shivamdev.beaconpoc.injection.component;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import com.shivamdev.beaconpoc.data.DataManager;
import com.shivamdev.beaconpoc.injection.ApplicationContext;
import com.shivamdev.beaconpoc.injection.module.AppModule;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    @ApplicationContext
    Context context();

    Application application();

    DataManager apiManager();
}
