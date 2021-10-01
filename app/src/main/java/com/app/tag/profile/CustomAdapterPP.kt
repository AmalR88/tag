package com.app.tag.profile
import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.tag.R
import kotlinx.android.synthetic.main.lp_row.view.*

class CustomAdapterPP (val activity: Activity): RecyclerView.Adapter<CustomAdapterPP.MyViewHolder>() {

    private var profilepageList: List<ProfileModel>? = null

    fun setProfilePageList(ppList: List<ProfileModel>?) {
        this.profilepageList = ppList
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CustomAdapterPP.MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pp_row, parent, false)

        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomAdapterPP.MyViewHolder, position: Int) {
        holder.bind(profilepageList?.get(position)!!, activity)
    }

    override fun getItemCount(): Int {
        if(profilepageList == null)return 0
        else return profilepageList?.size!!
    }

    class MyViewHolder(view : View): RecyclerView.ViewHolder(view){
        val image=view.iv
        fun bind(data: ProfileModel, activity: Activity) {

            data.image?.let { image.setImageResource(it) }

        }
    }
}