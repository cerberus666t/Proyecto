package grandeveloper.albumrusia;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

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
    private TextView tv;
    List<String> lsId;
    public Integer contador=10;
    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_compra, container, false);
        btn =(Button)v.findViewById(R.id.btnPaq);


       // Toast.makeText(getActivity().getBaseContext(), "entro en onCreateView", Toast.LENGTH_LONG).show();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(contador==0){
                    //Toast.makeText(getActivity().getBaseContext(), "Agotaste tus intentos\n Intenta mas tarde", Toast.LENGTH_LONG).show();
                    AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                    builder.setMessage("Solo tienes un máximo de 10 intentos de compra, puedes volver a comprar despúes del tiempo asignado o compartir tus tarjetas repetidas con tus amigos.");
                    builder.setTitle("¡Agotaste tus intentos!");
                    builder.setCancelable(false);
                    builder.setNeutralButton("Aceptar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    }); builder.show();
                }else {

                try {
                    contador--;
                    Intent intent = new Intent(getActivity(), Compras.class);
                    for (int i=0;i<5;i++){
                        intent.putExtra("str"+i,lsId.get(i));
                    }
                    getActivity().startActivity(intent);
                }catch (Exception e){
                    //Toast.makeText(getActivity().getBaseContext(), "Error al obtener tarjetas", Toast.LENGTH_LONG).show();
                    AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                    builder.setMessage("No es posible obtener las tarjetas, por favor verifique la conexión a internet.");
                    builder.setTitle("¡La acción falló!");
                    builder.setCancelable(false);
                    builder.setNeutralButton("Aceptar", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int id) {
                                            dialog.cancel();
                                        }
                                    }); builder.show();
                }

                }
            }
        });

        return v;
    }


    @Override
    public void onResume() {
        super.onResume();
        mqueue = Volley.newRequestQueue(getActivity().getBaseContext());
        SharedPreferences data = PreferenceManager.getDefaultSharedPreferences(getActivity().getBaseContext());
        contador = data.getInt("contador",10);
        tv = (TextView)getActivity().findViewById(R.id.tvComp);
        tv.setGravity(1);
        tv.setText("\n" + contador);
        lsId = new ArrayList<>();
        //Toast.makeText(getActivity().getBaseContext(), "entro en onResume", Toast.LENGTH_LONG).show();
        jsonParse();


    }

    @Override
    public void onPause() {
        super.onPause();
        SharedPreferences data = PreferenceManager.getDefaultSharedPreferences(getActivity().getBaseContext());
        SharedPreferences.Editor miEditor = data.edit();
        miEditor.putInt("contador",contador);
        miEditor.commit();
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
                            //Toast.makeText(getActivity().getBaseContext(),"Error al obtener tarjetas", Toast.LENGTH_LONG).show();
                            AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                            builder.setMessage("No es posible conectarse con el servidor, verique que puede conectarse a internet.");
                            builder.setTitle("¡Error con servidor!");
                            builder.setCancelable(false);
                            builder.setNeutralButton("Aceptar", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            }); builder.show();
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
                //Toast.makeText(getActivity().getBaseContext(),"Error de conexón", Toast.LENGTH_LONG).show();
            }
        });
        mqueue.add(request);
    }
}

