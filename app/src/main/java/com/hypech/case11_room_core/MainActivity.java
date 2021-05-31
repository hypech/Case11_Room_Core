package com.hypech.case11_room_core;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myClick(View view){
        UserDatabase userDb = UserDatabase.getDatabase(this);
        UserDao userDao = userDb.userDao();

        User u2 = new User("room", "pwd", "hypech.com@gmail.com", "877-777-7777");
        userDao.add(u2);
        userDb.close();

        //Below is SQLite.
        //DBOpenHelper mDBOpenHelper = new DBOpenHelper(this);
        //mDBOpenHelper.add("hypech", "pwd", "hypech.com@gmail.com", "777-777-7777");
    }
}