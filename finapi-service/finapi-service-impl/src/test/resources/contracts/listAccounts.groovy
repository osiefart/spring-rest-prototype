package contracts

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        url '/devices/1'
        body("""
        """)
        headers {
            //header('Content-Type', 'application/vnd.fraud.v1+json')
        }
    }
    response {
        status 200
        body("""
  {
    "name": "Olafs IPhone",
    "type": "iphone 4s",
    "_links": {
      "self": {
        "href": "http://localhost/devices/1"
      },
      "device": {
        "href": "http://localhost/devices/1"
      }
    }
  }
  """)
        headers {
            //header('Content-Type': 'application/vnd.fraud.v1+json')
        }
    }
}