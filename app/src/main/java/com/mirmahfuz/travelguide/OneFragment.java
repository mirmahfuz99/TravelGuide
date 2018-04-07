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



public class OneFragment extends Fragment{
        private LinearLayoutManager lLayout;
        public OneFragment() {
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
            allItems.add(new ItemObject("কুতুবদিয়া দ্বীপ", "কক্সবাজার জেলার একটি দ্বীপ উপজেলা কুতুবদিয়া। প্রায় ২১৬ বর্গ কিলোমিটার আয়তনের ছোট্ট এই দ্বীপে আছে নানান বৈচিত্র্য। নির্জন বেলাভূমি, বাংলাদেশের সবচেয়ে বড় বায়ুবিদ্যুৎ কেন্দ্র, লবণ চাষ, বাতিঘর, কুতুব আউলিয়ার মাজারসহ আছে দেখার মতো অনেক কিছু।","আরো জানুন", R.drawable.kutubdia));
            allItems.add(new ItemObject("সেন্ট মার্টিন", "সেন্ট মার্টিন্\u200Cস দ্বীপ বাংলাদেশের সর্ব দক্ষিণে বঙ্গোপসাগরের উত্তর-পূর্বাংশে অবস্থিত একটি প্রবালদ্বীপ। এটি কক্সবাজার জেলার টেকনাফ হতে প্রায় ৯ কিলোমিটার দক্ষিণে এবং মায়ানমার-এর উপকূল হতে ৮ কিলোমিটার পশ্চিমে নাফ নদীর মোহনায় অবস্থিত। ","আরো জানুন", R.drawable.saint));
            allItems.add(new ItemObject("নিঝুম দ্বীপ",  " বাংলাদেশ বিশ্বের অন্যতম ঘনবসতিপূর্ণ দেশ। প্রতি বর্গকিলোমিটারে এখানে গড়ে প্রায় এক হাজার ২০০ মানুষ বসবাস করে। কিন্তু অদ্ভুতভাবে এরপরও আমাদের দেশে এমন কিছু স্থান রয়েছে যেখানে মানুষের বসতি খুবই কম, প্রকৃতির সেখানে অবাধ বিস্তার। ","আরো জানুন",R.drawable.nijhum));
            allItems.add(new ItemObject("সোনাদিয়া দ্বীপ", "মহেশখালী উপজেলার অর্ন্তগত হোয়ানক ইউনিয়নে অবস্থিত সোনাদিয়া দ্বীপটির আয়তন ৯ বর্গকিলোমিটার। ম্যানগ্রোভ ও উপকূলীয় বনের সমন্বয়ে গঠিত এই দ্বীপটি। সাগরের গাঢ় নীল জল, লাল কাঁকড়া, কেয়া বন, সামুদ্রিক পাখি সবমিলিয়ে এক ধরনের রোমাঞ্চিত পরিবেশ সবসময় এই দ্বীপে বিরাজ করে।","আরো জানুন" ,R.drawable.sonadia_one));
            allItems.add(new ItemObject("সাগরকন্যা কুয়াকাটা", "অপরূপ সৌন্দর্যের লীলাভূমি সাগর কন্যা কুয়াকটা যা পটুয়াখালী জেলায় অবস্থিত। কুয়াকাটা দক্ষিণ এশিয়ায় একটি মাত্র সমুদ্র সৈকত যেখানে দাঁড়িয়ে সূর্যোদয় ও সূর্যাস্ত অবলোকন করা যায়। ","আরো জানুন", R.drawable.kuyakata));
            allItems.add(new ItemObject("আহসান মঞ্জিল",  "ইসলামপুরের কুমারটুলী নামে পরিচিত পুরনো ঢাকার বুড়িগঙ্গা নদীর তীরে বর্তমান ইসলামপুরে আহসান মঞ্জিল অবস্থিত। এটি ব্রিটিশ ভারতের উপাধিপ্রাপ্ত ঢাকার নওয়াব পরিবারের বাসভবন ও সদর কাচারি ছিল। অনবদ্য অলঙ্করন সমৃদ্ধ সুরম্য এ ভবনটি ঢাকার অন্যতম শ্রেষ্ঠ স্থাপত্য নিদর্শন।","আরো জানুন",R.drawable.ahsan_monjil));
            allItems.add(new ItemObject("লালবাগ কেল্লা", "লালবাগ কেল্লা পুরাতন ঢাকার লালবাগে অবস্থিত। সম্রাট আওরঙ্গজেব তার শাসনামলে লালবাগ কেল্লা নির্মাণের ব্যবস্থা করেন। সম্রাট আওরঙ্গজেবের পুত্র যুবরাজ শাহজাদা আজম ১৬৭৮ খ্রিষ্টাব্দে এই প্রাসাদ দূর্গের নির্মাণ কাজ শুরু করেন। তৎকালীন লালবাগ কেল্লার নামকরণ করা হয় আওরঙ্গবাদ কেল্লা বা আওরঙ্গবাদ দূর্গ।","আরো জানুন", R.drawable.lalbag_kella));
            allItems.add(new ItemObject("লালাখাল ", "লালাখাল (Lalakhal) সিলেট (Sylhet) শহর থেকে ৩৫ কিলোমিটার দূরে জৈন্তাপুর উপজেলায় অবস্থিত। ভারতের চেরাপুঞ্জির ঠিক নিচেই লালাখালের অবস্থান। চেরাপুঞ্জি পাহাড় থেকে উৎপন্ন এই নদী বাংলাদেশের মধ্য দিয়ে প্রবাহিত। ","আরো জানুন", R.drawable.lalkhal_mainn));
            allItems.add(new ItemObject("শিমুল ফুলের বাগান", "সুনামগঞ্জের তাহিরপুরে জাদুকাটা নদীর তীরে এই শিমুল ফুলের বাগান। পাশাপাশি আছে লেবু গাছ। বসন্তের দুপুরে পাপড়ি মেলে থাকা শিমুলের রক্তিম আভা মন রাঙায় তো বটেই, ঘুম ভাঙায় সৌখিন হৃদয়ের। এ যেনো কল্পনার রঙে সাজানো এক শিমুলের প্রান্তর ।","আরো জানুন", R.drawable.shimul_ful));
            allItems.add(new ItemObject(" বাঘা মসজিদ ", "প্রাচীন এ মসজিদ ইট দিয়ে তৈরি। মূল মসজিদের চারপাশে চারটি ও মাঝখানে দুই সারিতে পাঁচটি করে মোট দশটি গম্বুজ আছে। মসজিদের পূর্বপাশে পাঁচটি দরজা আছে। উত্তর ও দক্ষিণ দেয়ালের চারটি দরজাই বন্ধ করে দেওয়া হয়েছে।","আরো জানুন", R.drawable.bagha));
            allItems.add(new ItemObject("ষাট গম্বুজ মসজিদ", "ষাট গম্বুজ মসজিদ বাগেরহাট জেলায় অবস্হিত । ১৫ শতকের দিকে উলঘ খান-ই-জাহান এই মসজিদটি নির্মাণ করেন । প্রত্নসহানটি ১৯৮৫ সালে ইউনেস্কো  ঘোষিত বিশ্বঐতিহ্য কেন্দ্র হিসেবে ঘোষিত হয় । অত্র এলাকায় বেশ কিছু মসজিদ, সহাপনা, সমাধি, পুকুর ও ঢিবি পাওয়া গেছে । ষাট গমবুজ মসজিদ এদের মধ্যে অন্যতম । মসজিদটিতে ৮১ টি গমবুজ রয়েছে । ","আরো জানুন", R.drawable.satgombuj_mosque));
            allItems.add(new ItemObject("গোলাপ ফুলের গ্রাম", "সাভারের তুরাগ নদীর তীরে সাদুল্লাহপুর পুরো গ্রামটাই যেন গোলাপের বাগান! উঁচু জমিগুলো ছেয়ে আছে মিরান্ডা জাতের গোলাপে। লাল, হলুদ, সাদা নানান রঙের গোলাপে ছেয়ে আছে দিগন্ত জোড়া ক্ষেতগুলো। মন প্রজাপতি উড়ে বেড়াতে চাইবে এখানে। গোলাপের এই অসীম রাজ্যের মাঝ দিয়ে চলে গেছে আঁকাবাঁকা মেঠো পথ।","আরো জানুন", R.drawable.golap_main));
            allItems.add(new ItemObject("  মালনীছড়া চা বাগান ", "সিলেট সদর উপজেলায় রয়েছে বাংলাদেশ তথা উপমহাদেশের বৃহত্তম এবং সর্বপ্রথম প্রতিষ্ঠিত চা বাগান। যার নাম ‘মালনীছড়া চা বাগান।’ ইংরেজ সাহেব হার্ডসনের হাত ধরে ১৮৪৯ সালে ১৫০০ একর জায়গা জুড়ে প্রতিষ্ঠিত হয় উপমহাদেশের প্রথম চা বাগান মালনীছড়া। বাগানটি বর্তমানে পরিচলিত হচ্ছে বেসরকারি তত্ত্বাবধানে।","আরো জানুন", R.drawable.malnicherra_tea));
            allItems.add(new ItemObject("চিম্বুক পাহাড়় ", "বান্দরবান জেলা শহর থেকে ২৬ কিলোমিটার দূরে চিম্বুক পাহাড়ের অবস্থান। সমুদ্র পৃষ্ঠ থেকে এর উচ্চতা প্রায় ২৫০০ শত ফুট। চিম্বুক যাওয়ার রাস্তার দুই পাশের পাহাড়ী দৃশ্য খুবই মনোরম। যাওয়ার পথে সাঙ্গু নদী চোখে পড়ে। ","আরো জানুন", R.drawable.chimbuk_hill));




            return allItems;
        }





        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {


            List<ItemObject> rowListItem = getAllItemList();
            lLayout = new LinearLayoutManager(getContext());

            View rootView = inflater.inflate(R.layout.fragment_one, container, false);
            RecyclerView rView = (RecyclerView)rootView.findViewById(R.id.recycler_view);
            rView.setLayoutManager(lLayout);

            RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(getContext(), rowListItem);
            rView.setAdapter(rcAdapter);
            rView.setLayoutManager(new LinearLayoutManager(getContext()));
            return rootView;
            // Inflate the layout for this fragment







        }


    }

