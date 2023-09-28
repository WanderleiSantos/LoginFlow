package com.wanderlei.loginflow.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.wanderlei.loginflow.R
import com.wanderlei.loginflow.components.CheckboxComponent
import com.wanderlei.loginflow.components.HeadingTextComponent
import com.wanderlei.loginflow.components.MyTextFieldComponent
import com.wanderlei.loginflow.components.NormalTextComponent
import com.wanderlei.loginflow.components.PasswordTextFieldComponent

@Composable
fun SignUpScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(28.dp)
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
        ) {
            NormalTextComponent(value = stringResource(R.string.hello))
            HeadingTextComponent(value = stringResource(R.string.create_an_account))
            Spacer(modifier = Modifier.height(20.dp))
            MyTextFieldComponent(
                labelValue = stringResource(R.string.first_name),
                painterResource = painterResource(id = R.drawable.profile),
            )
            MyTextFieldComponent(
                labelValue = stringResource(R.string.last_name),
                painterResource = painterResource(id = R.drawable.profile),
            )
            MyTextFieldComponent(
                labelValue = stringResource(R.string.e_mail),
                painterResource = painterResource(id = R.drawable.mail),
            )
            PasswordTextFieldComponent(
                labelValue = stringResource(R.string.password),
                painterResource = painterResource(id = R.drawable.lock),
            )

            CheckboxComponent()
        }

    }

}