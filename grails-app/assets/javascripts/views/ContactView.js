
var app = app || {};

var ContactView = Backbone.View.extend({

    initialize: function() {

    },

    tagName: "article",
    className: "contact-container",
    template: $("#contactTemplate").html(),

    render: function() {
        var tmpl = _.template(this.template);

        $(this.el).html(tmpl(this.model.toJSON()));

        return this;
    }



});