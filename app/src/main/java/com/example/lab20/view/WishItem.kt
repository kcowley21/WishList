package com.example.lab20.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lab20.R
import com.example.lab20.model.ItemEnter

class WishItem (val c: Context, val userList:ArrayList<ItemEnter>) :RecyclerView.Adapter<WishItem.UserViewHolder>()
{
    inner class UserViewHolder(val v:View):RecyclerView.ViewHolder(v){
        val name = v.findViewById<TextView>(R.id.wList)
        val mbNum = v.findViewById<TextView>(R.id.wSubList)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val inflater = LayoutInflater.from(parent.context)
            val v = inflater.inflate(R.layout.wishlist_item,parent,)
            return UserViewHolder(v)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val newList = userList[position]
        holder.name.text = newList.userName
        holder.mbNum.text = newList.userChoice
    }

}