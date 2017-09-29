package possiblerecycle.leex.recycle.com.possiblerecycle.view.activity

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import possiblerecycle.leex.recycle.com.possiblerecycle.R
import possiblerecycle.leex.recycle.com.possiblerecycle.view.fragment.FirstFragment
import possiblerecycle.leex.recycle.com.possiblerecycle.view.fragment.FirstFragment2


class MainActivity : AppCompatActivity() , View.OnClickListener {

    var mViewPager: ViewPager? = null
    var mTabView : LinearLayout? = null

    var mTitleList: Array<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mTitleList = this.resources.getStringArray(R.array.home_activity_tablist)
        mTabView = findViewById(R.id.tab_view) as LinearLayout
        initTabViewBySelectId(mTabView , 0)
        mViewPager = findViewById(R.id.vp_view) as ViewPager
        val list = ArrayList<Fragment>()
        list.add(FirstFragment())
        list.add(FirstFragment2())
        mViewPager!!.adapter = object : FragmentPagerAdapter(supportFragmentManager) {
            override fun getItem(position: Int): Fragment {
                return list[position]
            }

            override fun getCount(): Int {
                return list.size
            }

            override fun getPageTitle(position: Int): CharSequence {
                return mTitleList!!.get(position)
            }


        }
//        tabLayout!!.setupWithViewPager(viewPager)
        mViewPager!!.setOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {}

            override fun onPageSelected(position: Int) {
//                Toast.makeText(this@MainActivity, "" + position, Toast.LENGTH_SHORT).show()
                initTabViewBySelectId(mTabView , position)
            }

            override fun onPageScrollStateChanged(state: Int) {

            }
        })

//        tabLayout!!.getTabAt(0)!!.setIcon(R.drawable.home_tab_home_normal)
//        tabLayout!!.getTabAt(1)!!.setIcon(R.drawable.home_tab_me_normal)

    }

    fun initTabViewBySelectId(linearLayout: LinearLayout?,index : Int) {
        var homeTabItem = linearLayout!!.findViewById(R.id.tab_home_item)
        var meTabItem = linearLayout!!.findViewById(R.id.tab_me_item)
        homeTabItem.setOnClickListener(this)
        meTabItem.setOnClickListener(this)
        if (index == 0) {
            var icon: ImageView = homeTabItem.findViewById(R.id.tab_icon) as ImageView
            icon.setImageResource(R.drawable.home_tab_home_selected)
            var title: TextView = homeTabItem.findViewById(R.id.tab_title) as TextView
            title.text = mTitleList!![0]

            icon = meTabItem.findViewById(R.id.tab_icon) as ImageView
            icon.setImageResource(R.drawable.home_tab_me_normal)
            title = meTabItem.findViewById(R.id.tab_title) as TextView
            title.text = mTitleList!![1]
        } else {
            var icon: ImageView = homeTabItem.findViewById(R.id.tab_icon) as ImageView
            icon.setImageResource(R.drawable.home_tab_home_normal)
            var title: TextView = homeTabItem.findViewById(R.id.tab_title) as TextView
            title.text = mTitleList!![0]

            icon = meTabItem.findViewById(R.id.tab_icon) as ImageView
            icon.setImageResource(R.drawable.home_tab_me_selected)
            title = meTabItem.findViewById(R.id.tab_title) as TextView
            title.text = mTitleList!![1]
        }
    }

    fun dip2px(dip: Int): Int {
        val density = resources.displayMetrics.density
        return (dip * density + 0.5).toInt()
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.tab_home_item -> {
                initTabViewBySelectId(mTabView , 0)
                mViewPager!!.currentItem = 0
            }
            R.id.tab_me_item -> {
                initTabViewBySelectId(mTabView , 1)
                mViewPager!!.currentItem = 1
            }

        }
    }
}
