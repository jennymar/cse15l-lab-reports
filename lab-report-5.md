# Lab Report 5

For my lab report 5, I want to do the same exploration of several options for the the `find` command. In my lab report 3, I explored 4 different options for the `grep` command, and I will be continuing that but with the `find` command in this report.


#### -name
Source: linux commands manual by running `man find`

Example 1: 
```
$ find . -name HandRHawaii.txt
./travel_guides/berlitz1/HandRHawaii.txt
```
In this first example, I ran the find command on the working directory with the `-name` option, which searches for all files that match that name. Because there was only 1 file that matched, it returned the HandRHawaii.txt file in berlitz1. 

Example 2:
```
$ find . -name ch2.txt
./non-fiction/OUP/Berk/ch2.txt
./non-fiction/OUP/Abernathy/ch2.txt
./non-fiction/OUP/Rybczynski/ch2.txt
./non-fiction/OUP/Fletcher/ch2.txt
```
In the second example, we see that there are 4 different file paths that contain the file `ch2.txt`, which shows the usefulness of this command option. If we know the name of the file but not the location, we can find it using `-name` and we can check if there are other files with the same name.


#### -type
Source: https://linuxhint.com/use-the-find-command-in-linux-to-search-files/#:~:text=%5Boptions%5D%3A%20It%20defines%20the,to%20perform%20with%20the%20file

Example 1:
```
$ find . -type d
.
./non-fiction
./non-fiction/OUP
./non-fiction/OUP/Berk
./non-fiction/OUP/Abernathy
./non-fiction/OUP/Rybczynski
./non-fiction/OUP/Kauffman
./non-fiction/OUP/Fletcher
./non-fiction/OUP/Castro
./travel_guides
./travel_guides/berlitz1
./travel_guides/berlitz2
```
For the `-type d` option, we can search for all matching results that correspond with the type of a directory. In the `written_2` directory, there are 12 different resulting directories, including itself. 

Example 2:
```
$ find . -type f
./non-fiction/OUP/Berk/ch2.txt
./non-fiction/OUP/Berk/ch1.txt
./non-fiction/OUP/Berk/CH4.txt
./non-fiction/OUP/Berk/ch7.txt
./non-fiction/OUP/Abernathy/ch2.txt
./non-fiction/OUP/Abernathy/ch3.txt
./non-fiction/OUP/Abernathy/ch1.txt
./non-fiction/OUP/Abernathy/ch7.txt
...
./travel_guides/berlitz2/Cuba-History.txt
./travel_guides/berlitz2/Vallarta-WhereToGo.txt
./travel_guides/berlitz2/Bahamas-History.txt
./travel_guides/berlitz2/Beijing-WhatToDo.txt
./travel_guides/berlitz2/Cancun-WhereToGo.txt
```
The option `-type f` searches for the type files and returns a very long list of every file in `written_2`. This command option can be very useful to filter out unnecessary file types that we do not want to look for. We can use “f”, “d”, “l”, and “s”.


#### -size
Source: https://ostechnix.com/find-files-bigger-smaller-x-size-linux/ 

Example 1:
```
$ find . -type f -size -2048c
./travel_guides/berlitz1/HandRLasVegas.txt
./travel_guides/berlitz1/HandRIstanbul.txt
./travel_guides/berlitz1/HandRHongKong.txt
./travel_guides/berlitz1/HandRLisbon.txt
./travel_guides/berlitz1/HandRMallorca.txt
./travel_guides/berlitz1/HandRLosAngeles.txt
./travel_guides/berlitz1/HandRMadeira.txt
./travel_guides/berlitz1/HandRIbiza.txt
./travel_guides/berlitz1/HandRLakeDistrict.txt
./travel_guides/berlitz1/HandRJerusalem.txt
```
In order to search for files/directories of a given size, we can use the `-size` option. In this first example, we are finding all files in the working directory that have a size of less than 2048 bytes.

Example 2:
```
$ find . -type f -size -1k
./travel_guides/berlitz1/HandRIstanbul.txt
./travel_guides/berlitz1/HandRIbiza.txt
```
In this second example, we are filtering the `find` command to return only files that have a size of less than 1 kilobyte. We can also use "c" for bytes, "M" for megabytes, and "G" for gigabytes, as well as a "+" or "-" to denote above or below the size threshold given.


#### -iname
Source: https://linuxhint.com/use-the-find-command-in-linux-to-search-files/#:~:text=%5Boptions%5D%3A%20It%20defines%20the,to%20perform%20with%20the%20file 

Example 1:
```
$ find . -iname cUbA-hiSTORy.txt
./travel_guides/berlitz2/Cuba-History.txt
```
If we are unsure of the case of the file, we can search in a case-insensitive manner with the `-iname` option. Here, we are finding with `cUbA-hiSTORy.txt` and the command line returns `Cuba-History.txt`.

Example 2: 
```
$ find . -iname ch4.txt     
./non-fiction/OUP/Berk/CH4.txt
./non-fiction/OUP/Kauffman/ch4.txt
```
In this final example, we are searching for `ch4.txt`, and the terminal gives back 2 distinct file paths, with different case sensitivities. This option would be very beneficial in a situation like this where we are unsure of the capitalization of the actual file. 