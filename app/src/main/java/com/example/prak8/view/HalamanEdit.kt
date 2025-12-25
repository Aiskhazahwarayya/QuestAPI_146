package com.example.prak8.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.prak8.viewmodel.EditViewModel
import com.example.prak8.viewmodel.provider.PenyediaViewModel

@Composable
fun EditSiswaScreen(
    navigateBack: () -> Unit,
    onNavigateUp: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: EditViewModel = viewModel(factory = PenyediaViewModel.Factory)
){

}