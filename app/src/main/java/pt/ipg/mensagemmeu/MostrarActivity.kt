package pt.ipg.mensagemmeu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MostrarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar)

        val nome = intent.getStringExtra(MainActivity.INFO_EXTRA_NOME)
        val textViewNome = findViewById<TextView>(R.id.textViewNome)
        textViewNome.setText(nome)
        val email = intent.getStringExtra(MainActivity.INFO_EXTRA_EMAIL)
        val textViewEmail = findViewById<TextView>(R.id.textViewEmail)
        textViewEmail.setText(email)
        val tele = intent.getStringExtra(MainActivity.INFO_EXTRA_TELE)
        val textViewTele = findViewById<TextView>(R.id.textViewTele)
        textViewTele.setText(tele)
        val idade = intent.getStringExtra(MainActivity.INFO_EXTRA_IDADE)
        val textViewIdade = findViewById<TextView>(R.id.textViewIdade)
        textViewIdade.setText(idade)
    }

}