package com.shivamdev.beaconpoc.features.beacon.porter.item;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.mikepenz.fastadapter.items.AbstractItem;
import com.shivamdev.beaconpoc.R;
import com.shivamdev.beaconpoc.data.model.PorterRequestData;

import java.util.List;

import butterknife.ButterKnife;

/**
 * Created by shivam on 18/7/17.
 */
public class PorterRequestsItem extends AbstractItem<PorterRequestsItem, PorterRequestsItem.PorterRequestsHolder> {

    private final PorterRequestData data;

    public PorterRequestsItem(final PorterRequestData data) {
        this.data = data;
    }

    @Override
    public int getType() {
        return R.id.porter_request_id;
    }

    @Override
    public int getLayoutRes() {
        return R.layout.item_listing;
    }

    public PorterRequestData getPorterRequestData() {
        return data;
    }

    @Override
    public void bindView(PorterRequestsHolder holder, List<Object> payloads) {
        super.bindView(holder, payloads);
        holder.bind(data);
    }

    @Override
    public PorterRequestsHolder getViewHolder(View view) {
        return new PorterRequestsHolder(view);
    }

    public static class PorterRequestsHolder extends RecyclerView.ViewHolder {

        public PorterRequestsHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        void bind(final PorterRequestData data) {

        }
    }
}