package com.example.pictureenglishcards

import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class FragmentBir : Fragment() {


    private lateinit var newRecyclerView: RecyclerView
    private val newArrayList = ArrayList<ClassData>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bir, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //val data = ClassData(R.id.learned, "kjdnskdsj", "nsckjcdn", "jkxxknj")
       // newArrayList.add(data)
    }
}