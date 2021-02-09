package com.nclaus.code.reducation.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nclaus.code.reducation.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var mBinder: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinder = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(mBinder.root)
    }
}