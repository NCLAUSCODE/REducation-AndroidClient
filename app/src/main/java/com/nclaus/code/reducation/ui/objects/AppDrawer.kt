package com.nclaus.code.reducation.ui.objects

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.mikepenz.materialdrawer.AccountHeader
import com.mikepenz.materialdrawer.AccountHeaderBuilder
import com.mikepenz.materialdrawer.Drawer
import com.mikepenz.materialdrawer.DrawerBuilder
import com.mikepenz.materialdrawer.model.DividerDrawerItem
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem
import com.mikepenz.materialdrawer.model.ProfileDrawerItem
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem
import com.nclaus.code.reducation.R
import com.nclaus.code.reducation.ui.fragments.ScheduleFragment
import com.nclaus.code.reducation.ui.fragments.SettingsFragment

class AppDrawer(private val mainActivity: AppCompatActivity, private val toolbar: Toolbar) {
    private lateinit var mDrawer: Drawer
    private lateinit var mHeader: AccountHeader

    fun create() {
        createHeader()
        createDrawer()
    }

    private fun createDrawer() {
        mDrawer = DrawerBuilder()
            .withActivity(mainActivity)
            .withToolbar(toolbar)
            .withActionBarDrawerToggle(true)
            .withSelectedItem(-1)
            .withAccountHeader(mHeader)
            .addDrawerItems(
                PrimaryDrawerItem()
                    .withIdentifier(1)
                    .withIconTintingEnabled(true)
                    .withName("Расписание")
                    .withIcon(R.drawable.ic_timetable)
                    .withSelectable(false),
                DividerDrawerItem(),
                PrimaryDrawerItem()
                    .withIdentifier(2)
                    .withIconTintingEnabled(true)
                    .withName("Редактировать профиль")
                    .withIcon(R.drawable.ic_pencil)
                    .withSelectable(false)
            )
            .withOnDrawerItemClickListener(object : Drawer.OnDrawerItemClickListener {
                override fun onItemClick(
                    view: View?,
                    position: Int,
                    drawerItem: IDrawerItem<*>
                ): Boolean {
                    when(drawerItem.identifier) {
                        1L -> mainActivity.supportFragmentManager
                            .beginTransaction()
                            .addToBackStack(null)
                            .replace(R.id.dataContainer, ScheduleFragment())
                            .commit()
                        2L -> mainActivity.supportFragmentManager
                            .beginTransaction()
                            .addToBackStack(null)
                            .replace(R.id.dataContainer, SettingsFragment())
                            .commit()
                    }
                    return false
                }
            })
            .build()
    }

    private fun createHeader() {
        mHeader = AccountHeaderBuilder()
            .withActivity(mainActivity)
            .withHeaderBackground(R.drawable.header)
            .addProfiles(
                ProfileDrawerItem()
                    .withName("Николай Матвеев")
                    .withEmail("nclaus.code@gmail.com")
            ).build()
    }

}