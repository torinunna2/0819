package com.nepplus.a0819

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveToTextViewBtn.setOnClickListener {

//            입력한 메세지를 -> 변수에 저장해서 -> 텍스트뷰의 -> text 속성으로 대입

            val inputMessage = messageEdt.text.toString()

            resultText.text = inputMessage

        }


 toastBtn.setOnClickListener {

     //     입력한 메세지가 무너지? 변수에 저장.
//         messageEdtdml text속성에 담겨있는 값을 => inputmessage 변수에 담자.

     val inputMessage = messageEdt.text.toString()


//     토스트로 inputmessage를 띄워주자.

     Toast.makeText(this, inputMessage, Toast.LENGTH_SHORT).show()
 }




    }
}