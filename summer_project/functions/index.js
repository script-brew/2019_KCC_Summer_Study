// jshint esversion: 8
// Runtime: Node.js 8
// firebase --version: 7.2.4

const admin = require('firebase-admin');
const functions = require('firebase-functions');
admin.initializeApp();

const db = admin.firestore();

// // Create and Deploy Your First Cloud Functions
// // https://firebase.google.com/docs/functions/write-firebase-functions
//
// exports.helloWorld = functions.https.onRequest((request, response) => {
//  response.send("Hello from Firebase!");
// });


exports.signin = functions.https.onRequest((request, response) => {
    // get request data, parse
    var data = JSON.parse(Object.keys(request.body)[0]);
    var id = data.user_info.user_id;
    var pw = data.user_info.user_pw;
    // create default response query
    var status_code = 400;
    db.collection('UserInfo').get().then((snapshot) => {
        snapshot.forEach((doc) => {
            // if id match
            if (doc.user_id===id){
                // if password match
                if (doc.user_pw===pw){
                    // change status code
                    status_code = 200;
                }
                // if password not match
                if (doc.user_pw!==pw){
                    // change status code
                    status_code = 201;
                }
            }
        });
        console.log("status_code: ", status_code);
        // send response query to https
        response.send(status_code);
        // return Promise
        return;
    }).catch((err) => {
        // if Error occurs, go to Firebase\functions\log
        console.log("Error getting documents", err);
    });
});


exports.signup = functions.https.onRequest((request, response) => {
    // get request data, parse
    var data = JSON.parse(Object.keys(request.body)[0]);
    var id = data.user_info.user_id;
    var pw = data.user_info.user_pw;
    var name = data.user_info.user_name;
    var birthday = data.user_info.user_birthday;
    // create default response query
    var status_code = 400;
    db.collection('UserInfo').get().then((snapshot) => {
        snapshot.forEach((doc) => {
            // if id already exist in Database
            if (doc.data().user_id===id){
                console.log("id overlapped: ", id);
                status_code = 202;
                console.log("status_code: ", status_code);
                response.send(status_code);
            }
        }); // end forEach
        // return Promise
        return;
    }).catch((err) => {
        console.log("Error getting documents", err);
    });
    // update data on Database
    db.collection('UserInfo').doc().set({
        'user_id': id,
        'user_pw': pw,
        'user_name': name,
        'user_birthday': birthday
    });
    // change status code
    status_code = 200;
    console.log("status_code: ", status_code);
    // send response query to https
    response.send(status_code);
});