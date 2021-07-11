package by.svetlana.project.telegram.ui.fragment

import androidx.fragment.app.Fragment
import by.svetlana.project.telegram.R
import kotlinx.android.synthetic.main.fragment_enter_code.register_text_we_sent

class EnterCodeFragment : Fragment(R.layout.fragment_enter_code) {

    override fun onStart() {
        super.onStart()
        register_text_we_sent
    }

}