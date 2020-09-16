SELECT * FROM mvc_car;

CREATE TABLE mvc_car(
	car_no NUMBER PRIMARY KEY,
	model VARCHAR2(100) NOT NULL,
	price NUMBER NOT NULL
)

CREATE SEQUENCE mvc_car_seq;

INSERT INTO mvc_car(car_no,model,price) VALUES(mvc_car_seq.nextval,'K5',2000);
INSERT INTO mvc_car(car_no,model,price) VALUES(mvc_car_seq.nextval,'K7',2500);
INSERT INTO mvc_car(car_no,model,price) VALUES(mvc_car_seq.nextval,'K9',3000);

COMMIT