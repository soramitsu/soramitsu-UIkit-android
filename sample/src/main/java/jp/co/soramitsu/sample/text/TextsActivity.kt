package jp.co.soramitsu.sample.text

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import jp.co.soramitsu.sample.R
import kotlinx.android.synthetic.main.activity_texts.toolbar

class TextsActivity : AppCompatActivity() {

    companion object {

        fun start(context: Context) {
            val intent = Intent(context, TextsActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_texts)

        toolbar.setHomeButtonListener { finish() }
    }
}