package com.frontend.ajeng.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.frontend.ajeng.data.Dataku
import com.frontend.ajeng.model.Penawaran
import com.frontend.ajeng.presentation.component.PenawaranItem
import com.frontend.ajeng.ui.theme.AjengTheme

@Composable
fun PenawaranScreen(
    modifier: Modifier = Modifier,
    penawaran: List<Penawaran> = Dataku.dataPenawarann
) {
    LazyVerticalGrid(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        columns = GridCells.Adaptive(140.dp),
        modifier = modifier.fillMaxSize()
    ) {
        items(penawaran, key = { it.dp }) { item ->
            PenawaranItem(penawaran = item)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun PenawaranScreenPreview() {
    AjengTheme {
        PenawaranScreen(penawaran = Dataku.dataPenawarann)
    }
}