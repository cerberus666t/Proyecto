package grandeveloper.albumrusia;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class AlbumFragment3 extends Fragment {
    @Nullable

    private LinearLayout l1;
    private ImageView iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8,btn1,btn2;
    int i;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_album2,container,false);
        l1 = (LinearLayout) v.findViewById(R.id.ll1);
        iv1 = (ImageView)v.findViewById(R.id.image1);
        iv2 = (ImageView)v.findViewById(R.id.image2);
        iv3 = (ImageView)v.findViewById(R.id.image3);
        iv4 = (ImageView)v.findViewById(R.id.image4);
        iv5 = (ImageView)v.findViewById(R.id.image5);
        iv6 = (ImageView)v.findViewById(R.id.image6);
        iv7 = (ImageView)v.findViewById(R.id.image7);
        iv8 = (ImageView)v.findViewById(R.id.image8);
        btn1 = (ImageView)v.findViewById(R.id.btnadelante);
        btn2 = (ImageView)v.findViewById(R.id.btnatras);

        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(getContext(),"bd_jugadores",null,1);
        SQLiteDatabase bd = conn.getWritableDatabase();

        for(i=17;i<25;i++){
            Cursor c=bd.rawQuery("SELECT inventario FROM jugadores WHERE id ='"+i+"'",null);
            c.moveToFirst();

            if(i==17){
                if (c.getInt(0)>=0 ){
                    iv1.setBackgroundResource(R.drawable.id17);
                }
            }

            else if(i==18){
                if (c.getInt(0)>=0 ){
                    iv2.setBackgroundResource(R.drawable.id18);
                }
            }

            else if(i==19){
                if (c.getInt(0)>=0 ){
                    iv3.setBackgroundResource(R.drawable.id19);
                }
            }

            else if(i==20){
                if (c.getInt(0)>=0 ){
                    iv4.setBackgroundResource(R.drawable.id20);
                }
            }

            else if(i==21){
                if (c.getInt(0)>=0 ){
                    iv5.setBackgroundResource(R.drawable.id21);
                }
            }

            else if(i==22){
                if (c.getInt(0)>=0 ){
                    iv6.setBackgroundResource(R.drawable.id22);
                }
            }

            else if(i==23){
                if (c.getInt(0)>=0 ){
                    iv7.setBackgroundResource(R.drawable.id23);
                }
            }

            else if(i==24){
                if (c.getInt(0)>=0 ){
                    iv8.setBackgroundResource(R.drawable.id24);
                }
            }

        }



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlbumFragment4 f = new AlbumFragment4();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlbumFragment2 f = new AlbumFragment2();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
            }
        });
        conn.close();

        return v;
    }
}
