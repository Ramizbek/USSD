package ramizbek.aliyev.ussd

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_second.*
import ramizbek.aliyev.ussd.adapters.SMSAdapter
import ramizbek.aliyev.ussd.databinding.FragmentTypeSMSBinding
import ramizbek.aliyev.ussd.models.UserSMS


class TypeSMS : Fragment() {
    lateinit var binding:FragmentTypeSMSBinding
    lateinit var typeSMS:ArrayList<UserSMS>
    lateinit var smsAdapter: SMSAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        loadData()
        binding = FragmentTypeSMSBinding.inflate(layoutInflater)

        smsAdapter = SMSAdapter(container!!.context,typeSMS)
        binding.rvSms.adapter = smsAdapter

        return binding.root
    }

    private fun loadData() {
        typeSMS = ArrayList()
        typeSMS.add(UserSMS(R.drawable.beeline, "20 SMS", "500 so'm", "Kun", "*110*161#"))
        typeSMS.add(UserSMS(R.drawable.beeline, "50 SMS", "1000 so'm", "Kun", "*110*162#"))
        typeSMS.add(UserSMS(R.drawable.beeline, "250 SMS", "1300 so'm", "Kun", "*110*151#"))
        typeSMS.add(UserSMS(R.drawable.beeline, "100 SMS", "5263 so'm", "Oy", "*110*044#"))
        typeSMS.add(UserSMS(R.drawable.beeline, "500 SMS", "13 683 so'm", "Oy", "*110*045#"))
        typeSMS.add(UserSMS(R.drawable.beeline, "1000 SMS", "22 103 so'm", "Oy", "*110*046#"))
        typeSMS.add(UserSMS(R.drawable.beeline, "25 SMS(xalqaro)", "5263 so'm", "-", "*110*041#"))
        typeSMS.add(UserSMS(R.drawable.beeline, "50 SMS(xalqaro)", "8420 so'm", "-", "*110*042#"))
        typeSMS.add(UserSMS(R.drawable.beeline, "100 SMS(xalqaro)", "12 630 so'm", "-", "*110*043#"))
    }
}