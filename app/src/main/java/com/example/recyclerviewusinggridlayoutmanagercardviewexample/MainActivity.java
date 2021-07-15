package com.example.recyclerviewusinggridlayoutmanagercardviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.recyclerviewusinggridlayoutmanagercardviewexample.adapter.UserAdapter;
import com.example.recyclerviewusinggridlayoutmanagercardviewexample.model.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rcv_user);
        userAdapter =new UserAdapter(this);


        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,3);//hien thi so cot
        recyclerView.setLayoutManager(gridLayoutManager);

        userAdapter.SetData(getListUser());

        recyclerView.setAdapter(userAdapter);

    }

    private List<User> getListUser()
    {
          List<User> list =new ArrayList<>();

          list.add(new User(R.drawable.anh1,"Hà anh"));
          list.add(new User(R.drawable.anh2,"Hà anh"));
          list.add(new User(R.drawable.anh3,"Hà anh"));
          list.add(new User(R.drawable.anh4,"Hà anh"));

          list.add(new User(R.drawable.anh1,"Hà anh"));
          list.add(new User(R.drawable.anh3,"Hà anh"));
          list.add(new User(R.drawable.anh2,"Hà anh"));
          list.add(new User(R.drawable.anh4,"Hà anh"));

          list.add(new User(R.drawable.anh1,"Hà anh"));
          list.add(new User(R.drawable.anh4,"Hà anh"));
          list.add(new User(R.drawable.anh3,"Hà anh"));
          list.add(new User(R.drawable.anh2,"Hà anh"));


          list.add(new User(R.drawable.anh4,"Hà anh"));
          list.add(new User(R.drawable.anh2,"Hà anh"));
          list.add(new User(R.drawable.anh3,"Hà anh"));
          list.add(new User(R.drawable.anh1,"Hà anh"));

          list.add(new User(R.drawable.anh4,"Hà anh"));
          list.add(new User(R.drawable.anh2,"Hà anh"));
          list.add(new User(R.drawable.anh3,"Hà anh"));
          list.add(new User(R.drawable.anh1,"Hà anh"));


          list.add(new User(R.drawable.anh4,"Hà anh"));
          list.add(new User(R.drawable.anh2,"Hà anh"));
          list.add(new User(R.drawable.anh3,"Hà anh"));
          list.add(new User(R.drawable.anh1,"Hà anh"));


          list.add(new User(R.drawable.anh4,"Hà anh"));
          list.add(new User(R.drawable.anh2,"Hà anh"));
          list.add(new User(R.drawable.anh3,"Hà anh"));
          list.add(new User(R.drawable.anh1,"Hà anh"));

          list.add(new User(R.drawable.anh4,"Hà anh"));
          list.add(new User(R.drawable.anh2,"Hà anh"));
          list.add(new User(R.drawable.anh3,"Hà anh"));
          list.add(new User(R.drawable.anh1,"Hà anh"));

          list.add(new User(R.drawable.anh4,"Hà anh"));
          list.add(new User(R.drawable.anh2,"Hà anh"));
          list.add(new User(R.drawable.anh3,"Hà anh"));
          list.add(new User(R.drawable.anh1,"Hà anh"));

          list.add(new User(R.drawable.anh4,"Hà anh"));
          list.add(new User(R.drawable.anh2,"Hà anh"));
          list.add(new User(R.drawable.anh3,"Hà anh"));
          list.add(new User(R.drawable.anh1,"Hà anh"));
          list.add(new User(R.drawable.anh3,"Hà anh"));
          list.add(new User(R.drawable.anh1,"Hà anh"));

        return list;
    }
}