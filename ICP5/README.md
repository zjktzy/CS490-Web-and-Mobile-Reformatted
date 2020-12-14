# ICP3 README / WIKI

Description:

In this ICP I created a simple rock paper scissors game using javascript as well as replicated a mockup using html and css

## RPS Task

##### Output Screenshot

![icp5_output](wiki_screenshots/icp5_output.PNG)

notes: <br>
To Do tasks can be added, removed, and marked complete

##### HTML Screenshot

![RPS_css](wiki_screenshots/icp5_html.PNG)

notes: <br>
My application consists of two containers, the first holds my To Do input box and list. <br>
The second container holds the input boxes for new events and a list of timestamps for each event. <br>

##### To Do TypeScript Screenshot

![icp5_todo_ts](wiki_screenshots/icp5_todo_ts.PNG)

notes: <br>
The submitNewItem function simply takes the item input and adds it to the item list. <br>
The completeItem function finds the index of the given item and 'splices' or removes it from the list. <br>

##### Countdown TypeScript Screenshot

![icp5_countdown_ts](wiki_screenshots/icp5_countdown_ts.PNG)

notes: <br>
The submitNewDate function adds both the event name and event date to their respective lists. <br>
The startCountDown function parses the user input date and stores it in a date object. It should also start the countdown for that date, but this part is not functioning. <br>
The countdown function decrements the date by one second and is meant to be called each second the app is running for each date in the dates list. <br>