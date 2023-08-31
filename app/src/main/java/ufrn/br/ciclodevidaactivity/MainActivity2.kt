package ufrn.br.ciclodevidaactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("Aula", "onCreate()")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intent = intent

        val texto:String = intent.getStringExtra("texto")?:""

        val textView = findViewById<TextView>(R.id.texto)
        textView.text = texto
    }
}