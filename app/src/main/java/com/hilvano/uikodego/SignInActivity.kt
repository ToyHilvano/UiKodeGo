package com.hilvano.uikodego

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hilvano.uikodego.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        forgotPassword()
        signUpButton()
        signInButton()
    }

    private fun forgotPassword() {
        binding.forgotPassword.setOnClickListener {
            val intent = Intent(this, ForgotPassword::class.java)
            startActivity(intent)
        }
    }
    private fun signUpButton() {
        binding.signUpButton.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
    private fun signInButton() {
        binding.signInButton.setOnClickListener {
            val intent = Intent(this, SignInSuccess::class.java)
            startActivity(intent)
        }
    }
}