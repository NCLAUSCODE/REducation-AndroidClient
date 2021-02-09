package com.nclaus.code.reducation.ui.fragments

import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.nclaus.code.reducation.R
import kotlinx.android.synthetic.main.fragment_enter_code.*

class EnterCodeFragment : Fragment(R.layout.fragment_enter_code) {
    override fun onStart() {
        super.onStart()
        register_enterCode.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                val string = register_enterCode.text.toString()
                if (string.length == 6) {
                    verificationCode()
                }
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                // TODO
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                // TODO
            }
        })
    }

    private fun verificationCode() {
        Toast.makeText(activity, "Дальше типо проверка...", Toast.LENGTH_SHORT).show()
    }
}