# ICP3 README / WIKI

Description:<br>

Tasks for this ICP -<br><br>

1.) Hover<br>
    -modify javascript to show baking image on mouse over<br><br>

2.) Github User Finder<br>
    -display image about github users after entering a username<br><br>

## Hover Task

### Output Screenshot

![hover_output](wiki_screenshots/hover_output.PNG)

notes: <br>
this is better displayed in my video

### JS Screenshot

![hover_js](wiki_screenshots/hover_js.PNG)

notes: <br>
I call the update function on mouse over of each image along the bottom. <br>
I call the unDo function on mouseout<br>

## Github User Finder

### Output Screenshot

![github_output](wiki_screenshots/github_output.PNG)

notes: <br>
I display the users name in the h2 header, and their company and bio in two divs tothe right of their avatar.<br>
In this example, I've used my own github username.<br>

### getGithubInfo(user) code

![github_js1](wiki_screenshots/github_js1.PNG)

notes: <br>
I was able to replicate most of the elements but struggled to make my name appear on the right side. I think my columns were not set up correctly<br>

### showUser(user) code

![github_js2](wiki_screenshots/github_js2.PNG)

notes: <br>
I call the showUser function after getting a successful http response.<br>
This function edits the HTML of index.html to output the github user information<br>

### noSuchUser(username) code

![github_js3](wiki_screenshots/github_js3.PNG)

notes: <br>
This function simply outputs the user input with a short message "...no such user"

