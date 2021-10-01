package com.app.tag.landing
import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.tag.R
import kotlinx.android.synthetic.main.lp_row.view.*

class CustomAdapterLP (val activity: Activity): RecyclerView.Adapter<CustomAdapterLP.MyViewHolder>() {
    private var landingList: List<LandingModel>? = null

    fun setLandingPageList(lpList: List<LandingModel>?) {
        this.landingList = lpList
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CustomAdapterLP.MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.lp_row, parent, false)

        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomAdapterLP.MyViewHolder, position: Int) {
        holder.bind(landingList?.get(position)!!, activity)
    }

    override fun getItemCount(): Int {
        if(landingList == null)return 0
        else return landingList?.size!!
    }

    class MyViewHolder(view : View): RecyclerView.ViewHolder(view){
        val heading = view.tv_heading
        val description = view.tv_description
        val image=view.iv

       fun bind(data: LandingModel, activity: Activity) {
            heading.text = data.heading
            description.text = data.description
           data.image?.let { image.setImageResource(it) }

       }
    }
}