package nl.timvdalen.bedroom_dimmer_remote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatDelegate
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val dimButton = findViewById<Button>(R.id.button)
		dimButton.setOnClickListener {
			val queue = Volley.newRequestQueue(this)

			val dimRequest = StringRequest(Request.Method.GET, getString(R.string.host),
				Response.Listener<String> {r -> Log.i("bedroom-dimmer", r)},
				Response.ErrorListener {e -> Log.e("bedroom-dimmer", e.toString())})

			queue.add(dimRequest)
		}
	}
}
