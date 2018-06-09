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


public class AlbumFragment4 extends Fragment {
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

        for(i=25;i<33;i++){
            Cursor c=bd.rawQuery("SELECT inventario FROM jugadores WHERE id ='"+i+"'",null);
            c.moveToFirst();

            if(i==25){
                if (c.getInt(0)>=0 ){
                    iv1.setBackgroundResource(R.drawable.id25);
                }
            }

            else if(i==26){
                if (c.getInt(0)>=0 ){
                    iv2.setBackgroundResource(R.drawable.id26);
                }
            }

            else if(i==27){
                if (c.getInt(0)>=0 ){
                    iv3.setBackgroundResource(R.drawable.id27);
                }
            }

            else if(i==28){
                if (c.getInt(0)>=0 ){
                    iv4.setBackgroundResource(R.drawable.id28);
                }
            }

            else if(i==29){
                if (c.getInt(0)>=0 ){
                    iv5.setBackgroundResource(R.drawable.id29);
                }
            }

            else if(i==30){
                if (c.getInt(0)>=0 ){
                    iv6.setBackgroundResource(R.drawable.id30);
                }
            }

            else if(i==31){
                if (c.getInt(0)>=0 ){
                    iv7.setBackgroundResource(R.drawable.id31);
                }
            }

            else if(i==32){
                if (c.getInt(0)>=0 ){
                    iv8.setBackgroundResource(R.drawable.id32);
                }
            }

        }

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlbumFragment5 f = new AlbumFragment5();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlbumFragment3 f = new AlbumFragment3();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
            }
        });
        conn.close();

        return v;
    }
}
