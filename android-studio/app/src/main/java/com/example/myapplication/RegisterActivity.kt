package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    private lateinit var usernameInput: EditText
    private lateinit var emailInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var confirmPasswordInput: EditText
    private lateinit var registerBtn: Button
    private lateinit var loginTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        Log.i("RegisterActivity", "Tela de cadastro iniciada")

        usernameInput = findViewById(R.id.username_input)
        emailInput = findViewById(R.id.email_input)
        passwordInput = findViewById(R.id.password_input)
        confirmPasswordInput = findViewById(R.id.confirm_password_input)
        registerBtn = findViewById(R.id.register_btn)
        loginTextView = findViewById(R.id.tv_login)

        registerBtn.setOnClickListener {
            val username = usernameInput.text.toString().trim()
            val email = emailInput.text.toString().trim()
            val password = passwordInput.text.toString()
            val confirmPassword = confirmPasswordInput.text.toString()

            Log.i("RegisterActivity", "Botão de registro clicado")
            Log.i("RegisterActivity", "Username: $username, Email: $email")

            if (username.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                Log.w("RegisterActivity", "Um ou mais campos estão vazios")
                Toast.makeText(this, "Fill in all fields!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (password != confirmPassword) {
                Log.w("RegisterActivity", "Senhas não coincidem")
                Toast.makeText(this, "Passwords do not match!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            Log.i("RegisterActivity", "Cadastro bem-sucedido!")
            Toast.makeText(this, "Account registered successfully!", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        loginTextView.setOnClickListener {
            Log.i("RegisterActivity", "Clicou em login, retornando para MainActivity")
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
