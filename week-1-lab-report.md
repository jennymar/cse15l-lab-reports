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

The last step is to test out some linux commands! I listed out the contents of my home directory, 
changed directories into perl5, printed out the new working directory, etc. When I was finished testing
out commands, I logged out with Ctrl-D. 


