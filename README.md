# Getting Started

`curl http://localhost:9999/oauth/token \
    -d"grant_type=client_credentials&scope=read&username=akhil&password=password" \
    -H"Content-type:application/x-www-form-urlencoded; charset=utf-8" \
    -u test:secret`

# With  User Name Password  (gives refresh token)

`curl http://localhost:9999/oauth/token \
    -d"grant_type=password&username=akhil&password=password" \
    -H"Content-type:application/x-www-form-urlencoded; charset=utf-8" \
    -u test:secret`
