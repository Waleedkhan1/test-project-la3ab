package com.evaluation.testproject.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.evaluation.testproject.R
import com.evaluation.testproject.app.MyApplication
import com.evaluation.testproject.databinding.FragmentCategoryDetailBinding
import com.evaluation.testproject.models.category.GamesResponse
import com.evaluation.testproject.viewModels.MainVM
import com.evaluation.testproject.views.adapters.CategoriesAdapter
import com.evaluation.testproject.views.adapters.PlatformAdapter
import com.evaluation.testproject.views.adapters.RatingsAdapter
import com.evaluation.testproject.views.fragments.base.BaseFragment
import com.evaluation.testproject.vmCallbacks.category.MainCallBack

class CategoriesDetailFragment : BaseFragment() {
    private val TAG = CategoriesDetailFragment::class.java.simpleName
    private lateinit var binding: FragmentCategoryDetailBinding

    private lateinit var imageURL: String

    var objData: GamesResponse.Results? = null
    var position: Int? = 0

    private val homeVM: MainVM by lazy {
        ViewModelProvider(this).get(
            MainVM::class.java
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        objData =
            arguments?.getSerializable("data") as GamesResponse.Results?

        position = arguments?.getInt("position")

    }

    override fun onResume() {
        super.onResume()
        homeListener.onHomeDataChangeListener(
            false,
            false,
            false,
            View.GONE,
            View.GONE,
            "",
            View.GONE,
            View.GONE,
            View.GONE
        )

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        if (mView == null) {
            mView = inflater.inflate(R.layout.fragment_category_detail, container, false)
            binding = FragmentCategoryDetailBinding.bind(mView!!)
                .apply {
                    this.lifecycleOwner = this@CategoriesDetailFragment
                    this.viewModel = homeVM
                }
        }
        return mView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        homeVM.getFragmentCB().observe(viewLifecycleOwner, vmCallbackObserver)
        homeVM.getCallback().observe(viewLifecycleOwner, callbackObserver)

        objData?.let { init(position, it) }
    }

    private val callbackObserver = Observer<MainCallBack> { callBack ->
        when (callBack) {
            MainCallBack.PopulateSubCategoriesData -> {
            }
        }
    }

    private fun init(position: Int?, objData: GamesResponse.Results) {

        Glide.with(MyApplication.applicationContext())
            .load(objData.background_image)
            .into(binding.ivDetail)

        binding.tvGameName.text = objData.name

        val ratingsAdapter: RatingsAdapter by lazy {
            RatingsAdapter(homeVM,objData.ratings,position!!)
        }

        val platformAdapter: PlatformAdapter by lazy {
            PlatformAdapter(homeVM,objData.platforms,position!!)
        }

        binding.rvRatings.apply {
            adapter = ratingsAdapter
        }

        binding.rvPlatform.apply {
            adapter = platformAdapter
        }

        binding.rvRatings.adapter?.notifyDataSetChanged()
        binding.rvPlatform.adapter?.notifyDataSetChanged()
    }

    override fun onDestroyView() {
        homeVM.clearObservers(vmCallbackObserver)
        super.onDestroyView()
    }
}