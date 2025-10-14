# Radiance App – Beauty & Wellness Booking Platform

![Radiance App Banner](images/radiance_banner.png)

## Overview
**Radiance App** is an open-source beauty and wellness management system that connects clients with salons, spas, and independent stylists.  
It allows users to **book appointments**, **browse services**, and **make secure payments** through a simple and elegant interface.  

The app replaces manual salon books with a smart, digital experience that is **accessible, multilingual, and mobile-friendly** — designed to empower small beauty businesses to digitise their services.

---

## Purpose of the Application
The purpose of Radiance App is to streamline and enhance the entire salon booking experience for both clients and service providers.

### Objectives
- Simplify appointment bookings, cancellations, and payments.  
- Provide inclusive access with multilingual support (English, Zulu, Sepedi).  
- Enable real-time notifications, reminders, and reviews.  
- Equip salon owners with dashboards and analytics.  
- Ensure POPIA-compliant data privacy and secure user authentication.

---

## Functional Features
1. **User Registration & Login**
   - Secure sign-up and login using email, phone, or Google account.
   - Encrypted passwords with session management.

2. **Service Listings**
   - Hair, Nails, Facial, and Massage categories with filtering by stylist or price.
   - Clear duration, price, and availability indicators.

3. **Smart Booking**
   - Real-time slot availability with booking summary and confirmation.
   - Options to reschedule or cancel bookings.

4. **Technician Profiles**
   - Showcase stylist experience, gallery, and client reviews.

5. **Notifications & Reminders**
   - Email and push notifications for confirmations and reminders.

6. **Payments**
   - PayFast / card / digital wallet payments, or “Pay at Salon”.
   - PCI-DSS-compliant transactions for security.

7. **Offline Mode**
   - Temporary offline support using RoomDB / SQLite.

8. **Reviews & Ratings**
   - Clients can rate services and post feedback publicly.

---

## Design Considerations

### User Interface (UI)
- Pastel color palette with soft gradients.  
- Consistent navigation bar (Home | Bookings | Profile | Settings).  
- “Book Now” buttons visible across service cards.  
- Fully responsive layout for phones and tablets.

### User Experience (UX)
- Booking completion within three taps.  
- Multilingual interface toggle.  
- Instant validation messages for inputs.  
- Fast screen transitions and real-time data updates.

### Core Design Principles

| Principle | Implementation |
|------------|----------------|
| **Consistency** | Unified color theme and iconography |
| **Visibility of status** | Progress bars and success messages |
| **User control** | Easy cancellation or profile editing |
| **Error prevention** | Input validation at every step |
| **Recognition over recall** | Familiar icons and standard UI patterns |

---

## Technical Architecture

| Layer | Technology |
|--------|-------------|
| **Frontend** | Flutter / React Native |
| **Backend** | ASP.NET Core 8 Web API |
| **Database** | Azure SQL Database + Entity Framework Core |
| **Authentication** | Firebase Auth / Identity |
| **CI/CD** | GitHub Actions |
| **Hosting** | Azure App Service |

---

## GitHub Utilisation

### Version Control & Collaboration
GitHub hosts the Radiance App codebase and manages collaboration between contributors.

**Practices Followed**
- Branches: `main`, `develop`, `feature/*`
- Pull Requests for peer review
- Issues & Projects for tracking tasks
- Descriptive commits for traceability

**Example Git Commands**
```bash
# Clone the repository
git clone https://github.com/ST10079125/RadianceApp.git

# Create feature branch
git checkout -b feature/booking-system

# Stage and commit changes
git add .
git commit -m "Add booking system feature"

# Push to GitHub
git push origin feature/booking-system

