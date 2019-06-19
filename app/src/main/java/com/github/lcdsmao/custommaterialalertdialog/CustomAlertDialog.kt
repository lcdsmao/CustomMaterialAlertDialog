package com.github.lcdsmao.custommaterialalertdialog

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class CustomAlertDialog : DialogFragment() {

  override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
    return MaterialAlertDialogBuilder(context)
        .setTitle(R.string.title)
        .setMessage(R.string.message)
        .setPositiveButton(R.string.positive, null)
        .setNegativeButton(R.string.negative, null)
        .create()
  }
}