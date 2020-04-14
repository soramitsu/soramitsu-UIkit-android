package jp.co.soramitsu.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jp.co.soramitsu.sample.buttons.RoundedButtonsActivity
import jp.co.soramitsu.sample.loading.LoadingActivity
import jp.co.soramitsu.sample.pin.PinCodeActivity
import jp.co.soramitsu.sample.text.TextsActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonsTv.setOnClickListener {
            RoundedButtonsActivity.start(this)
        }

        textsTv.setOnClickListener {
            TextsActivity.start(this)
        }

        pinCodeTv.setOnClickListener {
            PinCodeActivity.start(this)
        }

        loadingViewTv.setOnClickListener {
            LoadingActivity.start(this)
        }
    }
}
