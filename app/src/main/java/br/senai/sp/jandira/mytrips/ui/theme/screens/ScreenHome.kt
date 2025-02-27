package br.senai.sp.jandira.mytrips.ui.theme.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.R

@Composable
fun ScreenHome(modifier: Modifier = Modifier){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color.White
            )

    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    color = Color.White
                ),
                    verticalArrangement = Arrangement.Center
        ) {
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(32.dp)
                    .background(
                        color = Color.White
                    ),
                verticalArrangement = Arrangement.Center
            ){
                Text(
                    text = stringResource(
                        R.string.login
                    ),
                    color = Color.Blue,
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = stringResource(
                        R.string.sign
                    ),
                    color = Color.Black,
                    fontSize = 15.sp,
                )
                TextField(value = "", onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 100.dp),
                    shape = RoundedCornerShape(15.dp)
                )
                TextField(value = "", onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, bottom = 30.dp),
                    shape = RoundedCornerShape(15.dp)

            )
               Button (onClick = {},
                   modifier = Modifier
                       .align(
                           alignment = Alignment.End
                       )
                       .padding( bottom = 10.dp),
                    shape = RoundedCornerShape(8.dp),

                ) {
                   Text(
                       text = stringResource(
                           R.string.botao

                       ),
                       fontSize = 20.sp
                   )

               }
                Row(
                    modifier = Modifier
                        .align(
                            alignment = Alignment.End
                        )
                ) {
                    Text(
                        text = stringResource(
                            R.string.ajuda

                        ),
                        fontSize = 10.sp
                    )

                        Text(
                            color = Color.Blue,
                            fontWeight = FontWeight.Bold,
                            text = stringResource(
                                R.string.ajudaa


                            ),
                            fontSize = 10.sp
                        )

                }
            }
        }
        Card (
            modifier = Modifier
                .width(130.dp)
                .height(40.dp)
                .align(
                    alignment = Alignment.TopEnd
                ),
            shape = RoundedCornerShape(
                bottomStart = 10.dp,
            ),
            colors = CardDefaults
                .cardColors(
                    containerColor = Color.Blue
                ),

            )
        {}
        Card (
            modifier = Modifier
                .width(130.dp)
                .height(40.dp)
                .align(
                    alignment = Alignment.BottomStart
                ),
            shape = RoundedCornerShape(
                topEnd = 10.dp,
            ),
            colors = CardDefaults
                .cardColors(
                    containerColor = Color.Blue
                ),


            ){}
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    ScreenHome()
}