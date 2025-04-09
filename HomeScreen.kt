
package com.playmetrics.ui.home

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text("Welcome to PlayMetrics", style = MaterialTheme.typography.headlineSmall)

        Spacer(modifier = Modifier.height(24.dp))

        Button(onClick = { /* TODO: Open video picker */ }) {
            Text("Upload Video")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text("Your Analysis", style = MaterialTheme.typography.titleMedium)
        // TODO: Show video list, overlay visuals, and feedback
    }
}
