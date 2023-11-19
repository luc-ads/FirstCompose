package com.example.firstcompose.ui.theme.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.firstcompose.R
import com.example.firstcompose.data.Story
import com.example.firstcompose.ui.theme.spacingMedium


@Composable
fun HomeScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {

        InstagramToolbar()

        val stories = listOf(
            Story("lp_silvaa", R.drawable.image_jpg),
            Story("felp", R.drawable.ryan_gsling),
            Story("j_hill", R.drawable.jonah_hill),
            Story("lp_silvaa", R.drawable.image_jpg),
            Story("felp", R.drawable.ryan_gsling),
            Story("j_hill", R.drawable.jonah_hill),
            Story("lp_silvaa", R.drawable.image_jpg),
            Story("felp", R.drawable.ryan_gsling),
            Story("j_hill", R.drawable.jonah_hill)
        )

        StoryList(stories = stories)
    }
}

@Composable
fun StoryList(stories: List<Story>) {
    LazyRow(modifier = Modifier.padding(top = spacingMedium)) {
        itemsIndexed(stories) { _, item ->
            StoryItem(story = item)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}