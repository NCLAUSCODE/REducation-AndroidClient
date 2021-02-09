package com.nclaus.code.reducation.ui.fragments

import android.view.Menu
import android.view.MenuInflater
import com.nclaus.code.reducation.R

class SettingsFragment : BaseFragment(R.layout.fragment_settings) {

    override fun onResume() {
        super.onResume()
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        activity?.menuInflater?.inflate(R.menu.settings_action_menu, menu)
    }
}