org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        url '/people/1'
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
    "firstName": "Max",
    "lastName": "Mustermann",
    "_links": {
      "self": {
        "href": "http://localhost/people/1"
      },
      "person": {
        "href": "http://localhost/people/1"
      }
    }
  }
  """)
        headers {
            //header('Content-Type': 'application/vnd.fraud.v1+json')
        }
    }
}