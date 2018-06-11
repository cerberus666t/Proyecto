package grandeveloper.albumrusia;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class CompartirFragment extends Fragment {
    private Button empezar, btn1, btn2;
    private String interCards="";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_compartir, container, false);
        empezar = (Button)v.findViewById(R.id.btnEmp);
        btn1 =(Button)v.findViewById(R.id.btn1);
        btn2 = (Button)v.findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Compartir.class);
                intent.putExtra("op",1);
                startActivity(intent);
            }

        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Compartir.class);
                intent.putExtra("op",2);
                startActivity(intent);
            }

        });


        empezar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
               //String R = getResources().getIdentifier("id"+1, "strings", getActivity().getPackageName());
                builder.setMessage("¿Desea intercambiar las tarjetas " + interCards +"?");
                builder.setTitle("Intercambio");
                builder.setCancelable(false);
                builder.setNeutralButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.setNegativeButton("Enviar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();

                        QrFragment qrf = new QrFragment();
                        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame,qrf).commit();
                    }
                });
                builder.setPositiveButton("Recibir", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent = new Intent(getActivity(),Escanear.class);
                        intent.putExtra("user",false);
                        getActivity().startActivity(intent);
                        dialog.cancel();
                    }
                }); builder.show();
            }
        });


        return v;
    }


}
