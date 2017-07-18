package com.shivamdev.beaconpoc.features.beacon.listing.item;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.mikepenz.fastadapter.items.AbstractItem;
import com.shivamdev.beaconpoc.R;
import com.shivamdev.beaconpoc.data.model.BeaconData;

import java.util.List;

import butterknife.ButterKnife;

/**
 * Created by shivam on 18/7/17.
 */
public class PlacesItem extends AbstractItem<PlacesItem, PlacesItem.ListingHolder> {

    private final BeaconData data;

    public PlacesItem(final BeaconData data) {
        this.data = data;
    }

    @Override
    public int getType() {
        return R.id.listing_id;
    }

    @Override
    public int getLayoutRes() {
        return R.layout.item_listing;
    }

    public BeaconData getListingData() {
        return data;
    }

    @Override
    public void bindView(ListingHolder holder, List<Object> payloads) {
        super.bindView(holder, payloads);
        holder.bind(data);
    }

    @Override
    public ListingHolder getViewHolder(View view) {
        return new ListingHolder(view);
    }

    public static class ListingHolder extends RecyclerView.ViewHolder {

        public ListingHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        void bind(final BeaconData data) {

        }
    }
}