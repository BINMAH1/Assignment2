package com.example.test2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.view.MenuInflater as MenuInflater1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ratingTV: Button = findViewById(R.id.TVrate)
        val button : Button = findViewById(R.id.Resultbt)
        var num1 : EditText = findViewById(R.id.number1)
        var num2 : EditText = findViewById(R.id.number2)
        var Tv : TextView = findViewById(R.id.sum)
        var flag : String = "Multi"

        button.setOnClickListener {

        var x : Int = num1.text.toString().toInt()
            var y : Int = num2.text.toString().toInt()

           if(flag == "Add")
        Tv.text = sum(x,y).toString();
        else if(flag == "Multi")
            Tv.text = Multi(x,y).toString();
           else if(flag == "Sub")
               Tv.text = Sub(x,y).toString();
           else if(flag == "Div")
               Tv.text = Div(x,y).toString();
        }


        ratingTV.setOnClickListener {
            var dialog_var = CustomDialogFragment()
            dialog_var.show(supportFragmentManager, "Custom Dialog")
        }

    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.my_first_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {

            R.id.item1 -> Toast.makeText(this, "Addition ", Toast.LENGTH_SHORT).show()
            R.id.item2 -> Toast.makeText(this, "Division", Toast.LENGTH_SHORT).show()
            R.id.item3 -> Toast.makeText(this, "Multiplication", Toast.LENGTH_SHORT).show()
            R.id.item4 -> Toast.makeText(this, "Subtraction", Toast.LENGTH_SHORT).show()

        }
        return true;
    }


    @SuppressLint("WrongViewCast")
    fun receiveFeedback(feedback: String) {
        val ratingTV: TextView = findViewById(R.id.rating)
        ratingTV.text = feedback;
    }


    public fun sum(a: Int, b: Int): Int {
        return a + b;
    }

    public fun Multi(a: Int, b: Int): Int {
        return a * b;
    }

    public fun Div(a: Int, b: Int): Int {
        return a / b;
    }


    public fun Sub(a: Int, b: Int): Int {
        return a - b;
    }
}