let player_output = document.getElementById("player_output");
let computer_output = document.getElementById("computer_output");
let results_output = document.getElementById("results_output");

let rock_btn = document.getElementById("rock_btn")
let paper_btn = document.getElementById("paper_btn")
let scissors_btn = document.getElementById("scissors_btn")
let submit_btn = document.getElementById("submit_btn")

var player_choice = ""
var computer_choice = 0
var choice_change = 0

function clear() {
    player_output.innerHTML = "";
    computer_output.innerHTML = "";
    results_output.innerHTML = "";
    player_choice = "";
    computer_choice = "";
}

function submit(player_choice) {
    //get computer choice and compare against player choice
    computer_choice = Math.floor(Math.random() * Math.floor(3));
    choice_change = Math.floor(Math.random() * Math.floor(2));


    if (computer_choice == "0") {
        if (player_choice != "PAPER") {
            computer_output.innerHTML="ROCK";
            results_output.innerHTML="YOU LOSE!";
        }
        else {
            computer_output.innerHTML="ROCK";
            results_output.innerHTML="YOU WIN!";
        }
    }
    else if (computer_choice == "1") {
        if (player_choice != "SCISSORS") {
            computer_output.innerHTML="PAPER";
            results_output.innerHTML="YOU LOSE!";
        }
        else {
            computer_output.innerHTML="PAPER";
            results_output.innerHTML="YOU WIN!";
        }
    }
    else if (computer_choice == "2") {
        if (player_choice != "ROCK") {
            computer_output.innerHTML="SCISSORS";
            results_output.innerHTML="YOU LOSE!";
        }
        else {
            computer_output.innerHTML="SCISSORS";
            results_output.innerHTML="YOU WIN!";
        }
    }
}

//set listener for each btn
rock_btn.addEventListener('click', function () {
    //clear();
    player_choice = "ROCK";
    player_output.innerHTML="ROCK";
});

paper_btn.addEventListener('click', function () {
    //clear();
    player_choice = "PAPER";
    player_output.innerHTML="PAPER";
});

scissors_btn.addEventListener('click', function () {
    //clear();
    player_choice = "SCISSORS";
    player_output.innerHTML="SCISSORS";
});

submit_btn.addEventListener('click', function () {
    if (player_choice == "") {
        results_output = "please select rock, paper, or scissors"
    }
    else {
        submit(player_choice)
    }

});
