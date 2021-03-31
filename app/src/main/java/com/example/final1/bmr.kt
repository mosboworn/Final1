package com.example.final1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_bmr.*
import kotlinx.android.synthetic.main.activity_main.*


class bmr : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var men1=0
        var female1=0
        setContentView(R.layout.activity_bmr)
        men.setOnClickListener {
            men1=1
            female1=0
            Toast.makeText(this, "เลือกผู้ชาย", Toast.LENGTH_LONG).show()
        }
        female.setOnClickListener {
            female1=1
            men1=0
            Toast.makeText(this, "เลือกผู้หญิง", Toast.LENGTH_LONG).show()
        }
        pro2.setOnClickListener {
            if(men1==1){
                var bmr=66
                var bmr1=13.7
                var bmr2=5
                var bmr3=6.8
                var total = bmr+(bmr1*nn1.text.toString().toInt())+(bmr2*tt1.text.toString().toInt())-(bmr3-age1.text.toString().toInt())
                textView7.setText(total.toString())
            }
            else if(female1==1){
                var bmrr=66
                var bmrr1=13.7
                var bmrr2=5
                var bmrr3=6.8
                var total1 = bmrr+(bmrr1*nn1.text.toString().toInt())+(bmrr2*tt1.text.toString().toInt())-(bmrr3-age1.text.toString().toInt())
                textView7.setText(total1.toString())
            }

        }

    }
}