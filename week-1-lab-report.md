# Week 1 Lab Report

This is a tutorial on how to log into a remote account on ieng6!

### Step 1: Installing VScode
---
![image](/vscodescreenshot.png)

The first step is to install the VScode editor onto your computer. Because I already had VScode installed
on my computer, I skipped this step. VScode is a free online code editor that is very easy to use and can be installed from [this link](https://code.visualstudio.com/)!


### Step 2: Remotely Connecting
---
![image](/remotelogin.png)

The next step is to connect to the remote computer via the ssh command. Open the terminal application and type 
`ssh ACCOUNT@ieng6.ucsd.edu` where ACCOUNT is replaced by your CSE 15l account username. For me, it looked like 
this: `ssh cs15lwi23amj@ieng6.ucsd.edu`

Because I own a Mac machine, I did not have to install any additional items. If you do have a Windows 
machine, you may need to install and configure Bash as well.

The terminal then prompted me to input my password. I typed in the password that I had previously set and 
successfully logged in! Note that the password characters will not show up on the screen, but they are being 
inputted regardless. The above screenshot shows what the login screen looked like. 



### Step 3: Trying Some Commands
---
![image](/terminalcommands.png)

The last step is to test out some linux commands! I learned that these terminal commands can help me do a lot of important things, including view what files and
folders are within directories, create new files, and print out file contents, both within my local computer and the remote 
machine. The interesting thing about some of these commands is that by adding extra -x components after the command will
give different variations of outputs. Here are some of the commands I used: 
* `ls`: lists files and directories from current location
* `cd perl5`: changes directories to be inside perl5 folder
* `pwd`: prints working directory, which is `/home/linux/ieng6/cs15lwi23/cs15lwi23amj/perl5`
* `cd ~`: go back to home directory
* `ls -lat`: list what is inside directory, but with showing hidden dot files, listing by time, and long listing 
* `logout`: signs me out of the remote ieng6 machine

