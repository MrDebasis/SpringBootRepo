#INSERT
#URL-----  http://localhost:8080/product/insert

#JSON REQUEST

{
       "id": 101,
        "itemName": "MOBILE",
        "itemDescription": "oneplus",
        "price": "16000",
        "availableQuantity": "50000"
    }
    
    RESPONCE
    Sucessfully addedProductEntity [itemName=MOBILE, itemDescription=oneplus, price=16000, availableQuantity=50000]
    
#DELETE  
URL -  http://localhost:8080/product/delete/101

#MODIFY
URL -  http://localhost:8080/product/update/101

#JSON REQUEST

{
       "id": 101,
        "itemName": "MOBILE",
        "itemDescription": "MI",
        "price": "15555",
        "availableQuantity": "40000000"
    }
    
    
#FIND ALL
URL -  http://localhost:8080/product/find

#H2DATABASE
URL -  http://localhost:8080/h2-console







    
    