package com.hilvano.uikodego

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hilvano.uikodego.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        termsAndConditions()
        signUp()
        signIn()
    }
    private fun termsAndConditions() {
        binding.termsAndConditions.setOnClickListener {
            val intent = Intent(this, TermsAndCondiitions::class.java)
            startActivity(intent)
        }
    }
    private fun signUp() {
        binding.signMeUp.setOnClickListener {
            val intent = Intent(this, SignUpSuccess::class.java)
            startActivity(intent)
        }
    }
    private fun signIn() {
        binding.signInButton.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }

}