package com.moldcoin.app

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(50, 100, 50, 50)
        }

        val title = TextView(this).apply {
            text = "MoldCoin Wallet"
            textSize = 24f
        }

        val balance = TextView(this).apply {
            text = "Balance: 0.00 moldcoin"
            textSize = 18f
            setPadding(0, 30, 0, 40)
        }

        val mineButton = Button(this).apply {
            text = "Mine MoldCoin"
            setOnClickListener {
                balance.text = "Balance: 10.00 moldcoin"
            }
        }

        layout.addView(title)
        layout.addView(balance)
        layout.addView(mineButton)

        setContentView(layout)
    }
}
