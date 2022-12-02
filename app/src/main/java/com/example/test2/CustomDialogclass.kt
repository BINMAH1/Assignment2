package com.example.test2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.DialogFragment
import android.widget.*
class CustomDialogFragment: DialogFragment(R.layout.fragment_custom_dialog) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val cancelbt : Button = view.findViewById(R.id.canelbt);
        val submitbt : Button = view.findViewById(R.id.submitbt);
        val radioGroup = view.findViewById<RadioGroup>(R.id.rating)

    cancelbt.setOnClickListener{
        dismiss()
    }

        submitbt.setOnClickListener {
            val selectedOption: Int = radioGroup.checkedRadioButtonId
            val radioButton = view.findViewById<RadioButton>(selectedOption)
            Toast.makeText(context,radioButton.text,Toast.LENGTH_SHORT).show()
            val m1:MainActivity = getActivity() as MainActivity;
            dismiss()
        }
    }

}
