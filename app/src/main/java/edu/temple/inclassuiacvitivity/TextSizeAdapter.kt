package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter (private val c: Context, private val items: Array<Int>): BaseAdapter() {


    override fun getCount() = items.size

    override fun getItem(position: Int) = items[position]

    override fun getItemId(position: Int) = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?) =
        if (convertView == null){
            TextView(c)
        } else{
            convertView as TextView
        }.apply {
            text = items[position].toString()
            textSize = 22f
        }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?) =
        getView(position, convertView, parent).apply{ textSize = items[position].toFloat() }

}