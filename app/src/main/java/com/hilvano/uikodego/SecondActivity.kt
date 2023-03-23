package com.hilvano.uikodego

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.hilvano.uikodego.databinding.ActivitySecondBinding


class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        signInButton()

        val signInButton = getString(R.string.already_have_an_account_sign_in)
        val spannableString = SpannableString(signInButton)

        val startIndex = signInButton.indexOf("Sign")
        val endIndex = startIndex + "In".length

        spannableString.setSpan(object : ClickableSpan() {
            override fun onClick(widget: View) {
                val intent = Intent(this@SecondActivity, SignInActivity::class.java)
                ContextCompat.startActivity(this@SecondActivity, intent, null)
            }
        }, startIndex, endIndex, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        val myTextView = findViewById<TextView>(R.id.sign_in_button)
        myTextView?.text = spannableString
        myTextView?.movementMethod = LinkMovementMethod.getInstance()
    }
    private fun signInButton() {
        binding.signInButton.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}