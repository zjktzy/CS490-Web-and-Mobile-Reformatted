# ICP9 README / WIKI

Description:

In this ICP I created a pizza ordering app which sends an email to users confirming their order.

## RPS Task

##### Output Screenshot

![order_output](wiki_screenshots/order_output.PNG)
notes: <br>
This is the primary screen for my app. Users can input their desired order and quantity.

##### MainActivity Java Screenshot

![MainActivity_java](wiki_screenshots/MainActivity_java.PNG)

notes: <br>
The primary function here is the submitAndSendMail function. <br>
this function is called when the user clicks the submit button. It should create an email with the complete order summary in the body, send it to the specified recipient, and navigate to the next page

##### SummaryActivity Java Screenshot

![SummaryActivity_java](wiki_screenshots/SummaryActivity_java.PNG)

notes: <br>
Code for displaying the users name and order is written here, as well as functionality to redirect back to the order page.