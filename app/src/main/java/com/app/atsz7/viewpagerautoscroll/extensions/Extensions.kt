package com.app.atsz7.viewpagerautoscroll.extensions

import android.os.Handler
import androidx.viewpager.widget.ViewPager

/**
 * This method is used to program "automatic scrolling" in a
 * [ViewPager] with an specific [interval].
 */
fun ViewPager.autoScroll(interval: Long) {

    val handler = Handler()
    var scrollPosition = 0

    val runnable = object : Runnable {

        override fun run() {

            /**
             * Calculate "scroll position" with
             * adapter pages count and current
             * value of scrollPosition.
             */
            val count = adapter?.count ?: 0
            setCurrentItem(scrollPosition++ % count, true)

            handler.postDelayed(this, interval)
        }
    }

    handler.post(runnable)
}
