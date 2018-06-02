package ir.charnal.davod.a4nalfinal.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ir.charnal.davod.a4nalfinal.R;
import ir.charnal.davod.a4nalfinal.datamodel.DataModelCategoryShopMainPage;

public class CategoryShopMainPageAdapter extends RecyclerView.Adapter<CategoryShopMainPageAdapter.CategoryShopMainPageViewHolder> {


    private final Context context;
    private final List<DataModelCategoryShopMainPage> categoriesShopMainPage;

    public CategoryShopMainPageAdapter (Context context, List<DataModelCategoryShopMainPage> categoriesShopMainPage){

        this.context = context;
        this.categoriesShopMainPage = categoriesShopMainPage;
    }
    @NonNull
    @Override
    public CategoryShopMainPageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.category_shop_main_page_model_layout,parent,false);
        return new CategoryShopMainPageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryShopMainPageViewHolder holder, int position) {
        DataModelCategoryShopMainPage categoryShopMainPage = categoriesShopMainPage.get(position);
        holder.textViewCategoryShopMainPage.setText(categoryShopMainPage.getProductName());
    }



    @Override
    public int getItemCount() {
        return categoriesShopMainPage.size();
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




