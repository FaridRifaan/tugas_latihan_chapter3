package com.tugas_latihan.tugas_latihan_chapter3.tugas_parcelable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tugas_latihan.tugas_latihan_chapter3.R
import com.tugas_latihan.tugas_latihan_chapter3.databinding.ActivityParcelableBinding

class ParcelableActivity : AppCompatActivity() {

    lateinit var binding: ActivityParcelableBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityParcelableBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnParcelable.setOnClickListener{
            val name2 = binding.inputNamaParce.text.toString()
            val email2 = binding.inputEmailParce.text.toString()
            val phone2 = binding.inputPhoneParce.text.toString().toInt()
            val addres2 = binding.inputAddressParce.text.toString()
            val age2 = binding.inputAgeParce.text.toString().toInt()

            val myDataUser = DataUser(name2, email2, phone2, addres2, age2)
            val move = Intent(this, ParcelableActivity2::class.java)
            move.putExtra("KUNCIDATA", myDataUser)
            startActivity(move)
        }
    }
}