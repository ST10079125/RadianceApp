package com.example.radienceapp

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class BookingActivity : AppCompatActivity() {

    private lateinit var fullNameInput: EditText
    private lateinit var emailInput: EditText
    private lateinit var phoneInput: EditText
    private lateinit var serviceCheckboxGroup: LinearLayout
    private lateinit var paymentGroup: RadioGroup
    private lateinit var payButton: Button

    private var selectedService = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking)


        selectedService = intent.getStringExtra("SERVICE_NAME") ?: ""

        // Initialize views
        fullNameInput = findViewById(R.id.full_name_input)
        emailInput = findViewById(R.id.email_input)
        phoneInput = findViewById(R.id.phone_input)
        serviceCheckboxGroup = findViewById(R.id.service_checkbox_group)
        paymentGroup = findViewById(R.id.payment_group)
        payButton = findViewById(R.id.pay_button)

        // service checkboxes
        setupServiceCheckboxes()

        // Pay button
        payButton.setOnClickListener {
            processBooking()
        }
    }

    private fun setupServiceCheckboxes() {
        val services = arrayOf("Nails", "Hair", "Facial", "Massage", "Hair (Formula / Sew-in)")

        for (service in services) {
            val checkBox = CheckBox(this)
            checkBox.text = service
            checkBox.textSize = 16f
            checkBox.setPadding(8, 8, 8, 8)

            if (service == selectedService) {
                checkBox.isChecked = true
            }

            serviceCheckboxGroup.addView(checkBox)
        }
    }

    private fun processBooking() {
        val fullName = fullNameInput.text.toString().trim()
        val email = emailInput.text.toString().trim()
        val phone = phoneInput.text.toString().trim()

        // Validation
        if (fullName.isEmpty()) {
            fullNameInput.error = "Full name is required"
            fullNameInput.requestFocus()
            return
        }

        if (email.isEmpty()) {
            emailInput.error = "Email is required"
            emailInput.requestFocus()
            return
        }

        if (phone.isEmpty()) {
            phoneInput.error = "Phone number is required"
            phoneInput.requestFocus()
            return
        }

        // Get selected services
        val selectedServices = mutableListOf<String>()
        for (i in 0 until serviceCheckboxGroup.childCount) {
            val checkBox = serviceCheckboxGroup.getChildAt(i) as CheckBox
            if (checkBox.isChecked) {
                selectedServices.add(checkBox.text.toString())
            }
        }

        if (selectedServices.isEmpty()) {
            Toast.makeText(this, "Please select at least one service", Toast.LENGTH_SHORT).show()
            return
        }

        // Get payment method
        val selectedPaymentId = paymentGroup.checkedRadioButtonId
        if (selectedPaymentId == -1) {
            Toast.makeText(this, "Please select a payment method", Toast.LENGTH_SHORT).show()
            return
        }

        val paymentMethod = findViewById<RadioButton>(selectedPaymentId).text.toString()

        // Show success message
        Toast.makeText(
            this,
            "Booking confirmed!\nServices: ${selectedServices.joinToString(", ")}\nPayment: $paymentMethod",
            Toast.LENGTH_LONG
        ).show()

        finish()
    }
}