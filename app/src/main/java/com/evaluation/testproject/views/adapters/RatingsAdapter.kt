package com.evaluation.testproject.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.evaluation.testproject.app.MyApplication
import com.evaluation.testproject.databinding.ItemAddressBinding
import com.evaluation.testproject.databinding.ItemRatingsAdapterBinding
import com.evaluation.testproject.models.category.GamesResponse
import com.evaluation.testproject.viewModels.MainVM

class RatingsAdapter (private val homeVM: MainVM,ratingsRes: ArrayList<GamesResponse.Ratings>,position: Int) :
    RecyclerView.Adapter<RatingsAdapter.ViewHolder>() {

    var selectedPosition = RecyclerView.NO_POSITION
    var actualPosition = position
    private var ratings: ArrayList<GamesResponse.Ratings> = ratingsRes

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding =
            ItemRatingsAdapterBinding.inflate(inflater, parent, false)

        return ViewHolder(binding)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(
            position,
            ratings?.get(position)
        )
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return ratings?.size
            ?: 0
    }

    //the class is holding the list view
    inner class ViewHolder(private val binding: ItemRatingsAdapterBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(position: Int,ratingResponse: GamesResponse.Ratings) {

            binding.position = position
            binding.viewModel = homeVM
            binding.categoryData = ratingResponse

            binding.executePendingBindings()
        }
    }
}