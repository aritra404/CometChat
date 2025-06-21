package com.example.cometchat

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import com.cometchat.chat.core.CometChat
import com.cometchat.chat.exceptions.CometChatException
import com.cometchat.chat.models.User
import com.cometchat.chatuikit.shared.cometchatuikit.CometChatUIKit
import com.cometchat.chatuikit.shared.cometchatuikit.UIKitSettings
import android.content.Intent


class MainActivity : ComponentActivity() {

    private val TAG = "MainActivity"

    private val appID = "27770458febb23d2"
    private val region = "IN"
    private val authKey = "266c684bf58feda9602ff9062128ba19cce9c865"

    private val uiKitSettings = UIKitSettings.UIKitSettingsBuilder()
        .setRegion(region)
        .setAppId(appID)
        .setAuthKey(authKey)
        .subscribePresenceForAllUsers()
        .build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        CometChatUIKit.init(this, uiKitSettings, object : CometChat.CallbackListener<String?>() {
            override fun onSuccess(successString: String?) {

                Log.d(TAG, "Initialization completed successfully")

                loginUser()
            }

            override fun onError(e: CometChatException?) {}
        })
    }

    private fun loginUser() {
        CometChatUIKit.login("cometchat-uid-1", object : CometChat.CallbackListener<User>() {
            override fun onSuccess(user: User) {

                // ✅ Option 1: Launch One-to-One or Group Chat Screen
                // val intent = Intent(this@MainActivity, MessageActivity::class.java)
                // intent.putExtra("uid", "cometchat-uid-1")
                // startActivity(intent)

                // ✅ Option 2: Launch Conversation List + Message View (Split-Screen Style)
                 //startActivity(Intent(this@MainActivity, ConversationActivity::class.java))

                // ✅ Option 3: Launch Tab-Based Chat Experience (Chats, Calls, Users, Groups)
                 startActivity(Intent(this@MainActivity, TabbedActivity::class.java))
            }

            override fun onError(e: CometChatException) {
                // Handle login failure (e.g. show error message or retry)
                Log.e("Login", "Login failed: ${e.message}")
            }
        })
    }
}


