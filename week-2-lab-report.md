# Week 2 Lab Report

### Part 1: StringServer Web Server
---
![image](/stringservercode.png)
![image](/helloss.png)
After I ran `java StringServer 4000` into the command line terminal, I called the main method for StringServer and received a localhost link to the port 4000. The argument I passed in was a String, which would be parsed as an Integer to indicate which port to utilize. 

This started up the server on my local machine and called the method handleRequest. The arguments to start the server was the port number and a new instance of the Handler. When I initially clicked on the link to visit the page, I didn't append any `\add-message` extensions to the back of the URL, so I received a `404 not found` error just as I programmed. 

In this screenshot, I added to the end of the URL `/add-message?s=Hello` to add the message "Hello" to the web page. This called the `handleRequest(URI url)` method with the argument url passed in being the new url link request in a URI object. My String field `output` added on the new String "Hello" and the new line symbol. This is because if my program detects that the URL has the query s="insert some string," it will parse the query into my `parameters` String array and add the second value into the field `output`.


![image](/secondmsgss.png)
In this second screenshot, the method `handleRequest(URI url)` was once again called to handle the new link request I made, the updated URI request being passed in. The parameters String array now has the String "This is a second message" in the second value/first index. Now, the value of `output` is changed to `Hello\nThis is a second message\n`. 


### Part 2: StringServer Web Server
---

I chose the bug from the method reversed(int[] arr) in ArrayExamples.java. 

**Failure-inducing input:** 
```
int[] input2 = { 4, 5, 6 };
assertArrayEquals(new int[]{ 6, 5, 4 }, ArrayExamples.reversed(input2));
```
I inputed a int array with 3 values 4, 5, and 6. 

**Non-failure inducing input:**
```
int[] input1 = { };
assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
```
I inputed an empty int array with 0 values.

**Symptom:**
The failure-inducing input test case returned the error below.
> arrays first differed at element [0]; expected:[6] but was:[0] at ArrayTests.testReversed(ArrayTests.java:26)

This means that the buggy method contained the value 0 at the index 0, but we expected the program to have the value 6 in that position.

**Bug:** 
In the original code, the statement within the for loop sets arr to a value from newArray, but newArray is merely an int array with 0 in all positions. Instead, we want to set newArray to a value form arr because arr is the int array with the real values we want to reverse. Additionally, we want to return newArray and not arr because the method wants to return a new array with all elements of the input array reversed, not the original array. 

Buggy Code:

```
static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = newArray[arr.length - i - 1];
    }
    return arr;
  }
```

Fixed Code:
```
static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      newArray[i] = arr[arr.length - i - 1];
    }
    return newArray;
  }
```
The fix now allows us to deep copy values from the original array into the new array in a reversed order and returns the correct new array.




### Part 3: StringServer Web Server
---
Something that I learned from lab from week 2/3 was about web servers and server client hosting! I did not have any previous experience with how web pages and requests were sent and received, so I found that very interesting. I learned that because the server exists in a different place than the https site I am viewing, multiple people can access and change data that will change the output for all users. I also learned that if a port is already being occupied, that port cannot be used by another program. 





