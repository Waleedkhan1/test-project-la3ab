package com.evaluation.testproject.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.evaluation.testproject.app.MyApplication
import com.evaluation.testproject.databinding.ItemPlatformsAdapterBinding
import com.evaluation.testproject.databinding.ItemRatingsAdapterBinding
import com.evaluation.testproject.models.category.GamesResponse
import com.evaluation.testproject.viewModels.MainVM

class PlatformAdapter (private val homeVM: MainVM, platformRes: ArrayList<GamesResponse.PlatForms>, position: Int) :
    RecyclerView.Adapter<PlatformAdapter.ViewHolder>() {

    var selectedPosition = RecyclerView.NO_POSITION
    var actualPosition = position
    private var platforms: ArrayList<GamesResponse.PlatForms> = platformRes

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding =
            ItemPlatformsAdapterBinding.inflate(inflater, parent, false)

        return ViewHolder(binding)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(
            position,
            platforms?.get(position)
        )
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return platforms?.size
            ?: 0
    }

    //the class is holding the list view
    inner class ViewHolder(private val binding: ItemPlatformsAdapterBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(position: Int,platformResponse: GamesResponse.PlatForms) {

            binding.position = position
            binding.viewModel = homeVM
            binding.categoryData = platformResponse

            Glide.with(MyApplication.applicationContext())
                .load(platformResponse.platform.image_background)
                .into(binding.ivRecipy)

            binding.executePendingBindings()
        }
    }
}