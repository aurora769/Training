

SELECT e.ENAME , d.LOC 
FROM EMP e, DEPT d
WHERE d.LOC LIKE 'Chicago';

SELECT e.ENAME , d.LOC 
FROM EMP e, DEPT d
ORDER BY d.LOC;


SELECT e.* , d.LOC 
FROM EMP e, DEPT d;

SELECT e.ENAME 
FROM EMP e, JOBHIST j
WHERE e.HIREDATE BETWEEN j.STARTDATE AND j.ENDDATE;

SELECT e.ENAME , d.DNAME
FROM EMP e, DEPT d;

SELECT E.EMPNO, E.ENAME
FROM EMP E JOIN EMP M
ON E.MGR=M.EMPNO AND E.HIREDATE<M.HIREDATE;

SELECT MANAGER.ENAME ,MANAGER.HIREDATE, WORKER.ENAME,WORKER.HIREDATE
FROM EMP WORKER , EMP MANAGER
WHERE WORKER.EMPNO = MANAGER.MGR
AND MANAGER.HIREDATE > WORKER.HIREDATE;

SELECT *
FROM EMP,DEPT;


SELECT E.ENAME, D.LOC
FROM EMP E
RIGHT OUTER JOIN
DEPT D
ON(E.DEPTNO=D.DEPTNO)
WHERE D.LOC='CHICAGO';

SELECT E.ENAME, D.LOC
FROM EMP E
FULL OUTER JOIN
DEPT D
ON(D.DEPTNO=E.DEPTNO)
ORDER BY D.LOC


SELECT E.ENAME,E.HIREDATE,J.HIREDATE
FROM EMP E
FULL OUTER JOIN
EMP J
ON E.EMPNO=J.MGR
WHERE E.HIREDATE < J.HIREDATE;

SELECT D.DNAME,E.ENAME
FROM EMP E
FULL OUTER JOIN
DEPT D
ON(E.DEPTNO=D.DEPTNO)


