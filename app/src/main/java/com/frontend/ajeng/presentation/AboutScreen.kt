package com.frontend.ajeng.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.frontend.ajeng.R
import com.frontend.ajeng.ui.theme.AjengTheme

data class About(
    val name: String,
    val nim: String,
    val email: String,
    val asalPT: String,
    val prodi: String,
    val photo: Int // Assuming R.drawable.ajengsr is the drawable resource for the photo
)

val dataAbout = listOf(
    About(
        name = "Ajeng Sri Indawati",
        nim = "2112110023",
        email = "aajengsr2104@gmail.com",
        asalPT = "Universitas Qomaruddin Gresik",
        prodi = "Teknik Informatika",
        photo = R.drawable.ajengsri
    )
)

@Composable
fun AboutScreen(
    modifier: Modifier = Modifier,
    about: About
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = about.photo),
            contentDescription = "Profile picture of Ajeng Sri Indawati",
            modifier = Modifier.size(150.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = about.name,
            style = MaterialTheme.typography.h4
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "NIM: ${about.nim}",
            style = MaterialTheme.typography.caption
        )
        Text(
            text = "Email: ${about.email}",
            style = MaterialTheme.typography.body1
        )
        Text(
            text = "Asal PT: ${about.asalPT}",
            style = MaterialTheme.typography.body1
        )
        Text(
            text = "Prodi: ${about.prodi}",
            style = MaterialTheme.typography.body1
        )
    }
}


@Preview(showBackground = true)
@Composable
private fun AboutScreenPreview() {
    AjengTheme {
        AboutScreen(about = dataAbout[0])
    }
}