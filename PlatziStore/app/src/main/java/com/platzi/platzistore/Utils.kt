package com.platzi.platzistore

import android.app.Activity
import android.widget.Toast

fun Activity.toastLong(mensaje:String){

    Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()

}

fun Activity.toastShort(mensaje:String){

    Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()

}