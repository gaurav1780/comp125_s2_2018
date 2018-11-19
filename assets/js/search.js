'use strict';

// Credit to https://learn.cloudcannon.com/jekyll/jekyll-search-using-lunr-js/

// Inspiration from https://stackoverflow.com/questions/41436805/how-to-display-a-table-with-10-rows-per-page
// to use datatable.js
(function() {
  function displaySearchResults(results, store) {
    // String for datatable HTML element
    var tableString = '<thead>'+
    // Table Headings
    '<tr><th>Name</th><th>Tags</th></tr>'+
    '</thead>'+
    // Start of table body
    '<tbody>';
    var searchResults = document.getElementById('search-results');
    if (results.length) { // Are there any results?
      // Iterate over the results and append into tableString
      for (var i = 0; i < results.length; i++) {
        var item = store[results[i].ref];
        var title = "";

        if(item.collection_title != "") {
          title = item.collection_title + " - " + item.title;
        } else {
          title = item.title;
        }

        // If no tags for item, then default value is N/A.
        var tags = item.tags || 'N/A';
        // Append result
        tableString += '<tr>'+
        '<td><a href=".' + item.url + '"><strong>' + title + '</strong></a></td>'+
        '<td>' + tags +'</td>'
        '</tr>';
      }
    }
    // End table body with ending tbody tag.
    searchResults.innerHTML = tableString + '</tbody>';
  }

  function getQueryVariable(variable) {
    var query = window.location.search.substring(1);
    var vars = query.split('&');

    for (var i = 0; i < vars.length; i++) {
      var pair = vars[i].split('=');
      if (pair[0] === variable) {
        return decodeURIComponent(pair[1].replace(/\+/g, '%20'));
      }
    }
  }

  var searchTerm = getQueryVariable('search-term');

  if (searchTerm) {
    document.getElementById('search-box').setAttribute("value", searchTerm);

    // Initalize lunr with the fields it will be searching on. I've given title
    // a boost of 10 to indicate matches on this field are more important.
    var idx = lunr(function () {
      this.field('id');
      this.field('title', { boost: 10 });
      this.field('tags');
    });

    for (var key in window.store) { // Add the data to lunr
      idx.add({
        'id': key,
        'title': window.store[key].title,
        'tags': window.store[key].tags,
      });

      var results = idx.search(searchTerm); // Get lunr to perform a search

      displaySearchResults(results, window.store); // We'll write this in the next section
    }
  }
})();
