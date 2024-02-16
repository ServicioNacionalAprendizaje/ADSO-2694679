# Documentación de Service Security

## Person

### ** POST => http://localhost:9000/service-security/v1/api/person **

#### **json normal**
```json
    {
        "id": 0,
        "state": true,
        "createdAt": "2024-02-16T20:40:55.434Z",
        "updatedAt": "2024-02-16T20:40:55.434Z",
        "deletedAt": "2024-02-16T20:40:55.434Z",
        "createdBy": 0,
        "updatedBy": 0,
        "deletedBy": 0,
        "firstName": "string",
        "lastName": "string",
        "email": "string",
        "phone": "string",
        "dateOfBirth": "2024-02-16",
        "gender": "string",
        "address": "string"
    }
```

#### **json a enviar**
```json
    {
        "state": true,
        "firstName": "Jesús",
        "lastName": "González",
        "email": "jesus@gmailcom",
        "phone": "3123123",
        "dateOfBirth": "1992-02-16",
        "gender": "M",
        "address": "Calle 56"
    }
```

### ** PUT => http://localhost:9000/service-security/v1/api/person/1 **

#### **json normal**
```json
    {
        "id": 0,
        "state": true,
        "createdAt": "2024-02-16T20:40:55.434Z",
        "updatedAt": "2024-02-16T20:40:55.434Z",
        "deletedAt": "2024-02-16T20:40:55.434Z",
        "createdBy": 0,
        "updatedBy": 0,
        "deletedBy": 0,
        "firstName": "string",
        "lastName": "string",
        "email": "string",
        "phone": "string",
        "dateOfBirth": "2024-02-16",
        "gender": "string",
        "address": "string"
    }
```

#### **json a enviar**
```json
    {
        "state": true,
        "firstName": "Jesús Ariel",
        "lastName": "González Bonilla",
        "email": "jesus@gmailcom",
        "phone": "3123123",
        "dateOfBirth": "1992-02-16",
        "gender": "M",
        "address": "Calle 56"
    }
```

### ** Get (All) => http://localhost:9000/service-security/v1/api/person **

#### **json normal**
```json
    {
       
    }
```

#### **json a enviar**
```json
    {
      
    }
```

### ** Get (Id) => http://localhost:9000/service-security/v1/api/person/1 **

#### **json normal**
```json
    {
       
    }
```

#### **json a enviar**
```json
    {
      
    }
```

### ** Delete (Id) => http://localhost:9000/service-security/v1/api/person/1 **

#### **json normal**
```json
    {
       
    }
```

#### **json a enviar**
```json
    {
      
    }
```

# ********************************************