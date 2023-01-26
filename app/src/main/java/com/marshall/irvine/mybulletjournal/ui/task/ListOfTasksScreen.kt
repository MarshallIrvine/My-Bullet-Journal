package com.marshall.irvine.mybulletjournal.ui.task


import android.content.res.Resources.Theme
import android.widget.ImageButton
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.room.util.TableInfo
import com.marshall.irvine.mybulletjournal.R
import com.marshall.irvine.mybulletjournal.data.room.entity.Task

@Composable
fun ListOfTaskScreen() {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column{
            Text(
                text = "Vos tâches à accomplir !",
                style = MaterialTheme.typography.headlineLarge,
                modifier = Modifier.padding(30.dp)
            )
            val task = Task(idTask = 1, "Cras elementum ultrices diam. ",  isDone = false, isImportant = false)
            taskItem(task = task)
        }
    }
}


@Composable
fun taskItem(task: Task){
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .padding(10.dp)
        ,
        color = MaterialTheme.colorScheme.onPrimary,
        shadowElevation = 5.dp
    ) {
        Row(verticalAlignment = Alignment.CenterVertically){
            Spacer(Modifier.height(10.dp))
            RadioButton(
                selected = task.isDone , onClick = { /*TODO*/ },
            )
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(Modifier.height(10.dp))
                Text(
                    text = task.nameTask, textAlign = TextAlign.Start
                )
                Spacer(Modifier.height(10.dp))
            }
            Image(
                painter = painterResource(id = R.drawable.flag_filled_grey),
                contentDescription = stringResource(id = R.string.app_name)
            )

            
        }
    }
}

@Preview
@Composable
fun previewItemTask() {
    val task = Task(idTask = 1, "Cras elementum ultrices diam. ",  isDone = false, isImportant = false)
    taskItem(task = task)
}
@Preview
@Composable
fun previewListOfTaskScreen() {
    ListOfTaskScreen()

}