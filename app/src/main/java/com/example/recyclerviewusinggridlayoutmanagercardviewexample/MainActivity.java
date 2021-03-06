package com.example.recyclerviewusinggridlayoutmanagercardviewexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.recyclerviewusinggridlayoutmanagercardviewexample.adapter.UserAdapter;
import com.example.recyclerviewusinggridlayoutmanagercardviewexample.model.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private UserAdapter userAdapter;

    private GridLayoutManager gridLayoutManager;
    private LinearLayoutManager linearLayoutManager;
    private StaggeredGridLayoutManager staggeredGridLayoutManager;

    private List<User> mlistUser;
    private int mCurrentTyPeDisPlay=User.TYPE_GRID;//bien khoi tao ban dau type hien thi
    private  Menu mMenu;
    private int mCurrentPosition;//bien luu trang thai hien thi khi chuyen type
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.rcv_user);




        gridLayoutManager=new GridLayoutManager(this,2);//hien thi so cot
        linearLayoutManager=new LinearLayoutManager(this);
        staggeredGridLayoutManager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);


        recyclerView.setLayoutManager(gridLayoutManager);

        mlistUser =getListUser();

        setTypeDisPlay(User.TYPE_GRID);

        userAdapter=new UserAdapter(mlistUser);

        recyclerView.setAdapter(userAdapter);

    }

    // ham xet type hien thi trong recyclerview;

    private void setTypeDisPlay(int typeDisPlay)
    {
        if(mlistUser==null||mlistUser.isEmpty())
        {
          return;
        }
         mCurrentTyPeDisPlay=typeDisPlay;
        for (User user:mlistUser)
        {
            user.setTypeDisplay(typeDisPlay);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        this.mMenu=menu;
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id=item.getItemId();

        if(id==R.id.action_menu)
        {
            setmCurrentPosition();//ham luu trang thai hien thi khi chuyen kieu hien thi trong reclerview
            onClickChangeDisplay();//ham thay doi  chuyen kieu type hien thi khi nhan vao menu
        }

        return true;
    }

    private void onClickChangeDisplay()
    {
       if(mCurrentTyPeDisPlay==User.TYPE_GRID)
       {
           setTypeDisPlay(User.TYPE_LIST);
           recyclerView.setLayoutManager(linearLayoutManager);
       } else if (mCurrentTyPeDisPlay == User.TYPE_LIST)
       {
           setTypeDisPlay(User.TYPE_STAGGER);
           recyclerView.setLayoutManager(staggeredGridLayoutManager);
       }
      else if (mCurrentTyPeDisPlay == User.TYPE_STAGGER)
      {
        setTypeDisPlay(User.TYPE_GRID);
        recyclerView.setLayoutManager(gridLayoutManager);

      }
       userAdapter.notifyDataSetChanged();
       setIconMenu();//ham set icon menu khi click vao icon menu bat ki
       recyclerView.scrollToPosition(mCurrentPosition);//luu bien trang thai sau khi chuyen type
    }

    private void setIconMenu()
    {
        switch (mCurrentTyPeDisPlay){
            case User.TYPE_GRID:
                mMenu.getItem(0).setIcon(R.drawable.ic_grid);
                break;
            case User.TYPE_LIST:
                mMenu.getItem(0).setIcon(R.drawable.ic_list);
                break;
            case User.TYPE_STAGGER:
                mMenu.getItem(0).setIcon(R.drawable.ic_sole_24);
                break;
        }

    }

    private void setmCurrentPosition()//ham luu trang thai hien thi khi chuyen kieu hien thi trong reclerview
    {
        RecyclerView.LayoutManager layoutManager =recyclerView.getLayoutManager();
        switch (mCurrentTyPeDisPlay){
            case User.TYPE_GRID:
                mCurrentPosition=((GridLayoutManager)layoutManager).findFirstVisibleItemPosition();//tim den position dau tien ma ng dung thay
                break;
            case User.TYPE_LIST:
                mCurrentPosition=((LinearLayoutManager)layoutManager).findFirstVisibleItemPosition();//tim den position dau tien ma ng dung thay
                break;
            case User.TYPE_STAGGER:
                int [] tempposition=null;
                tempposition=((StaggeredGridLayoutManager)layoutManager).findFirstVisibleItemPositions(tempposition);//tim den position dau tien ma ng dung thay
                mCurrentPosition=tempposition[0];
                break;
        }
    }

    private List<User> getListUser()
    {
          List<User> list =new ArrayList<>();

          list.add(new User(R.drawable.anh1,"H?? anh1"));
          list.add(new User(R.drawable.anh2,"H?? anh2"));
          list.add(new User(R.drawable.anh3,"H?? anh3"));
          list.add(new User(R.drawable.anh4,"H?? anh4"));

          list.add(new User(R.drawable.anh1,"H?? anh5"));
          list.add(new User(R.drawable.anh3,"H?? anh6"));
          list.add(new User(R.drawable.anh2,"H?? anh7"));
          list.add(new User(R.drawable.anh4,"H?? anh8"));

          list.add(new User(R.drawable.anh1,"H?? anh9"));
          list.add(new User(R.drawable.anh4,"H?? anh10"));
          list.add(new User(R.drawable.anh3,"H?? anh11"));
          list.add(new User(R.drawable.anh2,"H?? anh12"));


          list.add(new User(R.drawable.anh4,"H?? anh13"));
          list.add(new User(R.drawable.anh2,"H?? anh14"));
          list.add(new User(R.drawable.anh3,"H?? anh15"));
          list.add(new User(R.drawable.anh1,"H?? anh16"));

          list.add(new User(R.drawable.anh4,"H?? anh17"));
          list.add(new User(R.drawable.anh2,"H?? anh18"));
          list.add(new User(R.drawable.anh3,"H?? anh19"));
          list.add(new User(R.drawable.anh1,"H?? anh20"));


          list.add(new User(R.drawable.anh4,"H?? anh21"));
          list.add(new User(R.drawable.anh2,"H?? anh22"));
          list.add(new User(R.drawable.anh3,"H?? anh23"));
          list.add(new User(R.drawable.anh1,"H?? anh24"));


          list.add(new User(R.drawable.anh4,"H?? anh25"));
          list.add(new User(R.drawable.anh2,"H?? anh26"));
          list.add(new User(R.drawable.anh3,"H?? anh27"));
          list.add(new User(R.drawable.anh1,"H?? anh28"));

          list.add(new User(R.drawable.anh4,"H?? anh29"));
          list.add(new User(R.drawable.anh2,"H?? anh30"));
          list.add(new User(R.drawable.anh3,"H?? anh31"));
          list.add(new User(R.drawable.anh1,"H?? anh32"));

          list.add(new User(R.drawable.anh4,"H?? anh33"));
          list.add(new User(R.drawable.anh2,"H?? anh34"));
          list.add(new User(R.drawable.anh3,"H?? anh35"));
          list.add(new User(R.drawable.anh1,"H?? anh36"));

          list.add(new User(R.drawable.anh4,"H?? anh37"));
          list.add(new User(R.drawable.anh2,"H?? anh38"));
          list.add(new User(R.drawable.anh3,"H?? anh39"));
          list.add(new User(R.drawable.anh1,"H?? anh40"));
          list.add(new User(R.drawable.anh3,"H?? anh41"));
          list.add(new User(R.drawable.anh1,"H?? anh42"));

        return list;
    }
}