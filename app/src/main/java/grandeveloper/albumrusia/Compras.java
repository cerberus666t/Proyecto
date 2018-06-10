package grandeveloper.albumrusia;

import android.content.pm.ActivityInfo;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;
import java.util.List;

public class Compras extends AppCompatActivity {

    List<Integer> lstcards = new ArrayList<>();
    List<String> idCards = new ArrayList<>();
    HorizontalInfiniteCycleViewPager infCy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_compras);
        CompraFragment comp = new CompraFragment();
        //para la base
        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this,"bd_jugadores",null,1);
        SQLiteDatabase bd = conn.getWritableDatabase();
        SQLiteDatabase bd1 = conn.getReadableDatabase();
        //recupera info de fragment
        String aux = "";
        for (int i = 0; i < 5; i++){
            aux = getIntent().getStringExtra("str" + i);
            idCards.add(aux);
        }
        //guarda en base de datos
        /*for (int i= 0;i<5;i++) {
            Cursor c = bd.rawQuery("SELECT inventario FROM jugadores WHERE id ='" + Integer.parseInt(idCards.get(i)) + "'", null);
            c.moveToFirst();
            int contAux = c.getInt(0);

            ContentValues values = new ContentValues();
            values.put("inventario",String.valueOf(contAux+1));
            String[] sel = {idCards.get(i)};
            int co = bd1.update("jugadores",values," LIKE ?",sel);
        }
        conn.close();
        */
        initData();
        infCy = (HorizontalInfiniteCycleViewPager)findViewById(R.id.horizontal_cycle);
        AdaptadorCard adaptadorCard = new AdaptadorCard(lstcards,getBaseContext());
        infCy.setAdapter(adaptadorCard);


    }
    private void initData(){
       /* lstcards.add(R.drawable.id1);
        lstcards.add(R.drawable.id2);
        lstcards.add(R.drawable.id3);
        lstcards.add(R.drawable.id4);
        lstcards.add(R.drawable.id5);*/
        for (int i = 0;i < idCards.size();i++){
            String aux = idCards.get(i);
            switch (aux){
                case "1":
                    lstcards.add(R.drawable.id1);
                    break;
                case "2":
                    lstcards.add(R.drawable.id2);
                    break;
                case "3":
                    lstcards.add(R.drawable.id3);
                    break;
                case "4":
                    lstcards.add(R.drawable.id4);
                    break;
                case "5":
                    lstcards.add(R.drawable.id5);
                    break;
                case "6":
                    lstcards.add(R.drawable.id6);
                    break;
                case "7":
                    lstcards.add(R.drawable.id7);
                    break;
                case "8":
                    lstcards.add(R.drawable.id8);
                    break;
                case "9":
                    lstcards.add(R.drawable.id9);
                    break;
                case "10":
                    lstcards.add(R.drawable.id10);
                    break;
                case "11":
                    lstcards.add(R.drawable.id11);
                    break;
                case "12":
                    lstcards.add(R.drawable.id12);
                    break;
                case "13":
                    lstcards.add(R.drawable.id13);
                    break;
                case "14":
                    lstcards.add(R.drawable.id14);
                    break;
                case "15":
                    lstcards.add(R.drawable.id15);
                    break;
                case "16":
                    lstcards.add(R.drawable.id16);
                    break;
                case "17":
                    lstcards.add(R.drawable.id17);
                    break;
                case "18":
                    lstcards.add(R.drawable.id18);
                    break;
                case "19":
                    lstcards.add(R.drawable.id19);
                    break;
                case "20":
                    lstcards.add(R.drawable.id20);
                    break;
                case "21":
                    lstcards.add(R.drawable.id21);
                    break;
                case "22":
                    lstcards.add(R.drawable.id22);
                    break;
                case "23":
                    lstcards.add(R.drawable.id23);
                    break;
                case "24":
                    lstcards.add(R.drawable.id24);
                    break;
                case "25":
                    lstcards.add(R.drawable.id25);
                    break;
                case "26":
                    lstcards.add(R.drawable.id26);
                    break;
                case "27":
                    lstcards.add(R.drawable.id27);
                    break;
                case "28":
                    lstcards.add(R.drawable.id28);
                    break;
                case "29":
                    lstcards.add(R.drawable.id29);
                    break;
                case "30":
                    lstcards.add(R.drawable.id30);
                    break;
                case "31":
                    lstcards.add(R.drawable.id31);
                    break;
                case "32":
                    lstcards.add(R.drawable.id32);
                    break;
                case "33":
                    lstcards.add(R.drawable.id33);
                    break;
                case "34":
                    lstcards.add(R.drawable.id34);
                    break;
                case "35":
                    lstcards.add(R.drawable.id35);
                    break;
                case "36":
                    lstcards.add(R.drawable.id36);
                    break;
                case "37":
                    lstcards.add(R.drawable.id37);
                    break;
                case "38":
                    lstcards.add(R.drawable.id38);
                    break;
                case "39":
                    lstcards.add(R.drawable.id39);
                    break;
                case "40":
                    lstcards.add(R.drawable.id40);
                    break;
                case "41":
                    lstcards.add(R.drawable.id41);
                    break;
                case "42":
                    lstcards.add(R.drawable.id42);
                    break;
                case "43":
                    lstcards.add(R.drawable.id43);
                    break;
                case "44":
                    lstcards.add(R.drawable.id44);
                    break;
                case "45":
                    lstcards.add(R.drawable.id45);
                    break;
                case "46":
                    lstcards.add(R.drawable.id46);
                    break;
                case "47":
                    lstcards.add(R.drawable.id47);
                    break;
                case "48":
                    lstcards.add(R.drawable.id48);
                    break;
                case "49":
                    lstcards.add(R.drawable.id49);
                    break;
                case "50":
                    lstcards.add(R.drawable.id50);
                    break;
            }
        }





    }


}
