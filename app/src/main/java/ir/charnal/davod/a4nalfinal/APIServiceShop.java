package ir.charnal.davod.a4nalfinal;

import android.content.Context;
import android.util.Log;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import ir.charnal.davod.a4nalfinal.datamodel.DataModelProductShopMainPage;

public class APIServiceShop {

    private JsonArrayRequest jsonArrayRequest;
    private Context context;
    public String tag = "TAG";

    public APIServiceShop(Context context) {
        this.context = context;
    }

    public void getDatabase(final OnInfoReceived infoReceived){
        try {
            jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, "http://192.168.1.4/davod/GetPosts.php", null,
                    new Response.Listener<JSONArray>() {
                        @Override
                        public void onResponse(JSONArray response) {
                            List<DataModelProductShopMainPage> models = parse(response);
                            infoReceived.onReceived(models);
                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Log.e(tag,"khate 49 API");
                }
            });
        }catch (Exception e){
            e.getMessage();
        }
        jsonArrayRequest.setRetryPolicy(new DefaultRetryPolicy(10000,DefaultRetryPolicy.DEFAULT_MAX_RETRIES,DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        RequestQueue requestQueue = Volley.newRequestQueue(context);
        requestQueue.add(jsonArrayRequest);
    }


    public List<DataModelProductShopMainPage> parse(JSONArray response){
        List<DataModelProductShopMainPage> models = new ArrayList<>();
        for (int i = 0 ; i<response.length();i++){
            DataModelProductShopMainPage model  = new DataModelProductShopMainPage();
            try {
                JSONObject object = response.getJSONObject(i);
                model.setId(object.getInt("id"));
             //   model.setProductImage(object.getString("title"));
                model.setContent(object.getString("content"));
                model.setPrice(object.getString("date"));

                models.add(model);
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
        return models;
    }

    public interface OnInfoReceived{
        public void onReceived(List<DataModelProductShopMainPage> dataModelList);
    }
}

