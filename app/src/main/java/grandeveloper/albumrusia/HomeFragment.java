package grandeveloper.albumrusia;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.text.format.DateUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class HomeFragment extends Fragment {
    private int cont2 = 0;
    List<String> url = new ArrayList<>();
    private TextView countDown;
    private TextView tv;
    private CountDownTimer countDownTimer;
    private long initialTime =
            DateUtils.DAY_IN_MILLIS * 0 +
                    DateUtils.HOUR_IN_MILLIS * 0 +
                    DateUtils.MINUTE_IN_MILLIS * 2 +
                    DateUtils.SECOND_IN_MILLIS * 0;
    CompraFragment cf = new CompraFragment();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        url.add("https://www.youtube.com/watch?v=0B_Lu-Im408");
        url.add("https://www.youtube.com/watch?v=hDF7KYA5iYI");
        url.add("https://www.youtube.com/watch?v=YV4EQXOq8_o");
        url.add("https://www.youtube.com/watch?v=0r1UHipg2ko");

        ImageView imVid = (ImageView) v.findViewById(R.id.imVid);
        imVid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(getActivity(), VideoActivity.class);
                try {

                    if (cont2 == 3) {
                        cont2 = 0;
                        Uri uri = Uri.parse(url.get(cont2));
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        getActivity().startActivity(intent);
                    }else{
                        cont2++;
                        Uri uri = Uri.parse(url.get(cont2));
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        getActivity().startActivity(intent);
                    }

                }catch ( Exception e){
                    AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                    builder.setMessage("Verifique que tiene Youtube instalado");
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
        });

        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
        SharedPreferences data = PreferenceManager.getDefaultSharedPreferences(getActivity().getBaseContext());
        cf.contador = data.getInt("contador",10);
        cont2 = data.getInt("contUrl",0);
        initialTime = data.getLong("hora",DateUtils.HOUR_IN_MILLIS * 0 + DateUtils.MINUTE_IN_MILLIS * 2 + DateUtils.SECOND_IN_MILLIS * 0);

        tv = (TextView)getActivity().findViewById(R.id.tvConsejo);
        countDown = (TextView)getActivity().findViewById(R.id.tvTime);
        if(cf.contador==0) {
        countDownTimer = new CountDownTimer(initialTime, 1000) {
            StringBuilder time = new StringBuilder();

            @Override
            public void onTick(long millisUntilFinished) {
                time.setLength(0);
                // Use days if appropriate
                if (millisUntilFinished > DateUtils.DAY_IN_MILLIS) {
                    long count = millisUntilFinished / DateUtils.DAY_IN_MILLIS;
                    if (count > 1)
                        time.append(count).append(" Dias ");
                    else
                        time.append(count).append(" Dia ");

                    millisUntilFinished %= DateUtils.DAY_IN_MILLIS;
                }
                initialTime = millisUntilFinished;
                time.append(DateUtils.formatElapsedTime(Math.round(millisUntilFinished / 1000d)));
                countDown.setText(time.toString());
                tv.setText("Consejo: puedes intercambiar tarjetas con tus amigos");
            }

            @Override
            public void onFinish() {
                countDown.setText(DateUtils.formatElapsedTime(0));

                cf.contador = 10;
                initialTime = DateUtils.HOUR_IN_MILLIS * 0 + DateUtils.MINUTE_IN_MILLIS * 2 + DateUtils.SECOND_IN_MILLIS * 0;
                countDown.setTextSize(24);
                countDown.setText("Ahora puedes seguir comprando");
            }


        }.start();
        }else {
            countDown.setTextSize(24);
            countDown.setText("Aun puedes comprar paquetes de tarjetas");
            tv.setText("");
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        SharedPreferences data = PreferenceManager.getDefaultSharedPreferences(getActivity().getBaseContext());
        SharedPreferences.Editor miEditor = data.edit();
        miEditor.putInt("contador",cf.contador);
        miEditor.putLong("hora",initialTime);
        miEditor.putInt("contUrl",cont2);
        miEditor.commit();

    }

    public long difHora(Date fechaInicial, Date fechaFinal){
        long diferencia = fechaFinal.getTime() - fechaInicial.getTime();

        Log.i("Fragment", "fechaInicial : " + fechaInicial);
        Log.i("Fragment", "fechaFinal : " + fechaFinal);

        long segsMilli = 1000;
        long minsMilli = segsMilli * 60;
        long horasMilli = minsMilli * 60;
        long diasMilli = horasMilli * 24;
        /*
        long diasTranscurridos = diferencia / diasMilli;
        diferencia = diferencia % diasMilli;

        long horasTranscurridos = diferencia / horasMilli;
        diferencia = diferencia % horasMilli;

        long minutosTranscurridos = diferencia / minsMilli;
        diferencia = diferencia % minsMilli;

        long segsTranscurridos = diferencia / segsMilli;
        */
        return diferencia;
    }

}
