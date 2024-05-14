
package com.frontend.ajeng.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.frontend.ajeng.R
import com.frontend.ajeng.model.Wisata
import com.frontend.ajeng.ui.theme.AjengTheme

@Composable
fun WisataItem(
    wisata: Wisata,
    modifier: Modifier = Modifier,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp) // Added padding for better spacing
    ) {
        Image(
            painter = painterResource(id = wisata.photo),
            contentDescription = wisata.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(CircleShape)
                .size(80.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(text = wisata.name, style = MaterialTheme.typography.titleMedium)
            Row {
                Text(text = wisata.jarak, color = MaterialTheme.colorScheme.primary)
                Spacer(modifier = Modifier.width(4.dp)) // Added spacing between texts
                Text(text = " - ${wisata.adress}")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun WisataItemPreview() {
    AjengTheme {
        WisataItem(
            wisata = Wisata(
                id = 1,
                name = "Bukit Jamur",
                adress = "Jl Raya Bungah No.01",
                photo = R.drawable.bukitjamur,
                jarak = "2 km"
            )
        )
    }
}
