package by.svetlana.project.telegram.ui.fragment

import android.view.Menu
import android.view.MenuInflater
import androidx.fragment.app.Fragment
import by.svetlana.project.telegram.R

class SettingsFragment : Fragment(R.layout.fragment_settings) {

    override fun onResume() {
        super.onResume()
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        activity?.menuInflater?.inflate(R.menu.settings_action_menu, menu)
    }

}