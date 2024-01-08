package tuan4;

import android.content.Context;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Tuan42VolleyFn {
    String strJSON = "";
    public void getJsonArrayOfObject(Context context, TextView textView)
    {
        //1. Tao request
        RequestQueue queue = Volley.newRequestQueue(context);
        //2. Url
        String url ="https://jsonplaceholder.typicode.com/posts";
        //3. Goi request
        JsonArrayRequest request = new JsonArrayRequest(url,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        //chuyen mang sang cac doi tuong
                        for(int i=0;i< response.length();i++){
                            try {
                                JSONObject post=response.getJSONObject(i);//lay tung doi tuong
                                String userId = post.getString("userId");
                                String  id = post.getString("id");
                                String  title = post.getString("title");
                                String  body = post.getString("body");
                                //
                                strJSON +="userId: "+userId+"\n";
                                strJSON +="id: "+id+"\n";
                                strJSON +="title: "+title+"\n";
                                strJSON +="body: "+body+"\n";
                            } catch (JSONException e) {
                                throw new RuntimeException(e);
                            }
                            textView.setText(strJSON);
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                textView.setText(error.getMessage());
            }
        });
        //JsonArrayRequest(ur;, thanhcong, thatbai)
        //4. Thuc thi request
        queue.add(request);
    }
}
