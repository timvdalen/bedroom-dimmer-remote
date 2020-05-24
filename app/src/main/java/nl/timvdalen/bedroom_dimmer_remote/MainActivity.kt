package nl.timvdalen.bedroom_dimmer_remote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val dimButton = findViewById<Button>(R.id.button)
		dimButton.setOnClickListener {
			Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
		}
	}
}
