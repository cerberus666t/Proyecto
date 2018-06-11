package grandeveloper.albumrusia;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Compartir extends AppCompatActivity {

    private ListView listView;
    private Button btn1;
    MyCustomAdapter dataAdapter = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.compartir);
        displaylistView();
    }

    private void displaylistView() {
        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this, "bd_jugadores", null, 1);
        SQLiteDatabase bd = conn.getWritableDatabase();
        ArrayList<Jugadores> jugadorList = new ArrayList<Jugadores>();
        Jugadores jugadores;
        for (int i = 1; i < 51; i++) {
            Cursor c = bd.rawQuery("SELECT nombre,inventario FROM jugadores WHERE id ='" + i + "'", null);
            c.moveToFirst();
            if (c.getInt(1) > 1) {
                String idd = Integer.toString(i);
                Integer numerod = c.getInt(1);
                numerod = numerod-1;
                String nombreC = c.getString(0);
                String inventarioC = Integer.toString(numerod);
                jugadores = new Jugadores(idd,nombreC, inventarioC, false);
                jugadorList.add(jugadores);
            }
        }

        dataAdapter = new MyCustomAdapter(this, R.layout.list_view_item, jugadorList);
        listView = (ListView) findViewById(R.id.listView1);
        listView.setAdapter(dataAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, android.view.View view, int position, long id) {
                Jugadores jugador = (Jugadores) parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "Seleccionaste: " + jugador.getNombre(), Toast.LENGTH_SHORT);
            }
        });
    }


    private class MyCustomAdapter extends ArrayAdapter<Jugadores> {
        private ArrayList<Jugadores> jugadorList;

        public MyCustomAdapter(Context context, int textviewResourceid, ArrayList<Jugadores> jugadorList) {
            super(context, textviewResourceid, jugadorList);
            this.jugadorList = new ArrayList<Jugadores>();
            this.jugadorList.addAll(jugadorList);
        }


        private class ViewHolder {
            TextView repetidas;
            CheckBox nombre;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder = null;
            Log.v("ConvertView", String.valueOf(position));
            if (convertView == null) {
                LayoutInflater vi = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = vi.inflate(R.layout.list_view_item, null);
                holder = new ViewHolder();
                holder.repetidas = (TextView) convertView.findViewById(R.id.tarjeta);
                holder.nombre = (CheckBox) convertView.findViewById(R.id.checkbox1);
                convertView.setTag(holder);

                holder.nombre.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        CheckBox cb = (CheckBox) v;
                        Jugadores jugador = (Jugadores) cb.getTag();
                        Toast.makeText(getContext(), "Seleccionaste: " + cb.getTag() + "es" + cb.isChecked(), Toast.LENGTH_SHORT);
                        jugador.setSelected(cb.isChecked());
                    }
                });
            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            Jugadores jugador = jugadorList.get(position);
            holder.repetidas.setText(" ("+jugador.getRepetidas()+")");
            holder.nombre.setText(jugador.id+"."+jugador.getNombre());
            holder.nombre.setChecked(jugador.isSelected());
            holder.nombre.setTag(jugador);
            return convertView;

        }
    }
}
