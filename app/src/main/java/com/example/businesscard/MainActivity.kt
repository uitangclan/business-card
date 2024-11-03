package com.example.businesscard

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BusinessCard(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFd2e8d4)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.height(200.dp))
        Image(
            painter = painterResource(R.drawable.android_logo),
            contentDescription = null,
            modifier = Modifier
                .size(120.dp)
                .background(Color(0xff073042))
        )
        Text(
            text = stringResource(R.string.your_name),
            fontSize = 48.sp
        )
        Spacer(Modifier.height(10.dp))
        Text(
            text = stringResource(R.string.job_title),
            color = Color(0xFF3ddc84)
        )
        Spacer(Modifier.height(200.dp))
        ContactInformation()
    }
}

@Composable
fun ContactInformation() {
    Column(
    ) {
        Row() {
            Icon(
                Icons.Rounded.Call,
                tint = Color(0xFF3ddc84),
                contentDescription = "Call"
            )
            Spacer(Modifier.width(20.dp))
            Text(
                text = stringResource(R.string.phone_number)
            )
        }
        Spacer(Modifier.height(16.dp))
        Row() {
            Icon(
                Icons.Rounded.Share,
                tint = Color(0xFF3ddc84),
                contentDescription = "Share"
            )
            Spacer(Modifier.width(20.dp))
            Text(
                text = stringResource(R.string.social_media_handle)
            )
        }
        Spacer(Modifier.height(16.dp))
        Row() {
            Icon(
                Icons.Rounded.Email,
                tint = Color(0xFF3ddc84),
                contentDescription = "Email"
            )
            Spacer(Modifier.width(20.dp))
            Text(
                text = stringResource(R.string.email_address)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}