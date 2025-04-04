# API Documentation

## Base URL
All endpoints are prefixed with `/api`

## Endpoints

### 1. Get Default Greeting
```http
GET /api/hello
```

#### Response
```json
"Hello, World!"
```

**Status Codes:**
- 200: Success

### 2. Get Personalized Greeting
```http
GET /api/hello/{name}
```

#### Parameters
| Name | Type | Description |
|------|------|-------------|
| name | string | The name to include in the greeting |

#### Response
```json
"Hello, {name}!"
```

**Status Codes:**
- 200: Success
- 400: Invalid name parameter

### 3. Process Message
```http
POST /api/message
```

#### Request Body
```
Plain text message
```

#### Headers
| Name | Value |
|------|-------|
| Content-Type | application/json |

#### Response
```
"Received message: {message}"
```

**Status Codes:**
- 200: Success
- 400: Invalid message format

### 4. Get Cloud Image
```http
GET /api/cloud-image
```

#### Response
Returns a PNG image file.

#### Headers
| Name | Value |
|------|-------|
| Content-Type | image/png |

**Status Codes:**
- 200: Success
- 404: Image not found

## Error Responses

All error responses follow this format:
```json
{
    "timestamp": "2025-04-04T12:00:00Z",
    "status": 400,
    "error": "Bad Request",
    "message": "Detailed error message",
    "path": "/api/endpoint"
}
```

## Rate Limiting
Currently not implemented. Future versions will include rate limiting headers:
- X-RateLimit-Limit
- X-RateLimit-Remaining
- X-RateLimit-Reset