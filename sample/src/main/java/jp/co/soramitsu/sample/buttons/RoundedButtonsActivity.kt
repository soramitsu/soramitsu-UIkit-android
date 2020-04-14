package jp.co.soramitsu.sample.buttons

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import jp.co.soramitsu.sample.R
import kotlinx.android.synthetic.main.activity_buttons_rounded.toolbar

class RoundedButtonsActivity : AppCompatActivity() {

    companion object {

        fun start(context: Context) {
            val intent = Intent(context, RoundedButtonsActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buttons_rounded)

        toolbar.setHomeButtonListener { finish() }
        toolbar.hideHomeButton()
    }
}