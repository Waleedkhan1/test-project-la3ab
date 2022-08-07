package com.evaluation.testproject.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.evaluation.testproject.databinding.ItemSubCategoriesBinding
import com.evaluation.testproject.viewModels.MainVM

class SubCategoriesAdapter (private val orderHistoryVM: MainVM) :
    RecyclerView.Adapter<SubCategoriesAdapter.ViewHolder>() {
    var selectedPosition = RecyclerView.NO_POSITION

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding =
            ItemSubCategoriesBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    //the class is holding the list view
    inner class ViewHolder(private val binding: ItemSubCategoriesBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(position: Int) {

            binding.position = position
            binding.viewModel = orderHistoryVM
//            binding.categoryData = mSliderItems


            binding.executePendingBindings()
        }
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}