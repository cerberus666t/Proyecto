package grandeveloper.albumrusia;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


public class AvanceFragment extends Fragment {
    TextView t1, t2, t3, t4, t5, t6, t7, t8, t9, t10,
            t11, t12, t13, t14, t15, t16, t17, t18, t19, t20,
            t21, t22, t23, t24, t25, t26, t27, t28, t29, t30,
            t31, t32, t33, t34, t35, t36, t37, t38, t39, t40,
            t41, t42, t43, t44, t45, t46, t47, t48, t49, t50;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_avance, container, false);
        t1 = (TextView) v.findViewById(R.id.t1);
        t2 = (TextView) v.findViewById(R.id.t2);
        t3 = (TextView) v.findViewById(R.id.t3);
        t4 = (TextView) v.findViewById(R.id.t4);
        t5 = (TextView) v.findViewById(R.id.t5);
        t6 = (TextView) v.findViewById(R.id.t6);
        t7 = (TextView) v.findViewById(R.id.t7);
        t8 = (TextView) v.findViewById(R.id.t8);
        t9 = (TextView) v.findViewById(R.id.t9);
        t10 = (TextView) v.findViewById(R.id.t10);
        t11 = (TextView) v.findViewById(R.id.t11);
        t12 = (TextView) v.findViewById(R.id.t12);
        t13 = (TextView) v.findViewById(R.id.t13);
        t14 = (TextView) v.findViewById(R.id.t14);
        t15 = (TextView) v.findViewById(R.id.t15);
        t16 = (TextView) v.findViewById(R.id.t16);
        t17 = (TextView) v.findViewById(R.id.t17);
        t18 = (TextView) v.findViewById(R.id.t18);
        t19 = (TextView) v.findViewById(R.id.t19);
        t20 = (TextView) v.findViewById(R.id.t20);
        t21 = (TextView) v.findViewById(R.id.t21);
        t22 = (TextView) v.findViewById(R.id.t22);
        t23 = (TextView) v.findViewById(R.id.t23);
        t24 = (TextView) v.findViewById(R.id.t24);
        t25 = (TextView) v.findViewById(R.id.t25);
        t26 = (TextView) v.findViewById(R.id.t26);
        t27 = (TextView) v.findViewById(R.id.t27);
        t28 = (TextView) v.findViewById(R.id.t28);
        t29 = (TextView) v.findViewById(R.id.t29);
        t30 = (TextView) v.findViewById(R.id.t30);
        t31 = (TextView) v.findViewById(R.id.t31);
        t32 = (TextView) v.findViewById(R.id.t32);
        t33 = (TextView) v.findViewById(R.id.t33);
        t34 = (TextView) v.findViewById(R.id.t34);
        t35 = (TextView) v.findViewById(R.id.t35);
        t36 = (TextView) v.findViewById(R.id.t36);
        t37 = (TextView) v.findViewById(R.id.t37);
        t38 = (TextView) v.findViewById(R.id.t38);
        t39 = (TextView) v.findViewById(R.id.t39);
        t40 = (TextView) v.findViewById(R.id.t40);
        t41 = (TextView) v.findViewById(R.id.t41);
        t42 = (TextView) v.findViewById(R.id.t42);
        t43 = (TextView) v.findViewById(R.id.t43);
        t44 = (TextView) v.findViewById(R.id.t44);
        t45 = (TextView) v.findViewById(R.id.t45);
        t46 = (TextView) v.findViewById(R.id.t46);
        t47 = (TextView) v.findViewById(R.id.t47);
        t48 = (TextView) v.findViewById(R.id.t48);
        t49 = (TextView) v.findViewById(R.id.t49);
        t50 = (TextView) v.findViewById(R.id.t50);

        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(getContext(),"bd_jugadores",null,1);
        SQLiteDatabase bd = conn.getWritableDatabase();

        for(int i=1;i<=50;i++) {
            Cursor c = bd.rawQuery("SELECT inventario FROM jugadores WHERE id ='" + i + "'", null);
            c.moveToFirst();
            if(i==1){
                if (c.getInt(0)>0 ){
                    t1.setBackgroundColor(Color.WHITE);
                    t1.setTextColor(Color.BLACK);
                }
            }

            else if(i==2){
                if (c.getInt(0)>0 ){
                    t2.setBackgroundColor(Color.WHITE);
                    t2.setTextColor(Color.BLACK);
                }
            }
            else if(i==3){
                if (c.getInt(0)>0 ){
                    t3.setBackgroundColor(Color.WHITE);
                    t3.setTextColor(Color.BLACK);
                }
            }
            else if(i==4){
                if (c.getInt(0)>0 ){
                    t4.setBackgroundColor(Color.WHITE);
                    t4.setTextColor(Color.BLACK);
                }
            }
            else if(i==5){
                if (c.getInt(0)>0 ){
                    t5.setBackgroundColor(Color.WHITE);
                    t5.setTextColor(Color.BLACK);
                }
            }
            else if(i==6){
                if (c.getInt(0)>0 ){
                    t6.setBackgroundColor(Color.WHITE);
                    t6.setTextColor(Color.BLACK);
                }
            }
            else if(i==7){
                if (c.getInt(0)>0 ){
                    t7.setBackgroundColor(Color.WHITE);
                    t7.setTextColor(Color.BLACK);
                }
            }
            else if(i==8){
                if (c.getInt(0)>0 ){
                    t8.setBackgroundColor(Color.WHITE);
                    t8.setTextColor(Color.BLACK);
                }
            }
            else if(i==9){
                if (c.getInt(0)>0 ){
                    t9.setBackgroundColor(Color.WHITE);
                    t9.setTextColor(Color.BLACK);
                }
            }
            else if(i==10){
                if (c.getInt(0)>0 ){
                    t10.setBackgroundColor(Color.WHITE);
                    t10.setTextColor(Color.BLACK);
                }
            }
            else if(i==11){
                if (c.getInt(0)>0 ){
                    t11.setBackgroundColor(Color.WHITE);
                    t11.setTextColor(Color.BLACK);
                }
            }

            else if(i==12){
                if (c.getInt(0)>0 ){
                    t12.setBackgroundColor(Color.WHITE);
                    t12.setTextColor(Color.BLACK);
                }
            }
            else if(i==13){
                if (c.getInt(0)>0 ){
                    t13.setBackgroundColor(Color.WHITE);
                    t13.setTextColor(Color.BLACK);
                }
            }
            else if(i==14){
                if (c.getInt(0)>0 ){
                    t14.setBackgroundColor(Color.WHITE);
                    t14.setTextColor(Color.BLACK);
                }
            }
            else if(i==15){
                if (c.getInt(0)>0 ){
                    t15.setBackgroundColor(Color.WHITE);
                    t15.setTextColor(Color.BLACK);
                }
            }
            else if(i==16){
                if (c.getInt(0)>0 ){
                    t16.setBackgroundColor(Color.WHITE);
                    t16.setTextColor(Color.BLACK);
                }
            }
            else if(i==17){
                if (c.getInt(0)>0 ){
                    t17.setBackgroundColor(Color.WHITE);
                    t17.setTextColor(Color.BLACK);
                }
            }
            else if(i==18){
                if (c.getInt(0)>0 ){
                    t18.setBackgroundColor(Color.WHITE);
                    t18.setTextColor(Color.BLACK);
                }
            }
            else if(i==19){
                if (c.getInt(0)>0 ){
                    t19.setBackgroundColor(Color.WHITE);
                    t19.setTextColor(Color.BLACK);
                }
            }
            else if(i==20){
                if (c.getInt(0)>0 ){
                    t20.setBackgroundColor(Color.WHITE);
                    t20.setTextColor(Color.BLACK);
                }
            }
            else if(i==21){
                if (c.getInt(0)>0 ){
                    t21.setBackgroundColor(Color.WHITE);
                    t21.setTextColor(Color.BLACK);
                }
            }

            else if(i==22){
                if (c.getInt(0)>0 ){
                    t22.setBackgroundColor(Color.WHITE);
                    t22.setTextColor(Color.BLACK);
                }
            }
            else if(i==23){
                if (c.getInt(0)>0 ){
                    t23.setBackgroundColor(Color.WHITE);
                    t23.setTextColor(Color.BLACK);
                }
            }
            else if(i==24){
                if (c.getInt(0)>0 ){
                    t24.setBackgroundColor(Color.WHITE);
                    t24.setTextColor(Color.BLACK);
                }
            }
            else if(i==25){
                if (c.getInt(0)>0 ){
                    t25.setBackgroundColor(Color.WHITE);
                    t25.setTextColor(Color.BLACK);
                }
            }
            else if(i==26){
                if (c.getInt(0)>0 ){
                    t26.setBackgroundColor(Color.WHITE);
                    t26.setTextColor(Color.BLACK);
                }
            }
            else if(i==27){
                if (c.getInt(0)>0 ){
                    t27.setBackgroundColor(Color.WHITE);
                    t27.setTextColor(Color.BLACK);
                }
            }
            else if(i==28){
                if (c.getInt(0)>0 ){
                    t28.setBackgroundColor(Color.WHITE);
                    t28.setTextColor(Color.BLACK);
                }
            }
            else if(i==29){
                if (c.getInt(0)>0 ){
                    t29.setBackgroundColor(Color.WHITE);
                    t29.setTextColor(Color.BLACK);
                }
            }
            else if(i==30){
                if (c.getInt(0)>0 ){
                    t30.setBackgroundColor(Color.WHITE);
                    t30.setTextColor(Color.BLACK);
                }
            }
            else if(i==31){
                if (c.getInt(0)>0 ){
                    t31.setBackgroundColor(Color.WHITE);
                    t31.setTextColor(Color.BLACK);
                }
            }

            else if(i==32){
                if (c.getInt(0)>0 ){
                    t32.setBackgroundColor(Color.WHITE);
                    t32.setTextColor(Color.BLACK);
                }
            }
            else if(i==33){
                if (c.getInt(0)>0 ){
                    t33.setBackgroundColor(Color.WHITE);
                    t33.setTextColor(Color.BLACK);
                }
            }
            else if(i==34){
                if (c.getInt(0)>0 ){
                    t34.setBackgroundColor(Color.WHITE);
                    t34.setTextColor(Color.BLACK);
                }
            }
            else if(i==35){
                if (c.getInt(0)>0 ){
                    t35.setBackgroundColor(Color.WHITE);
                    t35.setTextColor(Color.BLACK);
                }
            }
            else if(i==36){
                if (c.getInt(0)>0 ){
                    t36.setBackgroundColor(Color.WHITE);
                    t36.setTextColor(Color.BLACK);
                }
            }
            else if(i==37){
                if (c.getInt(0)>0 ){
                    t37.setBackgroundColor(Color.WHITE);
                    t37.setTextColor(Color.BLACK);
                }
            }
            else if(i==38){
                if (c.getInt(0)>0 ){
                    t38.setBackgroundColor(Color.WHITE);
                    t38.setTextColor(Color.BLACK);
                }
            }
            else if(i==39){
                if (c.getInt(0)>0 ){
                    t39.setBackgroundColor(Color.WHITE);
                    t39.setTextColor(Color.BLACK);
                }
            }
            else if(i==40){
                if (c.getInt(0)>0 ){
                    t40.setBackgroundColor(Color.WHITE);
                    t40.setTextColor(Color.BLACK);
                }
            }
            else if(i==41){
                if (c.getInt(0)>0 ){
                    t41.setBackgroundColor(Color.WHITE);
                    t41.setTextColor(Color.BLACK);
                }
            }

            else if(i==42){
                if (c.getInt(0)>0 ){
                    t42.setBackgroundColor(Color.WHITE);
                    t42.setTextColor(Color.BLACK);
                }
            }
            else if(i==43){
                if (c.getInt(0)>0 ){
                    t43.setBackgroundColor(Color.WHITE);
                    t43.setTextColor(Color.BLACK);
                }
            }
            else if(i==44){
                if (c.getInt(0)>0 ){
                    t44.setBackgroundColor(Color.WHITE);
                    t44.setTextColor(Color.BLACK);
                }
            }
            else if(i==45){
                if (c.getInt(0)>0 ){
                    t45.setBackgroundColor(Color.WHITE);
                    t45.setTextColor(Color.BLACK);
                }
            }
            else if(i==46){
                if (c.getInt(0)>0 ){
                    t46.setBackgroundColor(Color.WHITE);
                    t46.setTextColor(Color.BLACK);
                }
            }
            else if(i==47){
                if (c.getInt(0)>0 ){
                    t47.setBackgroundColor(Color.WHITE);
                    t47.setTextColor(Color.BLACK);
                }
            }
            else if(i==48){
                if (c.getInt(0)>0 ){
                    t48.setBackgroundColor(Color.WHITE);
                    t48.setTextColor(Color.BLACK);
                }
            }
            else if(i==49){
                if (c.getInt(0)>0 ){
                    t49.setBackgroundColor(Color.WHITE);
                    t49.setTextColor(Color.BLACK);
                }
            }
            else if(i==50){
                if (c.getInt(0)>0 ){
                    t50.setBackgroundColor(Color.WHITE);
                    t50.setTextColor(Color.BLACK);
                }
            }

        }
        conn.close();

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id1), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id2), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id3), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id4), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id5), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id6), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id7), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id8), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id9), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id10), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id11), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id12), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id13), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id14), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id15), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id16), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id17), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id18), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id19), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id20), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id21), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id22), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id23), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id24), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id25), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id26), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id27), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id28), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id29), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id30), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id31), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id32), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id33), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id34), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id35), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id36), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id37), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id38), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id39), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id40), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id41), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id42), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id43), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id44), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id45), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id46), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id47), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id48), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id49), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });
        t50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ts;
                ts = Toast.makeText(getActivity().getBaseContext(), getActivity().getResources().getString(R.string.id50), Toast.LENGTH_LONG);
                ts.setGravity(Gravity.CENTER_VERTICAL,0,0);
                ts.show();

            }
        });


        return v;
    }

}

