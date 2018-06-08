package grandeveloper.albumrusia;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ConexionSQLiteHelper extends SQLiteOpenHelper {

    final String CREAR_TABLA_USUARIO = "CREATE TABLE jugadores (id INTEGER,nombre TEXT,inventario INTEGER )";
    final String BORRAR_TABLA_USUARIO = "DROP TABLE IF EXISTS jugadores";

    public ConexionSQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREAR_TABLA_USUARIO);
        db.execSQL("insert into jugadores(id, nombre, inventario) values(001,'Nawaf Al Abed',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(002,'Mohamed Salah',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(003,'Emil Forsberg',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(004,'Aleksandr Kokorin',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(005,'Victor Moses',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(006,'Philippe Coutinho',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(007,'Eden Hazard',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(008,'Olivier Giroud',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(009,'James Rodríguez',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(010,'Sadio Mané',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(011,'Hirving Lozano',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(012,'Cristiano Ronaldo',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(013,'Andrés Iniesta',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(014,'Branislav Ivanovic',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(015,'Gylfi Sigurdsson',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(016,'Lionel Messi',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(017,'Paolo Guerrero',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(018,'Marcelo Vieira',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(019,'Shinji Kagawa',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(020,'Radamel Falcao',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(021,'Mesut Özil',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(022,'Moussa Konaté',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(023,'Luca Modric',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(024,'Hamza Mendyl',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(025,'Romelu Lukaku',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(026,'Ferjani Sassi',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(027,'Mehdi Benatia',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(028,'Francisco Alarcón',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(029,'Toni Kroos',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(030,'Christian Eriksen',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(031,'Luis Suárez',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(032,'Xherdan Shaqiri',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(033,'Kylian Mbappé',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(034,'Thomas Müller',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(035,'Mile Jedinak',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(036,'Alex Iwobi',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(037,'Carlos Vela',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(038,'Manuel Neuer',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(039,'Javier Hernández',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(040,'Sergio Agüero',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(041,'Andrés Guardado',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(042,'Harry Kane',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(043,'Son Heung-min',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(044,'Paulo Dybala',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(045,'Antoine Griezmann',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(046,'Neymar Jr.',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(047,'Keylor Navas',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(048,'Sergio Ramos',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(049,'Robert Lewandowski',0)");
        db.execSQL("insert into jugadores(id, nombre, inventario) values(050,'Edinson Cavani',0)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(BORRAR_TABLA_USUARIO);
        onCreate(db);
    }
}
