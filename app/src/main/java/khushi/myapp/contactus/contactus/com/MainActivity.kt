package khushi.myapp.contactus.contactus.com
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    fun sendMessage() {
        val editTextFirstName: EditText = findViewById<EditText>(R.id.editTextFirstName)
        val editTextLastName: EditText = findViewById<EditText>(R.id.editTextLastName)
        val editTextEmailAddress: EditText = findViewById<EditText>(R.id.editTextEmailAddress)
        val editTextSubject: EditText = findViewById<EditText>(R.id.editTextSubject)
        val editTextTextMultiLine: EditText = findViewById<EditText>(R.id.editTextTextMultiLine)
        val imageView7: ImageView = findViewById<ImageView>(R.id.imageView7)
        val imageView8: ImageView = findViewById<ImageView>(R.id.imageView8)
        val imageView9: ImageView = findViewById<ImageView>(R.id.imageView9)
        imageView7.setImageResource(R.drawable.download6)
        imageView8.setImageResource(R.drawable.stat_sys_phone_call)
        imageView9.setImageResource(R.drawable.ic_menu_mylocation)
        Log.i("Info", "Button pressed")
        Log.i("First Name", editTextFirstName.text.toString())
        Log.i("Last Name", editTextLastName.text.toString())
        Log.i("Email Address", editTextEmailAddress.text.toString())
        Log.i("Subject", editTextSubject.text.toString())
        Log.i("Your Message", editTextTextMultiLine.text.toString())
        Toast.makeText(this, "Message sent!", Toast.LENGTH_SHORT).show()
    }

    fun clickFunction() {
        val imageButton: ImageButton = findViewById<ImageButton>(R.id.imageButton)
        val imageButton2: ImageButton = findViewById<ImageButton>(R.id.imageButton2)
        val imageButton3: ImageButton = findViewById<ImageButton>(R.id.imageButton3)
        val imageButton8: ImageButton = findViewById<ImageButton>(R.id.imageButton8)

        imageButton.setOnClickListener {
            Toast.makeText(
                applicationContext,
                "Facebook Button",
                Toast.LENGTH_LONG
            ).show()
        }
        imageButton2.setOnClickListener {
            Toast.makeText(
                applicationContext,
                "Twitter Button",
                Toast.LENGTH_LONG
            ).show()
        }
        imageButton3.setOnClickListener {
            Toast.makeText(
                applicationContext,
                "Youtube Button",
                Toast.LENGTH_LONG
            ).show()
        }
        imageButton8.setOnClickListener {
            Toast.makeText(
                applicationContext,
                "Instagram Button",
                Toast.LENGTH_LONG
            ).show()
        }
    }

    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickFunction(view: View) {}
    fun sendMessage(view: View) {}
}