package com.app.atsz7.viewpagerautoscroll.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.atsz7.viewpagerautoscroll.R
import com.app.atsz7.viewpagerautoscroll.extensions.autoScroll
import com.app.atsz7.viewpagerautoscroll.ui.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setAdapter()
        setViewPager()
    }

    /**
     * This method is used to set the [adapter] with
     * [ViewPagerAdapter] and "images" list.
     */
    private fun setAdapter() {

        this.adapter = ViewPagerAdapter(listOf(
            R.drawable.ic_one,
            R.drawable.ic_two,
            R.drawable.ic_three,
            R.drawable.ic_four,
            R.drawable.ic_five
        ))
    }

    /**
     * This method set the [viewPager] with [adapter].
     */
    private fun setViewPager() {
        viewPager.adapter = adapter

        /**
         * Start automatic scrolling with an
         * interval of 3 seconds.
         */
        viewPager.autoScroll(3000)
    }
}
