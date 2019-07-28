/* jshint esversion: 8 */

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
    var id = request.body.user_info.user_id;
    var pw = request.body.user_info.user_pw;
    // create default response query
    var res = {
        'status_code': 400
    };
    db.collection('UserInfo').get().then((snapshot) => {
        snapshot.forEach((doc) => {
            if (doc.user_id===id && doc.user_pw===pw){
                // change status code
                res.status_code = 200;
            }
        });
        // send response query to Android
        response.send(res);
        // return Promise
        return;
    }).catch((err) => {
        console.log("Error getting documents", err);
    });
});


exports.signup = functions.https.onRequest((request, response) => {
    var id = request.body.user_info.user_id;
    var pw = request.body.user_info.user_pw;
    // create default response query
    var res = {
        'status_code': 400
    };
    // update data on Database
    db.collection('UserInfo').doc().set({
        'user_id': id,
        'user_pw': pw
    });
    // change status code
    res.status_code = 200;
    console.log(res.status_code);
    // send response query to Android
    response.send(res);
});