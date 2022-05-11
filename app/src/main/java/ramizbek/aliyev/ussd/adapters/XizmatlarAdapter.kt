package ramizbek.aliyev.ussd.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_xizmatlar.view.*
import ramizbek.aliyev.ussd.R
import ramizbek.aliyev.ussd.XizmatlarFragment
import ramizbek.aliyev.ussd.models.UserXizmatlar

class XizmatlarAdapter (
    var context: Context, var list: List<UserXizmatlar>):
    RecyclerView.Adapter<XizmatlarAdapter.Vh>() {
     inner class Vh(itemView: View):RecyclerView.ViewHolder(itemView){
         fun onBind(userXizmatlar: UserXizmatlar){
             val animation = AnimationUtils.loadAnimation(context, R.anim.rv_anim)
             itemView.startAnimation(animation)
             itemView.tv_title_name.text = userXizmatlar.titleName
             itemView.information.text = userXizmatlar.information
             itemView.yoqish33.text = userXizmatlar.yoqish
             itemView.ochirish.text = userXizmatlar.ochirish

         }
     }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): XizmatlarAdapter.Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.item_xizmatlar, parent, false))

    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int  = list.size

}