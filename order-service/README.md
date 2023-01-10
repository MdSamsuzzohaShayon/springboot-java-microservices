### Order service
 - Api endpoints
    - `/api/order` create an order `curl -X POST http://localhost:8081/api/order -H 'Content-Type: application/json' -d '{"orderLineItemsDtoList": [{"skuCode": "ph-ap-21", "price": 1200, "quantity": 1}]}'`