package com.example.firstcompose.data.repository

import com.example.firstcompose.R
import com.example.firstcompose.data.model.Feed
import com.example.firstcompose.data.model.StatusStory
import com.example.firstcompose.data.model.Story
val stories = listOf(
    Story("lp_silvaa", R.drawable.image_jpg, StatusStory.NORMAL),
    Story("ryan_g", R.drawable.ryan_gsling, StatusStory.VISUALIZED),
    Story("j_hill", R.drawable.jonah_hill, StatusStory.CLOSE),
    Story("brad_pitt", R.drawable.brad_pitt, StatusStory.CLOSE),
    Story("lp_silvaa", R.drawable.image_jpg, StatusStory.NORMAL),
    Story("ryan_g", R.drawable.ryan_gsling, StatusStory.CLOSE),
    Story("j_hill", R.drawable.jonah_hill, StatusStory.VISUALIZED),
    Story("brad_pitt", R.drawable.brad_pitt, StatusStory.NORMAL),
    Story("lp_silvaa", R.drawable.image_jpg, StatusStory.NORMAL),
    Story("ryan_g", R.drawable.ryan_gsling, StatusStory.VISUALIZED),
    Story("j_hill", R.drawable.jonah_hill, StatusStory.CLOSE),
    Story("brad_pitt", R.drawable.brad_pitt, StatusStory.NORMAL)
)

val feedList = listOf(
    Feed(
        userNickName = "alexturner",
        userAvatar = R.drawable.image_jpg,
        localName = "Sheffield - UK",
        imageUrl = R.drawable.image_jpg,
        description = "I wanna be your Ford Cortina I will never rust...",
        postedAgo = "Há 21 horas"
    ),
    Feed(
        userNickName = "joji",
        userAvatar = R.drawable.ryan_gsling,
        localName = "Osaka - Japão",
        imageUrl = R.drawable.ryan_gsling,
        description = "Perfect don't mean that it's working. So what can I do? Cause sometimes I look in her eyes and that's where I find a glimpse of us. And I try to fall for her touch. But I'm thinkin' of the way it was said I'm fine and said I moved on. I'm only here passin' time in her arms, hopin' I find a glimpse of us.",
        postedAgo = "Há 2 dias"
    ),
    Feed(
        userNickName = "tricks&combo",
        userAvatar = R.drawable.jonah_hill,
        localName = "Rival vs Rival",
        imageUrl = R.drawable.jonah_hill,
        description = "Alan - Biohazard",
        postedAgo = "Há 4 dias"
    ),
    Feed(
        userNickName = "chevette",
        userAvatar = R.drawable.brad_pitt,
        localName = "Localiza ai",
        imageUrl = R.drawable.brad_pitt,
        description = "É necessário sempre acreditar que o sonho é possível, que o céu é o limite e você, truta, é imbatível. Que o tempo ruim vai passar, é só uma fase que o sofrimento alimenta mais a sua coragem que a sua família precisa de você, lado a lado se ganhar pra te apoiar se perder.",
        postedAgo = "Há 10 horas"
    ),
    Feed(
        userNickName = "barbaraliskov",
        userAvatar = R.drawable.image_jpg,
        localName = "Los Angeles - CA",
        imageUrl = R.drawable.image_jpg,
        description = "Princípio da Inversão de Liskov: um guia fundamental na programação orientada a objetos. Ele estabelece que as classes derivadas devem ser substituíveis por suas classes base, sem alterar o comportamento esperado do programa. Em outras palavras, se um código funciona com uma determinada classe, ele também deve funcionar com suas subclasses. Isso garante a consistência e a extensibilidade do sistema, evitando surpresas indesejadas. Mantenha suas classes em harmonia e construa um código sólido com a Inversão de Liskov.",
        postedAgo = "Há 22 horas"
    ),
    Feed(
        userNickName = "tostao",
        userAvatar = R.drawable.ryan_gsling,
        localName = "Belo Horizonte - MG",
        imageUrl = R.drawable.ryan_gsling,
        description = "Grande dia!",
        postedAgo = "Há 21 horas"
    ),
    Feed(
        userNickName = "cazuza",
        userAvatar = R.drawable.jonah_hill,
        localName = "Rio de Janeiro - RJ",
        imageUrl = R.drawable.jonah_hill,
        description = "EXAGERADO… Jogado aos teus pés, eu sou mesmo exagerado. Adoro um amor inventado!",
        postedAgo = "Há 21 horas"
    ),
    Feed(
        userNickName = "jovemwerther",
        userAvatar = R.drawable.brad_pitt,
        localName = "Frankfurt - Alemanha",
        imageUrl = R.drawable.brad_pitt,
        description = "É verdade, meu amigo, que cada dia compreendo melhor quão insensato é vivermos a julgar os outros. De minha parte, tenho tanto que fazer para modificar-me a mim mesmo, tanto esforço a despender para acalmar as tempestades do meu coração!... Ah! eu deixarei de bom grado que os outros façam o que bem entendam, contanto que eles me deixem fazer o mesmo.",
        postedAgo = "Há 5 dias"
    ),
    Feed(
        userNickName = "churrasco021",
        userAvatar = R.drawable.image_jpg,
        localName = "021",
        imageUrl = R.drawable.image_jpg,
        description = "Quando eu te encontrar é sequencia de lovezin \uD83C\uDFB5",
        postedAgo = "Há 5 horas"
    ),
    Feed(
        userNickName = "cruzeiro",
        userAvatar = R.drawable.ryan_gsling,
        localName = "Belo Horizonte - MG",
        imageUrl = R.drawable.ryan_gsling,
        description = "Para relembrar a narração emblemática e emocionante do gol do título da Libertadores de 76, quando Joãozinho de forma “irresponsável” bateu a falta que era de Nelinho, provavelmente o melhor batedor de faltas do mundo naquela época. Durante a narração, o narrador Vilibaldo Alves relembra do nosso atacante Roberto Batata, que faleceu durante a libertadores daquele ano : - “O jogador Ortiz argentino reclama, fica na frente da bola, bastante catimbada, é boa, é Nelinho quem tem que bater! Tem que se afastar, tomar posição, meter o gringo com bola e tudo pra dentro do gol, bol… aaaaaaaadivinhe! Joãozinho pelo amor de Deus Joãozinho! Você Joãozinho, Joãozinho… que Roberto batata lá do céu abrace-o aqui na terra Joãozinho… nesse momento eu me lembro de Roberto Batata, ele que tanto lutou nessa libertadores pelo Cruzeiro faz o gol que o Brasil está comemorando, vamos agora esperar torcedor do Brasil… Cruzeiro 3, River Plate 2! O River quer brigar, mas o Cruzeiro ganha no futebol.”",
        postedAgo = "Há 6 horas"
    ),
    Feed(
        userNickName = "neguinism",
        userAvatar = R.drawable.jonah_hill,
        localName = "Por ai",
        imageUrl = R.drawable.jonah_hill,
        description = "Dance!",
        postedAgo = "Há 7 dias"
    ),
    Feed(
        userNickName = "winston",
        userAvatar = R.drawable.brad_pitt,
        localName = "Oceania",
        imageUrl = R.drawable.brad_pitt,
        description = "Liberdade é a liberdade de dizer que dois mais dois são quatro.",
        postedAgo = "Há 2 dias"
    )
)
