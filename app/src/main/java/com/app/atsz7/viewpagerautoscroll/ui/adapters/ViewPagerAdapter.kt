package com.app.atsz7.viewpagerautoscroll.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.viewpager.widget.PagerAdapter
import com.app.atsz7.viewpagerautoscroll.R
import kotlinx.android.synthetic.main.item_images_list.view.*

/**
 * The [ViewPagerAdapter] class is used as adapter of "images"
 * view pager.
 */

class ViewPagerAdapter(private val images: List<Int>) : PagerAdapter() {

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        val view = LayoutInflater.from(container.context).inflate(
            R.layout.item_images_list, container, false
        )

        with(view) {
            imageView.setImageDrawable(AppCompatResources.getDrawable(
                context, images[position]
            ))
        }

        container.addView(view)
        return view
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun getCount() = images.size

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}
