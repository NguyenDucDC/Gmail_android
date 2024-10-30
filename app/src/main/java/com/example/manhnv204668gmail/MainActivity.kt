package com.example.manhnv204668gmail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val items: ArrayList<GmailModel> = arrayListOf()
    private val mAdapter: Adapter = Adapter(items)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setLogo(R.drawable.menu)
        supportActionBar?.setDisplayUseLogoEnabled(true)

        repeat(10) {
            items.add(
                GmailModel(
                    sender = "anhdep.com.vn",
                    title = "This is your change to do something very very very important!!!",
                    content = "Today we announce something very important for you this is your change to take an advantage of cat",
                    time = "12:30 AM",
                    logoPath = "https://hoanghamobile.com/tin-tuc/wp-content/uploads/2023/07/anh-dep-thien-nhien-2-1.jpg",
                    isMark = false
                )
            )
        }

        findViewById<RecyclerView>(R.id.recycler_view).apply {
            adapter = mAdapter
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu,menu)
        return true
    }
}