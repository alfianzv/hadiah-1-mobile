package com.alfianzv.hadiah1.adaptors;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alfianzv.hadiah1.R;
import com.alfianzv.hadiah1.models.Drink;

import java.util.ArrayList;

public class DrinkAdapter extends RecyclerView.Adapter<DrinkAdapter.ViewHolder> {

    ArrayList<Drink> drinkArrayList;
    Context context;

    public DrinkAdapter(Context context, ArrayList<Drink> drinkArrayList) {
        this.context = context;
        this.drinkArrayList = drinkArrayList;
    }

    @NonNull
    @Override
    public DrinkAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_drinks, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DrinkAdapter.ViewHolder holder, int position) {
        Drink drink = drinkArrayList.get(position);
        holder.tvDrinkName.setText(drink.getDrinkName());
        holder.ivThumbnail.setImageResource(drink.getThumbnail());
    }

    @Override
    public int getItemCount() {
        return drinkArrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivThumbnail;
        TextView tvDrinkName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivThumbnail = itemView.findViewById(R.id.iv_thumbnail);
            tvDrinkName = itemView.findViewById(R.id.tv_drink_name);
        }

    }
}
