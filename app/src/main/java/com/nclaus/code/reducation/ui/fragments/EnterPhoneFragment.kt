package com.nclaus.code.reducation.ui.fragments

import android.widget.Toast
import androidx.fragment.app.Fragment
import com.nclaus.code.reducation.R
import kotlinx.android.synthetic.main.fragment_enter_phone.*

class EnterPhoneFragment : Fragment(R.layout.fragment_enter_phone) {
    override fun onStart() {
        super.onStart()
        register_btn_next.setOnClickListener { sendCode() }
    }

    private fun sendCode() {
        if (register_phoneNumber.text.toString().isEmpty()) {
            Toast.makeText(activity, "Введите номер телефона", Toast.LENGTH_SHORT).show()
            return
        }
        fragmentManager?.beginTransaction()
            ?.replace(R.id.registerDataContainer, EnterCodeFragment())
            ?.addToBackStack(null)
            ?.commit()
    }
}