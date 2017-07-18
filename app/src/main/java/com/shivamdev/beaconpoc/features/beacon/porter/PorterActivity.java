package com.shivamdev.beaconpoc.features.beacon.porter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mikepenz.fastadapter.commons.adapters.FastItemAdapter;
import com.shivamdev.beaconpoc.Constants;
import com.shivamdev.beaconpoc.R;
import com.shivamdev.beaconpoc.data.model.PorterRequestData;
import com.shivamdev.beaconpoc.features.base.BaseActivity;
import com.shivamdev.beaconpoc.features.beacon.porter.item.PorterRequestsItem;
import com.shivamdev.beaconpoc.injection.component.ActivityComponent;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;

public class PorterActivity extends BaseActivity implements PorterScreen {

    @Inject
    public PorterPresenter presenter;

    private FastItemAdapter<PorterRequestsItem> fastItemAdapter;

    @BindView(R.id.rv_requests)
    RecyclerView rvRequests;

    public static void start(Context context, String id) {
        Intent starter = new Intent(context, PorterActivity.class);
        starter.putExtra(Constants.ID, id);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupRecyclerView();
    }

    private void setupRecyclerView() {
        fastItemAdapter = new FastItemAdapter<>();
        rvRequests.setLayoutManager(new LinearLayoutManager(this));
        rvRequests.setAdapter(fastItemAdapter);
    }

    @Override
    public int getLayout() {
        return R.layout.activity_porter;
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

    public void showPorterRequests(List<PorterRequestData> porterRequests) {
        porterRequests.forEach(PorterRequestsItem::new);
    }
}