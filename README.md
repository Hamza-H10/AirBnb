# Airbnb clone (fullstack project) Spring boot 3, Angular 17, PrimeNG, PostgreSQL, Auth0

## Usage
### Prerequisites
- [JDK 21](https://adoptium.net/temurin/releases/)
- [PostgreSQL](https://www.postgresql.org/download/)
- IDE ([VSCode](https://code.visualstudio.com/download), [IntelliJ](https://www.jetbrains.com/idea/download/))

### Key Features:
- 📅 Booking management for travelers
- 🏠 Landlord reservation management
- 🔍 Search for houses by distinct criteria (location, date, guests, beds, etc)
- 🔐 Authentication and Authorization (Role management) with Auth0 (OAuth2)
- 🏢 Domain-driven design 

### Clone the repository
``git clone https://github.com/Hamza-H10/AirBnb.git``

## Backend
### Launch
#### Maven
``./mvnw spring-boot:run  -Dspring-boot.run.arguments="--AUTH0_CLIENT_ID=<client-id> --AUTH0_CLIENT_SECRET=<client-secret>"``

#### IntelliJ
Go in IntelliJ add the environment variables and then run it.

## Frontend
### Fetch dependencies
``npm install``

### Launch dev server
Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The application will automatically reload if you change any of the source files.

### Build
Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory.
