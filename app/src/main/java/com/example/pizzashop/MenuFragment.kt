package com.example.pizzashop

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class MenuFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        val view = inflater.inflate(R.layout.fragment_encrypt, container, false)
        val radioButton = view.findViewById<Button>(R.id.radioButton)
        val radioButton2 = view.findViewById<Button>(R.id.radioButton2)
        val radioButton3 = view.findViewById<Button>(R.id.radioButton3)
        val radioButton4 = view.findViewById<Button>(R.id.radioButton4)
        val checkBox = view.findViewById<Button>(R.id.checkBox)
        val checkBox2 = view.findViewById<Button>(R.id.checkBox2)
        val checkBox3 = view.findViewById<Button>(R.id.checkBox3)
        val checkBox4 = view.findViewById<Button>(R.id.checkBox4)
        val buttonAddToOrder = view.findViewById<Button>(R.id.buttonAddToOrder)
        val textView4 = view.findViewById<TextView>(R.id.textView4)
        val double1 = "9.99"
        val double2 = "6.99"
        val double3 = "3.99"
        val double4 = "1.99"
        val pizzaValue: Double = double1.toDouble()
        val wingsValue: Double = double2.toDouble()
        val sidesValue: Double = double3.toDouble()
        val drinksValue: Double = double4.toDouble()


        radioButton.setOnClickListener(){
            if(radioButton.isPressed){
                checkBox.text = "Pepperoni"
                checkBox2.text = "Cheese"
                checkBox3.text = "Combination"
                checkBox4.text = "Veggie"
                radioButton2.isEnabled = false
                radioButton3.isEnabled = false
                radioButton4.isEnabled = false
            }
        }

        radioButton2.setOnClickListener(){
            if(radioButton2.isPressed){
                checkBox.text = "Buffalo"
                checkBox2.text = "BBQ"
                checkBox3.text = "Garlic Parmesan"
                checkBox4.text = "Plain"
                radioButton.isEnabled = false
                radioButton3.isEnabled = false
                radioButton4.isEnabled = false
            }
        }

        radioButton3.setOnClickListener(){
            if(radioButton3.isPressed){
                checkBox.text = "BreadSticks"
                checkBox2.text = "Cheesy BreadSticks"
                checkBox3.text = "Garlic Knots"
                checkBox4.text = "Lava Cake"
                radioButton.isEnabled = false
                radioButton2.isEnabled = false
                radioButton4.isEnabled = false
            }
        }

        radioButton4.setOnClickListener(){
            if(radioButton4.isPressed){
                checkBox.text = "Coke"
                checkBox2.text = "Pepsi"
                checkBox3.text = "Rootbeer"
                checkBox4.text = "Sprite"
                radioButton.isEnabled = false
                radioButton2.isEnabled = false
                radioButton3.isEnabled = false
            }
        }

        buttonAddToOrder.setOnClickListener(){
            if(radioButton.isEnabled && checkBox.isEnabled or
                checkBox2.isEnabled or checkBox3.isEnabled or checkBox4.isEnabled){
                textView4.text = pizzaValue.toString()
                radioButton.isEnabled = true
                radioButton2.isEnabled = true
                radioButton3.isEnabled = true
                radioButton4.isEnabled = true
            }

            if(radioButton2.isEnabled && checkBox.isEnabled or
                checkBox2.isEnabled or checkBox3.isEnabled or checkBox4.isEnabled){
                textView4.text = wingsValue.toString()
                radioButton.isEnabled = true
                radioButton2.isEnabled = true
                radioButton3.isEnabled = true
                radioButton4.isEnabled = true
            }

            if(radioButton3.isEnabled && checkBox.isEnabled or
                checkBox2.isEnabled or checkBox3.isEnabled or checkBox4.isEnabled){
                textView4.text = sidesValue.toString()
                radioButton.isEnabled = true
                radioButton2.isEnabled = true
                radioButton3.isEnabled = true
                radioButton4.isEnabled = true
            }

            if(radioButton4.isEnabled && checkBox.isEnabled or
                checkBox2.isEnabled or checkBox3.isEnabled or checkBox4.isEnabled){
                textView4.text = drinksValue.toString()
                radioButton.isEnabled = true
                radioButton2.isEnabled = true
                radioButton3.isEnabled = true
                radioButton4.isEnabled = true
            }
        }
        return view
    }

}