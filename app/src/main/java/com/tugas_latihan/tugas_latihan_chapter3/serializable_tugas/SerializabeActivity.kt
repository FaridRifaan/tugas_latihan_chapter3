package com.tugas_latihan.tugas_latihan_chapter3.serializable_tugas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.tugas_latihan.tugas_latihan_chapter3.databinding.ActivitySerializabeBinding
import com.tugas_latihan.tugas_latihan_chapter3.databinding.ActivitySerializable2Binding

class SerializabeActivity : AppCompatActivity() {

    lateinit var binding: ActivitySerializabeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySerializabeBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnSerializable.setOnClickListener{
            val name1 = binding.inputName.text.toString()
            val email1 = binding.inputEmail.text.toString()
            val phone1 = binding.inputPhone.text.toString()
            val addres1 = binding.inputAddress.text.toString()
            val age1 = binding.inputAge.text.toString()

            val myData = MyDataClass(name1,email1, phone1, addres1, age1)
            val pindah = Intent(this, SerializableActivity2::class.java)
            pindah.putExtra("DATAUSER", myData)
            startActivity(pindah)
        }

    }
}