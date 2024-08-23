package com.android.rive

import androidx.annotation.RawRes

data class RiveObj(
    @RawRes val resId: Int,
    val stateMachineName: String? = null,
    val artboardName: String? = null,
)

val riveObjects = listOf(
    RiveObj(R.raw.soarus),
    RiveObj(R.raw.dragon_ride),
    RiveObj(R.raw.panda),
    RiveObj(R.raw.walk_boom),
    RiveObj(R.raw.ori),
    RiveObj(R.raw.guitargirl),
    RiveObj(R.raw.dog_escape),
    RiveObj(R.raw.alien),
    RiveObj(R.raw.walk_cycle_blend, artboardName = "combined"),
    RiveObj(R.raw.testjoystickplanet),
    RiveObj(R.raw.pencil_dude_hello),
    RiveObj(R.raw.artist, artboardName = "Artist Comp"),
    RiveObj(R.raw.big_wheel_demo),
    RiveObj(R.raw.chatbot),
    RiveObj(R.raw._2d_girl, artboardName = "2dGirl"),
    RiveObj(R.raw.luke_vs_darth),
    RiveObj(R.raw.flying),
    RiveObj(R.raw.spacecow),
    RiveObj(R.raw.smileys),
    RiveObj(R.raw.cat),
    RiveObj(R.raw.football_time),
    RiveObj(R.raw.walle),
    RiveObj(R.raw.game_character_demo),
    RiveObj(R.raw.sketis),
    RiveObj(R.raw.donnie_the_dino),
    RiveObj(R.raw.flame_and_spark),
    RiveObj(R.raw.thats_no_moon),
    RiveObj(R.raw.anime_girl),
    RiveObj(R.raw.pull_to_refresh_),
    RiveObj(R.raw.bat),
    RiveObj(R.raw.floaty_boi),
    RiveObj(R.raw.zoom_loop_nested_artboards_example),
    RiveObj(R.raw.happy_little_robot),
    RiveObj(R.raw.book),
    RiveObj(R.raw.mech_publish),
    RiveObj(R.raw.robot_puppet),
    RiveObj(R.raw.castle_demo),
    RiveObj(R.raw.juicy_walk),
    RiveObj(R.raw.knight),
    RiveObj(R.raw.doggo),
    RiveObj(R.raw.paint),
    RiveObj(R.raw.girl_black_hair),
    RiveObj(R.raw.truck),
    RiveObj(R.raw.rigging_a_character),
    RiveObj(R.raw.polito),
    RiveObj(R.raw.hero_use_case),
    RiveObj(R.raw.mixing_animations),
    RiveObj(R.raw.login_screen_character),
    RiveObj(R.raw.gost),
    RiveObj(R.raw.game_controller),
)