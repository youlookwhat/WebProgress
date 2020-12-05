package me.jingbin.webprogress

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        progress.setColor(getCompatColor(R.color.colorAccent))
        progress.show()
        progress.postDelayed({ progress.hide() }, 2000)
        progressShader.setColor(getCompatColor(R.color.colorAccentTranslate), getCompatColor(R.color.colorAccent))
        progressShader.show()
        progressShader.postDelayed({ progressShader.hide() }, 2000)


        progress2.show()
        progress2.postDelayed({ progress2.hide() }, 4000)
        progressShader2.show()
        progressShader2.setColor("#002483D9", "#2483D9")
        progressShader2.postDelayed({ progressShader2.hide() }, 4000)


        progress3.setColor("#1aad19")
        progress3.show()
        progress3.postDelayed({ progress3.hide() }, 6000)
        progressShader3.setColor("#001aad19", "#1aad19")
        progressShader3.show()
        progressShader3.postDelayed({ progressShader3.hide() }, 6000)


        progress4.show()
        progress4.postDelayed({ progress4.hide() }, 10000)
        progressShader4.show()
        progressShader4.setColor("#002483D9", "#2483D9")
        progressShader4.postDelayed({ progressShader4.hide() }, 10000)
    }

    private fun getCompatColor(id: Int): Int {
        return ContextCompat.getColor(this, id)
    }
}
