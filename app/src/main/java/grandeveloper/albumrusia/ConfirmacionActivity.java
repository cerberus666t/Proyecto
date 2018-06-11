package grandeveloper.albumrusia;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ConfirmacionActivity extends AppCompatActivity {
    long codigoEnviado;
    long codigoRecibido;
    boolean ini;
    TextView tvcod;
    Button cancel, acept;
    EditText et;
    long aux =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_confirmacion);
        ini = getIntent().getBooleanExtra("inicio",true);
        cancel = (Button)findViewById(R.id.btnCan);
        acept = (Button)findViewById(R.id.btnConf);
        et = (EditText)findViewById(R.id.etConf);

        tvcod = (TextView)findViewById(R.id.tvCod);
        if(ini == true){
             aux = (codigoRecibido/125) + 525;
            tvcod.setText("Código generado: "+ aux);
        }else {
            aux = (codigoRecibido/240) + 1048;
            tvcod.setText("Código generado: "+ aux);
        }

        acept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ConfirmacionActivity.this);
                try {

                    if (ini == true) {
                        long aux2 = (codigoEnviado / 240) + 1048;

                        if (aux2 == Integer.parseInt(et.getText().toString())) {
                            Toast.makeText(ConfirmacionActivity.this, "Transferencia exitosa!", Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(ConfirmacionActivity.this, MainActivity.class);
                            ConfirmacionActivity.this.startActivity(intent);
                        } else
                            builder.setMessage("Por favor verifica el código del otro usuario");
                            builder.setTitle("Algo salió mal!");
                            builder.setCancelable(false);
                            builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                    Intent intent = new Intent(ConfirmacionActivity.this, MainActivity.class);
                                    ConfirmacionActivity.this.startActivity(intent);
                                }
                            });
                            builder.setPositiveButton("Intentar de nuevo", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            }); builder.show();

                    } else {
                        long aux2 = (codigoEnviado / 125) + 525;

                        if (aux2 == Integer.parseInt(et.getText().toString())) {
                            Toast.makeText(ConfirmacionActivity.this, "Transferencia exitosa!", Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(ConfirmacionActivity.this, MainActivity.class);
                            ConfirmacionActivity.this.startActivity(intent);
                        } else

                            builder.setMessage("Por favor verifica el código del otro usuario");
                            builder.setTitle("Algo salió mal!");
                            builder.setCancelable(false);
                            builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                    Intent intent = new Intent(ConfirmacionActivity.this, MainActivity.class);
                                    ConfirmacionActivity.this.startActivity(intent);
                                }
                            });
                            builder.setPositiveButton("Intentar de nuevo", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            }); builder.show();


                    }

                }catch (Exception e){

                    builder.setMessage("Problema: por favor ingresa el código del otro usuario");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                       }
                    }); builder.show();
                }

            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConfirmacionActivity.this,MainActivity.class);
                ConfirmacionActivity.this.startActivity(intent);
            }
        });



    }
}
