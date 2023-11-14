package me.nicotoast.autosize.example

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import me.nicotoast.autosize.example.databinding.FragmentAutoSizeBinding

/**
 * Created by lucas on 2023/11/14.
 */
class AdaptedFragment : AutoSizeFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentAutoSizeBinding.inflate(inflater, container, false).root
}