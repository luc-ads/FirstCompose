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
import androidx.compose.foundation.layout.wrapContentWidth
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstcompose.R
import com.example.firstcompose.data.model.Feed
import com.example.firstcompose.ui.theme.spacingHalfLarge
import com.example.firstcompose.ui.theme.spacingLarge
import com.example.firstcompose.ui.theme.spacingMedium
import com.example.firstcompose.ui.theme.spacingSmall

@Composable
fun FeedItem(feed: Feed) {

    val userAvatarContentDesc = stringResource(R.string.avatar_com_imagem_do_autor_da_postagem)
    val feedImageContentDesc = stringResource(R.string.imagem_exibindo_a_foto_do_instagram)

    val likeIcon = R.drawable.ic_notification
    val messageIcon = R.drawable.ic_message
    val commentIcon = R.drawable.ic_comment
    val bookmarkIcon = R.drawable.ic_bookmark

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

        Row(
            modifier = Modifier
                .padding(horizontal = spacingLarge)
                .padding(top = spacingLarge)
                .fillMaxWidth()
        ) {

            Image(
                painter = painterResource(id = likeIcon),
                contentDescription = stringResource(R.string.icone_de_curtir),
                modifier = Modifier
                    .padding(end = spacingHalfLarge)
                    .size(30.dp)
            )
            Image(
                painter = painterResource(id = commentIcon),
                contentDescription = stringResource(R.string.icone_de_comentar),
                modifier = Modifier
                    .padding(end = spacingHalfLarge)
                    .size(30.dp)
            )
            Image(
                painter = painterResource(id = messageIcon),
                contentDescription = stringResource(R.string.icone_de_enviar),
                modifier = Modifier
                    .padding(end = spacingHalfLarge)
                    .size(30.dp)
            )
            Image(
                painter = painterResource(id = bookmarkIcon),
                contentDescription = stringResource(R.string.icone_de_enviar),
                modifier = Modifier
                    .size(30.dp)
                    .weight(1f)
                    .wrapContentWidth(align = Alignment.End)
            )
        }
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

