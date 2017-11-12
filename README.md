# rest-data-from-thirdpartyserver

>Project gets data from hird party server: ``` http://www.watchstation.com ```

Application represents a simple REST web service that fetchs data from third party server. Data is stored in MySQL.

>REST resource is accessible by:
- "/v1/watches" to GET all Watches;

>Fetching data is accesible by:
- "/v1/watches/thirdPartyWatches" to POST Watches from ``` http://www.watchstation.com;``` 

>Structure:
  - addNewWatches() method from WatchService interface
  - loadWatchesFromThirdPartyServer() method from WatchListController class 
  - fetchDataFromThirdPartyServer() method from WatchClient class
  - parseRawDateToWatches() and  prepareStringForParsing() methods from HtmlParser class (fasterxml.jackson parser) 
  - Watch class represents entity of watch (using fasterxml.jackson annotations)
