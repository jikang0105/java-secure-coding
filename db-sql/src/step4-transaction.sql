/*
	SQL -> DCL
	Ʈ�����(Transaction) -> �۾��ܵ� or ��������
	: Ʈ������̶� �����ͺ��̽��� ���¸� ��ȭ��Ű������ �����ϴ� �۾������� ���Ѵ�.
	- COMMIT : ����� ��� ������ ���� �����ͺ��̽��� �ݿ�(���� ����)
	- ROLLBACK : ����� ��� ������ ����ϰ� �������·� �ǵ�����.
	
	ex1) ������ü ��������(������ü Transaction)������ 
		1. �۱����� ���¿��� ��� �۾��� �Ѵ�
		2. �۱����� ���¿��� ����� �̷�(�Ͻÿ� ����� ��⿡ ���� ����)�� �����Ѵ�.
		3. �������� ���� ������ Ȯ���ϴ� �۾��� �Ѵ�.
		4. �������� ���¿� �۱ݾ��� �Ա��ϴ� �۾��� �����Ѵ�.
		5. �������� ��ü �Ͻÿ� ��Ÿ ������ ���� �̷��� �����Ѵ�.
		
		���� �۾��� ��� ���������� ����Ǿ��� ������ ���� �����ͺ��̽��� ������ ����(COMMIT)�Ѵ�.
		���� �ϳ��� �۾��̶� ������ �߻��� ��쿡�� �� �۾������� ��� �۾��� ���(ROLLBACK)�Ѵ�.
		
		�̸� ���ؼ��� �����ͺ��̽��� ����ϴ� ���α׷� ��������
		COMMIT�� �������� ��ȯ�ؾ� �Ѵ�.
		JDBC������ �⺻�� AutoCOMMIT ����̹Ƿ� �������� ��ȯ �� Ʈ����� ó���� �ؾ��Ѵ�.
		
	ex2) ī�� �߱޽ÿ� ����Ʈ�� �����ϴ� �۾������� �����Ѵ�.
		1. ī�� �߱�
		2. ����Ʈ ����
		���� ǥ��Ʈ ���޽ÿ� ������ �߻��� ��쿡�� �۾����(ROLLBACK)�ϰ�
		1,2�� �۾��� ��� ���������� ����Ǿ��� ������ �����ͺ��̽��� �ݿ��ϵ��� ����(COMMIT)�غ���.
		
*/
	
	-- ex2 �׽�Ʈ�� ���� ���̺� 
	CREATE TABLE card(
		id VARCHAR2(100) PRIMARY KEY,
		name 	varchar2(100) not null
	)
	CREATE TABLE point(
		id VARCHAR2(100) PRIMARY KEY,
		point_type VARCHAR2(100) NOT NULL,
		point NUMBER NOT NULL
	)
	SELECT * FROM card;
	SELECT * FROM point;
	
	DELETE FROM card;
	DELETE FROM point;
	
	COMMIT