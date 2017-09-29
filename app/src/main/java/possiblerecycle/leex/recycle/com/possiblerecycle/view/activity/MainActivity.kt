package possiblerecycle.leex.recycle.com.possiblerecycle.view.activity

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import possiblerecycle.leex.recycle.com.possiblerecycle.R



class MainActivity : AppCompatActivity() {


//    private var view1: View = View(this)
    var tabLayout: TabLayout? = null
    var viewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        StatusBarCompat.compat(this)
//        tabLayout = findViewById(R.id.tabs) as TabLayout
//        val linearLayout = tabLayout!!.getChildAt(0) as LinearLayout
////        linearLayout.setShowDividers(LinearLayout.SHOW_DIVIDER_MIDDLE)
//        linearLayout.showDividers = (LinearLayout.SHOW_DIVIDER_BEGINNING)
//        linearLayout.setDividerDrawable(ContextCompat.getDrawable(this, R.drawable.test))
////        linearLayout.setDividerPadding(dip2px(50))
//        viewPager = findViewById(R.id.vp_view) as ViewPager
//
////        var mTitleList: Array<String> = this.resources.getStringArray(R.array.home_activity_tablist)
//        var mTitleList = ArrayList<String>()
//        mTitleList.add("Taab 1")
//        mTitleList.add("Tab 2")
//
//        var view1 : View = View.inflate(this , R.layout.home_bottom_item ,null)
//        var view2 : View = View.inflate(this , R.layout.home_bottom_item ,null)
//
//        var image1 :ImageView = view1.findViewById(R.id.icon) as ImageView
//        var text1 : TextView = view1.findViewById(R.id.title) as TextView
//        image1.setImageResource(R.drawable.home_tab_home_normal)
//        text1.setText(mTitleList.get(0))
//
//        var image2 :ImageView = view2.findViewById(R.id.icon) as ImageView
//        var text2 : TextView = view2.findViewById(R.id.title) as TextView
//        image2.setImageResource(R.drawable.home_tab_me_normal)
//        text2.setText(mTitleList.get(1))
////
////        tabLayout!!.addTab(tabLayout!!.newTab().setCustomView(view1))
////        tabLayout!!.addTab(tabLayout!!.newTab().setCustomView(view2))
//
////        tabLayout!!.getTabAt(0)!!.setCustomView(view1)
////        tabLayout!!.getTabAt(1)!!.setText("Taab 2")
////        tabLayout!!.getTabAt(1)!!.setCustomView(view2)
////        tabLayout!!.newTab().setCustomView(view1))
////        tabLayout!!.addTab(tabLayout!!.newTab().setIcon(R.mipmap.home_add_message).setText(mTitleList.get(1)),false)
//
//        val list = ArrayList<Fragment>()
//        list.add(FirstFragment())
//        list.add(FirstFragment2())
////        tabLayout!!.tabMode = TabLayout.MODE_SCROLLABLE
//
//        viewPager!!.adapter = object : FragmentPagerAdapter(supportFragmentManager) {
//            override fun getItem(position: Int): Fragment {
//                return list[position]
//            }
//
//            override fun getCount(): Int {
//                return list.size
//            }
//
//            override fun getPageTitle(position: Int): CharSequence {
//                return mTitleList.get(position)
//            }
//
//
//        }
//        tabLayout!!.setupWithViewPager(viewPager)
//        viewPager!!.setOnPageChangeListener(object : ViewPager.OnPageChangeListener {
//            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {}
//
//            override fun onPageSelected(position: Int) {
//                Toast.makeText(this@MainActivity, "" + position, Toast.LENGTH_SHORT).show()
//            }
//
//            override fun onPageScrollStateChanged(state: Int) {
//
//            }
//        })
//
//        tabLayout!!.getTabAt(0)!!.setIcon(R.drawable.home_tab_home_normal)
//        tabLayout!!.getTabAt(1)!!.setIcon(R.drawable.home_tab_me_normal)

    }

    fun dip2px(dip: Int): Int {
        val density = resources.displayMetrics.density
        return (dip * density + 0.5).toInt()
    }
}
