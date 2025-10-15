package com.example.radienceapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var confirmPasswordEditText: EditText
    private lateinit var signupButton: Button
    private lateinit var loginLink: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        // Initialize views
        usernameEditText = findViewById(R.id.username_input)
        emailEditText = findViewById(R.id.email_input)
        passwordEditText = findViewById(R.id.password_input)
        confirmPasswordEditText = findViewById(R.id.confirm_password_input)
        signupButton = findViewById(R.id.signup_button)
        loginLink = findViewById(R.id.login_link)

        // Signup button click
        signupButton.setOnClickListener {
            performSignup()
        }

        // Login link click
        loginLink.setOnClickListener {
            finish() // Back to login
        }
    }

    private fun performSignup() {
        val username = usernameEditText.text.toString().trim()
        val email = emailEditText.text.toString().trim()
        val password = passwordEditText.text.toString().trim()
        val confirmPassword = confirmPasswordEditText.text.toString().trim()

        if (username.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            return
        }

        if (password.length < 6) {
            passwordEditText.error = "Password must be at least 6 characters"
            return
        }

        if (password != confirmPassword) {
            confirmPasswordEditText.error = "Passwords do not match"
            return
        }

        Toast.makeText(this, "Account created successfully", Toast.LENGTH_SHORT).show()


        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}
