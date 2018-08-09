---
layout: base
title: Search
root: .
---
<ul id="search-results"></ul>

<ul id="search-results" class="side-nav"></ul>

<script>
  window.store = {
    {% assign collections = '' | split: ',' %}
    {%- for collection in site.collections -%}
      {%- unless collection.docs.size == 0 or collection.label == 'episodes' -%}{%- assign collections = collections | push: collection -%}{%- endunless -%}
    {%- endfor -%}
    {%- assign num_of_collections = collections | size -%}
    {%- for collection in collections -%}
      {%- assign collection_counter = forloop.index -%}
      {%- assign collection_size = collection.docs.size -%}
      {%- assign collection_title = "" -%}
      {%- for nav_list_collection in site.data.navigation-list.navigation_list -%}
        {%- if collection.label == nav_list_collection.id -%}
          {%- assign collection_title = nav_list_collection.title -%}
        {%- endif -%}
      {%- endfor -%}
      {%- for page in collection.docs -%}
    "{{ page.url | slugify }}": {
    "title": "{{ page.title | xml_escape }}",
    "collection_title": "{{ collection_title }}",
    "url": "{{ page.url | xml_escape | relative_url | append: '.html' }}",
    "content": {{ page.content | strip_html | strip_newlines | jsonify }},
    "excerpt": {{ page.content | strip_html | truncatewords: 50 | jsonify }}
    }{% unless collection_counter == num_of_collections and forloop.index == collection_size %},
    {% endunless %}
      {%- endfor -%}
    {% endfor %}
  };
</script>


<script src="{{page.root }}/assets/js/lunr.min.js"></script>

<script src="{{ page.root }}/assets/js/jquery.min.js"></script>
<script src="{{ page.root }}/assets/js/search.js"></script>
