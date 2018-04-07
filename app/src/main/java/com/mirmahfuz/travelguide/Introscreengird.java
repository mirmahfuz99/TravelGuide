package com.mirmahfuz.travelguide;
  import android.content.ActivityNotFoundException;
  import android.content.Intent;
  import android.net.Uri;
  import android.os.Bundle;
    import android.support.v7.app.AppCompatActivity;
    import android.view.View;
    import android.widget.AdapterView;
    import android.widget.GridView;
    import android.widget.Toast;

public class Introscreengird extends AppCompatActivity {

        GridView androidGridView;

        String[] gridViewString = {
                "দর্শনীয় স্থানগুলো", " শেয়ার এপ্স ", " রেটিং এপ্স ",

        } ;
        int[] gridViewImageId = {
                R.drawable.spot, R.drawable.share, R.drawable.ratingus,
        };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_introscreengird);

            CustomGridViewActivity adapterViewAndroid = new CustomGridViewActivity(Introscreengird.this, gridViewString, gridViewImageId);
            androidGridView=(GridView)findViewById(R.id.grid_view_image_text);
            androidGridView.setAdapter(adapterViewAndroid);
            androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                    switch (position) {
                        case 0:

                            Intent i = new Intent(getApplicationContext(), MainActivity.class);
                            i.putExtra("id", position);
                            startActivity(i);
                            break;


                        case 1:

                            try {
                                Intent j = new Intent(Intent.ACTION_SEND);
                                j.setType("text/plain");
                                j.putExtra(Intent.EXTRA_SUBJECT, "My application name");
                                String sAux = "\nLet me recommend you this application\n\n";
                                sAux = sAux + "https://play.google.com/store/apps/details?id=com.mirmahfuz.travelguide \n\n";
                                j.putExtra(Intent.EXTRA_TEXT, sAux);
                                startActivity(Intent.createChooser(j, "choose one"));
                            } catch (Exception e) {
                                //e.toString();
                            }
                            break;



                        case 2:


                        Uri uri = Uri.parse("market://details?id=" + getPackageName());
                        Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                        // To count with Play market backstack, After pressing back button,
                        // to taken back to our application, we need to add following flags to intent.
                        goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                                Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                                Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                        try {
                            startActivity(goToMarket);
                        } catch (ActivityNotFoundException e) {
                            startActivity(new Intent(Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName())));
                        };
                        break;


                        default:
                            break;
                    }



                }
            });

        }
    }