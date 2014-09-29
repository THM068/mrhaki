var app = app || {}

var Contact = Backbone.Model.extend({
    defaults: {
        photo: "assets/placeholder.png"
    }


});

var Directory = Backbone.Collection.extend({
    model: Contact
})