
function getGithubInfo(user) {
    //1. Create an instance of XMLHttpRequest class and send a GET request using it.
    // The function should finally return the object(it now contains the response!)

    // create http request, provide url with user
    const request = new XMLHttpRequest();
    var url = "https://api.github.com/users/" + user;

    request.open("GET", url);
    request.send();

    request.onload = function() {
        // parse and display results successful response case
        if (request.status === 200) {
            showUser(JSON.parse(request.response));
        }
        // when no user is found
        else {
            noSuchUser(user);
        }
    }
}

function showUser(user) {
    //2. set the contents of the h2 and the two div elements in the div '#profile' with the user content


    // clear output
    $(".avatar").html("");
    $(".information").html("");

    // gather user info
    var usr_login = $(user).attr("login");
    var usr_avatarurl = $(user).attr("avatar_url");
    var usr_company = $(user).attr("company");
    var usr_bio = $(user).attr("bio");

    //output to index.html
    $("#header2").append(usr_login)
    $(".avatar").append("<img style='width: 20%' src=" + usr_avatarurl + ">");
    $(".information").append("<div>Company: " + usr_company + "><br>");
    $(".information").append("<div>Bio: " + usr_bio + "><br>");

}

function noSuchUser(username) {
    //3. set the elements such that a suitable message is displayed

    $(".avatar").text(username);
    $(".information").text("...no such user");
}

$(document).ready(function () {
    $(document).on('keypress', '#username', function (e) {
        //check if the enter(i.e return) key is pressed
        if (e.which == 13) {
            //get what the user enters
            username = $(this).val();
            //reset the text typed in the input
            $(this).val("");
            //get the user's information and store the response
            getGithubInfo(username);
        }
    })
});