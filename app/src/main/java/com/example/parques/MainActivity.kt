package com.example.parques
import android.nfc.Tag
import android.util.Log
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.parques.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val Tag="";
        
        binding.BGuardar.setOnClickListener{

          Log.d(Tag,"el parque es "+ binding+binding.TBNombre.text)
           if(binding.CBDeporte.isChecked)
             Log.d(Tag,"Las actividades del parque son:${binding.CBDeporte.text}")
                      /*Mostrar por pantalla el spinner*/
            Log.d(Tag,"La hora de apertura:${binding.spinner.selectedItem} y la hora de cierre es ${binding.spinner2.selectedItem}")

          //  val miDialogo=MiDialogFragment();
            //miDialogo.show(supportFragmentManager,"MiDialogo")

        }
    }
}