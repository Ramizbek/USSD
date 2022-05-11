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
import kotlinx.android.synthetic.main.item_rv2.view.*
import ramizbek.aliyev.ussd.R
import ramizbek.aliyev.ussd.models.UserTariflarAdapter

class TariflarAdapter(var context: Context, var list: List<UserTariflarAdapter>) :
    RecyclerView.Adapter<TariflarAdapter.Vh>() {
    inner class Vh(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun onBind(context: Context,user: UserTariflarAdapter) {
            val animation = AnimationUtils.loadAnimation(context, R.anim.rv_anim)
            itemView.startAnimation(animation)
            itemView.tv_name.text = user.nomi
            itemView.tv_kun.text = user.kun
            itemView.tv_narx.text = user.narx
            itemView.tv_code.text = user.code
            itemView.info.text = user.info
            itemView.setOnClickListener {
                val intent = Intent(Intent.ACTION_DIAL)
                intent.data = Uri.parse("tel:${itemView.tv_code.text}")
                context.startActivity(intent)
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.item_rv2, parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(context,list[position])
    }
    override fun getItemCount(): Int = list.size
}