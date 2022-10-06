# Mobile Automation Challenge

## Run Suite

```
mvn clean verify
```

## Run Test Cases

### Search movie test
```
mvn clean verify -Dtest=MyTest#searchMovieTest
```

### Verify watchlist test
```
mvn clean verify -Dtest=MyTest#verifyWatchlistTest
```

### Rate movie test
```
mvn clean verify -Dtest=MyTest#rateMovieTest
```

## Open Allure Report
```
Allure serve
```
