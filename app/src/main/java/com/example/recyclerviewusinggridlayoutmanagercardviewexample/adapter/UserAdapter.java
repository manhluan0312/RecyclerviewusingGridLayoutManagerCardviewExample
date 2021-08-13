package com.example.recyclerviewusinggridlayoutmanagercardviewexample.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewusinggridlayoutmanagercardviewexample.R;
import com.example.recyclerviewusinggridlayoutmanagercardviewexample.model.User;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder>
    {

        private final List<User> mListUser;

        public UserAdapter(List<User> mListUser) {
            this.mListUser = mListUser;
        }

        @Override
        //ham quy dinh type hien thi
        public int getItemViewType(int position) {
            User user=mListUser.get(position);
            return user.getTypeDisplay();
        }

        @Override
        public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
        {
            View view =null;

            switch (viewType)
            {
                case User.TYPE_GRID:
                    view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user_grid,parent,false);
                    break;

                case User.TYPE_LIST:
                    view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user_list,parent,false);
                    break;

                case User.TYPE_STAGGER:
                    view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user_stagger,parent,false);
                    break;

            }
            return new UserViewHolder(view);
        }

        @Override
        public void onBindViewHolder(UserAdapter.UserViewHolder holder, int position)
        {
               User user =mListUser.get(position);
               if(user==null){
                   return;
               }
               holder.img.setImageResource(user.getRe_image());
               holder.tv_ten.setText(user.getName());
        }

        @Override
        public int getItemCount() {
            if(mListUser!=null)
            {
                return mListUser.size();
            }
            return 0;
        }

        public static class UserViewHolder extends RecyclerView.ViewHolder {

            private final ImageView img;
            private final TextView tv_ten;

            public UserViewHolder(View itemView) {

                super(itemView);
                img = itemView.findViewById(R.id.img_user);
                tv_ten = itemView.findViewById(R.id.tv_name);
            }
        }
    }
