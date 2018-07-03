package ir.charnal.davod.a4nalfinal.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ir.charnal.davod.a4nalfinal.R;
import ir.charnal.davod.a4nalfinal.activity.CategoryListShopActivity;
import ir.charnal.davod.a4nalfinal.datamodel.DataModelCategoryShopMainPage;
import ir.charnal.davod.a4nalfinal.datamodel.dataModelShop.DataModelCategoriseOfProducts;

public class CategoryShopMainPageAdapter extends RecyclerView.Adapter<CategoryShopMainPageAdapter.CategoryShopMainPageViewHolder> {


    private final Context context;
    private final List<DataModelCategoriseOfProducts> categories;
    public static final String RECYCLER_POSITION = "recycler_position";

    public CategoryShopMainPageAdapter (Context context, List<DataModelCategoriseOfProducts> categories){

        this.context = context;
        this.categories = categories;
    }
    @NonNull
    @Override
    public CategoryShopMainPageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.model_category_shop_main_page_layout,parent,false);
        return new CategoryShopMainPageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryShopMainPageViewHolder holder, final int position) {
        DataModelCategoriseOfProducts categoriesOfProducts = categories.get(position);
        holder.textViewCategoryShopMainPage.setText(categoriesOfProducts.getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, CategoryListShopActivity.class);
                intent.putExtra(RECYCLER_POSITION,position);
                context.startActivity(intent);
            }
        });
    }



    @Override
    public int getItemCount() {
        return categories.size();
    }

    public class CategoryShopMainPageViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewCategoryShopMainPage;

        public CategoryShopMainPageViewHolder(View itemView) {
            super(itemView);
            textViewCategoryShopMainPage = itemView.findViewById(R.id.text_view_category_shop_main_page);
        }
    }

//    public class CategoryShopMainPageViewHolder extends RecyclerView.ViewHolder{
//        private TextView categoryShopMainPage;
//
//        public CategoryShopMainPageViewHolder(View itemView) {
//            super(itemView);
//            categoryShopMainPage = itemView.findViewById(R.id.category_name_main_page);
//        }
    }




