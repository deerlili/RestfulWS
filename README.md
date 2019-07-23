# RestfulWS
Restful interfaces for multiple data sources

## overview
有3个源库和一个数据中心，数据中心包含了3个源库的数据，现在是如果源库连接不上就去DC获取对应的数据。
### 1.源库A连接不上，源库A对应的接口切换到数据DC。源库B和源库C连接不变；
### 2.源库A，B连接不上，源库A,B对应的接口切换到数据DC。源库C连接不变；
