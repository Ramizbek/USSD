package ramizbek.aliyev.ussd.adapters

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_rv.view.*
import ramizbek.aliyev.ussd.R
import ramizbek.aliyev.ussd.models.UserInternetPaket

class InternetPaketAdapter(var context: Context, var list: List<UserInternetPaket>) :
    RecyclerView.Adapter<InternetPaketAdapter.Vh>() {
    inner class Vh(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun onBind(context: Context,user: UserInternetPaket) {


            val animation = AnimationUtils.loadAnimation(context, R.anim.rv_anim)
            itemView.startAnimation(animation)
            itemView.tv_internet.text = user.mb
            itemView.tv_kun1.text = user.kun
            itemView.tv_narx1.text = user.narx
            itemView.tv_code1.text = user.code
            itemView.setOnClickListener {
                val intent = Intent(Intent.ACTION_DIAL)
                intent.data = Uri.parse("tel:${itemView.tv_code1.text}")
                context.startActivity(intent)
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.item_rv, parent, false))
    }
    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(context,list[position])
    }
    override fun getItemCount(): Int = list.size
}