package com.tugas_latihan.tugas_latihan_chapter3.bundle_tugas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tugas_latihan.tugas_latihan_chapter3.databinding.ActivityBundleBinding

class ActivityBundle : AppCompatActivity() {

    lateinit var binding : ActivityBundleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityBundleBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.btnSave.setOnClickListener{
            val namaUser = binding.masukanNama.text.toString()
            val umurUser = binding.masukanTahunLahir.text.toString().toInt()
            val bundle = Bundle()
            val move = Intent(this,ActivityBundle2::class.java)
            bundle.putString("Halo", namaUser)
            bundle.putInt("Umur Kamu", umurUser)
            move.putExtras(bundle)
            startActivity(move) // ctr + d = duplicate
        }

    }
}