package com.app.tag.profile
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.app.tag.R
import kotlinx.android.synthetic.main.activity_landing.*

class ProfileActivity : AppCompatActivity() {
    lateinit var recyclerAdapter: CustomAdapterPP
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        initRecyclerView()
        initViewModel()
    }

    private fun initRecyclerView() {
        recyclerview.layoutManager = GridLayoutManager(this,2)
        recyclerAdapter = CustomAdapterPP(this)
        recyclerview.adapter =recyclerAdapter

    }

    private fun initViewModel() {
        val viewModel: ProfileViewModel = ViewModelProvider(this).get(ProfileViewModel::class.java)
        viewModel.getLiveDataObserver().observe(this, Observer {
            if(it != null) {
                recyclerAdapter.setProfilePageList(it)
                recyclerAdapter.notifyDataSetChanged()
            } else {
                Toast.makeText(this, "Error in getting list", Toast.LENGTH_SHORT).show()
            }
        })
        viewModel.makeAPICall()
    }
}