﻿SET DEFINE OFF;
Insert into LLSFW_V2.TS_USER_JOB
   (LOGIN_NAME, JOB_CODE, CREATE_BY, CREATE_DATE)
 Values
   ('admin', 'deptLeader', 'admin', TO_DATE('02/01/2016 14:30:59', 'MM/DD/YYYY HH24:MI:SS'));
Insert into LLSFW_V2.TS_USER_JOB
   (LOGIN_NAME, JOB_CODE, CREATE_BY, CREATE_DATE)
 Values
   ('admin', 'hr', 'admin', TO_DATE('02/02/2016 11:02:20', 'MM/DD/YYYY HH24:MI:SS'));
Insert into LLSFW_V2.TS_USER_JOB
   (LOGIN_NAME, JOB_CODE, CREATE_BY, CREATE_DATE)
 Values
   ('demo', 'readonly', 'admin', TO_DATE('01/11/2016 09:26:33', 'MM/DD/YYYY HH24:MI:SS'));
Insert into LLSFW_V2.TS_USER_JOB
   (LOGIN_NAME, JOB_CODE, CREATE_BY, CREATE_DATE)
 Values
   ('admin', 'TEST_JOB', 'admin', TO_DATE('05/03/2014 13:01:50', 'MM/DD/YYYY HH24:MI:SS'));
COMMIT;
