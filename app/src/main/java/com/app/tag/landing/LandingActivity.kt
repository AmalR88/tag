package com.app.tag.landing
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.tag.R
import com.app.tag.profile.ProfileActivity
import kotlinx.android.synthetic.main.activity_landing.*

class LandingActivity : AppCompatActivity() {
     lateinit var recyclerAdapter: CustomAdapterLP

     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)
        val llregister = findViewById<View>(R.id.view_register)
        llregister.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                startActivity(Intent(this@LandingActivity, ProfileActivity::class.java))
            }})

        initRecyclerView()
        initViewModel()
    }

    private fun initRecyclerView() {
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerAdapter = CustomAdapterLP(this)
        recyclerview.adapter =recyclerAdapter

    }

    private fun initViewModel() {
        val viewModel:LandingViewModel = ViewModelProvider(this).get(LandingViewModel::class.java)
        viewModel.getLiveDataObserver().observe(this, Observer {
            if(it != null) {
                recyclerAdapter.setLandingPageList(it)
                recyclerAdapter.notifyDataSetChanged()
            } else {
                Toast.makeText(this, "Error in getting list", Toast.LENGTH_SHORT).show()
            }
        })
        viewModel.makeAPICall()
    }
}