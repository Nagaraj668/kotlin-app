package info.nagarajn.kotlinapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Toast.makeText(
            this,
            this.intent.getStringExtra("sample"), Toast.LENGTH_SHORT
        ).show()
    }
}