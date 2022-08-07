package com.evaluation.testproject.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.evaluation.testproject.app.MyApplication
import com.evaluation.testproject.databinding.ItemAddressBinding
import com.evaluation.testproject.models.category.GamesResponse
import com.evaluation.testproject.viewModels.MainVM
import java.util.*
import java.util.Comparator.comparing

class CategoriesAdapter (private val homeVM: MainVM) :
    RecyclerView.Adapter<CategoriesAdapter.ViewHolder>() {
    var selectedPosition = RecyclerView.NO_POSITION

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding =
            ItemAddressBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(
            position,
            homeVM.gamesResponse.value?.results?.get(position)!!
        )

//
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return  homeVM.gamesResponse.value?.results?.size
            ?: 0
    }

    //the class is holding the list view
    inner class ViewHolder(private val binding: ItemAddressBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(position: Int,categoriesResponse: GamesResponse.Results) {

            binding.position = position
            binding.viewModel = homeVM
            binding.categoryData = categoriesResponse

            Glide.with(MyApplication.applicationContext())
                .load(categoriesResponse.background_image)
                .into(binding.ivImage)

            binding.executePendingBindings()
        }
    }
}