package com.example.foo

import android.app.Activity
import android.os.Bundle
import com.example.foo.R // ודא שזה נוסף אם חסר

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}


