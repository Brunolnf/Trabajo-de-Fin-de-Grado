package com.example.tfg.UserInterface

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import com.example.tfg.ViewModel.LoginViewModel

@Composable
fun LoginScreen(
    viewModel: LoginViewModel,
    onRegisterClick: () -> Unit
) {
    // ...
    OutlinedTextField(
        value = viewModel.email,
        onValueChange = viewModel::onEmailChange,
        label = { Text("Email") },
        modifier = Modifier.fillMaxWidth()
    )

    OutlinedTextField(
        value = viewModel.password,
        onValueChange = viewModel::onPasswordChange,
        label = { Text("Contraseña") },
        modifier = Modifier.fillMaxWidth()
    )

    Button(
        onClick = viewModel::login,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text("Iniciar sesión")
    }

    OutlinedButton(
        onClick = onRegisterClick,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text("Registrarse")
    }
}

