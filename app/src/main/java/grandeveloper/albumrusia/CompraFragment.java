package grandeveloper.albumrusia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class CompraFragment extends Fragment {
    private Button btn;
    private RequestQueue mqueue;
    List<String> lsId = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_compra, container, false);
        btn =(Button)v.findViewById(R.id.btnPaq);
        mqueue = Volley.newRequestQueue(getActivity().getBaseContext());
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jsonParse();
                Intent intent = new Intent(getActivity(), Compras.class);
                getActivity().startActivity(intent);
            }
        });

        return v;
    }
    private void jsonParse(){
        String url = "http://serverbpw.com/cm/cards.php?type=json";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONObject jsonObject = response.getJSONObject("result");
                            JSONArray jsonArray = jsonObject.getJSONArray("card");
                            for (int i=0;i<jsonArray.length();i++){
                                JSONObject card = jsonArray.getJSONObject(i);
                                String id = card.getString("id");
                                lsId.add(id);
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                            Toast.makeText(getActivity().getBaseContext(),"Error al obtener tarjetas", Toast.LENGTH_LONG).show();
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
                Toast.makeText(getActivity().getBaseContext(),"Error ", Toast.LENGTH_LONG).show();
            }
        });
        mqueue.add(request);
    }
}

