package info.nagarajn.kotlinapp

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        showListView()
    }

    private fun showListView() {
        var language:Array<String> = resources.getStringArray(R.array.technology_list)
        val arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,language)
        val listView = findViewById<ListView>(R.id.list_view)
        listView.adapter = arrayAdapter
    }

    fun display () {
        Toast.makeText(
            this,
            this.intent.getStringExtra("sample"), Toast.LENGTH_SHORT
        ).show()

        val builder = AlertDialog.Builder(this)
        builder.setMessage("alert dialog")

        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
}
