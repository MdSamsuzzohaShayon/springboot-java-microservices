# Springboot
 - [tutorial](https://www.youtube.com/watch?v=QuvS_VLbGko), [start project](https://start.spring.io/) from here and import into intellij or eclipse
 - There are 3 api endpoints is beed made
    - `/` Test the api `curl -X DELETE http://localhost:8080`
    - `/photoz` Get all photo `curl -X GET http://localhost:8080/photoz`
    - `/photoz/1` Get single photo `curl -X GET http://localhost:8080/photoz/1`
    - `/photoz/1` delete single photo `curl -X DELETE http://localhost:8080/photoz/1`
    - `/photoz` create a photo `curl -X POST http://localhost:8080/photoz -H 'Content-Type: application/json' -d '{"fileName": "file2.jpg"}'`
    - `/photoz` upload a real photo __http://localhost:8080/upload.html__
    - `/download/photoId` Download the uploaded photo __http://localhost:8080/download/bf29356-eeb6-4a73-adc7-aae43251a8d9__
 - Database operations
    - __http://localhost:8080/h2-console__ Access database from here db url will be `jdbc:h2:~/Documents/springboot-photoz/data/springboot` 
    - Set no user name and password


https://www.youtube.com/watch?v=lh1oQHXVSc0&list=PLSVW22jAG8pBnhAdq9S8BpLnZ0_jVBj0c
   
