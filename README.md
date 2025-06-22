# CometChat UI Kit Integration – Internship Assignment

## 📱 Project Overview

This project showcases the integration of CometChat's **Tab-Based UI Kit** into an Android application 
using **Kotlin**. The app allows users to sign up, log in, and chat with other users or groups.
Additionally, this functionality has also been extended into my personal project **Safety App**, 
enabling communication between the user and their guardians.

---

## 🔧 Features Implemented

- ✅ Integrated **Tab-Based CometChat UI Kit**
- ✅ Implemented **user sign-up and login system**
- ✅ Enabled **chat messaging functionality** using `CometChatMessageListScreen` activity
- ✅ Runtime error fix by adding **Internet permission**
- ✅ Bonus: Integrated CometChat into my existing **Safety App**

---

## 🧠 Issues Faced & How I Solved Them

### 1. **Messaging not working after clicking users/groups**
- **Problem:** Clicking on a user/group didn’t open any chat window.
- **Cause:** The Tab-based UI Kit documentation didn’t include the messaging implementation.
- **Solution:** Referred to the **“Conversation List + Message View”** documentation. Identified `CometChatMessageListScreen` and used proper `Intent` with extras to launch chats.
- **Recommendation:** Improve the UI Kit documentation by including this essential part for a working app.

### 2. **User Sign-Up and Login**
- **Problem:** CometChat doesn’t provide built-in sign-up/login UI.
- **Solution:** Built a custom **sign-up and login** screen to register and authenticate users. Used CometChat Dashboard for initial user creation fallback.

### 3. **Runtime Crash due to Missing Internet Permission**
- **Problem:** App was crashing due to network operations.
- **Solution:** Added required permission in `AndroidManifest.xml`:
  ```xml
  <uses-permission android:name="android.permission.INTERNET"/>


![1](https://github.com/user-attachments/assets/986020f8-9880-4d76-bf9b-688db73e1c84)


  
