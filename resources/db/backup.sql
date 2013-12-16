PRAGMA foreign_keys=OFF;
BEGIN TRANSACTION;
CREATE TABLE User (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    account_name varchar(255),
    password varchar(255),
    user_role int
);
INSERT INTO "User" VALUES(1,'gzmask','121212',1);
INSERT INTO "User" VALUES(2,'daisy','123456',2);
INSERT INTO "User" VALUES(3,'danco','123456',2);
CREATE TABLE User_role (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    role_name varchar(255)
);
INSERT INTO "User_role" VALUES(1,'developer');
INSERT INTO "User_role" VALUES(2,'manager');
INSERT INTO "User_role" VALUES(3,'customer');
CREATE TABLE Item (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    item_name varchar(255),
    item_type int,
    plucode varchar(255),
    price float,
    cost float,
    user_id int
, taxable Boolean, picture varchar(255));
INSERT INTO "Item" VALUES(20,'test room',1,'001',10.0,2.0,1,1,'resources/public/uploads/pro-pic/001/IMG_20131017_034026.jpg');
INSERT INTO "Item" VALUES(21,'test room',1,'001',10.0,2.0,1,1,'resources/public/uploads/pro-pic/001/IMG_20131017_034026.jpg');
INSERT INTO "Item" VALUES(22,'test room',1,'001',10.0,2.0,1,1,'resources/public/uploads/pro-pic/001/IMG_20131017_034026.jpg');
INSERT INTO "Item" VALUES(23,'test room',1,'001',10.0,2.0,1,1,'resources/public/uploads/pro-pic/001/IMG_20131017_034026.jpg');
INSERT INTO "Item" VALUES(24,'test room',1,'001',10.0,2.0,1,1,'resources/public/uploads/pro-pic/001/IMG_20131017_034026.jpg');
INSERT INTO "Item" VALUES(25,'test room',1,'001',10.0,2.0,1,1,'resources/public/uploads/pro-pic/001/IMG_20131017_034026.jpg');
INSERT INTO "Item" VALUES(26,'test room',1,'001',10.0,2.0,1,1,'resources/public/uploads/pro-pic/001/IMG_20131017_034026.jpg');
INSERT INTO "Item" VALUES(27,'test room',1,'001',10.0,2.0,1,1,'resources/public/uploads/pro-pic/001/IMG_20131017_034026.jpg');
INSERT INTO "Item" VALUES(28,'test room',1,'001',10.0,2.0,1,1,'resources/public/uploads/pro-pic/001/IMG_20131017_034026.jpg');
INSERT INTO "Item" VALUES(29,'test room',1,'001',10.0,2.0,1,1,'resources/public/uploads/pro-pic/001/IMG_20131017_034026.jpg');
INSERT INTO "Item" VALUES(30,'test room',1,'001',10.0,2.0,1,1,'resources/public/uploads/pro-pic/001/IMG_20131017_034026.jpg');
INSERT INTO "Item" VALUES(31,'test room',1,'001',10.0,2.0,1,1,'resources/public/uploads/pro-pic/001/IMG_20131017_034026.jpg');
INSERT INTO "Item" VALUES(32,'test room',1,'001',10.0,2.0,1,1,'resources/public/uploads/pro-pic/001/IMG_20131017_034026.jpg');
INSERT INTO "Item" VALUES(33,'test room',1,'001',10.0,2.0,1,1,'resources/public/uploads/pro-pic/001/IMG_20131017_034026.jpg');
INSERT INTO "Item" VALUES(34,'test room',1,'001',10.0,2.0,1,1,'resources/public/uploads/pro-pic/001/IMG_20131017_034026.jpg');
INSERT INTO "Item" VALUES(35,'test room',1,'001',10.0,2.0,1,1,'resources/public/uploads/pro-pic/001/IMG_20131017_034026.jpg');
INSERT INTO "Item" VALUES(36,'test room',1,'001',10.0,2.0,1,1,'resources/public/uploads/pro-pic/001/IMG_20131017_034026.jpg');
INSERT INTO "Item" VALUES(37,'test room',1,'001',10.0,2.0,1,1,'resources/public/uploads/pro-pic/001/IMG_20131017_034026.jpg');
CREATE TABLE Item_type (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    type_name varchar(255)
);
INSERT INTO "Item_type" VALUES(1,'rooms');
CREATE TABLE Item_sold (
id INTEGER PRIMARY KEY AUTOINCREMENT,
item_name varchar(255),
item_type int,
plucode varchar(255),
price float,
cost float,
user_id int,
invoice_id int
, refund Boolean, taxable Boolean);
CREATE TABLE Version (
id INTEGER PRIMARY KEY AUTOINCREMENT,
timestamp varchar(255)
);
INSERT INTO "Version" VALUES(1,'201311151257');
INSERT INTO "Version" VALUES(2,'201311151257');
CREATE TABLE Tax (
id INTEGER PRIMARY KEY AUTOINCREMENT,
name varchar(255),
rate float,
timestamp INTEGER
);
INSERT INTO "Tax" VALUES(5,'PST',0.05,NULL);
INSERT INTO "Tax" VALUES(6,'GST',0.05,NULL);
CREATE TABLE Invoice (
id INTEGER PRIMARY KEY AUTOINCREMENT,
name varchar(255),
tel varchar(255),
address varchar(255),
checkin varchar(255),
checkout varchar(255),
subtotal float,
total float,
timestamp INTEGER,
refund Boolean
, tax float, tax2 float);
DELETE FROM sqlite_sequence;
INSERT INTO "sqlite_sequence" VALUES('User_role',3);
INSERT INTO "sqlite_sequence" VALUES('User',3);
INSERT INTO "sqlite_sequence" VALUES('Version',2);
INSERT INTO "sqlite_sequence" VALUES('Invoice',7);
INSERT INTO "sqlite_sequence" VALUES('Item_type',1);
INSERT INTO "sqlite_sequence" VALUES('Item',37);
INSERT INTO "sqlite_sequence" VALUES('Tax',6);
INSERT INTO "sqlite_sequence" VALUES('Item_sold',18);
COMMIT;
