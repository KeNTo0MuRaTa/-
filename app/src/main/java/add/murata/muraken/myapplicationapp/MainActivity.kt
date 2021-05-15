package add.murata.muraken.myapplicationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    var nokori =3
    var suuji1 = 7
    var suuji2 = 7
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        atari.isVisible =false

        rebar.setOnClickListener {

            val number: Int = Random.nextInt(2)

            when(number){
                0-> {
                    suuji2=7
                }
                1->{
                    suuji2=8
                }
            }

                    nokori = nokori - 1
                    count.text = nokori.toString()
                    kazu1.isVisible = false
                    kazu1.text = suuji1.toString()

                    kazu2.isVisible = false
                    kazu1.text = suuji1.toString()

                    kazu3.isVisible = false
                    kazu1.text = suuji2.toString()

        }
        B1.setOnClickListener {
            kazu1.isVisible = true
        }
        B2.setOnClickListener {
            kazu2.isVisible = true
        }
        B3.setOnClickListener {
            kazu3.isVisible = true
            if(suuji2==7){
                atari.isVisible = true
            }
            if(nokori==0){
                nokori=3
            }
        }
    }
}