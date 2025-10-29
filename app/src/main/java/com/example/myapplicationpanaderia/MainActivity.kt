package com.example.myapplicationpanaderia

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplicationpanaderia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Cuando el usuario toque la imagen "aka"
        binding.aka.setOnClickListener { view ->
            Snackbar.make(view, "Pan artesanal recién horneado", Snackbar.LENGTH_LONG)
                .setAction("Cerrar", null)
                .show()
        }
    }
}
