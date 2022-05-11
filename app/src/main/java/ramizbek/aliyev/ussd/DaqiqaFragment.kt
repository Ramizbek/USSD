package ramizbek.aliyev.ussd

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ramizbek.aliyev.ussd.adapters.DaqiqaAdapter
import ramizbek.aliyev.ussd.adapters.InternetPaketAdapter
import ramizbek.aliyev.ussd.databinding.FragmentDaqiqaBinding
import ramizbek.aliyev.ussd.databinding.FragmentInternetPaketBinding
import ramizbek.aliyev.ussd.models.UserDaqiqa
import ramizbek.aliyev.ussd.models.UserSMS


class DaqiqaFragment : Fragment() {
lateinit var binding:FragmentDaqiqaBinding
lateinit var typeDaqiqa:ArrayList<UserDaqiqa>
lateinit var daqiqaAdapter: DaqiqaAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentDaqiqaBinding.inflate(layoutInflater)

        loadData()

        daqiqaAdapter = DaqiqaAdapter(container!!.context, typeDaqiqa)

        binding.rvSms.adapter = daqiqaAdapter

        return binding.root
    }

    private fun loadData() {
        typeDaqiqa = ArrayList()
        typeDaqiqa.add(UserDaqiqa(R.drawable.beeline, "#Ko'pso'zla ", "10 000 so'm", "Oy", "*108#"))

    }
}