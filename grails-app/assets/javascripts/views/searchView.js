var app = app || {};
app.SearchView = Backbone.View.extend({

    initialize: function() {
        this.render();
    },

    el:  $("#search_container"),

    events: {
        "click #search_button" : "doSearch"
    },

    render: function() {
        var variables = { search_label: 'My Search'};
        var $search_template = $("#search_template");
        var template = _.template($search_template.html(), { search_label: 'My Search'});

       this.$el.html(template);

    },

    doSearch: function(event) {
        alert("search for " + $("#search_input").val());
    }

});

