package com.example.connect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.connect.Viewmodel_packages.MarsViewModel
import com.example.connect.ui.theme.ConnectTheme
import dagger.hilt.android.AndroidEntryPoint
import retrofit2.Response

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val nn: MarsViewModel= viewModel()
            ConnectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, marsViewModel: MarsViewModel= viewModel(), modifier: Modifier = Modifier) {
  val lands by marsViewModel.lands.collectAsState()

Column {
LazyColumn{
    items(lands){item ->

        Text(
            text = "--------The Lands: ${item.id}!",
            modifier = modifier
        )
    }
}

    Text(
        text = "--------The Lands::::: ${lands.size}!",
        modifier = modifier
    )
    Button(onClick = {marsViewModel.getlands()}) {
        Text(
            text = "Reload",
            modifier = modifier
        )
    }

    Text(
        text = "--------Hello $name!",
        modifier = modifier
    )
}


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ConnectTheme {
        Greeting("Android")
    }
}