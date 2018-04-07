package com.mirmahfuz.travelguide;

import android.support.v7.widget.RecyclerView;
import android.test.suitebuilder.TestMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class RecyclerViewHolders extends RecyclerView.ViewHolder {


    public TextView soptDes;
    public TextView countryName;
    public ImageView countryPhoto;
    public TextView learnMore;

    public RecyclerViewHolders(View itemView) {
        super(itemView);

        this.soptDes = (TextView)itemView.findViewById(R.id.spot_des);
        this.countryName = (TextView)itemView.findViewById(R.id.country_name);
        this.countryPhoto = (ImageView)itemView.findViewById(R.id.country_photo);
        this.learnMore  = (TextView)itemView.findViewById(R.id.learn_more);
    }


    }
