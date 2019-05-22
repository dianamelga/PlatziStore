package com.platzi.platzistore

import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import org.jetbrains.anko.*
import org.jetbrains.anko.cardview.v7.cardView

class ItemList : AnkoComponent<AdapterLanding> {
    override fun createView(ui: AnkoContext<AdapterLanding>): View =
            with(ui) {
                verticalLayout {
                    lparams(width = matchParent, height = wrapContent)
                    cardView {
                        linearLayout {
                            orientation = LinearLayout.HORIZONTAL
                            lparams(width = matchParent)

                            imageView(R.mipmap.ic_launcher) {
                                id = R.id.imgItem
                                scaleType = ImageView.ScaleType.CENTER_CROP
                            }.lparams(width = dip(0), height = dip(100), weight = 1f)

                            linearLayout{
                                padding = dip(5)
                                orientation = LinearLayout.VERTICAL
                                textView("Titulo") {
                                    id = R.id.txtTitleItem
                                    setTextAppearance(ctx, android.R.style.TextAppearance_Material_Large)
                                }
                                textView("Descripcion") {
                                    id = R.id.txtDescItem
                                    setTextAppearance(ctx, android.R.style.TextAppearance_Material_Small)
                                }
                                textView("Precio") {
                                    id = R.id.txtPriceItem
                                    setTextAppearance(ctx, android.R.style.TextAppearance_Material_Medium)
                                    textColor = resources.getColor(R.color.colorAccent)
                                }.lparams{
                                    topMargin = dip(5)
                                    gravity = Gravity.END
                                }
                            }
                        }
                    }
                }
            }
}