package org.techtown.review_mango_contents

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

/*2-4. 리사이클러뷰를 하려고 어댑터를 만들었다.*/

/*2-6. 데이터 모델인 ContentsModel을 가진 리스트를 만든다. */
class RVAdapter(val context : Context, val List : MutableList<ContentsModel>) : RecyclerView.Adapter<RVAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.rv_item,parent,false)

        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RVAdapter.ViewHolder, position: Int) {
        holder.bindItems(List[position])
    }

    override fun getItemCount(): Int {
        return List.size
    }

    /*2-7. 뷰홀더를 만든다.*/
    inner class ViewHolder(itemView : View):RecyclerView.ViewHolder(itemView){
        fun bindItems(item : ContentsModel){
            val rv_text = itemView.findViewById<TextView>(R.id.rvTextArea)
            val rv_img = itemView.findViewById<ImageView>(R.id.rvImageArea)

            /*2-8. 이미지 주소를 불러오려면 글라이더 라는 놈을 써야한다.*/
            rv_text.text = item.titleText
            Glide.with(context)
                .load(item.ImageUrl)
                .into(rv_img)
        }
    }
}