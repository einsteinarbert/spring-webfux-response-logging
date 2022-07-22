# spring-webfux-response-logging
logging all incoming request and response

1. TEST URL:
```bash
    curl --location --request POST 'localhost:8080/employee/message1?abc=123' \
    --header 'Accept-Encoding: application/json' \
    --header 'second-request: "12234"' \
    --header 'Content-Type: application/json' \
    --data-raw '{"password":"admin","username":"admin"}'
```
