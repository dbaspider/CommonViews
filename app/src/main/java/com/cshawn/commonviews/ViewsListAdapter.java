package com.cshawn.commonviews;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by C.Shawn on 2017/4/7 0007.
 *
 * @author C.Shawn
 */
public class ViewsListAdapter extends RecyclerView.Adapter {
    private String[] views={"RoundCornerTextView"};
    private Context context;
    public ViewsListAdapter(Context context) {
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context,R.layout.item_views,null);
        return new RecyclerView.ViewHolder(view){};
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        TextView tv_view_name= (TextView) holder.itemView.findViewById(R.id.tv_view_name);
        tv_view_name.setText(views[position]);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (position) {
                    case 0:
                        context.startActivity(new Intent(context, RoundCornerTextViewActivity.class));
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return views.length;
    }
}