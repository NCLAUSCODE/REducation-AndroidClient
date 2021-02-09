package com.nclaus.code.reducation.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.nclaus.code.reducation.R
import com.nclaus.code.reducation.databinding.ActivityRegisterBinding
import com.nclaus.code.reducation.ui.fragments.EnterPhoneFragment

class RegisterActivity : AppCompatActivity() {
    private lateinit var mBinder: ActivityRegisterBinding
    private lateinit var mToolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinder = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(mBinder.root)
    }

    override fun onStart() {
        super.onStart()
        mToolbar = mBinder.registerToolbar
        setSupportActionBar(mToolbar)
        title = ""
        supportFragmentManager.beginTransaction()
            .add(R.id.registerDataContainer, EnterPhoneFragment())
            .commit()
    }
}