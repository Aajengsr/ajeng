package com.frontend.ajeng.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import com.frontend.ajeng.data.Dataku
import com.frontend.ajeng.model.Wisata

@Composable
fun DetailWisataScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    wisataId: Int?
) {
    val newWisataList = Dataku.dataWisataa.filter { place ->
        place.id == wisataId
    }
    Column(modifier = modifier) {
        DetailWisataContent(newWisataList = newWisataList)
    }
}

@Composable
private fun DetailWisataContent(
    newWisataList: List<Wisata>,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = modifier.padding(16.dp)
    ) {
        val painter = rememberImagePainter(data = newWisataList[0].photo)
        androidx.compose.foundation.Image(
            painter = painter,
            contentDescription = "Poster Movie",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(height = 250.dp, width = 170.dp)
                .clip(RoundedCornerShape(16.dp))
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = newWisataList[0].name,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "(${newWisataList[0].jarak})",
                style = MaterialTheme.typography.titleSmall,
            )
            Text(
                text = "Adress : ${newWisataList[0].adress}",
                style = MaterialTheme.typography.titleSmall,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DetailWisataContentPreview() {
    DetailWisataContent(newWisataList = Dataku.dataWisataa)
}