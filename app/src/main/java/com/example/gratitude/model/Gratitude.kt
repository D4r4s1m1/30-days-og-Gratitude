package com.example.gratitude.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.gratitude.R

data class Gratitude(
    @StringRes val nameRes: Int,
    @DrawableRes val imageRes: Int,
    @StringRes val descriptionRes: Int

)

object GratitudeRepository {
    val Gratitudes = listOf(
        Gratitude(
            nameRes = R.string.day1,
            imageRes = R.drawable.gratitude_1,
            descriptionRes = R.string.gratitude1,

        ),
        Gratitude(
            nameRes = R.string.day2,
            imageRes = R.drawable.gratitude_2,
            descriptionRes = R.string.gratitude2
        ),
        Gratitude(
            nameRes = R.string.day3,
            imageRes = R.drawable.gratitude_3,
            descriptionRes = R.string.gratitude3,

        ),
        Gratitude(
            nameRes = R.string.day4,
            imageRes = R.drawable.gratitude_4,
            descriptionRes = R.string.gratitude4

        ),
        Gratitude(
            nameRes = R.string.day5,
            imageRes = R.drawable.gratitude_5,
            descriptionRes = R.string.gratitude5,

        ),
        Gratitude(
            nameRes = R.string.day6,
            imageRes = R.drawable.gratitude_6,
            descriptionRes = R.string.gratitude6,

        ),
        Gratitude(
            nameRes = R.string.day7,
            imageRes = R.drawable.gratitude_7,
            descriptionRes = R.string.gratitude7,

        ),
        Gratitude(
            nameRes = R.string.day8,
            imageRes = R.drawable.gratitude_8,
            descriptionRes = R.string.gratitude8,

        ),
        Gratitude(
            nameRes = R.string.day9,
            imageRes = R.drawable.gratitude_9,
            descriptionRes = R.string.gratitude9,

        ),
        Gratitude(
            nameRes = R.string.day10,
            imageRes = R.drawable.gratitude_10,
            descriptionRes = R.string.gratitude10,

        ),
        Gratitude(
            nameRes = R.string.day11,
            imageRes = R.drawable.gratitude_11,
            descriptionRes = R.string.gratitude11,

        ),
        Gratitude(
            nameRes = R.string.day12,
            imageRes = R.drawable.gratitude_12,
            descriptionRes = R.string.gratitude12,

        ),
        Gratitude(
            nameRes = R.string.day13,
            imageRes = R.drawable.gratitude_13,
            descriptionRes = R.string.gratitude13,

        ),
        Gratitude(
            nameRes = R.string.day14,
            imageRes = R.drawable.gratitude_14,
            descriptionRes = R.string.gratitude14,

        ),
        Gratitude(
            nameRes = R.string.day15,
            imageRes = R.drawable.gratitude_15,
            descriptionRes = R.string.gratitude15,

        ),
        Gratitude(
            nameRes = R.string.day16,
            imageRes = R.drawable.gratitude_16,
            descriptionRes = R.string.gratitude16,

        ),
        Gratitude(
            nameRes = R.string.day17,
            imageRes = R.drawable.gratitude_17,
            descriptionRes = R.string.gratitude17,

        ),
        Gratitude(
            nameRes = R.string.day18,
            imageRes = R.drawable.gratitude_18,
            descriptionRes = R.string.gratitude18,

        ),
        Gratitude(
            nameRes = R.string.day19,
            imageRes = R.drawable.gratitude_19,
            descriptionRes = R.string.gratitude19,

        ),
        Gratitude(
            nameRes = R.string.day20,
            imageRes = R.drawable.gratitude_20,
            descriptionRes = R.string.gratitude20,

        ),
        Gratitude(
            nameRes = R.string.day21,
            imageRes = R.drawable.gratitude_21,
            descriptionRes = R.string.gratitude21,

        ),
        Gratitude(
            nameRes = R.string.day22,
            imageRes = R.drawable.gratitude_22,
            descriptionRes = R.string.gratitude22,

        ),
        Gratitude(
            nameRes = R.string.day23,
            imageRes = R.drawable.gratitude_23,
            descriptionRes = R.string.gratitude23,

        ),
        Gratitude(
            nameRes = R.string.day24,
            imageRes = R.drawable.grtitude_24,
            descriptionRes = R.string.gratitude24,

        ),
        Gratitude(
            nameRes = R.string.day25,
            imageRes = R.drawable.gratitude_25,
            descriptionRes = R.string.gratitude25,

        ),
        Gratitude(
            nameRes = R.string.day26,
            imageRes = R.drawable.gratitude_26,
            descriptionRes = R.string.gratitude26,

        ),
        Gratitude(
            nameRes = R.string.day27,
            imageRes = R.drawable.gratitude_27,
            descriptionRes = R.string.gratitude27,

        ),
        Gratitude(
            nameRes = R.string.day28,
            imageRes = R.drawable.gratitude_28,
            descriptionRes = R.string.gratitude28,

        ),
        Gratitude(
            nameRes = R.string.day29,
            imageRes = R.drawable.gratitude_29,
            descriptionRes = R.string.gratitude29,

        ),
        Gratitude(
            nameRes = R.string.day30,
            imageRes = R.drawable.gratitude_30,
            descriptionRes = R.string.gratitude30,

        )

    )
}