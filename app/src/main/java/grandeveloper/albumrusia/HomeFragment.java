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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class HomeFragment extends Fragment {

    private TextView countDown;
    private CountDownTimer countDownTimer;
    private long initialTime =
            DateUtils.DAY_IN_MILLIS * 0 +
                    DateUtils.HOUR_IN_MILLIS * 0 +
                    DateUtils.MINUTE_IN_MILLIS * 1 +
                    DateUtils.SECOND_IN_MILLIS * 10;
    CompraFragment cf = new CompraFragment();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        countDown = (TextView)v.findViewById(R.id.tvTime);
        //if(cf.contador==0) {
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

                    time.append(DateUtils.formatElapsedTime(Math.round(millisUntilFinished / 1000d)));
                    countDown.setText(time.toString());
                }

                @Override
                public void onFinish() {
                    countDown.setText(DateUtils.formatElapsedTime(0));

                    cf.contador = 10;
                    countDown.setTextSize(24);
                    countDown.setText("Ahora puedes seguir comprando");
                }


            }.start();
        /*}else {
            countDown.setText("Te quedan "+cf.contador+" intentos de compra");
        }*/

        ImageView imVid = (ImageView) v.findViewById(R.id.imVid);
        imVid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(getActivity(), VideoActivity.class);
                try {
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=0B_Lu-Im408");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    getActivity().startActivity(intent);
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
    }

    @Override
    public void onPause() {
        super.onPause();
        SharedPreferences data = PreferenceManager.getDefaultSharedPreferences(getActivity().getBaseContext());
        SharedPreferences.Editor miEditor = data.edit();
        miEditor.putInt("contador",cf.contador);
        miEditor.commit();

    }



}
