# Week 3 Lab Report

The command I chose to research and base my week 3 lab report off of was: `grep`

#### -c, --count
With `-c` or `--count`, only a count of selected lines is written to standard output for each file searched. 
Source: built-in command manual `man`

Example 1:
```
$ grep -c "Griffith" written_2/*/*/*/*.txt 
written_2/non-fiction/OUP/Abernathy/ch1.txt:0
written_2/non-fiction/OUP/Abernathy/ch14.txt:0
written_2/non-fiction/OUP/Abernathy/ch15.txt:0
written_2/non-fiction/OUP/Abernathy/ch2.txt:0
written_2/non-fiction/OUP/Abernathy/ch3.txt:0
written_2/non-fiction/OUP/Abernathy/ch6.txt:0
written_2/non-fiction/OUP/Abernathy/ch7.txt:0
...
written_2/non-fiction/OUP/Castro/chA.txt:3
written_2/non-fiction/OUP/Castro/chB.txt:2
written_2/non-fiction/OUP/Castro/chC.txt:1
written_2/non-fiction/OUP/Castro/chL.txt:1
written_2/non-fiction/OUP/Castro/chM.txt:0
written_2/non-fiction/OUP/Castro/chN.txt:2
```
In this first example, I called `grep -c` to look for the word "Griffith" in all of the txt files in the subdirectories 4 folders deep. We see that the output prints out the count of how many times "Griffith" appears in those text files next to the file path from the working directory. (I purposefully ommitted some of the output via "..." because of the magnitude of how many txt files exist within the given path.)


Example 2:
```
$ grep -c "city" written_2/*/*/*/*.txt
written_2/non-fiction/OUP/Abernathy/ch1.txt:0
written_2/non-fiction/OUP/Abernathy/ch14.txt:8
written_2/non-fiction/OUP/Abernathy/ch15.txt:2
written_2/non-fiction/OUP/Abernathy/ch2.txt:2
written_2/non-fiction/OUP/Abernathy/ch3.txt:6
written_2/non-fiction/OUP/Abernathy/ch6.txt:0
written_2/non-fiction/OUP/Abernathy/ch7.txt:6
written_2/non-fiction/OUP/Abernathy/ch8.txt:1
written_2/non-fiction/OUP/Abernathy/ch9.txt:3
written_2/non-fiction/OUP/Berk/CH4.txt:12
written_2/non-fiction/OUP/Berk/ch1.txt:8
written_2/non-fiction/OUP/Berk/ch2.txt:8
written_2/non-fiction/OUP/Berk/ch7.txt:4
...
```
In the second example, I called `grep -c` to look for the word "city". We can see just by numbers how many more times this word appears throughout the text files, as we would expect since "city" is a much more commonly used word that "Griffith". The command `grep -c` is useful to get a quick look at which files contain the given word and how many times in each file. 




#### -i, --ignore-case
With `-i` or `--ignore-case`, we can perform case insensitive matching when searching for a phrase/word.
Source: https://www.warp.dev/terminus/make-grep-case-insensitive#:~:text=To%20recap%2C%20the%20grep%20command,or%20%E2%80%94ignore%2Dcase%20flag.

Example 1:
```
$ grep -i "griFFitH" written_2/*/*/*/*.txt
written_2/non-fiction/OUP/Castro/chA.txt:References Carmichael and Sayer 1991; Griffith 1988; Morrison 1992; Sommers 1995; Turner 1981, 1982, 1990, 1999; Viduarri 1991
written_2/non-fiction/OUP/Castro/chA.txt:James Griffith, a professor at the University of Arizona, is probably the scholar who has published the most on Arizona Hispanic folklore. He has written several works on the traditional folk arts of southern Arizona, a region that also includes the Pimas, Yaquis, and Tohono O’odham Native Americans and borders the Sonora state of Mexico. Griffith writes about the foods of the region, folk art, yard shrines, cascarones (decorated eggshells), religious practices, and the various musical traditions. Folklore collected by Griffith’s students is also housed at the Southwest Folklore Archives of the University of Arizona library.
written_2/non-fiction/OUP/Castro/chA.txt:References Campa 1979; Espinel 1946; Griffith 1985, 1988, 1993, 1995; Heyman 1993; Kitchener 1997; Martin 1983, 1988, 1992, 1996; Medina 1975; Myal 1997; Sheridan 1986; Sheridan and Noriega 1987; Tales Told in Our Barrio 1984
written_2/non-fiction/OUP/Castro/chB.txt:References Collier Archives; Griffith 1988; Najera-Ramirez 1989; Soloman 1941
written_2/non-fiction/OUP/Castro/chB.txt:References Griffith 1988; Roemer 1993
written_2/non-fiction/OUP/Castro/chC.txt:References Barber 1993; Gosnell and Gott 1992; Griffith 1985; Jordan 1982; Sanborn 1989
written_2/non-fiction/OUP/Castro/chL.txt:References Bright 1994, 1995; Chabran and Chabran 1996; Gradante 1985; Griffith 1988; Marks 1980; Parsons 1999; Plascencia 1983; Stone 1990; Thomas 1994; Vigil 1991
written_2/non-fiction/OUP/Castro/chN.txt:References Griffith 1988; Heisley and MacGregor-Villarreal 1991; Kitchener 1994; Sommers 1995
written_2/non-fiction/OUP/Castro/chN.txt:References Cash 1998; Griffith 1992; Ramos 1991; Vidaurri 1991; West 1991
written_2/non-fiction/OUP/Castro/chP.txt:References Barker 1974; Braddy 1960, 1971; Campa 1979; Cerda and Farias 1953; Coltharp 1965; Cosgrove 1989; Fregoso 1995; Griffith 1948; Hinojosa 1975; Katz 1974; Keller 1985; Luckenbill 1990; Madrid-Barela 1973; Mazon 1984; Mirandé 1985; Montoya 1977; Orona-Cordova 1992; Paz 1961; Plascencia 1983; Valdez 1992
written_2/non-fiction/OUP/Castro/chP.txt:References Burciaga 1993; Gallegos 1991; Griffith 1988; Ortega 1973; Perl 1983; -Silverthorne 1990; Verti 1993
written_2/non-fiction/OUP/Castro/chQ.txt:References Bierhorst 1990; Brundage 1979; Florescano 1999; Griffith 1990
written_2/non-fiction/OUP/Castro/chR.txt:References Awalt 1998; Boyd 1974; Espinosa 1967; Griffith 1985, 1988; Vidaurri 1991; Wilder 1943
written_2/non-fiction/OUP/Castro/chR.txt:References Arnold 1928; Beeson, Adams, and King 1983; Clark 1959; Dolan and Deck 1994; Dolan and Hinojosa 1994; Griffith 1985, 1988, 1992; Ponce 1993
written_2/non-fiction/OUP/Castro/chY.txt:References Boyer 1988; Griffith 1992, 1995; Husband 1985; Kitchener 1994; Ramos 1991; Vidaurri 1991; West 1991
```
This example showcases that despite the odd capitalized letters within "griFFitH", the program still looked for any instances of the word case insensitively. This command is extremeley useful in searching for instances of words, as we would typically want to search for any appearances of "Griffith" and "griffith". 


Example 2:
```
$ grep -i "Bed-AND-Breakfast" written_2/*/*/*.txt
written_2/travel_guides/berlitz1/HandRIsrael.txt:        Gazit Menachem (Bed-and-Breakfast) ❁ Eilat Town; Tel. (07)
written_2/travel_guides/berlitz1/HandRLakeDistrict.txt:        B&B (bed-and-breakfast) rate, per person, with a fee added at many
```
I searched for "Bed-AND-Breakfast" and the two outputs have different capitalizations of the phase, with "Bed-and-Breakfast" in HandRIsrael.txt and "bed-and-breakfast" in HandRLakeDistrict.txt. Therefore, it was very helpful to use -i, as we'd otherwise get no results printed out since neither capitalizations exactly match the one given in the command.




#### -l, --files-with-matches
With `-l` or `--files-with-matches`, only the names of files containing selected lines are written to standard output.
Source: https://phoenixnap.com/kb/grep-command-linux-unix-examples#:~:text=Grep%20is%20a%20Linux%20%2F%20Unix,searching%20through%20large%20log%20files.

Example 1:
```
$ grep -l "happy" written_2/*/*/*.txt
written_2/travel_guides/berlitz1/HandRHongKong.txt
written_2/travel_guides/berlitz1/HandRIsrael.txt
written_2/travel_guides/berlitz1/HandRJamaica.txt
written_2/travel_guides/berlitz1/HistoryIndia.txt
written_2/travel_guides/berlitz1/HistoryItaly.txt
written_2/travel_guides/berlitz1/IntroFrance.txt
written_2/travel_guides/berlitz1/WhatToIbiza.txt
written_2/travel_guides/berlitz1/WhatToIstanbul.txt
written_2/travel_guides/berlitz1/WhatToJapan.txt
written_2/travel_guides/berlitz1/WhatToLasVegas.txt
written_2/travel_guides/berlitz1/WhatToMalaysia.txt
written_2/travel_guides/berlitz1/WhereToEdinburgh.txt
written_2/travel_guides/berlitz1/WhereToFWI.txt
written_2/travel_guides/berlitz1/WhereToFrance.txt
written_2/travel_guides/berlitz1/WhereToIbiza.txt
written_2/travel_guides/berlitz1/WhereToIndia.txt
written_2/travel_guides/berlitz1/WhereToIsrael.txt
written_2/travel_guides/berlitz1/WhereToItaly.txt
written_2/travel_guides/berlitz1/WhereToJapan.txt
written_2/travel_guides/berlitz1/WhereToLakeDistrict.txt
written_2/travel_guides/berlitz1/WhereToMadrid.txt
written_2/travel_guides/berlitz1/WhereToMalaysia.txt
written_2/travel_guides/berlitz2/Amsterdam-WhereToGo.txt
written_2/travel_guides/berlitz2/Bahamas-History.txt
written_2/travel_guides/berlitz2/Bahamas-Intro.txt
written_2/travel_guides/berlitz2/Bahamas-WhereToGo.txt
written_2/travel_guides/berlitz2/Barcelona-WhereToGo.txt
written_2/travel_guides/berlitz2/Beijing-WhereToGo.txt
written_2/travel_guides/berlitz2/Berlin-History.txt
written_2/travel_guides/berlitz2/Bermuda-WhatToDo.txt
written_2/travel_guides/berlitz2/Bermuda-WhereToGo.txt
written_2/travel_guides/berlitz2/California-WhereToGo.txt
written_2/travel_guides/berlitz2/Canada-WhereToGo.txt
written_2/travel_guides/berlitz2/CanaryIslands-History.txt
written_2/travel_guides/berlitz2/Cancun-History.txt
written_2/travel_guides/berlitz2/Cancun-WhatToDo.txt
written_2/travel_guides/berlitz2/China-WhereToGo.txt
written_2/travel_guides/berlitz2/Costa-WhatToDo.txt
written_2/travel_guides/berlitz2/CstaBlanca-WhereToGo.txt
written_2/travel_guides/berlitz2/Cuba-WhatToDo.txt
written_2/travel_guides/berlitz2/Paris-WhatToDo.txt
written_2/travel_guides/berlitz2/Vallarta-WhatToDo.txt
written_2/travel_guides/berlitz2/Vallarta-WhereToGo.txt
```

Using `-l`, the output is quiet clean, with only the file path names printed out, rather than a very long, busy output showing the context inside each file. This can be useful when searching for a semi-commonly used word such as "happy," as it would be very difficult to read the output without the `-l` addition. 

Example 2: 
```
$ grep -l "Sunset" written_2/travel_guides/*/*.txt
written_2/travel_guides/berlitz1/HandRHawaii.txt
written_2/travel_guides/berlitz1/HandRJamaica.txt
written_2/travel_guides/berlitz1/WhatToLasVegas.txt
written_2/travel_guides/berlitz1/WhatToLosAngeles.txt
written_2/travel_guides/berlitz1/WhereToLosAngeles.txt
written_2/travel_guides/berlitz2/California-WhatToDo.txt
written_2/travel_guides/berlitz2/California-WhereToGo.txt
```

This is another example of using `grep -l` to search for the word "Sunset" in the given file path. We see that there are 7 distinct files in the travel_guides directory that contain the word "Sunset".




#### -R, -r
With `-R` or `-r`, the program will recursively search the subdirectories listed. 
Source: built-in command manual `man`

Example 1:
```
$ grep -r "La Mer" written_2
written_2/travel_guides/berlitz1/HandRHawaii.txt:        top French restaurant (La Mer), and the serene House Without A Key
written_2/travel_guides/berlitz2/Cuba-WhereToGo.txt:The city’s most famous son, a general from the Ten Years’ War, was born in 1841 at the Casa Natal de Ignacio Agramonte, a handsome, early 19th-century mansion in the city center on Plaza de los Trabajadores. The patriot is remembered through personal effects; he met his death in battle in 1873. Visit La Merced church opposite to see peeling frescoes and the venerated objects stored in the crypt.
```
By utilizing `-r`, we simply just state the directory we want to be searched and do not need the `/*/*...` additions to the end of the directory name. Bash recursively searches every subdirectory within written_2 to find the phrase "La Mer". The output shows 2 files that contain "La Mer", HandRHawaii.txt and Cuba-WhereToGo.txt.


Example 2: 
```
$ grep -r “barometer” written_2
written_2/travel_guides/berlitz2/Budapest-WhereoGo.txt:If the ﬁsh are a barometer of a lake’s health, all would appear to be hazard free: about 40 species thrive in it. Balaton pike-perch (fogas) is usually singled out as the tastiest of all. Fishermen operate from shore, from boats, and from platforms set a little distance into the lake. Ice-ﬁshing has been popular since the earliest times, when winter was the only season in which the catch could be preserved and sold in distant parts of Hungary. The frozen lake is also used by ice yachtsmen, whose wind-powered boats skate at hair-raising speeds across the frozen lake.
```
Here is another example of using `-r` to search for the word "barometer" in the entire written_2 folder. The only instance of the word "barometer" is in Budapest-WhereoGo.txt. The command is very useful if we do not know the architecture of the subdirectories and if we do not know how deep the file we want is, if the file even exists at all. 
