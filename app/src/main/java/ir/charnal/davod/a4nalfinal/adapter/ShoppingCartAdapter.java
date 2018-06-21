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
import ir.charnal.davod.a4nalfinal.datamodel.DataModelListShoppingCart;

public class ShoppingCartAdapter extends RecyclerView.Adapter<ShoppingCartAdapter.ShoppingCartViewHolder>{


    private final Context context;
    private final List<DataModelListShoppingCart> shoppingCartList;

    public ShoppingCartAdapter(Context context, List<DataModelListShoppingCart> shoppingCartList){


        this.context = context;
        this.shoppingCartList = shoppingCartList;
    }

    @NonNull
    @Override
    public ShoppingCartAdapter.ShoppingCartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.model_shopping_cart_layout,parent,false);
        return new ShoppingCartAdapter.ShoppingCartViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ShoppingCartAdapter.ShoppingCartViewHolder holder, int position) {
        DataModelListShoppingCart shoppingCart = shoppingCartList.get(position);
        holder.nameShoppingCart.setText(shoppingCart.getName());
        holder.colorShoppingCart.setText(shoppingCart.getColor());
        holder.sizeShoppingCart.setText(shoppingCart.getSize());
        holder.priceOneShoppingCart.setText(shoppingCart.getPriceOne());
        holder.priceAllShoppingCart.setText(shoppingCart.getPriceAll());
        holder.imageShoppingCart.setImageDrawable(shoppingCart.getImage());

    }



    @Override
    public int getItemCount() {
        return shoppingCartList.size();
    }


    public class ShoppingCartViewHolder extends RecyclerView.ViewHolder{
        private TextView nameShoppingCart;
        private TextView colorShoppingCart;
        private TextView sizeShoppingCart;
        private TextView priceOneShoppingCart;
        private TextView priceAllShoppingCart;
//        private NumberPicker numberShoppingCart;
        private ImageView imageShoppingCart;

        public ShoppingCartViewHolder(View itemView) {
            super(itemView);
            nameShoppingCart = itemView.findViewById(R.id.text_view_name_product_shopping_cart);
            colorShoppingCart = itemView.findViewById(R.id.text_view_second_column_color_shopping_cart);
            sizeShoppingCart = itemView.findViewById(R.id.text_view_second_column_color_shopping_cart);
            priceOneShoppingCart = itemView.findViewById(R.id.text_view_second_column_price_one_shopping_cart);
            priceAllShoppingCart = itemView.findViewById(R.id.text_view_second_column_price_number_shopping_cart);
//            numberShoppingCart = itemView.findViewById(R.id.num_pick_number_shopping_cart);
            imageShoppingCart = itemView.findViewById(R.id.image_view_product_shopping_cart);

        }
    }
}