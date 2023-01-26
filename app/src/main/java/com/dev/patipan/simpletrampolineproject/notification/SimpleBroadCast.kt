package com.dev.patipan.simpletrampolineproject.notification

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.dev.patipan.simpletrampolineproject.SecondPageActivity

class SimpleBroadCast : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        context?.startActivity(
            Intent(context, SecondPageActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            })
    }
}