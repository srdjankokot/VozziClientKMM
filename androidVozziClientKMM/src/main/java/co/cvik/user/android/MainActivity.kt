package co.cvik.user.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import co.cvik.user.App
import co.cvik.user.datasource.network.KtorClientFactory
import io.ktor.client.call.body
import io.ktor.client.request.accept
import io.ktor.client.request.get
import io.ktor.client.request.header
import io.ktor.client.request.headers
import io.ktor.client.request.url
import io.ktor.http.ContentType
import io.ktor.http.contentType
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

const val TOKEN = "Token 9c8b06d329136da358c2d00e76946b0111ce2c48"
const val BASE_URL = "https://food2fork.ca/api/recipe"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        val ktorClient = KtorClientFactory().build()
//        CoroutineScope(IO).launch {
//
//            val bla = ktorClient.get {
//                val recipeId = 1551
//                url("$BASE_URL/get?id=$recipeId")
//                header("Authorization", TOKEN)
////                headers{
////                    contentType(ContentType.parse("application/json"))
////                    accept(ContentType.parse("application/json"))
////                }
//            }
//
//            println("KtorTest ${bla.body<String>()}")
//        }


        setContent {
            MyApplicationTheme {
                App()
            }
        }
    }
}

@Composable
fun GreetingView(text: String) {
    Text(text = text)
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        GreetingView("Hello, Android!")
    }
}
