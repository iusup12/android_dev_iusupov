package com.example.iusup_hmw3_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.iusup_hmw3_2.databinding.ActivityMain2Binding
import com.squareup.picasso.Picasso


class Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val itemId = intent.getIntExtra("id",0)
        val item = ItemRepository.getItemById(itemId)

        item?.let {
            Picasso.get().load(it.imageUrl).into(binding.detailImage)
            binding.detailTitle.text = it.title
            binding.detailDescription.text = it.description
            binding.detailDetailedDescription.text = it.detailedDescription
        }

        binding.backButton.setOnClickListener {
            finish()
        }

    }


}
