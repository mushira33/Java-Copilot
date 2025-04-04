# Spring Boot REST API Project

This project is a Spring Boot-based REST API that demonstrates basic HTTP endpoints and image serving capabilities.

## Features

- RESTful API endpoints
- GET and POST request handling
- Path variable demonstrations
- Static image serving
- Comprehensive test coverage

## Prerequisites

- Java 11 or higher
- Maven 3.6 or higher
- Git

## Quick Start

1. Clone the repository:
   ```bash
   git clone https://github.com/mushira33/Java-Copilot.git
   cd Java-Copilot
   ```

2. Build the project:
   ```bash
   mvn clean install
   ```

3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

The application will start on `http://localhost:8080`

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/hello` | Returns a "Hello, World!" message |
| GET | `/api/hello/{name}` | Returns a personalized greeting |
| POST | `/api/message` | Accepts and returns a message |
| GET | `/api/cloud-image` | Returns a cloud image |

## Testing

Run the tests using:
```bash
mvn test
```

## Documentation

- [Contributing Guidelines](CONTRIBUTING.md)
- [Design Documentation](docs/DESIGN.md)
- [API Documentation](docs/API.md)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.