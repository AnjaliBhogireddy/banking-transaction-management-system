# Banking Transaction Management System

A Spring Boot REST API application that simulates a real-world banking system. The application allows customers to create bank accounts, perform deposits, withdrawals, and fund transfers while maintaining transaction history.

---

## Features

- Customer Management
  - Create Customer
  - View Customer by ID
  - View All Customers

- Account Management
  - Create Bank Account
  - Associate Account with Customer
  - View Account Details
  - View All Accounts

- Transaction Management
  - Deposit Money
  - Withdraw Money
  - Transfer Funds Between Accounts
  - View Transaction History

- Validation
  - Request Validation using Bean Validation
  - Proper HTTP 400 responses for invalid requests

- Exception Handling
  - Global Exception Handling
  - Consistent Error Response Structure

- API Documentation
  - Swagger / OpenAPI Integration

---

## Tech Stack

- Java 17
- Spring Boot 3
- Spring Web
- Spring Data JPA
- Spring Validation
- Spring Security
- H2 Database
- Maven
- Swagger (OpenAPI)

---

## Project Structure

```
src
 ├── controller
 ├── service
 ├── repository
 ├── entity
 ├── exception
 ├── dto
 └── config
```

---

## REST APIs

### Customer APIs

| Method | Endpoint |
|---------|----------|
| POST | /api/customers |
| GET | /api/customers |
| GET | /api/customers/{id} |

---

### Account APIs

| Method | Endpoint |
|---------|----------|
| POST | /api/accounts/customer/{customerId} |
| GET | /api/accounts |
| GET | /api/accounts/{id} |

---

### Transaction APIs

| Method | Endpoint |
|---------|----------|
| POST | /api/transactions/deposit/{accountId}?amount=500 |
| POST | /api/transactions/withdraw/{accountId}?amount=200 |
| POST | /api/transactions/transfer |
| GET | /api/transactions/account/{accountId} |

---

## Swagger

```
http://localhost:8080/swagger-ui/index.html
```

---

## Sample Transfer Request

```json
{
    "fromAccountId": 2,
    "toAccountId": 3,
    "amount": 500
}
```

---

## Future Enhancements

- JWT Authentication
- Role-Based Authorization
- PostgreSQL Integration
- Docker Support
- Unit Testing (JUnit & Mockito)
- CI/CD Pipeline
- AWS Deployment
- Kafka Event Publishing
- Redis Caching

---

Author
Anjali Bhogireddy

Backend Java Developer

GitHub: https://github.com/AnjaliBhogireddy
