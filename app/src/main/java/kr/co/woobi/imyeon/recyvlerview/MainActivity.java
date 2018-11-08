package kr.co.woobi.imyeon.recyvlerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<HashMap<String, Object>> arrayList= new ArrayList<>();
        HashMap<String,Object> hashMap=null;
        hashMap = new HashMap<String, Object>();
        hashMap.put("title", "Chapter Two");
        hashMap.put("detail", "Item two details");
        hashMap.put("image", R.drawable.android_image_1);
        arrayList.add(hashMap);


        hashMap=null;
        hashMap = new HashMap<String, Object>();
        hashMap.put("title", "Chapter Two");
        hashMap.put("detail", "Item two details");
        hashMap.put("image", R.drawable.android_image_2);
        arrayList.add(hashMap);

        hashMap=null;
        hashMap = new HashMap<String, Object>();
        hashMap.put("title", "Chapter Two");
        hashMap.put("detail", "Item two details");
        hashMap.put("image", R.drawable.android_image_3);
        arrayList.add(hashMap);

        hashMap=null;
        hashMap = new HashMap<String, Object>();
        hashMap.put("title", "Chapter Two");
        hashMap.put("detail", "Item two details");
        hashMap.put("image", R.drawable.android_image_4);
        arrayList.add(hashMap);

        hashMap=null;
        hashMap = new HashMap<String, Object>();
        hashMap.put("title", "Chapter Two");
        hashMap.put("detail", "Item two details");
        hashMap.put("image", R.drawable.android_image_5);
        arrayList.add(hashMap);

        hashMap=null;
        hashMap = new HashMap<String, Object>();
        hashMap.put("title", "Chapter Two");
        hashMap.put("detail", "Item two details");
        hashMap.put("image", R.drawable.android_image_6);
        arrayList.add(hashMap);

        hashMap=null;
        hashMap = new HashMap<String, Object>();
        hashMap.put("title", "Chapter Two");
        hashMap.put("detail", "Item two details");
        hashMap.put("image", R.drawable.android_image_7);
        arrayList.add(hashMap);

        hashMap=null;
        hashMap = new HashMap<String, Object>();
        hashMap.put("title", "Chapter Two");
        hashMap.put("detail", "Item two details");
        hashMap.put("image", R.drawable.android_image_8);
        arrayList.add(hashMap);



        recyclerView=(RecyclerView)findViewById(R.id.recycle_view);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new RecyclerAdapter(arrayList);
        recyclerView.setAdapter(adapter);




    }


}
