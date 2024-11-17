curl -location POST http://localhost:8080/api/person -H "Content-Type: application/json" -d '{
    "dni":"8428shas",
 "firstName":"hector",
 "lastName":"vanegas",
 "age": 40,
 "address":"ahsjdaskj",
  "emailAddress":"asdjsadj",
  "cellNumber": 3044278239,
  "createAt":null
}'

curl -location PUT http://localhost:8080/api/person -H "Content-Type: application/json" -d '{
  "id":"661c2e18f474b976ad17ba1f",
  "dni":"",
 "firstName":"",
 "lastName":"",
 "age":"" ,
 "address":"",
  "emailAddress":"",
  "cellNumber": 123,
    "createAt":null
}' 

curl -location GET http://localhost:8080/api/person

curl -location GET http://localhost:8080/api/person/AllUpperCase

curl -location GET http://localhost:8080/api/person/AllUpperCaseRepeat

curl -location GET http://localhost:8080/person/7410qwer?param=7410qwer -H "Accept: application/json"

curl -location  DELETE http://localhost:8080/api/person/Address -H "Content-Type: application/json" -d '{
    "dni":"8428shas",
 "firstName":"hector",
 "lastName":"vanegas",
 "age": 40,
 "address":"ahsjdaskj",
  "emailAddress":"asdjsadj",
  "cellNumber": 3044278239,
  "createAt":null
}'

curl -location PUT http://localhost:8080/api/person/Address -H "Content-Type: application/json" -d '{
    "dni": "7410qwer",
    "firstName": "JUAN",
    "lastName": "perez",
    "age": 50,
    "address": "carrera 94 #4-20",
    "emailAddress": "juan.perez@example.com",
    "cellNumber": 3123456789,
    "createAt": null
}'

curl -location PUT http://localhost:8080/api/person/Email -H "Content-Type: application/json" -d '{
        "id": "673a6d62d346a3674ef83994",
        "dni": "9821kdjh",
        "firstName": "MARIANA",
        "lastName": "torres",
        "age": "29",
        "address": "calle principal 123",
        "emailAddress": "mariana.torres@example.com",
        "cellNumber": "3056789123",
        "createAt": "2024-11-17T22:25:38.709+00:00"
}'


