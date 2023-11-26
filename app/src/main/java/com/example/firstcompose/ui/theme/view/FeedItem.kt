package com.example.firstcompose.ui.theme.view

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstcompose.R
import com.example.firstcompose.data.model.Feed
import com.example.firstcompose.data.repository.feedList
import com.example.firstcompose.ui.theme.FirstComposeTheme
import com.example.firstcompose.ui.theme.fontSmall
import com.example.firstcompose.ui.theme.gray
import com.example.firstcompose.ui.theme.spacingHalfLarge
import com.example.firstcompose.ui.theme.spacingLarge
import com.example.firstcompose.ui.theme.spacingMedium
import com.example.firstcompose.ui.theme.spacingSmall

@Composable
fun FeedItem(feed: Feed) {

    val userAvatarContentDesc = stringResource(R.string.avatar_com_imagem_do_autor_da_postagem)
    val feedImageContentDesc = stringResource(R.string.imagem_exibindo_a_foto_do_instagram)

    val likeIcon = R.drawable.ic_notification
    val likedIcon = R.drawable.ic_liked
    val messageIcon = R.drawable.ic_message
    val commentIcon = R.drawable.ic_comment
    val bookmarkIcon = R.drawable.ic_bookmark
    val bookmarkActivedIcon = R.drawable.bookmark_actived

    val iconsColor = MaterialTheme.colorScheme.onBackground
    var isLiked by rememberSaveable { mutableStateOf(false) }
    var isSaved by rememberSaveable { mutableStateOf(false) }
    val likedColor = if (isLiked) Color.Red else iconsColor

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

            FeedIcon(
                iconDrawable = if (isLiked) likedIcon else likeIcon,
                contentDesc = stringResource(R.string.icone_de_curtir),
                modifier = Modifier
                    .padding(end = spacingHalfLarge)
                    .size(28.dp)
                    .clickable { isLiked = !isLiked },
                color = likedColor,
            )

            FeedIcon(
                iconDrawable = commentIcon,
                contentDesc = stringResource(R.string.icone_de_comentar),
                modifier = Modifier
                    .padding(end = spacingHalfLarge)
                    .size(28.dp),
                color = iconsColor
            )

            FeedIcon(
                iconDrawable = messageIcon,
                contentDesc = stringResource(R.string.icone_de_enviar),
                modifier = Modifier
                    .padding(end = spacingHalfLarge)
                    .size(28.dp),
                color = iconsColor
            )

            FeedIcon(
                iconDrawable = if (isSaved) bookmarkActivedIcon else bookmarkIcon,
                contentDesc = stringResource(R.string.icone_de_enviar),
                modifier = Modifier
                    .size(28.dp)
                    .weight(1f)
                    .wrapContentWidth(align = Alignment.End)
                    .clickable { isSaved = !isSaved },
                color = iconsColor
            )
        }

        val textoLikes = buildAnnotatedString {
            append("Curtido por ")
            withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                append("j_hill ")
            }
            append("e ")
            withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                append("outras pessoas")
            }
        }

        val textoPost = buildAnnotatedString {
            withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                append(feed.userNickName)
            }
            append(" ${feed.description}")
        }

        Text(
            text = textoLikes,
            modifier = Modifier
                .padding(horizontal = spacingLarge)
                .padding(top = spacingLarge)
        )

        Text(
            text = textoPost,
            modifier = Modifier
                .padding(horizontal = spacingLarge)
                .padding(top = spacingSmall),
        )

        Text(
            text = feed.postedAgo,
            modifier = Modifier
                .padding(horizontal = spacingLarge)
                .padding(top = spacingSmall),
            fontSize = fontSmall,
            maxLines = 1,
            color = gray,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Start
        )

    }
}


@Composable
fun FeedIcon(
    @DrawableRes iconDrawable: Int,
    contentDesc: String,
    modifier: Modifier,
    color: Color
) {
    Image(
        painter = painterResource(id = iconDrawable),
        contentDescription = contentDesc,
        modifier = modifier,
        colorFilter = ColorFilter.tint(color)
    )
}

@Preview(showBackground = true)
@Composable
fun FeedItemPreview() {
    FeedItem(
        feed = feedList[0]
    )
}


@Preview(showBackground = true)
@Composable
fun FeedItemPreviewDark() {
    FirstComposeTheme(darkTheme = true) {
        FeedItem(
            feed = feedList[0]
        )
    }
}

