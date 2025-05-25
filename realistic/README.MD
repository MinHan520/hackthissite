# Challenge 1
## Question
From: HeavyMetalRyan
Message: Hey man, I need a big favour from you. Remember that website I showed you once before? <a href="https://www.hackthissite.org/missions/realistic/1/">Uncle Arnold's Band Review Page?</a> Well, a long time ago I made a $500 bet with a friend that my band would be at the top of the list by the end of the year. Well, as you already know, two of my band members have died in a horrendous car accident... but this ass hole still insists that the bet is on!
I know you're good with computers and stuff, so I was wondering, is there any way for you to hack this website and make my band on the top of the list? My band is Raging Inferno. Thanks a lot, man!

## Solutions
1. You will notice this when inspect at <b>Raging Inferno</b>. Try to modify the value on 5 to 9999. 
2. Try to click on 5 to increase the score
<form action="v.php" method="get">
			<input type="hidden" name="PHPSESSID" value="abcaeadfc31a5c43b2534bf995c0553f">
			<input type="hidden" name="id" value="3">
			<select name="vote">
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="99999">5</option>
			</select>
			<input type="submit" value="vote!">
		</form>



# Challenge 2
## Question
From: DestroyFascism
Message: I have been informed that you have quite admirable hacking skills. Well, this racist hate group is using their <a href="https://www.hackthissite.org/missions/realistic/2/">website</a> to organize a mass gathering of ignorant racist bastards. We cannot allow such bigoted aggression to happen. If you can gain access to their administrator page and post messages to their main page, we would be eternally grateful.

## Solutions
1. Observe by inspecting the HTML code and open the update.php to redirect to the login page
2. There is not much information available in the login HTML page. Hence, I suspect this will be using the select SQL with normal Boolean to login. 
3. Hence, I tried with the most basic SQL injection by inserting "username ={1'='1' or 'a'='a} and password ={1'='1' or 'a'='a}". 
4. Next I successfully execute my basic SQL injection. 

*Side Note about SQL Injection*
Why do we use {1'='1' or 'a'='a} instead os {'1'='1' or 'a'='a'}?
The later option will turn out this SQL line 
{SELECT * FROM users WHERE username = 'test' OR '1'='1'';}


# Challenge 3
## Question
From: PeacePoetry

Message: I run this website where people can read and submit peace-related poetry. I am doing this out of good will towards others, and I don't see why I would be making enemies out of this, but some real ass hole hacked my website posting a bunch of ignorant aggressive propaganda on the front page. And I made that website a while ago, and I no longer have access to it. Do you think you can hack in and change it back? Please? Oh, and bonus points if you message me the name of the bastard who did this!
My website can be found <a href="https://www.hackthissite.org/missions/realistic/3/">here.</a>

## Solutions
1. Realize this comment in the page source : 
<!--Note to the webmasterThis website has been hacked, but not totally destroyed. The old website is still up. I simply copied the old index.html file to oldindex.html and remade this one. Sorry about the inconvenience.-->

2. visit the /oldindex.html page
3. Inspect the page and copy the whole html source code
4. Submit the poetry with the name : "../index.html" and poem : {paste the whole html code}.

# Challenge 4
## Question
Message: Hello, I was referred to you by a friend who says you know how to hack into computers and web sites - well I was wondering if you could help me out here. There's this local store who is killing hundreds of animals a day exclusively for the purpose of selling jackets and purses etc out of their skin! I have been to their website and they have an email list for their customers. I was wondering if you could somehow hack in and send me every email address on that list? I want to send them a message letting them know of the murder they are wearing. Just reply to this message with a list of the email addresses. Please? Their website is at <a href="http://www.hackthissite.org/missions/realistic/4/">link</a>. Thanks so much!!

## Solutions
1. By browsing through the inspection, you are able to see there is PHP file in this doc which is "https://www.hackthissite.org/missions/realistic/4/products.php?categoty=1"
2. I tested different categories and realize there is only 2 categories for this product. 
Example : "https://www.hackthissite.org/missions/realistic/4/products.php?category=2"


# Challenge 5
## Question
Message: Yo! This is Spiffomatic64 from Hackthissite.org! I'm a bit of a hacker myself as you can see, but I recently came upon a problem I couldn't resolve.....
Lately I've been getting calls day and night from the telemarketing place. I've gone to their <a href="https://www.hackthissite.org/missions/realistic/5/">website</a> and hacked it once deleting all of their phone numbers so they wouldn't call me anymore. That was a temporary fix but they put their database back up, this time with an encrypted password. When I hacked them I noticed everything they used was 10 years out of date and the new password seems to be a 'message digest'. I have done some research and I think it could be something like a so-called hash value. I think you could somehow reverse engineer it or brute force it. I also think it would be a good idea to look around the server for anything that may help you.

## Solutions
1. I use a fantastic tools which is HashTag by SmeegeSec <a href ="https://github.com/SmeegeSec/HashTag/tree/master">https://github.com/SmeegeSec/HashTag/tree/master</a>

This is a tools that allows me to know which are the high possibilities that the hash is used. I suggest to gitclone and store it in your folder.

2. I used python2 ../HashTag/HashTag.py -sh {<i>your hash value</i>}

Later on I found that MD4 stand a really high possibility.

3. Attempt to crack the password using the john the ripper tools 

*john --wordlist=/usr/share/john/password.lst --rules pass.txt*

4. I will try to crack directly with the higher possibility hash

Can use *john --list=formats pass.txt | grep MD4* to find what is the available hash

Or can use this to show available hash 

*john -list=formats | grep md4*

Crack the password

*john --formats=Raw-MD4 --fork=4 pass.txt*

5. Show the password

*john --format=Raw-MD4 --show pass.txt*

## Password

7973c

# Challenge 6
## Question 
From: ToxiCo_Watch

Message: Hello esteemed hacker, I hope you have some decent cryptography skills. I have some text I need decrypted.
I work for this company called ToxiCo Industrial Chemicals, which has recently come under fire because of the toxic chemicals we are dumping into the river nearby. Ecological inspectors have reported no problems, but it is widely speculated that they were paid off by ToxiCo management because the water pollution near the ToxiCo factory has always been a serious and widely publicized issue.
I have done some packet sniffing on my network and I have recovered this email that was sent from the CEO of the company to Chief Ecological Inspector Samuel Smith. However, it is encrypted and I cannot seem to decode it using any of my basic decryption tools. I have narrowed it down to the algorithm used to encrypt it, but it is beyond my scope. I was hoping you can take a look at it.
Please check it out,
<a href="https://www.hackthissite.org/missions/realistic/6/index.html">more details are on the page</a>. If you can unscramble it and reply to this message with the original text, it would be much appreciated. Thank you.


# Challenge 7
## Question 
From: FreedomOfChoice

Message: Friend of freedom and liberty, I invite you to take a look at the hate speech being spewed over the web at http://www.hackthissite.org/missions/realistic/7/. It's so funny that conservatives keep saying they want to protect the values of America - freedom, tolerance, and democracy - but when it comes to personal choices like private marijuana use or same-sex marriages, they damn them to burn in eternal hell and send them to jail.
This is a personal freedom issue. No one else is hurt if two consenting adults decide to marry. But people who claim to have the moral high ground decide to ruin it for everyone else and discriminate against same-sex couples. To think that they are talking about making a constitutional amendment to STOP OUR FREEDOM TO MARRY is ludicrous. This injustice must be stopped.
There is an admin section on that website somewhere, perhaps hidden among their directory structure. It would be a great fight against moral tyranny and a victory for freedom if you could somehow hack into their website. Thank you.

## Solution
1. When you observe the website you will able to see there is /images/{name}.jpg directory. 



I make use of this opportunity to see are there anything in the image dir.

2. I realize there are a lot of images and also *../admin/* dir in this dir means I will just have to find the password.

3. I try to search for files in the admin dir by doing this to the url : 

*https://www.hackthissite.org/missions/realistic/7/showimages.php?file=images/admin/.htpasswd*

4. In source code, I realize this : administrator:$1$AAODv...$gXPqGkIO3Cu6dnclE/sok1

5. I make use of John The Ripper tool too solve this : 

*john --fork=4 pass.txt*

*john --show pass.txt* 

Note : A side note when I try to check and identify the hash used, there written no hash is used for this challenge.

## Password 
Username : Administrator

Password : Shadow


# Challenge 8
