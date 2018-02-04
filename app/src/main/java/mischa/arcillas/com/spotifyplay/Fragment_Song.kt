package mischa.arcillas.com.spotifyplay

import android.app.Fragment
import android.content.Context
import android.media.Image
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_fragment_song.*

class Fragment_Song : Fragment(){
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater!!.inflate(R.layout.activity_fragment_song,container,false)


        val args = arguments
        val index = args.getString("123", "")
        fragment_TV_title.text=index


    }

    fun onCreate(savedInstanceState: Bundle?, context: Context) {
        super.onCreate(savedInstanceState)
        var mContext = context







    }

}



