package com.mirmahfuz.travelguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;



public class TwoFragment extends Fragment{
    private LinearLayoutManager lLayout;
    public TwoFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }


    private List<ItemObject> getAllItemList(){

        List<ItemObject> allItems = new ArrayList<ItemObject>();
        allItems.add(new ItemObject("কক্সবাজার","কক্সবাজারে রয়েছে বিশ্বের দীর্ঘতম অবিচ্ছিন্ন প্রাকৃতিক বালুময় সমুদ্র সৈকত যা কক্সবাজার শহর থেকে বদরমোকাম পর্যন্ত একটানা ১২০ কি.মি. বিস্তৃত। কক্সবাজা্র বাংলাদেশের সবচেয়ে বড় পর্যটন কেন্দ্র। " ,"আরো জানুন  ", R.drawable.coxsbazar));
        allItems.add(new ItemObject("জাফলং ", "এক নৈস্বর্গিক সৌন্দর্য্যে ভরপুর বাংলাদেশের জাফলং স্থানটি । জাফলং, সিলেট শহর থেকে ৬২ কিলোমিটার উত্তর-পূর্ব দিকে, ভারতের মেঘালয় সীমান্ত ঘেঁষে খাসিয়া-জৈন্তা পাহাড়ের পাদদেশে অবস্থিত ।","আরো জানুন", R.drawable.jaflong_main));
        allItems.add(new ItemObject("  বঙ্গবন্ধু সাফারি পার্ক  ", "গাজীপুর জেলার শ্রীপুর উপজেলায় মাওনা ইউনিনে গাজীপুর সাফারি পার্ক বা বঙ্গবন্ধু সাফারি পার্কটি অবস্থিত। ভাওয়াল গড়ের ছোট ছোট টিলা ও নিচু ভূমি সমৃদ্ধ বিশাল শালবনে তৈরি করা হয়েছে এই সাফারি পার্ক ","আরো জানুন", R.drawable.safari_park));
        allItems.add(new ItemObject("নুহাশ পল্লী, গাজীপুর", "প্রয়াত কথাসাহিত্যিক হুমায়ূন আহমেদ ঢাকার অদূরে গাজীপুরে প্রতিষ্ঠা করেছেন প্রাকৃতিক নৈসর্গ নুহাশ পল্লী। পারিবারিক বিনোদন কেন্দ্র ও শুটিংস্পট হিসেবে এটি বেশ পরিচিত। গাজীপুর চৌরাস্তা থেকে ১২ কিলোমিটার দূরে হোতাপাড়া বাজার। সেখান থেকে ৮ কিলোমিটার দূরে পিরুজালী গ্রামে অবস্থিত নুহাশপল্লী। ১৯৯৭ সালে হুমায়ূন আহমেদ নুহাশ পল্লী গড়ে তোলেন। মনোরম প্রাকৃতিক পরিবেশে ৪০ বিঘার এ বাগান বাড়িতে ফল, কাঠ ও ভেষজ গুণাবলীর কয়েকশ` প্রজাতির গাছ রয়েছে। ","আরো জানুন", R.drawable.nuhash));
        allItems.add(new ItemObject("সাজেক ভ্যালি ", "রাঙামাটির অনেকটা অংশই দেখে যায় সাজেক ভ্যালি থেকে। বাঘাইছড়ি উপজেলা থেকে ৩০ কিলোমিটারের দুরের সাজেকের পুরোটাই পাহাড়ে মোড়ানো পথ। প্রকৃতির অপার সৌন্দর্য্যের আঁধার আমাদের মাতৃভূমি রূপসী বাংলা । ","আরো জানুন", R.drawable.sajek));
        allItems.add(new ItemObject("ময়নামতি জাদুঘর", "শালবন বিহারের পাশেই ময়নামতি জাদুঘর । শ্রীভবদের মহাবিহার, কোটিলা মুড়া, চারপত্র মুড়া, রূপবানমুড়া, ইটাখোলা মুড়া, আনন্দ বিহার, রানীর বাংলা, ও ভোজ রাজার বাড়ি বিহার খননকালে অনেক মুল্যবান পুরাসামগ্রী খুঁজে পাওয়া যায়। ","আরো জানুন", R.drawable.mainamati_measume));




        return allItems;
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        List<ItemObject> rowListItem = getAllItemList();
        lLayout = new LinearLayoutManager(getContext());

        View rootView = inflater.inflate(R.layout.fragment_two, container, false);
        RecyclerView rView = (RecyclerView)rootView.findViewById(R.id.recycler_view);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(getContext(), rowListItem);
        rView.setAdapter(rcAdapter);
        rView.setLayoutManager(new LinearLayoutManager(getContext()));
        return rootView;
        // Inflate the layout for this fragment







    }


}