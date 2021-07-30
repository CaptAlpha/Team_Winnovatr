package org.tensorflow.lite.examples.classification.env

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import org.tensorflow.lite.examples.classification.ClassifierActivity
import org.tensorflow.lite.examples.classification.R

class WorkoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workout)
    }

    fun passToClassifier(view: View) {
        startActivity(Intent(this, ClassifierActivity::class.java))
    }
}