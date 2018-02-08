package com.example.poojajoshi.assignment_15_1;

import android.support.v7.widget.RecyclerView;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import android.view.LayoutInflater;
import android.widget.TextView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyHoder> {
    String[] androidVersionNames;
    Context context;

    public RecyclerViewAdapter(String[] list, Context context) {
        this.androidVersionNames = list;
        this.context = context;
    }

    @Override
    public MyHoder onCreateViewHolder(ViewGroup parent, int viewType) {
        // set the layout
        View view = LayoutInflater.from(context).inflate(R.layout.card_view_layout, parent,false);
        MyHoder myHoder = new MyHoder(view);
        return myHoder;
    }

    @Override
    public void onBindViewHolder(MyHoder holder, int position) {
        // set the name
        String versionName = androidVersionNames[position];
        holder.androidVersionName.setText(versionName);
    }

    @Override
    public int getItemCount() {
        int arr = 0;
        try{
            if(androidVersionNames.length==0){
                arr = 0;
            }
            else{
                arr=androidVersionNames.length;
            }
        }catch (Exception e){

        }
        return arr;
    }

    // recycler view holder
    class MyHoder extends RecyclerView.ViewHolder{
        TextView androidVersionName;

        public MyHoder(View itemView) {
            super(itemView);
            androidVersionName = (TextView) itemView.findViewById(R.id.textView);
        }
    }
}
