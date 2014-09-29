package com.mrhaki

/**
 * Created by thandomafela on 20/09/2014.
 */
class SampleTagLib {

    static namespace = "sample"

    static returnObjectForTags = ['sample', 'name']

    def sample = { attrs, body ->
        final double value = attrs.double('v', 43.0)
        value
    }

    def name = { attrs,body ->
        String name = 'Robyn'
        name
    }

    def contactListTile = { attrs, body ->
        def value = """
<script type="text/template"  id="contactTemplate">
        <img src="<%= photo %>" alt="<%=name %>" />
        <h1><%= name %><span><%=type %></span></h1>
        <div><%=address %></div>
        <dl>
            <dt>Tel:</dt><dd><%=tel %></dd>
            <dt>Email:</dt><dd><a href="mailto:<%=email %>"><%= email %></a></dd>
        </dl>
    </script>

"""
        out << value
    }
}
