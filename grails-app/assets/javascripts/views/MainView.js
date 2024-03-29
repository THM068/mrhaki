//= require_tree model
//= require_tree views
//= require_tree data

var app = app || {}
app.contacts = [
    { name: "Contact 1", address: "1, a street, a town, a city, AB12 3CD", tel: "0123456789", email: "anemail@me.com", type: "family" },
    { name: "Contact 2", address: "1, a street, a town, a city, AB12 3CD", tel: "0123456789", email: "anemail@me.com", type: "family" },
    { name: "Contact 3", address: "1, a street, a town, a city, AB12 3CD", tel: "0123456789", email: "anemail@me.com", type: "friend" },
    { name: "Contact 4", address: "1, a street, a town, a city, AB12 3CD", tel: "0123456789", email: "anemail@me.com", type: "colleague" },
    { name: "Contact 5", address: "1, a street, a town, a city, AB12 3CD", tel: "0123456789", email: "anemail@me.com", type: "family" },
    { name: "Contact 6", address: "1, a street, a town, a city, AB12 3CD", tel: "0123456789", email: "anemail@me.com", type: "colleague" },
    { name: "Contact 7", address: "1, a street, a town, a city, AB12 3CD", tel: "0123456789", email: "anemail@me.com", type: "friend" },
    { name: "Contact 8", address: "1, a street, a town, a city, AB12 3CD", tel: "0123456789", email: "anemail@me.com", type: "family" }
];

var app = app || {};

var DirectoryView = Backbone.View.extend({

    el: $("#contacts"),

    initialize: function() {
        this.collection = new Directory(app.contacts);
        this.$el.find("#filter").append(this.createSelect());

        this.on("change:filterType", this.filterByType, this);

        this.render();
    },

    events: {
        "change #filter select" : "setFilter"
    },

    render: function() {
        var that = this;

        _.each(this.collection.models, function(item){
            that.renderContact(item);
        }, this);
    },

    renderContact: function(item) {
        var contactView = new ContactView({model: item});

        $(this.el).append(contactView.render().el)
    },

    getTypes: function() {
        return _.uniq(this.collection.pluck("type"), false, function(type){
            return type.toLowerCase();
        });
    },

    createSelect: function () {
        var select = $("<select/>", { html: "<option>All</option>" });

        _.each(this.getTypes(), function (item) {
            var option = $("<option/>", {
                value: item.toLowerCase(),
                text: item.toLowerCase()
            }).appendTo(select);
        });
        return select;
    },

    setFilter: function(e) {
        this.filterType = e.currentTarget.value;
        console.log(this.filterType);
        this.trigger("change:filterType");
    },

    filterByType: function () {

        if (this.filterType === "all") {
            this.collection.reset(contacts);
        } else {
            this.collection.reset(contacts, { silent: true });

            var filterType = this.filterType,
                filtered = _.filter(this.collection.models, function (item) {
                    return item.get("type").toLowerCase() === filterType;
                });

            this.collection.reset(filtered);
        }
    }









});

var directoryView = new DirectoryView();