package com.example.firstcompose.ui.theme.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstcompose.R
import com.example.firstcompose.data.model.Feed
import com.example.firstcompose.data.model.Story
import com.example.firstcompose.data.repository.stories
import com.example.firstcompose.ui.theme.colorDivider
import com.example.firstcompose.ui.theme.spacingMedium


@Composable
fun HomeScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {

        InstagramToolbar()
        StoryList(stories = stories)
        Divider(color = colorDivider, thickness = 0.2.dp)
        FeedItem(feed = Feed(
            userNickName = "lp_silvaa",
            localName = "Sp - São Paulo",
            userAvatar = R.drawable.image_jpg,
            imageUrl = R.drawable.image_jpg,
            description = "",
            postedAgo = "15 minutos atrás"
        ))
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