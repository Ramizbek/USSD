package ramizbek.aliyev.ussd

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Spinner
import android.widget.TextView
import ramizbek.aliyev.ussd.adapters.XizmatlarAdapter
import ramizbek.aliyev.ussd.databinding.FragmentXizmatlarBinding
import ramizbek.aliyev.ussd.models.UserXizmatlar


class XizmatlarFragment : Fragment() {
    lateinit var binding: FragmentXizmatlarBinding
    lateinit var typeXizmat: ArrayList<UserXizmatlar>
    lateinit var xizmatlarAdapter: XizmatlarAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentXizmatlarBinding.inflate(layoutInflater)
        loadData()

        xizmatlarAdapter = XizmatlarAdapter(container!!.context, typeXizmat)
        binding.rvXizmatlar.adapter = xizmatlarAdapter


        return binding.root
    }

    private fun loadData() {
        typeXizmat = ArrayList()
        typeXizmat.add(
            UserXizmatlar(
                "XABARDOR BO'L", "Telefongiz o'chib qolsa, sizga telefon qilgan\n" +
                        "ragamlar SMS tarigasida keladi.\n" +
                        "Ulanish narxi: O so'm.\n" +
                        "Kunlik abonent to\"lovi: 240 so'm.", "*110*051#", "*110*050#"
            )
        )
        typeXizmat.add(
            UserXizmatlar(
                "BOG’LANISH MUMKIN",
                "Telefoningiz o'chib qolsa, sizga telefon gilgan\n" +
                        "ragamlarga, telefoningiz yoqilgani hacida SMS\n" +
                        "tarigasida ma'\"lumot beriladi.\n" +
                        "Ulanish narxi: O cyM.\n" +
                        "Kunlik abonent to'lovi: 240 so'm", "*110*051#", "*110*052#"
            )
        )
        typeXizmat.add(
            UserXizmatlar(
                "ANTIANIOLAGICH", "Telefon raqamingizni yashirish.\n" +
                        "Ulanish narxi: 421 so'm\n" +
                        "Kunlik abonent to'lovi: 421 so'm.\n", "*110*071#", "*110*070"
            )
        )
        typeXizmat.add(
            UserXizmatlar(
                "RAGAMNIANIOLAGICH", "Yashiringan telefon raqaminidan kelayotgan\n" +
                        "qo'ng'iroqlarniko'rish.\n" +
                        "Ulanish narxi: O cyM.\n" +
                        "Kunlik abonent to'lovi: O so'm.", "*110*062#", "*110*060#"
            )
        )
        typeXizmat.add(
            UserXizmatlar(
                "SIRLIQO'NG'IROQ", "O' raqamingizni yashirib qo'ng'iroq qiling.\n" +
                        "Chagirilayotgan abonent raqami oldiga # belgisini\n" +
                        "go'shing." +
                        "Misol:#99890XXXXXXX" +
                        "Xizmat Narxi:252,60 so'm", "*110*062#", ""
            )
        )
        typeXizmat.add(
            UserXizmatlar(
                "MENING MUSIQAM",
                "Sizga telefon qilishganida, odatiy chaqiruv\n" +
                        "ovozini o'rniga xar xil ohanglar o'rnatiladi.\n" +
                        "Ulanish narxi: 842 so'm.\n" +
                        "Kunlik abonent to\"lovi: 210,50 so'm.",
                " Yoqish: *110*311#",
                "Ochirish: *110*310#"
            )
        )
        typeXizmat.add(
            UserXizmatlar(
                "RAGAMNI BLOKIROVKA OILISH", "Narxi: 421 so'm.\n" +
                        "Raqamingizni blokirovkaga qo'shish va yechish\n" +
                        "uchun 0611 qisqa raqamiga telefon qiling.", "", ""
            )
        )
        typeXizmat.add(
            UserXizmatlar(
                "BOSHQA RAQAMGA YO'NALTIRISH", "Foydalanish:**21*RAQAM*11#\n" +
                        "Masalan:**21*931821234*11#\n" +
                        "Ulanish narxi: 0 cyM.\n" +
                        "Dagigasi: 421 so'm.",  "", "##21#"
            )
        )
    }
}