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

import com.squareup.picasso.Picasso;

import java.util.List;

import ir.charnal.davod.a4nalfinal.R;
import ir.charnal.davod.a4nalfinal.activity.SingleProductInformationShopActivity;
import ir.charnal.davod.a4nalfinal.datamodel.DataModelProductShopMainPage;
import ir.charnal.davod.a4nalfinal.datamodel.dataModelShop.DataModelProducts;

/**
 * Created by Sajjad on 4/7/2018.
 */

public class ProductShopMainPageAdapter extends RecyclerView.Adapter<ProductShopMainPageAdapter.ProductsViewHolder>{

    public static final int MAIN_PAGE = 1;
    public static final int ALL_PRODUCTS = 2;
    private final Context context;
    private List<DataModelProductShopMainPage> productsListShopMainPage;
    private List<DataModelProducts> products;
    private int id;


    public ProductShopMainPageAdapter(Context context, List<DataModelProducts> products,int id){

        this.context = context;
        this.products = products;
        this.id = id;
    }

//    public ProductShopMainPageAdapter(Context context,List<DataModelProductShopMainPage> productsListShopMainPage) {
//        this.context = context;
//        this.productsListShopMainPage = productsListShopMainPage;
//    }

    @NonNull
    @Override
    public ProductsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        int layout;
        if (id == MAIN_PAGE)
            layout = R.layout.model_product_shop_main_page_layout;
            else
                layout = R.layout.model_of_products;

        View view = LayoutInflater.from(context).inflate(layout, parent, false);
        return new ProductsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductsViewHolder holder, int position) {
        DataModelProducts productShopMainPage = products.get(position);
        Picasso.with(context).load(productShopMainPage.getImage_url().get(0).getSrc()).placeholder(R.drawable.horse6).into(holder.productPic);
        holder.productTitle.setText(productShopMainPage.getTitle());
        holder.productPrice.setText(productShopMainPage.getPrice());
        if (id == ALL_PRODUCTS)
            holder.productContent.setText(productShopMainPage.getShort_description());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SingleProductInformationShopActivity.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class ProductsViewHolder extends RecyclerView.ViewHolder{
        private ImageView productPic;
        private TextView productContent;
        private TextView productPrice;
        private TextView productTitle;

        public ProductsViewHolder(View itemView) {
            super(itemView);
            if (id == MAIN_PAGE) {
                productPic = itemView.findViewById(R.id.product_shop_main_page_pic);
                productTitle = itemView.findViewById(R.id.text_view_product_title_shop_main_page);
                productPrice = itemView.findViewById(R.id.text_view_product_price_shop_main_page);
            }else {
                productPic = itemView.findViewById(R.id.image_all_products);
                productTitle = itemView.findViewById(R.id.title_all_products);
                productContent = itemView.findViewById(R.id.short_description_all_products);
                productPrice = itemView.findViewById(R.id.price_all_products);
            }
        }
    }
}
