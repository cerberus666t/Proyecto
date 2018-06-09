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


public class AlbumFragment2 extends Fragment {
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

        for(i=9;i<17;i++){
            Cursor c=bd.rawQuery("SELECT inventario FROM jugadores WHERE id ='"+i+"'",null);
            c.moveToFirst();

            if(i==9){
                if (c.getInt(0)>=0 ){
                    iv1.setBackgroundResource(R.drawable.id9);
                }
            }

            else if(i==10){
                if (c.getInt(0)>=0 ){
                    iv2.setBackgroundResource(R.drawable.id10);
                }
            }

            else if(i==11){
                if (c.getInt(0)>=0 ){
                    iv3.setBackgroundResource(R.drawable.id11);
                }
            }

            else if(i==12){
                if (c.getInt(0)>=0 ){
                    iv4.setBackgroundResource(R.drawable.id12);
                }
            }

            else if(i==13){
                if (c.getInt(0)>=0 ){
                    iv5.setBackgroundResource(R.drawable.id13);
                }
            }

            else if(i==14){
                if (c.getInt(0)>=0 ){
                    iv6.setBackgroundResource(R.drawable.id14);
                }
            }

            else if(i==15){
                if (c.getInt(0)>=0 ){
                    iv7.setBackgroundResource(R.drawable.id15);
                }
            }

            else if(i==16){
                if (c.getInt(0)>=0 ){
                    iv8.setBackgroundResource(R.drawable.id16);
                }
            }

        }


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlbumFragment3 f = new AlbumFragment3();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlbumFragment f = new AlbumFragment();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
            }
        });
        conn.close();

        return v;
    }
}
