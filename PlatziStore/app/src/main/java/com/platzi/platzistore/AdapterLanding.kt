package com.platzi.platzistore

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_landing.view.*
import org.jetbrains.anko.AnkoContext

class AdapterLanding(val data: List<ItemLanding>): RecyclerView.Adapter<AdapterLanding.Holder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder =
        //Holder(parent.inflate(R.layout.item_landing))
        Holder(ItemList().createView(AnkoContext.Companion.create(parent.context, this, false)))


    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindView(data[position])
    }

    override fun getItemCount(): Int = data.size


    class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val txtViewTitle by lazy {

        }
        fun bindView(itemLanding: ItemLanding) {
            /* sin ankoLayouts
            with(itemLanding) {
                itemView.textTitle.text = title
                itemView.textDesc.text = desc
                itemView.textPrice.text = "${String.format("%.2f", price)}"
            }
            */


        }
    }
}