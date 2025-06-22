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
- ✅ Enabled **chat messaging functionality** using `MessageActivity` activity
- ✅ Runtime error fix by adding **Internet permission**
- ✅ Bonus: Integrated CometChat into my existing **Safety App**

---

## 🧠 Issues Faced & How I Solved Them

### 1. **Messaging not working after clicking users/groups**
- **Problem:** Clicking on a user/group didn’t open any chat window.
- **Cause:** The Tab-based UI Kit documentation didn’t include the messaging implementation.
- **Solution:** Referred to the **“Conversation List + Message View”** documentation. Identified `MessageActivity` and used proper `Intent` with extras to launch MessageActivity to actually send and recieve messages from the users or groups.
- **Recommendation:** Improve the UI Kit documentation (Tab-Based section) by including this essential part for a working app.

### 2. **User Sign-Up and Login**
- **Problem:** CometChat doesn’t provide a built-in sign-up/login UI, and initially required logging in by hardcoding user IDs in the code or manually adding users through the CometChat Dashboard.
- **Solution:** Built a custom **sign-up and login** screen to register and authenticate users.

### 3. **Runtime Crash due to Missing Internet Permission**
- **Problem:** App was crashing due to network operations.
- **Solution:** Added required permission in `AndroidManifest.xml`:
  ```xml
  <uses-permission android:name="android.permission.INTERNET"/>

 ## Screen recording
 
https://github.com/user-attachments/assets/7bba265e-053a-4b71-80fc-475f695ec4b1

## Screenshots

![1](https://github.com/user-attachments/assets/986020f8-9880-4d76-bf9b-688db73e1c84)
![2](https://github.com/user-attachments/assets/d50622fb-79d4-48aa-80a8-7e91f369c34b)
![3](https://github.com/user-attachments/assets/876f58c0-d94a-4a25-8613-9902db68f2f2)
![4](https://github.com/user-attachments/assets/f88c677e-5307-4840-a2b0-71613047c44e)
![5](https://github.com/user-attachments/assets/6fd1430c-1ff5-4c20-9382-b58cc4bc3da4)
![6](https://github.com/user-attachments/assets/f8b69f6b-28b0-4e7d-a73a-9f98f46de730)

## 🔗 Additional Integration

This chat feature was also integrated into my [Safety App](https://github.com/aritra404/Safety_app-main), enabling real-time communication between users and their guardians. This added functionality enhances the app’s safety focus by allowing trusted contact support during emergencies.

Users can click this button to open CometChat
![WhatsApp Image 2025-06-22 at 18 51 59_edd97b7c](https://github.com/user-attachments/assets/5e47223d-5ea3-4ac1-a52a-9ef5cdd82d84)

