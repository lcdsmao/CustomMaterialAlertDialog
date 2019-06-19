package com.github.lcdsmao.custommaterialalertdialog

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class CustomAlertDialogCenter : DialogFragment() {

  override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
    return MaterialAlertDialogBuilder(context, R.style.AlertDialogTheme_Center)
        .setIcon(R.drawable.ic_favorite)
        .setTitle(R.string.title)
        .setMessage(R.string.message)
        .setPositiveButton(R.string.positive, null)
        .setNegativeButton(R.string.negative, null)
        .create()
  }
}
