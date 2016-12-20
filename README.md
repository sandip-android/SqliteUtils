# SqliteUtils

<H3>How to Use</H3>

1). Create Object of SqliteHelper class   
```java
SQLiteHelper dbHelper;  
```
2). Initialize object  
```java
dbHelper = new SQLiteHelper(getActivity());  
dbHelper.open();  
```
3). Call custom method for Databse Operation  
```java
int res = dbHelper.insertData(<Required Parameter>);  
if (res > 0) {  
  //Success  
}else{
  //Error  
}  
```
4). Close Helper  
```java
dbHelper.close();
```
