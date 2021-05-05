package pt.ipg.mensagemmeu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MostrarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar)

        val nome = intent.getStringExtra(MainActivity.INFO_EXTRA_NOME)
        findViewById<TextView>(R.id.textViewNome).text = nome


        val email = intent.getStringExtra(MainActivity.INFO_EXTRA_EMAIL)
        findViewById<TextView>(R.id.textViewEmail).text = email


        val tele = intent.getStringExtra(MainActivity.INFO_EXTRA_TELE)
        findViewById<TextView>(R.id.textViewTele).text = tele


        val idade = intent.getIntExtra(MainActivity.INFO_EXTRA_IDADE,0)
        findViewById<TextView>(R.id.textViewIdade).text = idade.toString()

    }

}