package com.bodetree.v2bodetree;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;


import java.util.ArrayList;



public class view3  extends AppCompatActivity{

    private final String image_titles[] = {
            "Img1",
            "Img2",
            "Img3",
            "Img4",

    };

    private final Integer image_ids[] = {
            R.drawable.citywide_1,
            R.drawable.citywide_2,
            R.drawable.citywide_3,
            R.drawable.citywide_4,

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view3);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.imagegallery);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),2);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<CreateList> createLists = prepareData();
        MyAdapter adapter = new MyAdapter(getApplicationContext(), createLists);
        recyclerView.setAdapter(adapter);

    }



    private ArrayList<CreateList> prepareData(){

        ArrayList<CreateList> theimage = new ArrayList<>();
        for(int i = 0; i< image_titles.length; i++){
            CreateList createList = new CreateList();
            createList.setImage_title(image_titles[i]);
            createList.setImage_ID(image_ids[i]);
            theimage.add(createList);
        }
        return theimage;
    }


    public void onButtonClicked(View view){
        Intent intent = new Intent(this, view4.class);
        startActivity(intent);

    }

    @Override
    public void onBackPressed() {

    }


}
