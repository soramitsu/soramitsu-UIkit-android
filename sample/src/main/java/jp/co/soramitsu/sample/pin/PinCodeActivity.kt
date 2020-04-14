package jp.co.soramitsu.sample.pin

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import jp.co.soramitsu.sample.R
import kotlinx.android.synthetic.main.activity_pin_code.*

class PinCodeActivity : AppCompatActivity() {

    companion object {

        fun start(context: Context) {
            val intent = Intent(context, PinCodeActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pin_code)

        pinCodeView.changeDeleteButtonVisibility(true)
        pinCodeView.changeFingerPrintButtonVisibility(true)
    }
}