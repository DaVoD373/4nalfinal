package ir.charnal.davod.a4nalfinal.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ir.charnal.davod.a4nalfinal.R;
import ir.charnal.davod.a4nalfinal.datamodel.DataModelProductShopMainPage;

/**
 * Created by Sajjad on 4/7/2018.
 */

public class ProductShopMainPageAdapter extends RecyclerView.Adapter<ProductShopMainPageAdapter.ProductShopMainPageViewHolder>{
    private final Context context;
    private final List<DataModelProductShopMainPage> productsListShopMainPage;

    public ProductShopMainPageAdapter(Context context, List<DataModelProductShopMainPage> productsListShopMainPage){

        this.context = context;
        this.productsListShopMainPage = productsListShopMainPage;
    }

    @NonNull
    @Override
    public ProductShopMainPageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.product_shop_main_page_model_layout,parent,false);
        return new ProductShopMainPageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductShopMainPageViewHolder holder, int position) {
        DataModelProductShopMainPage productShopMainPage = productsListShopMainPage.get(position);
        holder.productPicShopMainPage.setImageDrawable(productShopMainPage.getProductImage());
        holder.productContentShopMainPage.setText(productShopMainPage.getContent());
        holder.productPriceShopMainPage.setText(productShopMainPage.getPrice());

    }

    @Override
    public int getItemCount() {
        return productsListShopMainPage.size();
    }

    public class ProductShopMainPageViewHolder extends RecyclerView.ViewHolder{
        private ImageView productPicShopMainPage;
        private TextView productContentShopMainPage;
        private TextView productPriceShopMainPage;

        public ProductShopMainPageViewHolder(View itemView) {
            super(itemView);
            productPicShopMainPage = itemView.findViewById(R.id.product_shop_main_page_pic);
            productContentShopMainPage = itemView.findViewById(R.id.product_content_shop_main_page);
            productPriceShopMainPage = itemView.findViewById(R.id.product_price_shop_main_page);
        }
    }
}
