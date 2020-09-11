package app.takemoto.ayumin.janken

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gooButton.setOnClickListener {
            player.setImageResource(R.drawable.goo)
            var number: Int = Random.nextInt(3)

            when(number){
                0 ->{
                    cpu.setImageResource(R.drawable.goo)
                    result.text = "引き分けです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                }
                1 -> {
                    cpu.setImageResource(R.drawable.tyoki)
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#ff0000"))
                }
                2 ->{
                    cpu.setImageResource(R.drawable.paa)
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                }
            }
        }

        paaButton.setOnClickListener {
            player.setImageResource(R.drawable.paa)
            var number: Int = Random.nextInt(3)

            when(number){
                0 ->{
                    cpu.setImageResource(R.drawable.goo)
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#ff0000"))
                }
                1 -> {
                    cpu.setImageResource(R.drawable.tyoki)
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                }
                2 ->{
                    cpu.setImageResource(R.drawable.paa)
                    result.text = "引き分けです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                }
            }

        }

        tyokiButton.setOnClickListener {
            player.setImageResource(R.drawable.tyoki)
            var number: Int = Random.nextInt(3)

            when(number){
                0 ->{
                    cpu.setImageResource(R.drawable.goo)
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                }
                1 -> {
                    cpu.setImageResource(R.drawable.tyoki)
                    result.text = "引き分けです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                }
                2 ->{
                    cpu.setImageResource(R.drawable.paa)
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#ff0000"))
                }
            }

        }
    }
}