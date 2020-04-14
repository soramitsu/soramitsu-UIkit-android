package jp.co.soramitsu.sample.loading

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import jp.co.soramitsu.sample.R
import kotlinx.android.synthetic.main.activity_loading.toolbar

class LoadingActivity : AppCompatActivity() {

    companion object {

        fun start(context: Context) {
            val intent = Intent(context, LoadingActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading)

        toolbar.setHomeButtonListener { finish() }
    }
}