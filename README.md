# Springboot
 - [tutorial](https://www.youtube.com/watch?v=QuvS_VLbGko), [start project](https://start.spring.io/) from here and import into intellij or eclipse
 - There are 3 api endpoints is beed made
    - `/` Test the api `curl -X DELETE http://localhost:8080`
    - `/photoz` Get all photo `curl -X GET http://localhost:8080/photoz`
    - `/photoz/1` Get single photo `curl -X GET http://localhost:8080/photoz/1`
    - `/photoz/1` delete single photo `curl -X DELETE http://localhost:8080/photoz/1`
    - `/photoz` create a photo `curl -X POST http://localhost:8080/photoz -H 'Content-Type: application/json' -d '{"fileName": "file2.jpg"}'`
    - 
   