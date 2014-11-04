var app = app || {}

var Contact = Backbone.Model.extend({

    initialize: function() {
        console.log('Hello world contact ')
    },

    defaults: {
        photo: "assets/placeholder.png"
    }


});

var Directory = Backbone.Collection.extend({
    model: Contact
})