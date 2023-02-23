# Lab Report 4

### Step 1: Delete Existing Forks
To delete the existing fork from GitHub, I went to my existing fork, went to Settings and deleted the repository from my account. To deleted the fork from my ieng machine, I used the command `rm -rf lab7/` to recursively delete all the files and subdirectories in `lab7`.

![image](/remove-repo-github.png)
![image](/delete-repo-locally.png)

### Step 2: Fork The Repo
In order to re-fork the repo, I went to https://github.com/ucsd-cse15l-w23/lab7 and forked the repository. 
![image](/forked-repo.png)

### Step 3: Log into ieng6
To log into my ucsd ieng6 remote machine, I used the command `ssh cs15lwi23amj@ieng6.ucsd.edu` and since I already set up my SSH key, I did not have to type in a password to secure my log in.
![image](/ieng-login.png)

### Step 4: Clone Fork From GitHub
The next step was to clone my fork of the repository from my Github account. I copied the ssh link from the GitHub repo and typed in `git clone` into the terminal, with Cmd + V after to paste, resulting in `git clone git@github.com:jennymar/lab7.git`. 
![image](/git-clone-repo.png)

### Step 5: Run Tests
To compile and run the java files, I first changed directory to lab7 by running `cd la<lab>`, which autofilled to `cd lab7/`. I used the commands `javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java` and `java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore TestList<tab>`. The `<tab>` autofilled to `TestListExamples.java` to run that java file for me. 
![image](/broken-tests.png)

### Step 6: Fix Code
To edit the java file, I ran `nano List<tab><tab>`, which autofilled to `nano ListExamples.java` to enter the java file. I hit the down arrow key until I reached the last iteration of the line `index1 += 1`. I hit the right arrow key 12 times and changed it to `index2 += 1` instead. To save and exit, I used `Ctrl + O`, then `<enter>`, and then `Ctrl + X`. 
![image](/nano.png)

### Step 7: Run Tests Again
To re-run the tests, I used `<up><up><up>` to run `javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java` and `<up><up><up>` to run `java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore TestListExamples`. 
![image](/fixed-tests.png)

### Step 8: Commit and Push 
After I completed all the previous steps, I commited and pushed my changes by running `git status` to review the changed files, `git add ListExamples.java` and `git commit -m "updated"` to commit with the message "updated". I then ran `git push origin` to push the changed to the remote repository. 
![image](/git-add.png)