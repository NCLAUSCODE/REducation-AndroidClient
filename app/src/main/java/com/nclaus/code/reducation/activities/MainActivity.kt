package com.nclaus.code.reducation.activities

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.nclaus.code.reducation.R
import com.nclaus.code.reducation.databinding.ActivityMainBinding
import com.nclaus.code.reducation.ui.fragments.SettingsFragment
import com.nclaus.code.reducation.ui.objects.AppDrawer

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding
    private lateinit var mToolbar: Toolbar
    private lateinit var mAppDriver: AppDrawer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }

    override fun onStart() {
        super.onStart()
        initFields()
        initFunc()
    }

    private fun initFields() {
        mToolbar = mBinding.mainToolbar
        mAppDriver = AppDrawer(this, mToolbar)
    }

    @SuppressLint("ResourceAsColor")
    private fun initFunc() {
        if (false) {
            setSupportActionBar(mToolbar)
            mAppDriver.create()
            supportFragmentManager.beginTransaction()
                .replace(R.id.dataContainer, SettingsFragment())
                .commit()
        } else {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}