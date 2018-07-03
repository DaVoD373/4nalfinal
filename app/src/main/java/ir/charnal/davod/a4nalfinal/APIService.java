package ir.charnal.davod.a4nalfinal;

import java.util.List;
import java.util.Map;

import ir.charnal.davod.a4nalfinal.datamodel.dataModelShop.DataModelCategoriseOfProducts;
import ir.charnal.davod.a4nalfinal.datamodel.dataModelShop.DataModelProducts;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface APIService {

    @GET("products")
    Call<List<DataModelProducts>> getProducts(@QueryMap Map<String,String> options);

    @GET("products/categories")
    Call<List<DataModelCategoriseOfProducts>> getCategoriseOfProducts(@QueryMap Map<String,String> options);


}
