# live-commute-api

## Description
Project that started to play around with [czynaczas.pl](https://czynaczas.pl) API. 

I'd like to prepare backend for the project that will be presenting the live communication data into a clear, intuitive format for end users.
This backend will serve as the foundation for delivering data in a way that enhances user understanding and accessibility, ensuring the information is easy to interpret and actionable.

The next step that I'm going to take is to request access to the api without rate limiting restrictions. To bypass this blocker I'm planning to build simple mock.

## Run
To run the project you need JDK 17
 
build and run:

`./gradlew build` 

`java -jar build/libs/live-commute-api-0.0.1-SNAPSHOT.jar  `

Go to: `http://localhost:8088/swagger-ui/index.html#/`

![image](https://albinoplant.github.io/images/live-commute-api/open-api-overview.png)

Get the list of vehicles with their live position:

![image](https://albinoplant.github.io/images/live-commute-api/open-api-get-vehicles-snake.png)

You can get the position of the stops and get list in following format:
```json
[
  {
    "id": "string",
    "name": "string",
    "latitude": 0,
    "longitude": 0
  }
]
```
