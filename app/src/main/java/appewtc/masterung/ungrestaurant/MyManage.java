package appewtc.masterung.ungrestaurant;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by com1test on 22/3/2559.
 */
public class MyManage {

    //Explicit
    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public static final String user_table = "userTABLE";
    public static final String column_id_ = "_id";
    public static final String column_User_ = "User";
    public static final String column_Password_ = "Password";
    public static final String column_name_ = "Name";


    public static final String food_table = "foodTABLE";
    public static final String column_Food_ = "Food";
    public static final String column_Price_ = "Price";
    public static final String column_Source_ = "Source";

    public MyManage(Context context) {

        //Create & Connected SQLite
        myOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = myOpenHelper.getWritableDatabase();
        readSqLiteDatabase = myOpenHelper.getReadableDatabase();

    }   //Constructor

    public long addValueToSQLite(int intTABLE,
                                 String strFirst,
                                 String strSecond,
                                 String strThird) {

        long myLong = 0;
        switch (intTABLE) {
            case 1:
                //userTABLE
                ContentValues contentValues = new ContentValues();
                contentValues.put(column_User_,strFirst);
                contentValues.put(column_Password_,strSecond);
                contentValues.put(column_name_,strThird);

                myLong = writeSqLiteDatabase.insert(user_table, null, contentValues);

                break;
            case 2:
                //foodTABLE
                ContentValues contentValues1 = new ContentValues();
                contentValues1.put(column_Food_, strFirst);
                contentValues1.put(column_Price_,strSecond);
                contentValues1.put(column_Source_,strThird);

                myLong = writeSqLiteDatabase.insert(food_table, null, contentValues1);
                break;

        }   //switch
        return myLong;
    }


}   //Main Ciass
