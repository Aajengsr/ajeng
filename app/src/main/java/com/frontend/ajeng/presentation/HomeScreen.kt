package com.frontend.ajeng.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.frontend.ajeng.data.Dataku
import com.frontend.ajeng.model.Wisata
import com.frontend.ajeng.model.Place
import com.frontend.ajeng.navigation.Screen
import com.frontend.ajeng.presentation.component.WisataItem
import com.frontend.ajeng.presentation.component.PlaceItem

@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    mentors: List<Place> = Dataku.dataPlacee,
    mentees: List<Wisata> = Dataku.dataWisataa,
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        item {
            LazyRow(
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = modifier
            ) {
                items(mentors, key = { it.id }) { place ->
                    PlaceItem(place = place) { placeId ->
                        navController.navigate(Screen.Detail.route + "/$placeId")
                    }
                }
            }
        }
        items(mentees, key = { it.id }) { wisata ->
            WisataItem(wisata = wisata, modifier = Modifier.padding(horizontal = 16.dp))
        }
    }
}