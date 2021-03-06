package com.example.kotlinsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.* // findViewById() 함수를 사용하지 않도록 함

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // button1이 클릭된 경우의 이벤트 리스너 설정
        button1.setOnClickListener {
            // Intent로 BmiJavaActivity를 타겟으로 지정하고 startActivity로 실행
            startActivity(Intent(this@MainActivity, BmiJavaActivity::class.java))
        }

        // button2가 클릭된 경우의 이벤트 리스너 설정
        button2.setOnClickListener {
            // Intent로 BmiKotlinActivity를 타겟으로 지정하고 startActivity로 실행
            startActivity(Intent(this@MainActivity, BmiKotlinActivity::class.java))
        }

        // button3이 클릭된 경우의 이벤트 리스너 설정
        button3.setOnClickListener {
            // Intent로 VariableJavaActivity를 타겟으로 지정하고 startActivity로 실행
            startActivity(Intent(this@MainActivity, VariableJavaActivity::class.java))
        }

        // button2가 클릭된 경우의 이벤트 리스너 설정
        button4.setOnClickListener {
            // Intent로 VariableKotlinActivity를 타겟으로 지정하고 startActivity로 실행
            startActivity(Intent(this@MainActivity, VariableKotlinActivity::class.java))
        }

        // button5가 클릭된 경우의 이벤트 리스너 설정
        button5.setOnClickListener {
            // Intent로 ControlJavaActivity를 타겟으로 지정하고 startActivity로 실행
            startActivity(Intent(this@MainActivity, ControlJavaActivity::class.java))
        }

        // button6이 클릭된 경우의 이벤트 리스너 설정
        button6.setOnClickListener {
            // Intent로 ControlKotlinActivity를 타겟으로 지정하고 startActivity로 실행
            startActivity(Intent(this@MainActivity, ControlKotlinActivity::class.java))
        }

    }
}
