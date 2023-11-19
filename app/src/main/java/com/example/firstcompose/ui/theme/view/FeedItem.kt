package com.example.firstcompose.ui.theme.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstcompose.R
import com.example.firstcompose.data.model.Feed
import com.example.firstcompose.ui.theme.spacingLarge
import com.example.firstcompose.ui.theme.spacingMedium
import com.example.firstcompose.ui.theme.spacingSmall

@Composable
fun FeedItem(feed: Feed) {

    val userAvatarContentDesc = "Avatar com imagem do autor da postagem"
    val feedImageContentDesc = "Imagem exibindo a foto do Instagram"

    Column(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.background)
    ) {

        Row(
            modifier = Modifier
                .padding(horizontal = spacingSmall)
                .padding(top = spacingLarge)
        ) {

            Image(
                painter = painterResource(id = feed.userAvatar),
                modifier = Modifier
                    .size(36.dp)
                    .fillMaxSize()
                    .clip(CircleShape)
                    .padding(end = spacingMedium),
                contentScale = ContentScale.Crop,
                contentDescription = userAvatarContentDesc
            )

            Column {
                Text(
                    text = feed.userNickName,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = spacingMedium),
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Start
                )

                Text(
                    text = feed.localName,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = spacingMedium),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Start
                )
            }
        }

        Image(
            painter = painterResource(id = feed.imageUrl),
            contentDescription = feedImageContentDesc,
            modifier = Modifier
                .padding(top = spacingLarge)
                .height(256.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FeedItemPreview() {
    FeedItem(
        feed = Feed(
            "lp_silvaa",
            "SP - São Paulo",
            R.drawable.image_jpg,
            R.drawable.image_jpg,
            "Férias merecidas",
            "2 min"
        )
    )
}

