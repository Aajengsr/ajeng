package com.frontend.ajeng.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.frontend.ajeng.R
import com.frontend.ajeng.model.Penawaran
import com.frontend.ajeng.ui.theme.AjengTheme

@Composable
fun PenawaranItem(
    penawaran: Penawaran,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = penawaran.photo),
            contentDescription = penawaran.name,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = penawaran.name,
            textAlign = TextAlign.Center,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = penawaran.tipe,
            textAlign = TextAlign.Center,
            color = when (penawaran.tipe) {
                "standart" -> Color.Red
                "high" -> Color.Green
                "flow" -> Color.Blue
                else -> MaterialTheme.colorScheme.primary
            },
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview
@Composable
private fun PenawaranItemPreview() {
    AjengTheme {
        PenawaranItem(
            penawaran = Penawaran(
                id = 1,
                name = "Air Terjun",
                tipe = "standart",
                photo = R.drawable.airterjun
            )
        )
    }
}
