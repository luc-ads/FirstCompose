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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.example.firstcompose.R
import com.example.firstcompose.data.model.StatusStory
import com.example.firstcompose.data.model.Story
import com.example.firstcompose.data.repository.stories
import com.example.firstcompose.ui.theme.spacingSmall
import com.example.firstcompose.ui.theme.storyCircleColorToCloseFriends
import com.example.firstcompose.ui.theme.storyCircleColorToView
import com.example.firstcompose.ui.theme.storyCircleColorVisualized

//Anotação para sinalizar que determinado recurso ainda está em alpha, ou seja, fase experimental
@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun StoryItem(story: Story) {
    
    val storyColorBorder =
        when (story.userStatus) {
            StatusStory.CLOSE -> {
                storyCircleColorToCloseFriends
            }
            StatusStory.NORMAL -> {
                storyCircleColorVisualized
            }
            else -> {
                storyCircleColorToView
            }
        }

    val avatarContentDesc =
        stringResource(id = R.string.content_descrition_story, story.userNickName)

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
                .border(2.dp, storyColorBorder, CircleShape),
            contentScale = ContentScale.Crop
        )

        Text(
            text = story.userNickName,
            modifier = Modifier
                .size(width = 72.dp, height = 24.dp),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center
        )

    }
}

@Preview(showBackground = true)
@Composable
fun StoryItemPreview() {
    StoryItem(story = stories[1])
}