package com.example.myapplication

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import android.graphics.Paint
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    private lateinit var usernameInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var loginBtn: MaterialButton
    private lateinit var themeToggleBtn: Button
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Recuperar preferências do usuário
        sharedPreferences = getSharedPreferences("settings", MODE_PRIVATE)
        val isDarkMode = sharedPreferences.getBoolean("dark_mode", false)

        // Aplicar o tema salvo
        if (isDarkMode) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }

        setContentView(R.layout.activity_main)

        usernameInput = findViewById(R.id.username_input)
        passwordInput = findViewById(R.id.password_input)
        loginBtn = findViewById(R.id.login_btn)
        themeToggleBtn = findViewById(R.id.theme_toggle_btn)

        updateThemeButtonText(isDarkMode)

        // Alternar entre modo claro e escuro ao clicar no botão
        themeToggleBtn.setOnClickListener {
            val newMode = !sharedPreferences.getBoolean("dark_mode", false)

            // Salvar a nova configuração
            sharedPreferences.edit().putBoolean("dark_mode", newMode).apply()

            // Aplicar o novo tema
            if (newMode) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }

            // Atualizar o texto do botão
            updateThemeButtonText(newMode)
        }

        loginBtn.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()

            Log.i("Login Test", "Username: $username, Password: $password")

            if (username == "admin" && password == "1234") {
                val intent = Intent(this, SplashScreenActivity::class.java)
                startActivity(intent)
                //finish()
            } else {
                Toast.makeText(this, "User or password incorrect!", Toast.LENGTH_SHORT).show()
            }
        }

        val createAccountTextView = findViewById<TextView>(R.id.create_account)
        createAccountTextView.paintFlags = createAccountTextView.paintFlags or Paint.UNDERLINE_TEXT_FLAG

        createAccountTextView.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

    private fun updateThemeButtonText(isDarkMode: Boolean) {
        themeToggleBtn.text = if (isDarkMode) "Desativar Modo Noturno" else "Ativar Modo Noturno"
    }
}
