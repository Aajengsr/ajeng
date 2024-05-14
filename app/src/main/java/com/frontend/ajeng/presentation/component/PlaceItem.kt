package com.frontend.ajeng.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.frontend.ajeng.R
import com.frontend.ajeng.model.Place
import com.frontend.ajeng.ui.theme.AjengTheme

@Composable
fun PlaceItem(
    place: Place,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.clickable {
            onItemClicked(place.id)
        }
    ) {
        Image(
            painter = painterResource(id = place.photo),
            contentDescription = place.name,
            modifier = Modifier
                .clip(CircleShape)
                .size(80.dp)
        )
        Text(
            text = place.name,
            style = MaterialTheme.typography.titleMedium,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(80.dp),
            maxLines = 1
        )
        Text(
            text = place.jarak,
            color = MaterialTheme.colorScheme.primary,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.width(80.dp),
            maxLines = 1
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PlaceItemPreview() {
    AjengTheme {
        PlaceItem(
            place = Place(
                id = 1,
                name = "Gresik",
                jarak = "25 mnt (30 km)",
                photo = R.drawable.gresik
            ),
            onItemClicked = { placeId ->
                println("Place Id: $placeId")
            }
        )
    }
}