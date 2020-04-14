package jp.co.soramitsu.sora_ui.controls

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.widget.Toolbar
import jp.co.soramitsu.sora_ui.R
import kotlinx.android.synthetic.main.tool_bar_default.view.homeImg
import kotlinx.android.synthetic.main.tool_bar_default.view.titleTv

class DefaultToolbar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : Toolbar(context, attrs, defStyleAttr) {

    enum class HomeMode {
        BACK,
        CLOSE
    }

    init {
        View.inflate(context, R.layout.tool_bar_default, this)

        applyAttributes(attrs)
    }

    private fun applyAttributes(attrs: AttributeSet?) {
        attrs?.let {
            val typedArray = context.obtainStyledAttributes(attrs, R.styleable.DefaultToolbar)
            val title = typedArray.getString(R.styleable.DefaultToolbar_title)
            titleTv.text = title

            val mode = HomeMode.values()[typedArray.getInt(R.styleable.DefaultToolbar_homeMode, 0)]
            val homeIconRes = when (mode) {
                HomeMode.BACK -> R.drawable.ic_arrow_back
                HomeMode.CLOSE -> R.drawable.ic_close
            }
            homeImg.setImageResource(homeIconRes)

            typedArray.recycle()
        }
    }

    fun setTitle(title: String) {
        titleTv.text = title
    }

    fun setHomeButtonListener(listener: (View) -> Unit) {
        homeImg.setOnClickListener(listener)
    }

    fun showHomeButton() {
        homeImg.visibility = View.VISIBLE
    }

    fun hideHomeButton() {
        homeImg.visibility = View.GONE
    }
}