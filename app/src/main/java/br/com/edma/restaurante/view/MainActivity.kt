package br.com.edma.restaurante.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import br.com.edma.restaurante.R
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {


    private val btnLogin by lazy { findViewById<Button>(R.id.btn_login) }
    private val btnRegister by lazy { findViewById<Button>(R.id.btn_register_login) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)

        }


        btnRegister.setOnClickListener{
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

    }

}