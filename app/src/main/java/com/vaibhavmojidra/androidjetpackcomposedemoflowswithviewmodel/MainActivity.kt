package com.vaibhavmojidra.androidjetpackcomposedemoflowswithviewmodel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.vaibhavmojidra.androidjetpackcomposedemoflowswithviewmodel.ui.theme.AndroidJetpackComposeDemoFlowsWithViewModelTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val myViewModel=viewModel<MyViewModel>()
            val currentValue= myViewModel.myFlow.collectAsState(initial = 1).value
            AndroidJetpackComposeDemoFlowsWithViewModelTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Text(text = "Current value is $currentValue", fontSize = 24.sp)
                }
            }
        }
    }
}
