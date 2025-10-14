# 🌸 RadianceHub – Beauty & Wellness Booking Platform

## 📘 Overview
**RadianceHub** is a digital beauty and wellness booking platform that simplifies how clients connect with salons and beauticians. The application enables users to explore services, view professional profiles, schedule appointments, and make secure payments — all from a single interface.

It bridges the gap between customers and service providers by offering a modern, efficient, and user-friendly experience designed to replace traditional manual booking processes.

---

## 🎯 Purpose of the Application
The primary aim of **RadianceHub** is to digitize and enhance the beauty service experience through a seamless and interactive platform.

### **Key Goals**
- Simplify salon booking and scheduling for customers.
- Offer a secure, multilingual, and accessible environment for all users.
- Provide beauty professionals with tools to manage appointments and showcase their expertise.
- Enable automated notifications, reminders, and review collection.
- Ensure safe and flexible payment options for every customer.

---

## ⚙️ Functional Features

1. **User Registration & Login**
   - Secure sign-up and login using email or Google account.
   - Passwords are encrypted before storage.
   - Session management ensures user data security.

2. **Service Categories**
   - Four main categories: *Nails, Hair, Facial, and Massage.*
   - Each displays pricing, duration, and available staff.
   - Users can filter results by service, stylist, or price range.

3. **Booking System**
   - Real-time booking interface to choose services and times.
   - Booking confirmation summary before finalizing.
   - Options to reschedule or cancel appointments easily.

4. **Service Bundles**
   - Users can combine multiple services (e.g., *Haircut + Facial*).
   - Package deals for improved affordability.

5. **Technician Profiles**
   - Each stylist has a portfolio with their skills, experience, images, and reviews.

6. **Notifications & Reminders**
   - Email, SMS, and push notifications for bookings and reminders.
   - Follow-up requests for feedback after completed appointments.

7. **Payments**
   - Supports card payments, digital wallets, and online banking.
   - “Pay at Salon” option available for added flexibility.
   - Transactions comply with PCI-DSS standards for security.

8. **Reviews & Ratings**
   - Customers can provide ratings and written feedback.
   - Reviews help guide future customer decisions.

---

## 🎨 Design Considerations

### **1. User Interface (UI) Design**
The interface focuses on simplicity, elegance, and accessibility.

- **Onboarding:** Users are prompted to log in or register. If unregistered, they are redirected to the sign-up page, with Google login available.
- **Profile Page:** After signing in, users can select their preferred language — English, Sepedi, or Zulu — and save their choice.
- **Navigation:** The app includes consistent top and bottom navigation bars for smooth transitions between pages.
- **Service Pages:** Each page highlights available services with a *Book Now* button.
- **Booking Page:** Users can confirm or modify appointments and view a summary before payment.
- **Location Tab:** Displays how far the salon is from the user, promoting convenience and travel planning.

---

### **2. User Experience (UX) Objectives**
RadianceHub’s UX design emphasizes inclusivity, convenience, and efficiency.

- **Ease of Use:** No more than three clicks to complete a booking.
- **Consistency:** Common layout and color themes throughout the app.
- **Accessibility:** Multilingual interface and clear visual icons.
- **Feedback Mechanisms:** Notifications and confirmations for user actions.
- **Performance:** Fast loading times and real-time booking confirmation.

---

### **3. Core Design Principles**

| Principle | Application in RadianceHub |
|------------|-----------------------------|
| **Visibility of system status** | Clear feedback for every booking or payment action. |
| **User control and freedom** | Users can cancel or change bookings easily. |
| **Consistency and standards** | Layouts, colors, and navigation remain uniform. |
| **Error prevention** | Input validation during sign-up and booking. |
| **Recognition rather than recall** | Familiar buttons and icons simplify navigation. |

---

### **4. Technical Design**

- **Performance:** Loads all screens within 3 seconds; real-time data processing.
- **Scalability:** Initially for one salon but extendable to multiple salons or freelancers.
- **Security:** Password encryption, POPIA compliance, and secure transactions.
- **Reliability:** Cloud-hosted for 99.9% uptime with automated backups.
- **Usability:** Mobile-responsive design suitable for all device types.

---

## 🧠 GitHub Utilization

### **1. Version Control and Collaboration**
GitHub acts as the main repository for managing code, documentation, and project collaboration.

**Key Practices:**
- Source code stored and updated through GitHub for transparency and backup.
- Branching system used for feature development (e.g., `feature/booking-system`, `feature/user-authentication`).
- Pull Requests allow team members to review and approve updates.
- Descriptive commit messages document all changes for traceability.
- GitHub Issues track bugs, enhancements, and milestones.

**Example Git Commands:**
```bash
# Clone repository
git clone https://github.com/username/RadianceHub.git

# Create feature branch
git checkout -b feature/booking-system

# Add and commit updates
git add .
git commit -m "Implemented appointment booking feature"

# Push changes to GitHub
git push origin feature/booking-system
```

---

## ⚙️ GitHub Actions

### **2. Continuous Integration and Deployment (CI/CD)**
**GitHub Actions** automates RadianceHub’s build, testing, and deployment workflow. This ensures every new update is reliable before being integrated into production.

#### **Purpose:**
- Automate application builds and tests on every commit.
- Detect and prevent broken code from reaching production.
- Ensure fast, consistent, and error-free deployment cycles.

#### **Example Workflow File:** `.github/workflows/dotnet.yml`
```yaml
name: .NET Build and Test

on:
  push:
    branches: [ "main" ]
  pull_request:
    branches: [ "main" ]

jobs:
  build:
    runs-on: ubuntu-latest
    steps:
      - name: Checkout repository
        uses: actions/checkout@v3
      
      - name: Setup .NET environment
        uses: actions/setup-dotnet@v3
        with:
          dotnet-version: 9.0.x
      
      - name: Restore dependencies
        run: dotnet restore
      
      - name: Build project
        run: dotnet build --no-restore --configuration Release
      
      - name: Run automated tests
        run: dotnet test --no-build --verbosity normal
```

#### **Advantages of GitHub Actions:**
- Guarantees consistent code quality through automated testing.
- Reduces manual deployment workload.
- Provides instant feedback on build or test failures.
- Increases reliability and development speed.

---

## 📂 Project Folder Structure
```
RadianceHub/
│
├── Controllers/
├── Models/
├── Views/
├── wwwroot/
│   ├── css/
│   ├── js/
│   └── images/
├── .github/workflows/
│   └── dotnet.yml
├── appsettings.json
├── Program.cs
├── README.md
└── RadianceHub.csproj
```

---

## 🔮 Future Improvements
- Integration with Google Maps API for real-time navigation.
- Loyalty and rewards program for returning clients.
- AI-based recommendations for personalized service suggestions.
- Administrative dashboards for multi-salon management.
---

## 👩‍💻 Youtube Link
**(https://youtu.be/5iHR3mspLws?feature=shared) 

---

## 👩‍💻 Author
**Project Manager & Developer:** Molebogeng Monyethabeng  
**Repository:** [GitHub Repository Link](https://github.com/your-username/RadianceHub)

---

## 📄 License
This project is licensed under the **MIT License**, permitting reuse and modification with proper credit.


