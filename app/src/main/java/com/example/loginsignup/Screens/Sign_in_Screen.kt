package com.example.loginsignup.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginsignup.R

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.computer),
            contentDescription = null,
            modifier = Modifier
                .size(300.dp)
        )
        Text(
            text = "Sign in your account",
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Start
        )
        var username by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        TextField(
            value = username,
            onValueChange = { username = it },
            placeholder = {
                Text(text = "Email")
            },
            leadingIcon = {
                Image(
                    imageVector = Icons.Outlined.MailOutline,
                    contentDescription = null
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            shape = RoundedCornerShape(15.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent,
                containerColor = Color.Cyan
            )
        )
        TextField(
            value = password,
            onValueChange = { password = it },
            placeholder = {
                Text(text = "Password")
            },
            leadingIcon = {
                Image(
                    imageVector = Icons.Outlined.Lock,
                    contentDescription = null
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            shape = RoundedCornerShape(15.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                containerColor = Color.Cyan,
                unfocusedBorderColor = Color.Transparent,
                focusedBorderColor = Color.Transparent
            )
        )
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .height(60.dp),
            shape = RoundedCornerShape(15.dp)
        ) {
            Text(
                text = "Sign up",
                fontSize = 20.sp
            )
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .padding(16.dp)
        ) {
            HorizontalDivider(
                thickness = 1.dp,
                color = Color.Black,
                modifier = Modifier
                    .weight(1f)
            )
            Text(
                text = " Or continue with",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(horizontal = 8.dp)
            )
            HorizontalDivider(
                thickness = 1.dp,
                color = Color.Black,
                modifier = Modifier
                    .weight(1f)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.Absolute.Center,
            verticalAlignment = Alignment.CenterVertically,

            )
        {
            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(15.dp),
                contentPadding = PaddingValues(0.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent
                )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.google),
                    contentDescription = null,
                    modifier = Modifier
                        .size(45.dp),
                )
            }
            Spacer(modifier = Modifier.padding(horizontal = 2.dp))
            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(15.dp),
                contentPadding = PaddingValues(0.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent
                )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.facebook),
                    contentDescription = null,
                    modifier = Modifier
                        .size(45.dp)
                        .padding(),

                    )
            }
            Spacer(modifier = Modifier.padding(horizontal = 2.dp))
            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(15.dp),
                contentPadding = PaddingValues(0.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent
                )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.instagram),
                    contentDescription = null,
                    modifier = Modifier
                        .size(45.dp),
                )
            }

        }
        Spacer(modifier = Modifier.padding(10.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = "Don't have an account?, ")
            SignUpScreen()
        }

    }
}

@Composable
fun SignUpScreen(modifier: Modifier = Modifier) {
    Text(
        text = "Sign up",
        color = Color.Blue,
        modifier = Modifier
            .clickable {

            },
        textDecoration = TextDecoration.Underline
        )
}

@Preview
@Composable
private fun LoginScreenPreview() {
    LoginScreen()
}