package com.alamin.daggerretrofitcoroutine_mvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.alamin.daggerretrofitcoroutine_mvvm.ProjectApplication
import com.alamin.daggerretrofitcoroutine_mvvm.R
import com.alamin.daggerretrofitcoroutine_mvvm.view_model.ProductViewModel
import com.alamin.daggerretrofitcoroutine_mvvm.view_model.ViewModelFactory
import java.lang.reflect.Array.get
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    lateinit var productViewModel: ProductViewModel;
    @Inject
    lateinit var viewModelFactory: ViewModelFactory;

    val products: TextView
        get() = findViewById(R.id.txtProducts);

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        (application as ProjectApplication).applicationComponent.inject(this)
        productViewModel = ViewModelProvider(this,viewModelFactory).get(ProductViewModel::class.java)

        productViewModel.products.observe(this, Observer {
            products.text = it.joinToString { x-> x.title+"\n\n" }
        })

    }
}