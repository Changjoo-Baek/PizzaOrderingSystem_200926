package com.zzazzu.pizzaorderingsystem_200926

import android.os.Bundle
import com.zzazzu.pizzaorderingsystem_200926.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : BaseActivity() {

    lateinit var mViewPagerAdapter: MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

        mViewPagerAdapter = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mViewPagerAdapter

        mainTabLayout.setupWithViewPager(mainViewPager)

    }
}