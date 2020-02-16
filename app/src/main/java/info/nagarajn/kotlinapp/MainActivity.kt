package info.nagarajn.kotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun shareText(view: View) {
        /*val sendIntent = Intent().apply {
            action = Intent.ACTION_SEND
            type = "text/plain"
            putExtra(Intent.EXTRA_TEXT, "Hello world")
        }
        startActivity(sendIntent)*/

        val intent: Intent = Intent(this, SecondActivity::class.java).apply {
            putExtra("sample", "values")
        }
        startActivity(intent)
    }
}
