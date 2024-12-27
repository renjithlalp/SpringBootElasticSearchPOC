# SpringBootElasticSearchPOC
Integration of elastic search with spring boot

D:\programs\ElasticStack\elasticsearch-8.12.2\bin>elasticsearch

Get Request: http://localhost:8080/apis/allProducts

POST Request : http://localhost:8080/apis/insertProduct

{
    "id": 3,
    "name": "AppleMotorola",
    "description": "Mobile phone",
    "quantity": 1,
    "price": 90000.0
}

GET Request: http://localhost:9200/products/_search

==> Give all products from elastic search
