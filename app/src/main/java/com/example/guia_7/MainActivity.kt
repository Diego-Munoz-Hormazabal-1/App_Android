package com.example.guia_7

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.guia_7.ui.theme.HomeScreen // Importa tu HomeScreen
import com.example.guia_7.ui.theme.Guia_7Theme // O el nombre del tema de tu app

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Guia_7Theme {
                // AQUÍ ESTÁ EL SECRETO: Llamamos a tu pantalla en lugar del texto por defecto
                HomeScreen()
            }
        }
    }
}