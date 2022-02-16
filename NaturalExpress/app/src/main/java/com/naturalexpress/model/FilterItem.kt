package com.naturalexpress.model

import android.content.Context
import android.view.ContextThemeWrapper
import com.google.android.material.chip.Chip
import com.naturalexpress.R

data class FilterItem(val value: String) {
    val text: String = value
}

fun FilterItem.toChip(context: Context): Chip {
    val chip = Chip(ContextThemeWrapper(context, androidx.navigation.ui.R.style.Widget_MaterialComponents_Chip_Choice))

    chip.text = text

    return chip
}