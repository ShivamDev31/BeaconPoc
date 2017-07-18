package com.shivamdev.beaconpoc.features.beacon.main;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;

import com.shivamdev.beaconpoc.R;
import com.shivamdev.beaconpoc.features.base.BaseActivity;
import com.shivamdev.beaconpoc.features.beacon.nurse.NurseActivity;
import com.shivamdev.beaconpoc.features.beacon.porter.PorterActivity;
import com.shivamdev.beaconpoc.injection.component.ActivityComponent;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity implements MainScreen {

    @Inject
    public MainPresenter presenter;

    @BindView(R.id.et_id)
    public EditText etId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public int getLayout() {
        return R.layout.activity_main;
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

    @OnClick(R.id.b_nurse)
    public void nurseClicked() {
        openNurseActivity();
    }

    @OnClick(R.id.b_porter)
    public void porterClicked() {
        openPorterActivity();
    }

    private void openNurseActivity() {
        String id = etId.getText().toString();
        if (TextUtils.isEmpty(id)) {
            Toast.makeText(this, R.string.error_empty_nurse_id, Toast.LENGTH_SHORT).show();
            return;
        }
        NurseActivity.start(this, etId.getText().toString());
    }

    private void openPorterActivity() {
        String id = etId.getText().toString();
        if (TextUtils.isEmpty(id)) {
            Toast.makeText(this, R.string.error_empty_nurse_id, Toast.LENGTH_SHORT).show();
            return;
        }
        PorterActivity.start(this, etId.getText().toString());
    }
}