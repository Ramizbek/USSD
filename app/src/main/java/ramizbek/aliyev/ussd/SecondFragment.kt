package ramizbek.aliyev.ussd

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import ramizbek.aliyev.ussd.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)

        binding.apply {
            internet.setOnClickListener {

                findNavController().navigate(
                    R.id.internetPaketFragment,
                    bundleOf("keyName" to R.id.internet)
                )
            }
            tariflar.setOnClickListener {
                findNavController().navigate(
                    R.id.tariflarFragment,
                    bundleOf("keyName" to R.id.tariflar)
                )
            }

            tvSms.setOnClickListener {
                findNavController().navigate(R.id.typeSMS, bundleOf("keyName" to R.id.tv_sms))

            }
            daqiqalar.setOnClickListener {
                findNavController().navigate(R.id.daqiqaFragment, bundleOf("keyName" to R.id.daqiqalar))

            }
            xizmatlar.setOnClickListener {
                findNavController().navigate(R.id.xizmatlarFragment, bundleOf("keyName" to R.id.xizmatlar))

            }
            yangiliklar.setOnClickListener {
                findNavController().navigate(R.id.yangiliklarFragment, bundleOf("keyName" to R.id.yangiliklar))
            }
        }

        return binding.root
    }
}