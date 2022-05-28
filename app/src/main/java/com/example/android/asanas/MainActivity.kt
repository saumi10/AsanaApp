package com.example.android.asanas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imgButton4: ImageButton = findViewById(R.id.imageButton4)
        imgButton4.setOnClickListener{
            val textMain1:TextView = findViewById(R.id.textView2)
            textMain1.setText(getString(R.string.sirs))
        val image4: ImageView = findViewById(R.id.mainImage)
        image4.setImageResource(R.drawable.sirsasana)
        val description4: TextView = findViewById(R.id.textView)
        description4.setText("SIRSASANA: ‘Sirsha’ means ‘head’ and ‘asana’ means ‘posture’, so Sirsasana is an asana that is done on the head.\n Pronounced as: Shir-sa-asa-na .The Sirsasana or Headstand Pose is called the king of all asanas as it is a pose that involves balance on the head/crown. This is an advanced yoga asana that must only be attempted under the guidance of a yoga instructor. This asana is very popular due to its multiple health benefits.\n It speeds up the blood circulation and ensures that the brain receives sufficient, well-oxygenated blood.")

        }
        val imgButton2: ImageButton = findViewById(R.id.imageButton2)
        imgButton2.setOnClickListener{
            val textMain2:TextView = findViewById(R.id.textView2)
            textMain2.setText(getString(R.string.dhanur))
            val image2: ImageView = findViewById(R.id.mainImage)
            image2.setImageResource(R.drawable.dhanurasana)
            val description2: TextView = findViewById(R.id.textView)
            description2.setText("DHANURASANA: It has been named after the shape the body takes while performing it – that of a bow. Dhanu means bow and asana means posture or pose. Just as a well-strung bow is an asset to a warrior, a well-stretched body helps keep you flexible with a good posture.\nStrengthens the back and abdominal muscles,stimulates the reproductive organs,opens up the chest, neck, and shoulders,tones the leg and arm muscles,adds greater flexibility to the back,alleviates stress and fatigue ,relieves menstrual discomfort and constipation,helps people with renal (kidney) disorders")

        }
        val imgButton3: ImageButton = findViewById(R.id.imageButton3)
        imgButton3.setOnClickListener {
            val textMain3: TextView = findViewById(R.id.textView2)
            textMain3.setText(getString(R.string.nauka))
            val image3: ImageView = findViewById(R.id.mainImage)
            image3.setImageResource(R.drawable.naukasana)
            val description3: TextView = findViewById(R.id.textView)
            description3.setText("NAUKASANA: This yoga posture has been named after the shape it takes – that of a boat. Naukasana is prounced as NAUK-AAHS-uh-nuh.\nBenefits of Naukasana are as follows -\nStrengthens the muscles of the abdomen, arms, thighs, and shoulders.\nOrgans of the abdomen like liver, pancreas, and kidney function better.\nRegulates the flow of blood.\nUseful for people with hernia")
        }
        val imgButton1: ImageButton = findViewById(R.id.imageButton1)
        imgButton1.setOnClickListener {
            val textMain4:TextView = findViewById(R.id.textView2)
            textMain4.setText(getString(R.string.bhuj))
            val image1: ImageView = findViewById(R.id.mainImage)
            image1.setImageResource(R.drawable.bhujangasana)
            val description1: TextView = findViewById(R.id.textView)
            description1.setText("BHUJANGASANA: It comes from the word bhujanga meaning cobra or snake and asana meaning pose. Bhujangasana is also known as Cobra Stretch. This pose is included in Suryanamaskar (Sun Salutations Pose) as well as Padma Sadhana.\nBhujangasana, the Cobra Pose, is a pose that you do while lying down on your stomach. It gives your body (especially the back), a good stretch that melts your stress away almost instantly!\nBenefits of Bhujangasana are as follows- \nOpens up the shoulders and neck to relieve pain\nTones the abdomen\nStrengthens the entire back and shoulders\nImproves flexibility of the upper and middle back.\nImproves blood circulation.")
        }
    }
}