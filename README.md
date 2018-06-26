# JDBC
### Connection to database
   * Obtain the JDBC driver and add it to the CLASSPATH
   * Register the JDBC driver with the DriverManager
   * Construct a connection URL
   * Use the getConnection() method of DriverManager for establish a connection
   
#### Few words about ANSI/ISO SQL isolation
 
 * Serializable. The highest isolation level. A serializable execution is defined to be an execution of the operations of concurrently executing SQL-transactions that produces the same effect as some serial execution of those same SQL-transactions. 
 * Repeatable reads. A lock-based concurrency control keeps read and write locks until the end of the transaction. However, range-lock are not managed, so phantom reads can occur.
 * Read committed. Read committed is an isolation level that guarantees that any data read is committed at the moment it is read. It simply restricts the reader from seeing any intermediate, uncommitted, 'dirty' read. It makes no promise whatsoever that if the transaction re-issues the read, it will find the same data; data is free to change after it is read.
 * Read uncommitted. This is the lowest isolation level. In this level, dirty reads are allowed, so one transaction may see not-yet-committed changes made by other transactions.