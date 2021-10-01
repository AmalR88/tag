package com.app.tag.landing
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.tag.R

class LandingViewModel  : ViewModel() {
    var liveDataList: MutableLiveData<List<LandingModel>>

    init {
        liveDataList = MutableLiveData()
    }

    fun getLiveDataObserver(): MutableLiveData<List<LandingModel>> {
        return liveDataList
    }

    fun makeAPICall() {

        val d1=  LandingModel(R.drawable.ic_lp1, "lorem ipsum\n" + "is used " , "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.")
        val d2=  LandingModel(R.drawable.ic_lp2, "lorem ipsum\n" + "is used " , "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.")
        val d3=  LandingModel(R.drawable.ic_lp3, "lorem ipsum\n" + "is used " , "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.")
        val d4=  LandingModel(R.drawable.ic_lp4, "lorem ipsum\n" + "is used " , "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.")
        val d5=  LandingModel(R.drawable.ic_lp5, "lorem ipsum\n" + "is used " , "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.")
        val d6=  LandingModel(R.drawable.ic_lp6, "lorem ipsum\n" + "is used " , "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.")
        val d7=  LandingModel(R.drawable.ic_lp7, "lorem ipsum\n" + "is used " , "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.")
        val d8=  LandingModel(R.drawable.ic_lp8, "lorem ipsum\n" + "is used " , "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.")


        liveDataList.postValue(listOf(d1)+ listOf(d2)+listOf(d3)+listOf(d4)+listOf(d5)+listOf(d6)+listOf(d7)+listOf(d8))



    }
}