@file:OptIn(
    ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class,
    ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class,
    ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class,
    ExperimentalMaterial3Api::class
)

package com.example.gratitude

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gratitude.model.Gratitude
import com.example.gratitude.model.GratitudeRepository.Gratitudes
import com.example.gratitude.ui.theme.GratitudeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GratitudeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    GratitudeApp()
                }
            }
        }
    }
}

@Composable
fun GratitudeApp() {
    Scaffold(
        topBar = {
            GratitudeTopBar()
        }
    ) { it ->
        LazyColumn(contentPadding = it) {
            items(Gratitudes) {
                SuperheroItem(
                    gratitude = it,
                    modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_small))
                )
            }
        }
    }

}

@Composable
fun GratitudeTopBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = " 30 Days of Gratitude",
                style = MaterialTheme.typography.displaySmall,
            )
        }, modifier = modifier
    )


}

@Composable
fun SuperheroItem(
    gratitude: Gratitude,
    modifier: Modifier = Modifier

) {
    var expanded by remember { mutableStateOf(false) }
    Card(
        modifier = modifier
            .padding(start = 16.dp, top = 8.dp)
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column{
            Row {
                GratitudeDay(gratitude.nameRes)
                Spacer(modifier = Modifier.weight(1f))
                GratitudeButton(
                    expanded = expanded,
                    onClick = { expanded = !expanded })
            }




            GratitudeImage(gratitude.imageRes)
            if (expanded) {
                GratitudeNote(
                    gratitude.descriptionRes,
                    modifier = Modifier.padding(
                        start = dimensionResource(R.dimen.padding_medium),
                        top = dimensionResource(R.dimen.padding_small),
                        end = dimensionResource(R.dimen.padding_medium),
                        bottom = dimensionResource(R.dimen.padding_medium)
                    )
                )

            }
        }
    }


}

@Composable
private fun GratitudeButton(
    expanded: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = onClick,
        modifier = modifier
    ) {
        Icon(
            imageVector = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
            contentDescription = stringResource(R.string.expand_button_content_description),
            tint = MaterialTheme.colorScheme.secondary
        )
    }


}

@Composable
fun GratitudeDay(
    @StringRes gratitudeDay: Int,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .padding(dimensionResource(id = R.dimen.padding_small))
            .height(35.dp),
    ) {


        Text(
            text = stringResource(gratitudeDay),
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(top = dimensionResource(id = R.dimen.padding_small)),
        )

    }
}

@Composable
fun GratitudeImage(
    @DrawableRes gratitudePicture: Int,
    modifier: Modifier = Modifier
) {
    Image(
        modifier = modifier
            .padding(dimensionResource(id = R.dimen.padding_small))
            .clip(MaterialTheme.shapes.small)
            .fillMaxWidth(),
        contentScale = ContentScale.Crop,
        painter = painterResource(gratitudePicture),
        contentDescription = null


    )
}

@Composable
fun GratitudeNote(
    @StringRes gratitudeDescription: Int,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .height(72.dp)
            .padding(dimensionResource(id = R.dimen.padding_small)),
    ) {

        Text(
            text = stringResource(gratitudeDescription),
            style = MaterialTheme.typography.bodySmall,
            modifier = Modifier.padding(top = dimensionResource(id = R.dimen.padding_small))
        )
    }
}

@Preview
@Composable
fun GratitudeAppPreview() {
    GratitudeTheme(darkTheme = false) {
        GratitudeApp()
    }
}

@Preview
@Composable
fun GratitudeAppDarkThemePreview() {
    GratitudeTheme(darkTheme = true) {
        GratitudeApp()
    }
}