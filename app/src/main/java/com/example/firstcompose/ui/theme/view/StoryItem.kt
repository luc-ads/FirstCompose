package com.example.firstcompose.ui.theme.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.example.firstcompose.R
import com.example.firstcompose.data.Story
import com.example.firstcompose.ui.theme.spacingSmall

//Anotação para sinalizar que determinado recurso ainda está em alpha, ou seja, fase experimental
@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun StoryItem(story: Story) {

    val avatarContentDesc = stringResource(id = R.string.content_descrition_story, story.userNickName)

    Column(
        modifier = Modifier
            .padding(spacingSmall)
            .background(MaterialTheme.colorScheme.background)
    ) {
        Image(
            painter = painterResource(id = story.userAvatar),
            contentDescription = avatarContentDesc,
            modifier = Modifier
                .size(64.dp)
                .align(Alignment.CenterHorizontally)
                .fillMaxSize()
                .clip(CircleShape)
                .border(1.5.dp, Color.Red, CircleShape),
            contentScale = ContentScale.Crop
        )
    }

}

@Preview(showBackground = true)
@Composable
fun StoryItemPreview() {
    StoryItem(story = Story("lp_silvaa", R.drawable.image_jpg))
}