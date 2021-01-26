package com.example.covidtracker.NavigationFragment

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.covid_19tracker.R

import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment(){
//
//                               },ListnerOnClikc {
//    val PhoneCallRequestCode: Int = 101
//    lateinit var statesViewModel: StatesViewModel
//    lateinit var statesAdapter: StatesAdapter
//    var statesResponseList = emptyList<StatesResponseModel>()
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//    }
//
//    //    override fun onAttach(context: Context) {
////        super.onAttach(context)
////        listener = context as FragmentListener
////    }
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_home, container, false)
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        statesViewModel =
//            StatesViewModelFactory(
//                this.requireContext(),
//                requireActivity()
//            ).create(StatesViewModel::class.java)
////          observeLiveData()
//        setRecyclerStateData()
//        usa_textview.setOnClickListener(View.OnClickListener {
//            statesViewModel.statesApiCall()
//            observeLiveDataFromDB()
//        })
        //  initViews(view)
        //  var country = spinner.selectedCountryName
        //   country = "USA"
   // }

    //    private fun initViews(view: View) {
//        callNow.setOnClickListener {
//            checkForPermission()
//        }
//        sendSms.setOnClickListener {
//            sendSMS()
//        }
//        when (view?.id) {
//            R.id.ibHomeMenu -> {
//                slideRight()
//            }
//            R.id.layoutslide -> {
//                slideLeft()
//            }
//        }
//        ibHomeMenu.setOnClickListener {}
//        ivLogout.setOnClickListener(View.OnClickListener {
//            val i = Intent(context, LogInActivity::class.java)
//            startActivity(i)
//        })
//    }
//    private fun slideRight() {
//        val slide = Slide()
//        slide.slideEdge = Gravity.START
//        TransitionManager.beginDelayedTransition(layoutslide, slide)
//        layoutslide.visibility = View.VISIBLE
//    }
//    private fun slideLeft() {
//        val slide = Slide()
//        slide.slideEdge = Gravity.START
//        TransitionManager.beginDelayedTransition(layoutslide, slide)
//        layoutslide.visibility = View.GONE
//    }
//    private fun observeLiveDataFromDB() {
//        statesViewModel.fetchStatesNameFromDB().observe(this, Observer {
//            it?.let {
//                this.statesResponseList = it
//                statesAdapter.updateStatesList(statesResponseList)
//            }
//        })
//    }

    //    private fun observeLiveData() {
//        statesViewModel.liveData.observe(this, Observer {
//            when (it) {
//                is StatesUIModel.Success -> {
//                    statesAdapter.updateStatesList(it.statesResponseList)
//                }
//
//                is StatesUIModel.Failure -> {
//                    Toast.makeText(
//                        context,
//                        "Error message ${it.error}",
//                        Toast.LENGTH_SHORT
//                    ).show()
//                }
//            }
//        })
//    }
//    private fun setRecyclerStateData() {
//        statesAdapter = StatesAdapter(statesResponseList, this)
//        val layoutManager = LinearLayoutManager(activity)
//        recycler_state.apply {
//            this.layoutManager = layoutManager
//            adapter = statesAdapter
//        }
//    }
//
//    private fun sendSMS() {
//        val uri = Uri.parse("smsto:1234567890")
//        val smsIntent = Intent(Intent.ACTION_SENDTO, uri)
//        smsIntent.putExtra(
//            "sms",
//            "Hey, Experienced covid positive symptoms. Need immediate assistance!!"
//        )
//        startActivity(smsIntent)
//    }
//
//    private fun checkForPermission() {
//        if (context?.let {
//                ContextCompat.checkSelfPermission(
//                    it,
//                    android.Manifest.permission.CALL_PHONE
//                )
//            } !=
//            PackageManager.PERMISSION_GRANTED) {
//            if (activity?.let {
//                    ActivityCompat.shouldShowRequestPermissionRationale(
//                        it,
//                        android.Manifest.permission.CALL_PHONE
//                    )
//                }!!) {
//            } else {
//                ActivityCompat.requestPermissions(
//                    activity!!,
//                    arrayOf(android.Manifest.permission.CALL_PHONE),
//                    101
//                )
//            }
//        } else {
//            callHelpLine()
//        }
//    }
//
//    override fun onRequestPermissionsResult(
//        requestCode: Int,
//        permissions: Array<out String>,
//        grantResults: IntArray
//    ) {
//        if (requestCode == 101) {
//            if ((grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
//                callHelpLine()
//            } else {
//            }
//            return
//        }
//    }
//
//    private fun callHelpLine() {
//        val callIntent = Intent(Intent.ACTION_CALL)
//        callIntent.data = Uri.parse("tel:1234567890")
//        startActivity(callIntent)
//    }
//
//
//    override fun ONclick(position: Int, state: String) {
////        statesViewModel.stateData.value = statesResponse.name
////        (activity!!.findViewById<View>(R.id.btm_navigation) as BottomNavigationView).selectedItemId =
////            R.id.action_static
////        val totalCountryFragment = MycountryFragment_total()
////        val bundle = Bundle()
////        totalCountryFragment.arguments = bundle;
////        bundle.putString("stateData", statesResponse.name);
////        Toast.makeText(
////            context, "State Name " + statesResponse.name
////                    + " " + "position " + position, Toast.LENGTH_LONG
////        ).show()
////        statesViewModel.stateData.value = statesResponse.state
////        listener.openStats(statesResponse.state!!)    }
////    private fun spinnerSelection(view: View) {
////        val countryList = ArrayList<String>()
////        countryList.add("USA")
////        countryList.add("INDIA")
////        countryList.add("EUROPE")
////        countryList.add("AUSTRALIA")
////
////        val arrayAdapter = context?.let { ArrayAdapter<String>(it, R.layout.support_simple_spinner_dropdown_item, countryList) }
////        spinner.adapter = arrayAdapter
////    }
//    }
//}