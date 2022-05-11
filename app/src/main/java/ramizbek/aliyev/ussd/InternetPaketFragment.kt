package ramizbek.aliyev.ussd

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ramizbek.aliyev.ussd.adapters.InternetPaketAdapter
import ramizbek.aliyev.ussd.databinding.FragmentInternetPaketBinding
import ramizbek.aliyev.ussd.models.UserInternetPaket

class InternetPaketFragment : Fragment() {
    lateinit var binding: FragmentInternetPaketBinding
    lateinit var typeList: ArrayList<UserInternetPaket>
    lateinit var internetPaket: InternetPaketAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInternetPaketBinding.inflate(layoutInflater)

        loadData()

        internetPaket = InternetPaketAdapter(container!!.context, typeList)

        binding.rvInternetPaket.adapter = internetPaket

        return binding.root
    }

    private fun loadData() {
        typeList = ArrayList()
        typeList.add(
            UserInternetPaket(
                R.drawable.beeline,
                "1000 MB",
                "30 kun",
                "10 000 so'm",
                "*1*01*3588#"
            )
        )
        typeList.add(
            UserInternetPaket(
                R.drawable.beeline,
                "2000 MB",
                "30 kun",
                "15 000 so'm",
                "*1*02*3588#"
            )
        )
        typeList.add(
            UserInternetPaket(
                R.drawable.beeline,
                "5000 MB",
                "30 kun",
                "25 000 so'm",
                "*1*05*3588#"
            )
        )
        typeList.add(
            UserInternetPaket(
                R.drawable.beeline,
                "10 000 MB",
                "30 kun",
                "45 000 so'm",
                "*1*10*3588#"
            )
        )
        typeList.add(
            UserInternetPaket(
                R.drawable.beeline,
                "30 000 MB",
                "30 kun",
                "75 000 so'm",
                "*1*30*3588#"
            )
        )
        typeList.add(
            UserInternetPaket(
                R.drawable.beeline,
                "50 000 MB",
                "30 kun",
                "90 000 so'm",
                "*1*50*3588#"
            )
        )
        typeList.add(
            UserInternetPaket(
                R.drawable.beeline,
                "75 000 MB",
                "30 kun",
                "110 000 so'm",
                "*1*75*3588#"
            )
        )
    }
}