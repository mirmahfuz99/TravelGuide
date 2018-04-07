package com.mirmahfuz.travelguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolders> {

    private List<ItemObject> itemList;
    public Context context;

    public RecyclerViewAdapter(Context context, List<ItemObject> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_list, null);
        RecyclerViewHolders rcv = new RecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders holder,  final int position) {
         {

            holder.learnMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (position) {
                        case 0:
                            Intent intent0 = new Intent(v.getContext(), Cox_bazar.class);
                            v.getContext().startActivity(intent0);;
                            break;

                        case 1:
                            Intent intent1=new Intent(v.getContext(),Jaflong.class);
                            v.getContext().startActivity(intent1);
                            break;
                        case 2:
                            Intent intent2=new Intent(v.getContext(),Safaripark.class);
                            v.getContext().startActivity(intent2);
                            break;

                        case 3:
                            Intent intent3=new Intent(v.getContext(),Nuhas_polli.class);
                            v.getContext().startActivity(intent3);
                            break;

                        case 4:
                            Intent intent4=new Intent(v.getContext(),Sagek_vely.class);
                            v.getContext().startActivity(intent4);
                            break;


                        case 5:
                            Intent intent5=new Intent(v.getContext(),Moynamoti.class);
                            v.getContext().startActivity(intent5);
                            break;
                        case 6:
                            Intent intent6=new Intent(v.getContext(),Kutubdia.class);
                            v.getContext().startActivity(intent6);
                            break;

                        case 7:
                            Intent intent7=new Intent(v.getContext(),Saint_martin.class);
                            v.getContext().startActivity(intent7);
                            break;

                        case 8:
                            Intent intent8=new Intent(v.getContext(),Nijum_dip.class);
                            v.getContext().startActivity(intent8);
                            break;

                        case 9:
                            Intent intent9=new Intent(v.getContext(),Sonadia.class);
                            v.getContext().startActivity(intent9);
                            break;

                        case 10:
                            Intent intent10=new Intent(v.getContext(),Kuakata.class);
                            v.getContext().startActivity(intent10);
                            break;

                        case 11:
                            Intent intent11=new Intent(v.getContext(),Ahsan_monjil.class);
                            v.getContext().startActivity(intent11);
                            break;

                        case 12:
                            Intent intent12=new Intent(v.getContext(),Lalbag_kella.class);
                            v.getContext().startActivity(intent12);
                            break;

                        case 13:
                            Intent intent13=new Intent(v.getContext(),Lalkhal.class);
                            v.getContext().startActivity(intent13);
                            break;

                        case 14:
                            Intent intent14=new Intent(v.getContext(),Simulful.class);
                            v.getContext().startActivity(intent14);
                            break;

                        case 15:
                            Intent intent15=new Intent(v.getContext(),Baga_mosque.class);
                            v.getContext().startActivity(intent15);
                            break;

                        case 16:
                            Intent intent16=new Intent(v.getContext(),Satgombuj_mosque.class);
                            v.getContext().startActivity(intent16);
                            break;

                        case 17:
                            Intent intent17=new Intent(v.getContext(),Golapgram.class);
                            v.getContext().startActivity(intent17);
                            break;



                        case 18:
                            Intent intent18=new Intent(v.getContext(),Malinichora.class);
                            v.getContext().startActivity(intent18);
                            break;

                        case 19:
                            Intent intent19=new Intent(v.getContext(),Chimbuk.class);
                            v.getContext().startActivity(intent19);
                            break;



                    }

                }
            });


             holder.countryPhoto.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     switch (position) {
                         case 0:
                             Intent intent0 = new Intent(v.getContext(), Cox_bazar.class);
                             v.getContext().startActivity(intent0);;
                             break;

                         case 1:
                             Intent intent1=new Intent(v.getContext(),Jaflong.class);
                             v.getContext().startActivity(intent1);
                             break;
                         case 2:
                             Intent intent2=new Intent(v.getContext(),Safaripark.class);
                             v.getContext().startActivity(intent2);
                             break;

                         case 3:
                             Intent intent3=new Intent(v.getContext(),Nuhas_polli.class);
                             v.getContext().startActivity(intent3);
                             break;

                         case 4:
                             Intent intent4=new Intent(v.getContext(),Sagek_vely.class);
                             v.getContext().startActivity(intent4);
                             break;


                         case 5:
                             Intent intent5=new Intent(v.getContext(),Moynamoti.class);
                             v.getContext().startActivity(intent5);
                             break;
                         case 6:
                             Intent intent6=new Intent(v.getContext(),Kutubdia.class);
                             v.getContext().startActivity(intent6);
                             break;

                         case 7:
                             Intent intent7=new Intent(v.getContext(),Saint_martin.class);
                             v.getContext().startActivity(intent7);
                             break;

                         case 8:
                             Intent intent8=new Intent(v.getContext(),Nijum_dip.class);
                             v.getContext().startActivity(intent8);
                             break;

                         case 9:
                             Intent intent9=new Intent(v.getContext(),Sonadia.class);
                             v.getContext().startActivity(intent9);
                             break;

                         case 10:
                             Intent intent10=new Intent(v.getContext(),Kuakata.class);
                             v.getContext().startActivity(intent10);
                             break;

                         case 11:
                             Intent intent11=new Intent(v.getContext(),Ahsan_monjil.class);
                             v.getContext().startActivity(intent11);
                             break;

                         case 12:
                             Intent intent12=new Intent(v.getContext(),Lalbag_kella.class);
                             v.getContext().startActivity(intent12);
                             break;

                         case 13:
                             Intent intent13=new Intent(v.getContext(),Lalkhal.class);
                             v.getContext().startActivity(intent13);
                             break;

                         case 14:
                             Intent intent14=new Intent(v.getContext(),Simulful.class);
                             v.getContext().startActivity(intent14);
                             break;

                         case 15:
                             Intent intent15=new Intent(v.getContext(),Baga_mosque.class);
                             v.getContext().startActivity(intent15);
                             break;

                         case 16:
                             Intent intent16=new Intent(v.getContext(),Satgombuj_mosque.class);
                             v.getContext().startActivity(intent16);
                             break;

                         case 17:
                             Intent intent17=new Intent(v.getContext(),Golapgram.class);
                             v.getContext().startActivity(intent17);
                             break;



                         case 18:
                             Intent intent18=new Intent(v.getContext(),Malinichora.class);
                             v.getContext().startActivity(intent18);
                             break;

                         case 19:
                             Intent intent19=new Intent(v.getContext(),Chimbuk.class);
                             v.getContext().startActivity(intent19);
                             break;




                     }

                 }
             });

        }
        holder.learnMore.setText(itemList.get(position).getLearn());
        holder.soptDes.setText(itemList.get(position).getDescription());
        holder.countryName.setText(itemList.get(position).getName());
        holder.countryPhoto.setImageResource(itemList.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}