package com.tugas_latihan.tugas_latihan_chapter3.serializable_tugas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tugas_latihan.tugas_latihan_chapter3.R
import com.tugas_latihan.tugas_latihan_chapter3.databinding.ActivitySerializable2Binding

@Suppress("DEPRECATION")
class SerializableActivity2 : AppCompatActivity() {

    lateinit var binding: ActivitySerializable2Binding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivitySerializable2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val menDapatkanData = intent.getSerializableExtra("DATAUSER") as MyDataClass
        val nama = menDapatkanData.name
        val email1 = menDapatkanData.email
        val noPhone = menDapatkanData.numberPhone
        val adress2 = menDapatkanData.address
        val age2 = menDapatkanData.age
        binding.textName.text = nama
        binding.textEmail.text = email1
        binding.textPhone.text = noPhone
        binding.textAddress.text = adress2
        binding.textAge.text = age2

    }
}