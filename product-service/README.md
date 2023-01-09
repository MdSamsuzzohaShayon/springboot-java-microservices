# Springboot microservices
 - [tutorial playlist](https://www.youtube.com/watch?v=lh1oQHXVSc0&list=PLSVW22jAG8pBnhAdq9S8BpLnZ0_jVBj0c)
 - API end points 
      - `/api/product` Create a product `curl -X POST http://localhost:8080/api/product -H 'Content-Type: application/json' -d '{"name": "Iphone 5", "description": "An old version of Iphone", "price": 600}'` 
      - `/api/product` Get list of product `curl -X GET http://localhost:8080/api/product` 