package ufrn.br.ciclodevidaactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("Aula", "onCreate()")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val editText = findViewById<EditText>(R.id.editText)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val textoEditText:String = editText.text.toString()

            val i = Intent(this, MainActivity2::class.java)
            i.putExtra("texto", textoEditText)

            startActivity(i)
        }

    }
}