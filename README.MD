docker run --name some-redis -d redis redis-server --save 60 1 --loglevel warning -p 6379:6379
