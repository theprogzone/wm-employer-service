create table TB_EMPLOYER (
  ID int not null AUTO_INCREMENT,
  NAME varchar(200) not null,
  EMAIL varchar(100) not null,
  PHONE varchar(50) not null,
  TYPE varchar(1) not null,
  ADDRESS varchar(300) null,
  CREATED_BY varchar(100) not null,
  CREATED_DATE TIMESTAMP not null,
  LAST_MODIFIED_BY varchar(100) not null,
  LAST_MODIFIED_DATE TIMESTAMP not null,
  PRIMARY KEY ( ID )
);

INSERT INTO TB_EMPLOYER (NAME, EMAIL, PHONE, TYPE, ADDRESS, CREATED_BY, CREATED_DATE, LAST_MODIFIED_BY, LAST_MODIFIED_DATE)
VALUES ('Prabhath Heavy Industries', 'prabhath-hv@phi.com', '10200300', 'B', 'Sun city building 512345', 'WMS', CURRENT_TIMESTAMP, 'WMS', CURRENT_TIMESTAMP);
