package controller;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;
import utils.utils;
public class DataBaseHandler extends SQLiteOpenHelper {


    public DataBaseHandler(@Nullable Context context) {
        super(context,utils.Database_name , null   , utils.Database_Version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
String Create_table="CREATE TABLE"+utils.Database_Tabel+"("
        +utils.Tabel_id+"INTEGER"+utils.Tabel_Book+"TEXT"+utils.Tabel_Subject+"TEXT"
        +utils.Tabel_Grade +"TEXT"+utils.Tabel_Price+"INTEGER" +")";
sqLiteDatabase.execSQL(Create_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+utils.Database_Tabel);
onCreate(sqLiteDatabase);
    }
}
