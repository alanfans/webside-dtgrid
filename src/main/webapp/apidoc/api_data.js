define({ "api": [
  {
    "type": "GET",
    "url": "/openapi/v1/weather/{cityName}",
    "title": "获取天气",
    "version": "1.0.0",
    "name": "Get_weather_information_by_cityName_",
    "group": "Weather",
    "permission": [
      {
        "name": "none"
      }
    ],
    "description": "<p>Get weather information by cityName.</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "cityName",
            "description": "<p>Name of the city.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "{\n  \"id\": 4711\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "firstname",
            "description": "<p>The weather information fo the city.</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "lastname",
            "description": "<p>The weather information fo the city.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200 OK\n{\n  \"firstname\": \"John\",\n  \"lastname\": \"Doe\"\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 404 Not Found\n{\n  \"error\": \"UserNotFound\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "src/main/java/com/webside/open/controller/WeatherController.java",
    "groupTitle": "Weather"
  }
] });
