package my.mood.counterapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CounterApp(viewModel: CounterViewModel){

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Count : ${viewModel.count.value}",
            fontSize = 24.sp,
            fontWeight = FontWeight.ExtraBold
        )

        Spacer(modifier = Modifier.height(24.dp))

        Row {
            Button(onClick = { viewModel.increment()})
            {
                Text(text = "Increment")
            }

            Spacer(modifier = Modifier.width(24.dp))

            Button(onClick = {viewModel.decrement()})
            {
                Text(text = "Decrement")
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun CounterAppPreview(){
    CounterApp(viewModel = CounterViewModel())
}