package ir.charnal.davod.a4nalfinal.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ir.charnal.davod.a4nalfinal.APIService;
import ir.charnal.davod.a4nalfinal.APIClient;
import ir.charnal.davod.a4nalfinal.datamodel.dataModelShop.DataModelCategoriseOfProducts;
import ir.charnal.davod.a4nalfinal.datamodel.dataModelShop.DataModelProducts;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DataFromServer {

    public static final int CATEGORIES_FATHER = 1;
    public static final int CATEGORIES_CHILD = 2;
    private List<DataModelProducts> products;
    private APIService service = APIClient.getInstance().getClient().create(APIService.class);
    Map<String, String> requestMap = new HashMap<>();


    public void getProductsFromServer(final OnProductsReceived onProductsReceived,String parameter , String value) {

        requestMap.put(parameter,value);

        Call<List<DataModelProducts>> call = service.getProducts(requestMap);
        call.enqueue(new Callback<List<DataModelProducts>>() {
            @Override
            public void onResponse(Call<List<DataModelProducts>> call, Response<List<DataModelProducts>> response) {
                products =  response.body();
                onProductsReceived.onReceived(products);
            }

            @Override
            public void onFailure(Call<List<DataModelProducts>> call, Throwable t) {

            }
        });

    }

    public void getCategoriesFromServer(final OnCategoriesReceived onCategoriesReceived,String parameter , String value){

        requestMap.put(parameter,value);

        Call<List<DataModelCategoriseOfProducts>> categoriseCall = service.getCategoriseOfProducts(requestMap);
        categoriseCall.enqueue(new Callback<List<DataModelCategoriseOfProducts>>() {
            @Override
            public void onResponse(Call<List<DataModelCategoriseOfProducts>> call, Response<List<DataModelCategoriseOfProducts>> response) {

                List<DataModelCategoriseOfProducts> category  = response.body();

                    onCategoriesReceived.onReceived(category);

                }

            @Override
            public void onFailure(Call<List<DataModelCategoriseOfProducts>> call, Throwable t) {

            }
        });
    }

    public interface OnProductsReceived {
        void onReceived(List<DataModelProducts> products);
    }
    public interface OnCategoriesReceived {
        void onReceived(List<DataModelCategoriseOfProducts> limit_category);
    }
}
