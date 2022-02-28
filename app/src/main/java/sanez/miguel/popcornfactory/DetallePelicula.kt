package sanez.miguel.popcornfactory

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detalle_pelicula.*

class DetallePelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)
        val bundle = intent.extras
        if(bundle != null){
            iv_imagenPelicula.setImageResource(bundle.getInt("header"))
            tv_tituloPelicula.setText(bundle.getString("nombre"))
            tv_descripcionPelicula.setText(bundle.getString("sinopsis"))
        }
    }
}