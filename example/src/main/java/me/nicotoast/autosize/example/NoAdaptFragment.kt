package me.nicotoast.autosize.example

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import me.nicotoast.autosize.example.databinding.FragmentAutoSizeBinding

/**
 * Created by lucas on 2023/11/14.
 */
class NoAdaptFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentAutoSizeBinding.inflate(inflater, container, false).root
}