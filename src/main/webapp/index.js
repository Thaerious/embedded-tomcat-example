"use strict";

console.log("running js file");

let wsUri = "ws://127.0.0.1:8080/wordgame/game";
let websocket = new WebSocket(wsUri);

websocket.onOpen = (evt)=>{
    console.log("Connected to Endpoint!");
     websocket.send("hello out there");
};

websocket.onerror  = (evt)=>{
    console.log("Error on Endpoint!");
};