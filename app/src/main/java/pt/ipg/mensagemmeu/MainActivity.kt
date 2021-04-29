package pt.ipg.mensagemmeu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    companion object{
        public val INFO_EXTRA_NOME :String = "NOME"
        public val INFO_EXTRA_EMAIL :String = "EMAIL"
        public val INFO_EXTRA_TELE :String = "TELE"
        public val INFO_EXTRA_IDADE :String = "IDADE"

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviaMensagem(view: View){
        //obter a mensagem
        val textInputEditNome = findViewById<EditText>(R.id.TextInputEditNome)
        val nome = textInputEditNome.text.toString()
        if(nome.isBlank()){
            textInputEditNome.error = "Preencha este campo"

            return
        }

        val textInputEditEmail = findViewById<EditText>(R.id.TextInputEditEmail)
        val email = textInputEditEmail.text.toString()
        if(email.isBlank()){
            textInputEditEmail.error = "Preencha este campo"

            return
        }


        val textInputEditTele = findViewById<EditText>(R.id.TextInputEditTele)
        val tele = textInputEditTele.text.toString()
        if(tele.isBlank()){
            textInputEditTele.error = "Preencha este campo"

            return
        }


        val textInputEditIdade = findViewById<EditText>(R.id.TextInputEditIdade)
        val idade = textInputEditIdade.text.toString()
        if(idade.isBlank()){
            textInputEditIdade.error = "Preencha este campo"

            return
        }

        //passar entre atividades
        val intent = Intent(this,MostrarActivity::class.java)
        intent.putExtra(INFO_EXTRA_NOME,nome)
        intent.putExtra(INFO_EXTRA_EMAIL,email)
        intent.putExtra(INFO_EXTRA_TELE,tele)
        intent.putExtra(INFO_EXTRA_IDADE,idade)

        startActivity(intent)
    }
}