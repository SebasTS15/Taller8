# Crear una persona.
Con el siguiente http del metodo `POST` `http://localhost:8080/api/person`
```json
[
    {
        "dni": "9821kdjh",
        "firstName": "mariana",
        "lastName": "torres",
        "age": 29,
        "address": "calle principal 123",
        "emailAddress": "mariana.torres@example.com",
        "cellNumber": 3056789123,
        "createAt": null
    },
    {    
        "dni": "1234abcd",
        "firstName": "carlos",
        "lastName": "gomez",
        "age": 35,
        "address": "avenida libertad 456",
        "emailAddress": "carlos.gomez@example.com",
        "cellNumber": 3001234567,
        "createAt": null
    },
    {
        "dni": "5678wxyz",
        "firstName": "luis",
        "lastName": "fernandez",
        "age": 42,
        "address": "barrio central 789",
        "emailAddress": "luis.fernandez@example.com",
        "cellNumber": 3119876543,
        "createAt": null
    },
    {   
        "dni": "7410qwer",
        "firstName": "JUAN",
        "lastName": "perez",
        "age": 50,
        "address": "carrera 10 #15-20",
        "emailAddress": "juan.perez@example.com",
        "cellNumber": 3123456789,
        "createAt": null
    }
]
```

# Actualizar Numero.
Con el siguiente http del metodo `PUT` `http://localhost:8080/api/person`
```json
{
  "id":"661c2e18f474b976ad17ba1f",
  "dni":"",
 "firstName":"",
 "lastName":"",
 "age":"" ,
 "address":"",
  "emailAddress":"",
  "cellNumber": 123,
    "createAt":null
}
```

# Actualizar Dirección.
Con el siguiente http del metodo `PUT` `http://localhost:8080/api/person/Address`
```json
{
    "dni": "7410qwer",
    "firstName": "JUAN",
    "lastName": "perez",
    "age": 50,
    "address": "carrera 94 #4-20",
    "emailAddress": "juan.perez@example.com",
    "cellNumber": 3123456789,
    "createAt": null
}
```
# Actualizar Correo
Con el siguiente http del metodo `PUT` `http://localhost:8080/api/person/Email`
```json
{
        "id": "673a6d62d346a3674ef83994",
        "dni": "9821kdjh",
        "firstName": "MARIANA",
        "lastName": "torres",
        "age": "29",
        "address": "calle principal 123",
        "emailAddress": "mariana.torres@example.com",
        "cellNumber": "3056789123",
        "createAt": "2024-11-17T22:25:38.709+00:00"
}
```

# Eliminar persona.
Con el siguiente http del metodo `DELETE` `http://localhost:8080/api/person/`
```json
{
"dni":"8428shas",
 "firstName":"hector",
 "lastName":"vanegas",
 "age": 40,
 "address":"ahsjdaskj",
  "emailAddress":"asdjsadj",
  "cellNumber": 3044278239,
  "createAt":null
}
```

# Buscar por ID.
Con el siguiente http del metodo `GET` `http://localhost:8080/person/7410qwer`

# Buscar y poner todos los nombre en mayusculas.
Con el siguiente http del metodo `GET` `http://localhost:8080/api/person/AllUpperCase`

# Buscar y poner todos los nombre en mayusculas y repertir las letras.
Con el siguiente http del metodo `GET` `http://localhost:8080/api/person/AllUpperCaseRepeat`


