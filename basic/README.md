


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

**Challenge 9**
Requirements: Knowledge of SSI, unix directory structure.
 
***Solutions***
1. limit people to using server side includes to display the directory listing to level 8 only. Which means the system only allows us to view until level 8 
2. Hence, taking into consideration of Challange 8 : using the ls ../ to check level 8 dir
3. We will be checking more information in this directory by using this command
#<!--exec cmd="ls ../../9"-->
later you will realize there is a new php file named "p91e283zc3.php"
4. Paste this php file at the end of the challenge 9 url to open the PHP file of the website. 

Answer :7bf30faa

**Challenge 10**
This time Sam used a more temporary and "hidden" approach to authenticating users, but he didn't think about whether or not those users knew their way around javascript...

***Solution 1***
1. Try to check on the cookies
2. You will see "level10_authorized" cookies listed as no
3. Change the value of no --> yes
4. Refresh the page and click 'submit', you will bypass the system.

***Solution 2***
1. Go go browser and type 
javascript:alert(document.cookie="level10_authorized=yes")


**Challenge 11**
Sam decided to make a music site. Unfortunately he does not understand Apache. This mission is a bit harder than the other basics.
                  
Hints : Understanding the apache server interaction 

***Solutions***
1. 


