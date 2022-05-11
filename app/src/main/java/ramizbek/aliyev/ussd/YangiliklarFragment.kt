package ramizbek.aliyev.ussd

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import ramizbek.aliyev.ussd.databinding.FragmentYangiliklarBinding


class YangiliklarFragment : Fragment() {
    lateinit var binding: FragmentYangiliklarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentYangiliklarBinding.inflate(layoutInflater)

        binding.apply {
            binding.imgYangilik.setOnClickListener {
                findNavController().navigate(
                    R.id.lastFragment,
                    bundleOf("keyName" to R.drawable.yangiliklar)
                )
            }
        }

        return binding.root
    }
}