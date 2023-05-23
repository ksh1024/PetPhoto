package kr.hs.emirim.sohee.petphoto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var checkstart:Switch
    lateinit var rg:RadioGroup
    lateinit var linear:LinearLayout
    lateinit var imgv:ImageView
    lateinit var btnFinish:Button
    lateinit var btnFirst:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        checkstart = findViewById(R.id.check_start)
        rg = findViewById(R.id.rg)
        linear = findViewById(R.id.linear)
        imgv = findViewById(R.id.imgv)
        btnFinish = findViewById(R.id.btn_finish)
        btnFirst = findViewById(R.id.btn_first)
        btnFinish = findViewById(R.id.btn_finish)
        linear.visibility = View.INVISIBLE

        checkstart.setOnCheckedChangeListener { compoundButton, b ->
            if (checkstart.isChecked) {
                linear.visibility = View.VISIBLE
            } else {
                linear.visibility = View.INVISIBLE
            }
        }

        rg.setOnCheckedChangeListener { compoundButton, b ->
            when (rg.checkedRadioButtonId) {
                R.id.radio_dog -> imgv.setImageResource(R.drawable.dog)
                R.id.radio_cat -> imgv.setImageResource(R.drawable.cat)
                R.id.radio_deer -> imgv.setImageResource(R.drawable.deer)
            }
        }
        btnFinish.setOnClickListener(btnListener)
        btnFirst.setOnClickListener(btnListener)
    }
        var btnListener=OnClickListener{
            when(it.id){
                R.id.btn_finish->finish()
                R.id.btn_first->{
                    linear.visibility=View.INVISIBLE
                    checkstart.isChecked=false
                }
            }
        }
    }

