package com.app.tag.profile
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.tag.R

class ProfileViewModel : ViewModel() {

    var liveDataList: MutableLiveData<List<ProfileModel>>

    init {
        liveDataList = MutableLiveData()
    }


    fun getLiveDataObserver(): MutableLiveData<List<ProfileModel>> {
        return liveDataList
    }

    fun makeAPICall() {

        val img1=  ProfileModel(R.drawable.ic_pplist1)
        val img2=  ProfileModel(R.drawable.ic_pplist2)
        val img3=  ProfileModel(R.drawable.ic_pplist3)
        val img4=  ProfileModel(R.drawable.ic_pplist4)
        val img5=  ProfileModel(R.drawable.ic_pplist5)
        val img6=  ProfileModel(R.drawable.ic_pplist6)

        liveDataList.postValue(listOf(img1)+ listOf(img2)+listOf(img3)+listOf(img4)+listOf(img5)+listOf(img6))

    }
}