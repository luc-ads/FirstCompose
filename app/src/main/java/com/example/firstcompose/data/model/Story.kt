package com.example.firstcompose.data.model

class Story(
    val userNickName: String,
    val userAvatar: Int,
    val userStatus: StatusStory
)

enum class StatusStory {
    CLOSE, NORMAL, VISUALIZED
}
