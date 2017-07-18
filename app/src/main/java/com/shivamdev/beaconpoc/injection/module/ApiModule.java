package com.shivamdev.beaconpoc.injection.module;

import com.shivamdev.beaconpoc.data.remote.BeaconApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by shivam on 29/5/17.
 */
@Module(includes = {NetworkModule.class})
public class ApiModule {

    @Provides
    @Singleton
    BeaconApi provideBeaconApi(Retrofit retrofit) {
        return retrofit.create(BeaconApi.class);
    }
}
