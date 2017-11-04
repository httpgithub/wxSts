/**
 * Created by mayxys on 2017/11/1.
 */
// Initialize app
var myApp = new Framework7();

// If we need to use custom DOM library, let's save it to $$ variable:
var $$ = Framework7.$;

// Add view
var mainView = myApp.addView('.view-main', {
    // Because we want to use dynamic navbar, we need to enable it for this view:
    dynamicNavbar: true
});

// Option 1. Using one 'pageInit' event handler for all pages (recommended way):
$$(document).on('pageInit', function (e) {
    // Get page data from event data
    var page = e.detail.page;

    if (page.name === 'about') {
        // Following code will be executed for page with data-page attribute equal to "about"
        myApp.alert('Here comes About page');
        var calendarMultiple = myApp.calendar({
            input: '#calendar-multiple',
            dateFormat: 'M dd yyyy'
        });
    }
})