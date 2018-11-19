---
layout: null
---
'use strict';

function toggleNavBar(collectionId) {
  var collectionIdSelector = '#' + collectionId;
  var collectionNavbar = collectionIdSelector + '-navbar';
  function removeStyling(name) {
      $(name).css('display', '');
      $(name).css('top', '');
      $(name).css('left', '');
      $(name).css('position', '');

  };
  console.log(collectionNavbar);

  $(collectionIdSelector).click(function(e) {
    // Kill click event, otherwise Bootstrap will treat it as a click outside of the dropdown and immediately close it.
    // Source: https://stackoverflow.com/questions/22842903/how-to-open-bootstrap-dropdown-programmatically
    e.stopPropagation();
    // Open lectures dropdown menu.
    $("#lecture-nav-bar").toggleClass("open");

    // Remove styling for all dropdown-submenu.
    {% for collection in site.data.navigation-list.navigation_list %}
    {%- assign id = collection.id -%}
      removeStyling('#{{ id }}-navbar');
    {% endfor %}

    // Toggle aria-expanded attribute.
    // Source: https://stackoverflow.com/questions/26340129/jquery-toggle-attribute-value
    if($('.dropdown-toggle').attr('aria-expanded')==='true'){
           //alert("true");
           $('.dropdown-toggle').attr('aria-expanded','false');
    }
    else{
        $('.dropdown-toggle').attr('aria-expanded','true');
    }

    // Style the element with collectionNavbar class.
    $(collectionNavbar).css('display', 'block');
    $(collectionNavbar).css('top', '0%');
    $(collectionNavbar).css('left', '100%');
    $(collectionNavbar).css('position', 'absolute');


  });
  // On click where in the document, remove the styling for element with collectionNavbar class.
  $('html').click(function() {
    removeStyling(collectionNavbar);
  });
  // On mouseover any .dropdown-submenu element, remove styling for element with collectionNavbar class.
  $('.dropdown-submenu').mouseover(function(e) {
    e.stopPropagation();
    removeStyling(collectionNavbar);
  });
}

$(document).ready(function(){
  //toggleNavBar(introduction);
  {% for collection in site.data.navigation-list.navigation_list %}
    {%- assign id = collection.id -%}
    toggleNavBar('{{ id }}');
  {% endfor %}
});

$(document).ready(function() {
    $('#search-results').DataTable();
} );
