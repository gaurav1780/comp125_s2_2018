---
collection-name: '05-recursion'
---


<script src="{{ page.root }}/assets/js/aio.js"></script>
<script>

    var lesson_episodes = [
    {% for episode in site[page.collection-name] %}
    "{{ episode.url }}"{% unless forloop.last %},{% endunless %}
    {% endfor %}
    ];

  window.onload = aio(lesson_episodes)
</script>
{% comment %}
Create anchor for each one of the episodes.
{% endcomment %}
{% for episode in site[page.collection-name] %}
<article id="{{ episode.url }}"></article>
{% endfor %}
