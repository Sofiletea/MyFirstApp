package com.example.helloworld

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.helloworld.databinding.ActivityMainBinding
import com.example.helloworld.databinding.Test2Binding

class MainActivity : AppCompatActivity() {

lateinit var bindingClass : ActivityMainBinding


    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

bindingClass.btResult.setOnClickListener {
    val resultValue  = bindingClass.edValut.text.toString().toInt()
    when(resultValue){
        in 0..1000->{
            bindingClass.tvResult.visibility= View.VISIBLE
            bindingClass.tvResult.text = "Вы в начале пути!"
        }
        in 1000..100000->{
            bindingClass.tvResult.visibility= View.VISIBLE
            bindingClass.tvResult.text = "Вы уже популярны!"
        }
        else ->{
            bindingClass.tvResult.visibility= View.VISIBLE
            bindingClass.tvResult.text = "Вы звезда!"
        }
    }
}


}
        }







