/*
 *  IN ������
 *  Ư������ ���ԵǴ� �����͸� ��ȸ�ϰ��� �� �� ����ϴ� ������
 * 	SELECT �÷�, �÷�
 * 	FROM ���̺��
 * 	WHERE �÷� IN('�Ե�', '���׷�', '����');
 * 
 * 	NOT IN ������
 * 	Ư������ ���Ե��� �ʴ� �����͸� ��ȸ�ϰ��� �� ��
 *	SELECT �÷�, �÷�
 * 	FROM ���̺��
 * 	WHERE �÷� NOT IN('�Ե�', '���׷�', '����');
 */

-- MAKER�� �Ե� ���� ���׷��� ��ǰ�� ������ ��ȸ�Ѵ�.
SELECT * FROM product
WHERE maker = '�Ե�' or maker = '����' or maker = '���׷�';

-- �� sql�� IN���� ��ȸ�غ���
SELECT * FROM product WHERE maker IN('�Ե�', '����', '���׷�');

-- maker�� �Ե� ���� ���׷��� �ƴ� ��ǰ���� ��ȸ�Ѵ�.
SELECT * FROM product WHERE maker <> '�Ե�' AND maker <> '����' AND maker <> '���׷�';

-- �� sql�� IN���� ��ȸ�غ���
SELECT * FROM product WHERE maker NOT IN('�Ե�', '����', '���׷�');

-- maker �� ��ǰ���� �ϳ��� maker ��ǰ�� ��ȸ�Ѵ�.
-- 1. ��ǰ���� �ϳ��� MAKER�� Ȯ���Ѵ�.
SELECT maker, COUNT(*) AS ��ǰ�� FROM product GROUP BY maker
-- 2. 1���� �ش��ϴ� MAKER�� ����Ѵ�.
SELECT maker, COUNT(*) AS ��ǰ�� FROM product GROUP BY maker HAVING COUNT(*) = 1
-- 3. SUBQUERY�� ����Ѵ�.
SELECT * FROM product WHERE maker IN(
SELECT maker FROM product GROUP BY maker HAVING COUNT(*) = 1);


-- ��ü ����� ��� ����
SELECT AVG(salary) FROM employee;

SELECT * FROM employee;

-- ��ü����� ��� ���޺��� job�� ��տ����� ���� job�� ��������� ��ȸ�Ѵ�.
--1. ��ü��� ��� ����
--2. job�� ��� ����
--3. ��ü�����տ��޺��� ���� �޴� job
--4. �� job�� �ش��ϴ� ����� job�� name

SELECT job, name FROM employee WHERE job IN(
	SELECT job FROM employee GROUP BY job HAVING ROUND(AVG(salary)) > (SELECT AVG(salary) FROM employee));
