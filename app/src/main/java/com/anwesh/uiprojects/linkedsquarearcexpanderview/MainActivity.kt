package com.anwesh.uiprojects.linkedsquarearcexpanderview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.squareexpanderview.SquareArcExpanderView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SquareArcExpanderView.create(this)
    }
}
