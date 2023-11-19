package com.example.firstcompose.ui.theme.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.firstcompose.R
import com.example.firstcompose.data.model.Feed

@Composable
fun FeedItem(feed: Feed) {
}

@Preview(showBackground = true)
@Composable
fun FeedItemPreview(){
    FeedItem(feed = Feed(
        "lp_silvaa",
        "SP - São Paulo",
        R.drawable.image_jpg,
        R.drawable.image_jpg,
        "Férias merecidas",
        "2 min"
    ))
}

