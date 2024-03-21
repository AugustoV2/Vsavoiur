package com.example.dupofvsaviour

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Face
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.LocationOn
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dupofvsaviour.ui.theme.DupOfVSaviourTheme
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.stringResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DupOfVSaviourTheme {

                var heartvalue by remember {
                    mutableStateOf(0)
                }
                heartvalue = (50..150).random()
                Column(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    Text(
                        text = "VSaviour",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                    )

                    Row {
                        Text(
                            text = "Home",
                            fontSize = 20.sp,
                            modifier = Modifier
                            //.padding(10.dp)

                        )
                    }
                    Row {
                        Text(
                            text = "Hi Ajumon, Welcome to vSaviour",
                            fontSize = 10.sp,
                            modifier = Modifier.padding(
                                start = 0.dp,
                                top = 0.dp,
                                end = 0.dp,
                                bottom = 10.dp
                            ),
                        )
                    }


                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(2.dp),
                    ) {
                        Text(
                            text = "VS - Ring(A1)",
                            fontSize = 20.sp,
                        )
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.CenterStart
                        ) {
                            Text(
                                text = "Status: Connected",
                                fontSize = 10.sp,
                                modifier = Modifier.padding(
                                    start = 0.dp,
                                    top = 0.dp,
                                    end = 0.dp,
                                    bottom = 0.dp
                                )
                            )

                            Image(
                                modifier = Modifier

                                    .clip(CircleShape)
                                    .size(50.dp)
                                    .align(Alignment.CenterEnd),
                                // .align(Arrangement.),

                                painter = painterResource(id = R.drawable.download),
                                contentDescription = "Image"
                            )

                        }
                        Row {
                            Text(
                                text = "Battery : 72%",
                                fontSize = 10.sp,
                            )

                        }

                    }
                    Row(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Card(
                            modifier = Modifier.size(150.dp)
                        ) {
                            Text(
                                text = "Heart Beat",
                            )
                            Row {
                                Text(
                                    text = heartvalue.toString(),
                                )
                            }
                        }
                        Card(
                            modifier = Modifier.size(150.dp)
                        ) {
                            Text(
                                text = "Sleep Monitor",
                            )
                        }

                    }
                    Card {
                        Row {
                            Button(
                                modifier = Modifier.fillMaxWidth(),
                                onClick = { /*TODO*/ }) {
                                Text(
                                    text = "Emergency"
                                )
                                Icon(
                                    Icons.Rounded.Person,
                                    contentDescription = stringResource(id = R.string.app_name)
                                )

                            }
                        }
                        Row {
                            Button(
                                modifier = Modifier.fillMaxWidth(),
                                onClick = { /*TODO*/ }) {
                                Text(
                                    text = "Location"
                                )
                                Icon(
                                    Icons.Rounded.LocationOn,
                                    contentDescription = stringResource(id = R.string.app_name)
                                )

                            }
                        }
                        Row {
                            Button(
                                modifier = Modifier.fillMaxWidth(),
                                onClick = { /*TODO*/ }) {
                                Text(
                                    text = "Emergency"
                                )
                                Icon(
                                    Icons.Rounded.Call,
                                    contentDescription = stringResource(id = R.string.app_name)
                                )

                            }
                        }
                    }
                }
            }
        }
    }
}