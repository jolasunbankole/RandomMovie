package com.example.randommovie.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayoutStates.TAG
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.randommovie.R
import com.example.randommovie.databinding.FragmentMoviesBinding
import com.example.randommovie.viewmodel.MovieViewModel


class MoviesFragment : Fragment() {

    private lateinit var binding: FragmentMoviesBinding






    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_movies, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewModel = ViewModelProvider(this)[MovieViewModel::class.java]
        binding.TitleText.text
        viewModel.getItem()
        viewModel.movieResponseList.observe(viewLifecycleOwner, Observer {
            for (item in it){
                Log.d(TAG, item.id)
                Log.d(TAG, item.title)
                Log.d(TAG, item.image)
                Log.d(TAG, item.year)
            }
        })


    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding
    }
}