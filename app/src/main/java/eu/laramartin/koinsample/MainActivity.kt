package eu.laramartin.koinsample

import android.os.Bundle

import android.support.v7.app.AppCompatActivity
import android.util.Log
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val helloViewModel: HelloViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", helloViewModel.sayHello())
    }
}
