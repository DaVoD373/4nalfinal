package ir.charnal.davod.a4nalfinal.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ir.charnal.davod.a4nalfinal.R;
import ir.charnal.davod.a4nalfinal.activity.CategoryListShopActivity;
import ir.charnal.davod.a4nalfinal.datamodel.DataModelCategoryShopListFragments;
import ir.charnal.davod.a4nalfinal.datamodel.dataModelShop.DataModelCategoriseOfProducts;

/**
 * Created by Sajjad on 6/2/2018.
 */

public class CategoryShopListAdapter extends RecyclerView.Adapter<CategoryShopListAdapter.CategoryShopListViewHolder> {

    private Context context;
    private List<DataModelCategoriseOfProducts> categorise;
    public static final String ID_OF_ADAPTER="id_of_adapter";

    public CategoryShopListAdapter(Context context, List<DataModelCategoriseOfProducts> categorise){

        this.context = context;
        this.categorise = categorise;
    }


    @NonNull
    @Override
    public CategoryShopListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.model_category_shop_list_layout,parent,false);
        return new CategoryShopListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryShopListViewHolder holder, int position) {
        DataModelCategoriseOfProducts category = categorise.get(position);
        holder.CategoryShopListName.setText(category.getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, CategoryListShopActivity.class);
                intent.putExtra(ID_OF_ADAPTER,1);
                context.startActivity(intent);
            }
        });
        //listName

    }

    @Override
    public int getItemCount() {
        return categorise.size();
    }


    public class CategoryShopListViewHolder extends RecyclerView.ViewHolder{
        private ImageView categoryShopListImage;
        private TextView CategoryShopListName;

        public CategoryShopListViewHolder(View itemView) {
            super(itemView);
            categoryShopListImage = itemView.findViewById(R.id.image_view_category_shop_list);
            CategoryShopListName = itemView.findViewById(R.id.text_view_category_shop_list_name);
        }
    }
}
