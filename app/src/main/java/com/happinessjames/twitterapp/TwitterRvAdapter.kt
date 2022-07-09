package com.happinessjames.twitterapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TwitterRvAdapter (var tweetList: List<Twitter>): RecyclerView.Adapter<TwitterViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TwitterViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.twitter_lists_items,parent,false)
        return TwitterViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: TwitterViewHolder, position: Int) {
        var currentTweet = tweetList.get(position)
        holder.tvName.text = currentTweet.name
        holder.tvHandle.text = currentTweet.handle
        holder.tvTwitt.text = currentTweet.twitt
        holder.tvComment.text = currentTweet.commentCount
        holder.tvLike.text = currentTweet.likesCount
        holder.tvRetweet.text = currentTweet.retweetCount


    }

    override fun getItemCount(): Int {
        return tweetList.size

    }
}
class TwitterViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var ivHappy = itemView.findViewById<TextView>(R.id.ivHappy)
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvHandle = itemView.findViewById<TextView>(R.id.tvHandle)
    var tvTwitt = itemView.findViewById<TextView>(R.id.tvTwitt)
    var ivComment = itemView.findViewById<TextView>(R.id.ivComment)
    var tvComment = itemView.findViewById<TextView>(R.id.tvComment)
    var ivRetweet = itemView.findViewById<TextView>(R.id.ivRetweet)
    var tvRetweet = itemView.findViewById<TextView>(R.id.tvRetweet)
    var ivLike = itemView.findViewById<TextView>(R.id.ivLike)
    var tvLike = itemView.findViewById<TextView>(R.id.tvLike)
    var ivShare = itemView.findViewById<TextView>(R.id.ivShare)
}