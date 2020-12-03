package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doOnTextChanged

class EnterTitleAndNotesActivity : AppCompatActivity() {

   lateinit var mContentEt:EditText
   lateinit var mTitleEt:EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.enter_title_and_notes_activity)

       mContentEt   =   findViewById(R.id.id_content_et)

        mTitleEt    =   findViewById(R.id.id_title_et)

        mContentEt.doOnTextChanged { text, start, before, count ->  }


        mTitleEt.doOnTextChanged { text, start, before, count ->  }



    }
}