package com.example.cometchat

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import com.cometchat.chat.core.CometChat
import com.cometchat.chat.exceptions.CometChatException
import com.cometchat.chat.models.User
import com.cometchat.chatuikit.shared.cometchatuikit.CometChatUIKit


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        CometChatUIKit.login("cometchat-uid-3", object : CometChat.CallbackListener<User>() {
            override fun onSuccess(user: User) {

                startActivity(Intent(this@MainActivity, ConversationActivity::class.java))

            }

            override fun onError(e: CometChatException) {
                Log.e("Login", "Login failed: ${e.message}")
            }
        })
    }
}
