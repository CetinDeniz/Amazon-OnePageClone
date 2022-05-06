package com.axuca.amazon

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import com.axuca.amazon.adapter.ProductAdapter
import com.axuca.amazon.data.getProducts
import com.axuca.amazon.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        setStatusBarGradiant(this)


        val adapter = ProductAdapter()
        adapter.submitList(getProducts(this))
        binding.recyclerView.adapter = adapter
    }


    private fun setStatusBarGradiant(activity: Activity) {
        val window: Window = activity.window
        val background = ContextCompat.getDrawable(activity, R.drawable.gradient_bar)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)

        window.statusBarColor = ContextCompat.getColor(activity, android.R.color.transparent)
//        window.navigationBarColor = ContextCompat.getColor(activity, android.R.color.transparent)

        window.setBackgroundDrawable(background)
    }

}