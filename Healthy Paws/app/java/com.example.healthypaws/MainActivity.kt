package com.example.healthypaws

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myPets = findViewById<Button>(R.id.MyPetsButton);
        val petInfo = findViewById<Button>(R.id.PetInformationButton);
        val addPet = findViewById<Button>(R.id.AddPetButton);

        myPets.setOnClickListener {
            val intent = Intent(this, MyPetsActivity::class.java)
            startActivity(intent)
        }

        petInfo.setOnClickListener {
            val intent = Intent (this, PetInformationActivity::class.java)
            startActivity(intent)
        }

        addPet.setOnClickListener {
            val intent = Intent (this, AddPetActivity::class.java)
            startActivity(intent)
        }


    }
}
