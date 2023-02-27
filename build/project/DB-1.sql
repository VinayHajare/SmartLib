--Creating table Register for storing login credentials
CREATE TABLE lib1
(
 USERNAME VARCHAR(30),
 EMAIL VARCHAR(30),
 PASSWORD VARCHAR(30),
 MOBILE  VARCHAR(11)
);

--Creating table Books
CREATE TABLE Books
(
 BK_ID VARCHAR(20) PRIMARY KEY,
 BK_NAME VARCHAR(30),
 BK_AUTOR VARCHAR(30),
 BK_PUB VARCHAR(40),
 BK_PRICE VARCHAR(40),
 BK_QTY VARCHAR(10)
);
--Creating table Issued_Books
CREATE TABLE Issued_Books
(
 BK_ID VARCHAR(20) FOREIGN KEY references Books(BK_ID),
 BK_NAME VARCHAR(40),
 BOR_ID VARCHAR(20),
 BOR_NAME VARCHAR(40),
 BOR_CONTACT VARCHAR(40),
 ISS_DATE DATE,
 RET_DATE DATE
);
--inserting into books
insert into books  values(01,'The Alchemist','Paulo Coelho','HarperTorch','500','1');
insert into books  values(02,'Harry Porter','Harry Porter','Bloomsbury','1000','5');
insert into books  values(03,'The Brief History of Time','Stephan Hawlking','Bantam Dell','1400','10');
insert into books  values(04,'Wings Of Fire','A.P.J.Abdul Kalam','Cocoblu','600','15');
insert into books  values(05,'The World As I See It','Albert Einsten','The Bodley Head','400','25');
--inserting into issued_books
insert into issued_books values(01,'The Alchemist',01,'Sam Daniel','7559282625',curdate(),curdate()+3);
insert into issued_books values(02,'Harry Porter',20,'Vivek Hajare','9921837076',curdate(),curdate()+7);
insert into issued_books values(01,'Wings Of Fire',12,'Sonali Argade','9529282725',curdate(),curdate()+7;