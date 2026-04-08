# ECommerceApp

A modern Android E-Commerce application built with **Kotlin** and **Jetpack Compose**, featuring **Firebase Authentication** for secure user access and product data from the **FakeStore API**.

---

## ✨ Features

- 🔐 User Authentication (Sign Up / Login) with Firebase Authentication
- 🛍️ Browse products from FakeStore API
- 📄 Product details screen
- 🧭 Jetpack Compose-based modern UI
- ⚡ Kotlin-first Android development

---

## 🛠️ Tech Stack

- **Language:** Kotlin
- **UI Toolkit:** Jetpack Compose
- **Authentication:** Firebase Authentication
- **API:** FakeStore API
- **Architecture:** MVVM

---

## 📱 Screens (Example)

- Splash / Welcome Screen
- Login Screen
- Sign Up Screen
- Home / Product Listing Screen
- Product Detail Screen
- Cart Screen (if implemented)

---

## 🔌 API Used

This project uses the [FakeStore API](https://fakestoreapi.com/) for sample e-commerce product data.

---

## 🔐 Firebase Setup

To run authentication, configure Firebase in your Android app:

1. Create a Firebase project in [Firebase Console](https://console.firebase.google.com/)
2. Add your Android app package
3. Download `google-services.json`
4. Place it inside your app module:
   - `app/google-services.json`
5. Enable **Email/Password** sign-in method in Firebase Authentication

---

## 🚀 Getting Started

### Prerequisites

- Android Studio (latest stable recommended)
- JDK 17+ (or version required by your Gradle setup)
- Firebase project setup
- Internet connection for API calls

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/Ashusingla90/ECommerceApp.git
   ```

2. Open the project in Android Studio

3. Add Firebase config file:
   - Place `google-services.json` in `app/`

4. Sync Gradle and run the app on an emulator/device

---

## 📂 Project Structure (Sample)

```text
app/
 ┣ data/
 ┃ ┣ remote/        # API service, DTOs
 ┃ ┗ repository/    # Data repositories
 ┣ ui/
 ┃ ┣ screens/       # Compose screens
 ┃ ┗ components/    # Reusable Compose UI components
 ┣ viewmodel/       # ViewModels
 ┗ MainActivity.kt
```

---

## 📌 Future Improvements

- ❤️ Wishlist functionality
- 🛒 Full cart and checkout flow
- 💳 Payment gateway integration
- 🌙 Dark mode support
- 🔎 Product search and filters

---

## 🤝 Contributing

Contributions are welcome!  
If you'd like to improve this project, feel free to fork the repo and submit a pull request.

---

## 📄 License

This project is licensed under the MIT License (or your preferred license).

---

## 👤 Author

**Ashusingla90**  
GitHub: [https://github.com/Ashusingla90](https://github.com/Ashusingla90)
