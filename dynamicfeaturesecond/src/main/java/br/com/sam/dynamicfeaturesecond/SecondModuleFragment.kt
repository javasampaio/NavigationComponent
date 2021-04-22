package br.com.sam.dynamicfeaturesecond

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.second_fragment.*

class SecondModuleFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.second_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_first.setOnClickListener {
            Navigation.findNavController(requireActivity(), R.id.includedGraphOne).navigate(R.id.action_SecondModuleFragment_to_FirstModuleFragment)
            //findNavController().navigate(R.id.action_SecondModuleFragment_to_FirstModuleFragment)
        }
    }
}