package com.tugas_latihan.tugas_latihan_chapter3.bundle_tugas

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tugas_latihan.tugas_latihan_chapter3.databinding.ActivityBundle2Binding

class ActivityBundle2 : AppCompatActivity() {

    lateinit var binding: ActivityBundle2Binding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityBundle2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val getbundle = intent.extras
        val name = getbundle?.getString("Halo")
        val umur = getbundle?.getInt("Umur Kamu")
        binding.textView.text = "halo, $name"
        binding.textUmur.text = "umur kamu adalah : $umur"

    }
}