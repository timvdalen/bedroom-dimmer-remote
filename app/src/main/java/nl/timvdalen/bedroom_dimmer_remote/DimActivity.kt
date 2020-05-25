package nl.timvdalen.bedroom_dimmer_remote

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class DimActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		val queue = Volley.newRequestQueue(this)

		val dimRequest = StringRequest(
			Request.Method.GET, getString(R.string.host),
			Response.Listener<String> {Toast.makeText(this@DimActivity, "Dimming", Toast.LENGTH_LONG).show()},
			Response.ErrorListener {})

		queue.add(dimRequest)

		finish()
	}
}
