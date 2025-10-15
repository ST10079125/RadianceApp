package com.example.radienceapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.cardview.widget.CardView

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // 🔹 Profile icon click listener
        val profileIcon = view.findViewById<ImageView>(R.id.profile_icon)
        profileIcon?.setOnClickListener {
            val intent = Intent(requireContext(), ProfileActivity::class.java)
            startActivity(intent)
        }

        //  Find all nail cards
        val nailsCard1 = view.findViewById<CardView>(R.id.nails_card_1)
        val nailsCard2 = view.findViewById<CardView>(R.id.nails_card_2)
        val nailsCard3 = view.findViewById<CardView>(R.id.nails_card_3)
        val nailsCard4 = view.findViewById<CardView>(R.id.nails_card_4)

        // Find all hair cards
        val hairCard1 = view.findViewById<CardView>(R.id.hair_card_1)
        val hairCard2 = view.findViewById<CardView>(R.id.hair_card_2)
        val hairCard3 = view.findViewById<CardView>(R.id.hair_card_3)
        val hairCard4 = view.findViewById<CardView>(R.id.hair_card_4)

        // Find all facial cards
        val facialCard1 = view.findViewById<CardView>(R.id.facial_card_1)
        val facialCard2 = view.findViewById<CardView>(R.id.facial_card_2)
        val facialCard3 = view.findViewById<CardView>(R.id.facial_card_3)
        val facialCard4 = view.findViewById<CardView>(R.id.facial_card_4)

        //Find all massage cards
        val massageCard1 = view.findViewById<CardView>(R.id.massage_card_1)
        val massageCard2 = view.findViewById<CardView>(R.id.massage_card_2)
        val massageCard3 = view.findViewById<CardView>(R.id.massage_card_3)
        val massageCard4 = view.findViewById<CardView>(R.id.massage_card_4)

        //Set click listeners for nail cards
        nailsCard1.setOnClickListener { navigateToBooking("Nails - Basic Manicure") }
        nailsCard2.setOnClickListener { navigateToBooking("Nails - Gel Overlay") }
        nailsCard3.setOnClickListener { navigateToBooking("Nails - Full Set Acrylic") }
        nailsCard4.setOnClickListener { navigateToBooking("Nails - Nail Art") }

        // Set click listeners for hair cards
        hairCard1.setOnClickListener { navigateToBooking("Hair - Dry Installation (Short)") }
        hairCard2.setOnClickListener { navigateToBooking("Hair - Cornrow/Extension") }
        hairCard3.setOnClickListener { navigateToBooking("Hair - Blow & Curl") }
        hairCard4.setOnClickListener { navigateToBooking("Hair - Treatment & Style") }

        // Set click listeners for facial cards
        facialCard1.setOnClickListener { navigateToBooking("Facial - Basic Facial") }
        facialCard2.setOnClickListener { navigateToBooking("Facial - Deep Cleansing") }
        facialCard3.setOnClickListener { navigateToBooking("Facial - Glow Facial") }
        facialCard4.setOnClickListener { navigateToBooking("Facial - Anti-Ageing") }

        // Set click listeners for massage cards
        massageCard1.setOnClickListener { navigateToBooking("Massage - Swedish") }
        massageCard2.setOnClickListener { navigateToBooking("Massage - Back & Neck") }
        massageCard3.setOnClickListener { navigateToBooking("Massage - Full Body") }
        massageCard4.setOnClickListener { navigateToBooking("Massage - Hot Stone") }

        // Find and handle Logout button
        val logoutButton = view.findViewById<Button>(R.id.logout_button)
        logoutButton?.setOnClickListener {
            Toast.makeText(requireContext(), "Logged out successfully", Toast.LENGTH_SHORT).show()
            val intent = Intent(requireContext(), LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            requireActivity().finish()
        }

        return view
    }

    private fun navigateToBooking(serviceName: String) {
        val intent = Intent(requireContext(), BookingActivity::class.java)
        intent.putExtra("SERVICE_NAME", serviceName)
        startActivity(intent)
    }
}
