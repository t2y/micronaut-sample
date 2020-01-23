# micronaut-sample

Micronaut Framework sample code

## How to build/run

```bash
$ gradle run
```

```bash
$ curl -s -X GET localhost:8080/hello | jq .
{
  "config": {
    "id": 33,
    "prop": "test"
  },
  "id": 1,
  "name": "update-bob"
}
```
