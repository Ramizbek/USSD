package ramizbek.aliyev.ussd.adapters

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_rv.view.*
import kotlinx.android.synthetic.main.item_sms.view.*
import ramizbek.aliyev.ussd.R
import ramizbek.aliyev.ussd.models.UserSMS
import java.util.jar.Manifest


class SMSAdapter(
    var context: Context, var list: List<UserSMS>
) :
    RecyclerView.Adapter<SMSAdapter.Vh>() {
    inner class Vh(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun onBind(context: Context, user: UserSMS) {
            val animation = AnimationUtils.loadAnimation(context, R.anim.rv_anim)
            itemView.startAnimation(animation)
            itemView.tv_count_sms.text = user.count
            itemView.tv_price.text = user.price
            itemView.tv_day.text = user.day
            itemView.tv_codee.text = user.yoqish
            itemView.setOnClickListener {
                val intent = Intent(Intent.ACTION_DIAL)
                val encodedHash = Uri.encode("#")
                intent.data = Uri.parse("tel:" + "${itemView.tv_codee.text}" + encodedHash)
                context.startActivity(intent)
                33
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SMSAdapter.Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.item_sms, parent, false))

    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(context, list[position])

    }

    override fun getItemCount(): Int = list.size

}